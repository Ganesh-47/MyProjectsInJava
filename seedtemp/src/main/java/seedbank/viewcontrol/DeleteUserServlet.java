package seedbank.viewcontrol;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import seedbank.control.AdminController;

/**
 * Servlet implementation class DeleteUserServlet
 */
public class DeleteUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DeleteUserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="/Message.jsp";
		int result=0;
		try {
			int userid=Integer.parseInt(request.getParameter("userid"));
			AdminController admincontroller=new AdminController();
			result=admincontroller.deleteUser(userid);
			if(result>0) {
				request.setAttribute("message", "User Id: "+result+" is Deleted!!!");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Delete User ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
		}catch(Exception e) {
			e.printStackTrace();
			throw new ServletException("Exception occurs");
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
