package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteUserServlet
 */
@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DeleteUserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/Message.jsp";
		int result=0;
		try {
			int userid=Integer.parseInt(request.getParameter("userid"));
			Controller admincontroller=new AdminController();
			result=admincontroller.deleteUser(userid);
			if(result>0) {
				request.setAttribute("message", "User Id: "+result+" is Deleted!!!");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Delete User ");
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
