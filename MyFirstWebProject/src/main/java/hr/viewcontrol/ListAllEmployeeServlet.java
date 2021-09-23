package hr.viewcontrol;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import hr.businesscontrol.EmployeeControl;
import hr.entity.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListAllEmployeeServlet
 */
@WebServlet("/ListAllEmployeeServlet")
public class ListAllEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListAllEmployeeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

response.setContentType("text/html");
  PrintWriter outputwriter = response.getWriter();  
  StringBuilder htmlbuilder=new StringBuilder(500);
  HashSet<Employee> empset=EmployeeControl.viewAllEmployees();
  Iterator<Employee> empiterator=empset.iterator();
  htmlbuilder.append("<style> table, th, td {  border: 2px solid black;  border-collapse:collapse;  } th, td { padding: 10px;  }  table{  width: 100%;   } table.center { margin-left: auto;  margin-right: auto; }  </style>"); 
  //form begin
  htmlbuilder.append("<div name='emplistform'>");
  htmlbuilder.append("<form action='addNewEmployee' method='post'>");
  htmlbuilder.append("<table >");
  htmlbuilder.append("<tr>");
  htmlbuilder.append("<th  >ID</th>");
  htmlbuilder.append("<th  >Name</th>");
  htmlbuilder.append("<th  >City</th>");
  htmlbuilder.append("<th  >Salary</th>");
  htmlbuilder.append("</tr>");
  while(empiterator.hasNext())
  {
     Employee emp= empiterator.next();
     htmlbuilder.append("<tr name='emprow'"+emp.getId()+" >");
      htmlbuilder.append("<td  >");
   htmlbuilder.append(emp.getId());
   htmlbuilder.append("</td>");
    htmlbuilder.append("<td  >");
   htmlbuilder.append(emp.getName());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(emp.getCity());
   htmlbuilder.append("</td>");
    htmlbuilder.append("<td  > ");
   htmlbuilder.append(emp.getSalary());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  //form end
  htmlbuilder.append("</table>");
  htmlbuilder.append("</form>");
  htmlbuilder.append("</div>");    
  outputwriter.write(htmlbuilder.toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
