package seedbank.viewcontrol;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seedbank.control.AdminController;
import seedbank.entity.User;

/**
 * Servlet implementation class AddNewUserServlet
 */
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
		Random rand=new Random();
		int max=999999999,min=123;
		int userid=rand.nextInt((max-min)+1)+min;
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
			user.setUserpassword(request.getParameter("userpassword"));
			user.setUserphone(Double.parseDouble(request.getParameter("userphone")));
			user.setUserpincode(Integer.parseInt(request.getParameter("userpincode")));
			user.setUserupiid(request.getParameter("userupiid"));
			AdminController admincontroller=new AdminController();
			currentuserid=admincontroller.addNewUser(user);
			if(currentuserid>0) {
				request.setAttribute("message", "User Id is: "+currentuserid);
				getServletContext().getRequestDispatcher(url).include(request, response);
				userid++;
			}else {
				request.setAttribute("message", "Failed To Add New User ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
			
		}catch(Exception e) {
			throw new ServletException("Exception Occurs");
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
