package com.aspire.seedbank.presentation.userservlets;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;

import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.control.UserController;
import com.aspire.seedbank.entity.Deposit;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 * Servlet implementation class DepositSeedServlet
 */
@WebServlet("/DepositSeedServlet")
public class DepositSeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DepositSeedServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand=new Random();
		HttpSession session=request.getSession();
		int max=999999999,min=123;
		int depositid=rand.nextInt((max-min)+1)+min;
		int transactionid=rand.nextInt((max-min)+1)+min;
		Deposit deposit=new Deposit(depositid);
		String url="/Message.jsp";
		int[] currenttransactionid=new int[2];
		try {
			deposit.setTransactionid(transactionid);
			deposit.setSeedid(Integer.parseInt(request.getParameter("seedid")));
			//deposit.setUserid(Integer.parseInt(request.getParameter("userid")));
			deposit.setUserid(Integer.parseInt((String) session.getAttribute("userid")));
			deposit.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			deposit.setDepositedate(Date.valueOf(LocalDate.now()));
			Controller usercontroller=new UserController();
			currenttransactionid=usercontroller.depositSeed(deposit);
			if(currenttransactionid!=null) {
				request.setAttribute("message", "Seed Deposited!!! Deposit Id is: "+depositid+" Transaction Id is: "+currenttransactionid[1]+" Amount Transferred: "+currenttransactionid[0]+" Rs");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Deposit Failed! Try after test all the inputs");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
			
		}catch(Exception exception) {
			throw new ServletException(exception);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
