package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.HashSet;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.OrderViewer;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindWithdrawServlet
 */
@WebServlet("/FindWithdrawServlet")
public class FindWithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FindWithdrawServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="";
		HashSet<OrderViewer> user=null;
		try {
			int userid=Integer.parseInt(request.getParameter("userid"));
			Controller admincontroller=new AdminController();
			user=admincontroller.findUserOrders(userid);
			if(user!=null) {
				url="/ViewAllOrders.jsp";
				request.setAttribute("orderhashset", user);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				url="/Message.jsp";
				request.setAttribute("message", "Failed To find User Order Details. Check the userid once and try again!!! ");
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
