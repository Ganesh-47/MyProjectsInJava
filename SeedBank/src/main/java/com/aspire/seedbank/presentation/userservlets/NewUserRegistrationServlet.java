package com.aspire.seedbank.presentation.userservlets;
//bending
import java.io.IOException;
import java.util.Random;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewUserRegistrationServlet
 */
@WebServlet("/NewUserRegistrationServlet")
public class NewUserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public NewUserRegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand=new Random();
		int max=999999999,min=123;
		int userid=rand.nextInt((max-min)+1)+min;
		User newuser=new User(userid);
		String url="/Message.jsp";
		int currentuserid=0;
		try {
			newuser.setUsername(request.getParameter("newusername"));
			newuser.setAccountnumber(Double.parseDouble(request.getParameter("newuseraccountnumber")));
			newuser.setUseraddress(request.getParameter("newuseraddress"));
			newuser.setUserbranch(request.getParameter("newuserbranch"));
			newuser.setUsercity(request.getParameter("newusercity"));
			newuser.setUseremail(request.getParameter("newuseremail"));
			newuser.setUserifsc(request.getParameter("newuserifsc"));
			newuser.setUserpassword(request.getParameter("newuserpassword"));
			newuser.setUserphone(Double.parseDouble(request.getParameter("newuserphone")));
			newuser.setUserpincode(Integer.parseInt(request.getParameter("newuserpincode")));
			newuser.setUserupiid(request.getParameter("newuserupiid"));
			Controller admincontroller=new AdminController();
			currentuserid=admincontroller.addNewUser(newuser);
			if(currentuserid>0) {
				request.setAttribute("message", "Your Temporary User Id is: "+currentuserid);
				getServletContext().getRequestDispatcher(url).include(request, response);
				userid++;
			}else {
				request.setAttribute("message", "Failed To Register!!!");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
			
		}catch(Exception exception) {
			throw new ServletException(exception);
		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
