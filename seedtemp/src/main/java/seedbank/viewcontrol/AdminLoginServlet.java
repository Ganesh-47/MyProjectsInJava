package seedbank.viewcontrol;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seedbank.control.AdminController;
import seedbank.entity.Login;

/**
 * Servlet implementation class AdminLoginServlet
 */
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
	@SuppressWarnings("null")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url=null;
		try {
			Login login=new Login();
			login.setEmail(request.getParameter("adminemail"));
			login.setPassword(request.getParameter("adminpassword"));
			AdminController admincontroller=new AdminController();
			String adminname=admincontroller.adminLogin(login);
			if(adminname==null) {
				url="/Message.jsp";
				request.setAttribute("message","Invalid Email or Password!!!" );
				getServletContext().getRequestDispatcher(url).forward(request, response);
			}else {
				url="/AdminPage.jsp";
				request.setAttribute("adminname",adminname );
				getServletContext().getRequestDispatcher(url).forward(request, response);
				
			}
		}catch(Exception e){
			e.printStackTrace();
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
