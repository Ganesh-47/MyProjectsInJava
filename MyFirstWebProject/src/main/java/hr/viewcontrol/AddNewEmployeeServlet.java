package hr.viewcontrol;

import java.io.IOException;
import java.io.PrintWriter;

import hr.businesscontrol.EmployeeControl;
import hr.entity.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddNewEmployeeServlet
 */
@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddNewEmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		  PrintWriter outputwriter = response.getWriter();  
		  StringBuilder htmlbuilder=new StringBuilder(500);
		   //form begin
		   htmlbuilder.append("<form action='AddNewEmployeeServlet' method='post'>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append("EmpID: <input type='text' name='txtid' style='border-radius:10px; width:250px; height:30px; margin-left:10px;' placeholder='Enter Employee Id here'/>");
		   htmlbuilder.append("</div>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append("Name: <input type='text' name='txtname' style='border-radius:10px; width:250px; height:30px; margin-left:20px; margin-top:10px;' placeholder='Enter Employee Name here'/>");
		   htmlbuilder.append("</div>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append("City: <input type='text' name='txtcity' style='border-radius:10px; width:250px; height:30px; margin-left:30px; margin-top:10px;' placeholder='Enter City here'/>");
		   htmlbuilder.append("</div>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append("Salary: <input type='text' name='txtsalary' style='border-radius:10px; width:250px; height:30px; margin-left:18px; margin-top:10px;' placeholder='Enter Salary here' />");
		   htmlbuilder.append("</div>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append(" <input type='submit' name='btnaddemployee' value='save' style='background-color:green; border;1px solid green; margin-left:100px; margin-top:30' />");
		   htmlbuilder.append("</div>");   
		   //form end
		   htmlbuilder.append("</form>");
		   outputwriter.write(htmlbuilder.toString());

}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp =null;
		  response.setContentType("text/html");
		  PrintWriter outputwriter = response.getWriter();  
		  try {
		  int id =Integer.parseInt(request.getParameter("txtid"));   
		  emp=new Employee(id);
		  emp.setName(request.getParameter("txtname"));
		  emp.setCity(request.getParameter("txtcity"));
		  emp.setSalary(Double.parseDouble(request.getParameter("txtsalary")));
		  int output=EmployeeControl.addNewEmployee(emp);
		  if(output>0)
		   outputwriter.write("<h2>Inserted " +output+" </h2>");
		  else
		   outputwriter.write("<h2> Insert Failed </h2>");

	}catch(Exception e) {
		outputwriter.write("<h2> Insertion Failed due to Invalid Inputs</h2>");
	}

}
}
