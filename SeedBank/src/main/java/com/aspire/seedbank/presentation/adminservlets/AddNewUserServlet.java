package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.Random;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.User;
import com.aspire.seedbank.utilities.PasswordControl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNewUserServlet
 */
@WebServlet("/AddNewUserServlet")
public class AddNewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddNewUserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random=new Random();
		int max=999999999,min=123;
		int userid=random.nextInt((max-min)+1)+min;
		User user=new User(userid);
		String url="/Message.jsp";
		int currentuserid=0;
		try {
			user.setUsername(request.getParameter("username"));
			user.setAccountnumber(Double.parseDouble(request.getParameter("accountnumber")));
			user.setUseraddress(request.getParameter("useraddress"));
			user.setUserbranch(request.getParameter("userbranch"));
			user.setUsercity(request.getParameter("usercity"));
			user.setUseremail(request.getParameter("useremail"));
			user.setUserifsc(request.getParameter("userifsc"));
			user.setUserpassword(PasswordControl.passHashing(request.getParameter("userpassword")));
			user.setUserphone(Double.parseDouble(request.getParameter("userphone")));
			user.setUserpincode(Integer.parseInt(request.getParameter("userpincode")));
			user.setUserupiid(request.getParameter("userupiid"));
			Controller admincontroller=new AdminController();
			currentuserid=admincontroller.addNewUser(user);
			if(currentuserid>0) {
				request.setAttribute("message", "User Id is: "+currentuserid);
				getServletContext().getRequestDispatcher(url).include(request, response);
				userid++;
			}else {
				request.setAttribute("message", "Failed To Add New User ");
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
