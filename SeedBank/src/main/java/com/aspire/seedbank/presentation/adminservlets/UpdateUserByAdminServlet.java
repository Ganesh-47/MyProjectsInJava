package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateUserByAdminServlet
 */
@WebServlet("/UpdateUserByAdminServlet")
public class UpdateUserByAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateUserByAdminServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userid=Integer.parseInt(request.getParameter("userid"));
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
			user.setUserphone(Double.parseDouble(request.getParameter("userphone")));
			user.setUserpincode(Integer.parseInt(request.getParameter("userpincode")));
			user.setUserupiid(request.getParameter("userupiid"));
			Controller admincontroller=new AdminController();
			currentuserid=admincontroller.updateUserByAdmin(user);
			if(currentuserid>0) {
				request.setAttribute("message", "User Id : "+currentuserid+" Updated!!!");
				getServletContext().getRequestDispatcher(url).include(request, response);
				userid++;
			}else {
				request.setAttribute("message", "Failed To Update User Details!");
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
