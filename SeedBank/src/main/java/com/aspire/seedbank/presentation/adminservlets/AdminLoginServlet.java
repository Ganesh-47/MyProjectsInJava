package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Login;
import com.aspire.seedbank.utilities.PasswordControl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLoginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Logger log=Logger.getLogger(AdminLoginServlet.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		String url=null;
		try {
			Login login=new Login();
			login.setEmail(request.getParameter("adminemail"));
			login.setPassword(PasswordControl.passHashing(request.getParameter("adminpassword")));
			Controller admincontroller=new AdminController();
			String adminname=admincontroller.adminLogin(login);
			if(adminname==null) {
				url="/Message.jsp";
				request.setAttribute("message","Invalid Email or Password!!!" );
				log.error("Invalid Email or Password!!!");
				getServletContext().getRequestDispatcher(url).forward(request, response);
			}else {
				url="/AdminPage.jsp";
				request.setAttribute("adminname",adminname );
				log.error("Loggedin Successfully!!! Admin Name: "+adminname);
				getServletContext().getRequestDispatcher(url).forward(request, response);
				
			}
		}catch(Exception exception){
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
