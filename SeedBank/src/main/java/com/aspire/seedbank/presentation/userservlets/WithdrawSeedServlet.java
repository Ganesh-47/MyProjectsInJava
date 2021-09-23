package com.aspire.seedbank.presentation.userservlets;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;

import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.control.UserController;
import com.aspire.seedbank.entity.Order;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class WithdrawSeedServlet
 */
@WebServlet("/WithdrawSeedServlet")
public class WithdrawSeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WithdrawSeedServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random=new Random();
		HttpSession session=request.getSession();
		int max=999999999,min=123;
		int orderid=random.nextInt((max-min)+1)+min;
		int transactionid=random.nextInt((max-min)+1)+min;
		Order order=new Order(orderid);
		String url="/Message.jsp";
		int[] currenttransactionid=new int[2];
		try {
			order.setTransactionid(transactionid);
			order.setSeedid(Integer.parseInt(request.getParameter("seedid")));
			//order.setUserid(Integer.parseInt(request.getParameter("userid")));
			order.setUserid(Integer.parseInt((String) session.getAttribute("userid")));
			order.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			order.setOrdereddate(Date.valueOf(LocalDate.now()));
			Controller usercontroller=new UserController();
			currenttransactionid=usercontroller.orderSeed(order);
			if(currenttransactionid!=null) {
				request.setAttribute("message", "Order Placed!!! Order Id is: "+orderid+" Transaction Id is: "+currenttransactionid[1]+" Amount Received: "+currenttransactionid[0]+" Rs");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Order Failed! Try after test all the inputs");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
