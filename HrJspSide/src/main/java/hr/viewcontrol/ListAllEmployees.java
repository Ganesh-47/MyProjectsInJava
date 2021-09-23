package hr.viewcontrol;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import hr.businesscontrol.EmployeeControl;
import hr.entity.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListAllEmployees
 */
public class ListAllEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListAllEmployees() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HashSet<Employee> empset=EmployeeControl.viewAllEmployees();
		Iterator<Employee> empiterator=empset.iterator();
		String url="/ListEmployees.jsp";
		request.setAttribute("empiterator", empiterator);
		getServletContext().getRequestDispatcher(url).include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
