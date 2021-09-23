package com.aspire.seedbank.presentation.userservlets;

import java.io.IOException;

import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.control.UserController;
import com.aspire.seedbank.entity.Login;
import com.aspire.seedbank.utilities.PasswordControl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserLoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url=null;
		HttpSession session=request.getSession();
		try {
			Login login=new Login();
			login.setEmail(request.getParameter("useremail"));
			login.setPassword(PasswordControl.passHashing(request.getParameter("userpassword")));
			Controller usercontroller=new UserController();
			String[] result=usercontroller.userLogin(login);
			if(result==null) {
				url="/Message.jsp";
				request.setAttribute("message","Invalid Email or Password!!!" );
				getServletContext().getRequestDispatcher(url).forward(request, response);
			}else {
				session.setAttribute("userid",result[1]);
				url="/UserPage.jsp";
				request.setAttribute("username",result[0] );
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
