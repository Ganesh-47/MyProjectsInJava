package lession;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Data
 */
@WebServlet("/Data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Data() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

HttpSession session = request.getSession(true);
  String btnsubmit =request.getParameter("btnsubmit");
  System.out.println("Button Clicked "+ btnsubmit);
  response.setContentType("text/html");
  PrintWriter outputwriter = response.getWriter(); 
  if(btnsubmit.equals("set"))
  {
   String data =request.getParameter("txtdata");
   System.out.println("Data Service "+ data);
   session.setAttribute("data", data);
   outputwriter.write("<h2>Data Set</h2>" + data);
  }
  else if(btnsubmit.equals("get"))
  {
   String objData=(String)session.getAttribute("data");
   if(objData!=null)
    outputwriter.write("Data Get: " + objData);
   else
    outputwriter.write("<h2>NO Data to Get</h2>" );
   
  }
  String htmloutput="<form action='Data' method='post'><div><input type='submit' value='get' name='btnsubmit'/></div><div><input type='submit' value='redirect' name='btnsubmit' /></div></form>";
  outputwriter.write(htmloutput);
  if(btnsubmit.equals("redirect"))
  {
   RequestDispatcher dispatcher=request.getRequestDispatcher("About");
   dispatcher.forward(request, response);
  }

		doGet(request, response);
	}

}
