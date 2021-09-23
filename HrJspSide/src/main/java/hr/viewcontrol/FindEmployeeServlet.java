package hr.viewcontrol;

import java.io.IOException;

import hr.businesscontrol.EmployeeControl;
import hr.entity.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindEmployeeServlet
 */
@WebServlet("/FindEmployeeServlet")
public class FindEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FindEmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp =null;
		  response.setContentType("text/html");
		  try {
			  String idstring=request.getParameter("id");
		  if(idstring==null)
			  request.setAttribute("notify","Id is Invalid ");
		  else {
			  request.setAttribute("notify","Employee Found!!! ");
			  int id =Integer.valueOf(idstring); 
			  emp=EmployeeControl.find(id);
			 request.setAttribute("employee", emp) ;
			 String url="/Result.jsp";
			 getServletContext().getRequestDispatcher(url).include(request, response);
			 }
		  
	}catch(Exception e) {
		request.setAttribute("notify","Exception occurs"+e.getMessage());
	}finally{
		getServletContext().getRequestDispatcher("/Notification.jsp").include(request, response);
	}

}
}
