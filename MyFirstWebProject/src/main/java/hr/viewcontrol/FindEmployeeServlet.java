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
		response.setContentType("text/html");
		  PrintWriter outputwriter = response.getWriter();  
		  StringBuilder htmlbuilder=new StringBuilder(500);
		   //form begin
		   htmlbuilder.append("<form action='FindEmployeeServlet' method='post'>");
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
		  response.setContentType("text/html");
		  PrintWriter outputwriter = response.getWriter();  
		  try {
			  String idstring=request.getParameter("txtid");
		  if(idstring==null)
			  outputwriter.write("<h2> Id is InValid </h2>");
		  else {
			  int id =Integer.valueOf(idstring); 
			  emp=EmployeeControl.find(id);
			  outputwriter.write("<h1>Id: "+emp.getId()+"</h1><br>");
			  outputwriter.write("<h1>Name: "+emp.getName()+"</h1><br>");
			  outputwriter.write("<h1>City: "+emp.getCity()+"</h1><br>");
			  outputwriter.write("<h1>Salary: "+emp.getSalary()+"</h1>");
		  }
		  
	}catch(Exception e) {
		outputwriter.write("<h2> Find operation Failed due to Invalid Inputs</h2>");
	}

}
}
