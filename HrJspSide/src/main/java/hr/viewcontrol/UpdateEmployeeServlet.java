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
 * Servlet implementation class UpdateEmployeeServlet
 */
@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateEmployeeServlet() {
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
		  int id =Integer.parseInt(request.getParameter("txtid"));   
		  emp=new Employee(id);
		  emp.setName(request.getParameter("txtname"));
		  emp.setCity(request.getParameter("txtcity"));
		  emp.setSalary(Double.parseDouble(request.getParameter("txtsalary")));
		  int output=EmployeeControl.update(emp);
		  if(output>0)
			  request.setAttribute("notify","Updated !!!");
		  else
			  request.setAttribute("notify","Updation Failed!!!");
	}catch(Exception e) {
		request.setAttribute("notify"," Exception Occurs"+e.getMessage());
	}finally {
		getServletContext().getRequestDispatcher("/Notification.jsp").include(request, response);
	}

}
}