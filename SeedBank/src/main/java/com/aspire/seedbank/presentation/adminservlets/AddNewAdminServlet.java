package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.Random;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Admin;
import com.aspire.seedbank.utilities.PasswordControl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNewAdminServlet
 */
@WebServlet("/AddNewAdminServlet")
public class AddNewAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddNewAdminServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random=new Random();
		int maximum=999999999,min=123;
		int adminid=random.nextInt((maximum-min)+1)+min;
		Admin admin=new Admin(adminid);
		String url="/Message.jsp";
		int currentadminid=0;
		try {
			admin.setAdminname(request.getParameter("adminname"));
			admin.setAdminaddress(request.getParameter("adminaddress"));
			admin.setAdmincity(request.getParameter("admincity"));
			admin.setAdminemail(request.getParameter("adminemail"));
			admin.setAdminpassword(PasswordControl.passHashing(request.getParameter("adminpassword")));
			admin.setAdminphone(Double.parseDouble(request.getParameter("adminphone")));
			admin.setAdminpincode(Integer.parseInt(request.getParameter("adminpincode")));
			Controller admincontroller=new AdminController();
			currentadminid=admincontroller.addNewAdmin(admin);
			if(currentadminid>0) {
				request.setAttribute("message", "Admin Added!!! Admin Id is: "+currentadminid);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Add New Admin ");
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
