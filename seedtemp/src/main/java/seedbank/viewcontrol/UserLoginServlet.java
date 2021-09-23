package seedbank.viewcontrol;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seedbank.control.UserController;
import seedbank.entity.Login;

/**
 * Servlet implementation class UserLoginServlet
 */
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
		try {
			Login login=new Login();
			login.setEmail(request.getParameter("useremail"));
			login.setPassword(request.getParameter("userpassword"));
			UserController usercontroller=new UserController();
			String username=usercontroller.userLogin(login);
			if(username==null) {
				url="/Message.jsp";
				request.setAttribute("message","Invalid Email or Password!!!" );
				getServletContext().getRequestDispatcher(url).forward(request, response);
			}else {
				url="/UserPage.jsp";
				request.setAttribute("username",username );
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
