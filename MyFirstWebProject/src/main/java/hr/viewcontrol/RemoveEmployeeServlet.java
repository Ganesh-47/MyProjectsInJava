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
		response.setContentType("text/html");
		  PrintWriter outputwriter = response.getWriter();  
		  StringBuilder htmlbuilder=new StringBuilder(500);
		   //form begin
		   htmlbuilder.append("<form action='RemoveEmployeeServlet' method='post'>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append("EmpID: <input type='text' name='txtid' />");
		   htmlbuilder.append("</div>");
		   htmlbuilder.append("<div>");
		   htmlbuilder.append(" <input type='submit' name='btnaddemployee' value='save' />");
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
		int result=0;
		  response.setContentType("text/html");
		  PrintWriter outputwriter = response.getWriter();  
		  try {
		  int id =Integer.parseInt(request.getParameter("txtid")); 
		  if(request.getParameter("txtid")==null)
			  outputwriter.write("<h2> Id is InValid </h2>");
		  else {
			  emp=EmployeeControl.find(id);
			  outputwriter.write("<p1>Id: "+emp.getId()+"</p1><br>");
			  outputwriter.write("<p1>Name: "+emp.getName()+"</p1><br>");
			  outputwriter.write("<p1>City: "+emp.getCity()+"</p1><br>");
			  outputwriter.write("<p1>Salary: "+emp.getSalary()+"</p1><br>");
			  result=EmployeeControl.delete(id);
			  }if(result>0)	outputwriter.write("<h2> This Employee Details Deleted!</h2><br>");
				  else	outputwriter.write("<h2> Employee not found</h2>");	  
		   
	}catch(Exception e) {
		outputwriter.write("<h2> Deletion Failed due to Invalid Inputs</h2>");
	}
	}

}
