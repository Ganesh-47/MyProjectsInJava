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
 * Servlet implementation class RemoveEmployeeServlet
 */
@WebServlet("/RemoveEmployeeServlet")
public class RemoveEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RemoveEmployeeServlet() {
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
		int result=0;
		  response.setContentType("text/html");
		  try {
		  int id =Integer.parseInt(request.getParameter("id")); 
		  if(request.getParameter("id")==null)
			  request.setAttribute("notify","Id is Invalid ");
		  else {
			  emp=EmployeeControl.find(id);
			  request.setAttribute("employee",emp);
			  String url="/Result.jsp";
			  getServletContext().getRequestDispatcher(url).include(request, response);
			  result=EmployeeControl.delete(id);
			  }if(result>0)	request.setAttribute("notify","This Employee Details Deleted!!!");
				  else	request.setAttribute("notify","Employee not found");	  
		   
	}catch(Exception e) {
		request.setAttribute("notify","Exception occurs"+e.getMessage());	 
	}finally {
		getServletContext().getRequestDispatcher("/Notification.jsp").include(request, response);
	}
	}

}
