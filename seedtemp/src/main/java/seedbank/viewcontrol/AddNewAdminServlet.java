package seedbank.viewcontrol;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import seedbank.control.AdminController;
import seedbank.entity.Admin;

/**
 * Servlet implementation class AddNewAdminServlet
 */
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
		Random rand=new Random();
		int max=999999999,min=123;
		int adminid=rand.nextInt((max-min)+1)+min;
		Admin admin=new Admin(adminid);
		String url="/Message.jsp";
		int currentadminid=0;
		try {
			admin.setAdminname(request.getParameter("adminname"));
			admin.setAdminaddress(request.getParameter("adminaddress"));
			admin.setAdmincity(request.getParameter("admincity"));
			admin.setAdminemail(request.getParameter("adminemail"));
			admin.setAdminpassword(request.getParameter("adminpassword"));
			admin.setAdminphone(Double.parseDouble(request.getParameter("adminphone")));
			admin.setAdminpincode(Integer.parseInt(request.getParameter("adminpincode")));
			AdminController admincontroller=new AdminController();
			currentadminid=admincontroller.addNewAdmin(admin);
			if(currentadminid>0) {
				request.setAttribute("message", "Admin Id is: "+currentadminid);
				getServletContext().getRequestDispatcher(url).include(request, response);
				adminid++;
			}else {
				request.setAttribute("message", "Failed To Add New Admin ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
			
		}catch(Exception e) {
			throw new ServletException("Exception Occurs");
		}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
