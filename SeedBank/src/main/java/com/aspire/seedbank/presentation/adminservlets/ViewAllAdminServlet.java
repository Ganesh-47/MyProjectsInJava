package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.HashSet;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewAllAdminServlet
 */
@WebServlet("/ViewAllAdminServlet")
public class ViewAllAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ViewAllAdminServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="";
		HashSet <Admin> adminhashset=null;
		try {
			Controller admincontroller=new AdminController();
			adminhashset=admincontroller.viewAllAdmin();
			if(adminhashset!=null) {
				url="/ViewAllAdmin.jsp";
				request.setAttribute("adminhashset",adminhashset);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				url="/Message.jsp";
				request.setAttribute("message", "Failed To View Admin Details!!! ");
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
		doGet(request,response);
	}

}
