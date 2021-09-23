package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.HashSet;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewAllTransactionServlet
 */
@WebServlet("/ViewAllTransactionServlet")
public class ViewAllTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViewAllTransactionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="";
		HashSet <Transaction> transactionhashset=null;
		try {
			Controller admincontroller=new AdminController();
			transactionhashset=admincontroller.viewAllTransactions();
			if(transactionhashset!=null) {
				url="/ViewAllTransactions.jsp";
				request.setAttribute("transactionhashset",transactionhashset);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				url="/Message.jsp";
				request.setAttribute("message", "Failed To View Transaction Details!!! ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
		}catch(Exception exception) {
			exception.printStackTrace();
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
