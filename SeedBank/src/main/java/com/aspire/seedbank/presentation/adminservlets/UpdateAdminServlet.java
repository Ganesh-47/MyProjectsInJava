package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Admin;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateAdminServlet
 */
@WebServlet("/UpdateAdminServlet")
public class UpdateAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateAdminServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int adminid=Integer.parseInt(request.getParameter("adminid"));
		Admin admin=new Admin(adminid);
		String url="/Message.jsp";
		int currentadminid=0;
		try {
			admin.setAdminname(request.getParameter("adminname"));
			admin.setAdminaddress(request.getParameter("adminaddress"));
			admin.setAdmincity(request.getParameter("admincity"));
			admin.setAdminemail(request.getParameter("adminemail"));
			admin.setAdminphone(Double.parseDouble(request.getParameter("adminphone")));
			admin.setAdminpincode(Integer.parseInt(request.getParameter("adminpincode")));
			Controller admincontroller=new AdminController();
			currentadminid=admincontroller.updateAdmin(admin);
			if(currentadminid>0) {
				request.setAttribute("message", "Admin Id : "+currentadminid+" Updated!!!");
				getServletContext().getRequestDispatcher(url).include(request, response);
				adminid++;
			}else {
				request.setAttribute("message", "Failed To Update Admin Details!");
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
