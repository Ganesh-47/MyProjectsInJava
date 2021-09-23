package src.main.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/MainController")
public class MainController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public MainController() {
        super();
        
     }
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Firstname=request.getParameter("Firstname");
		String Lastname=request.getParameter("Lastname");
		String Email=request.getParameter("Email");
		String Password=request.getParameter("Password");
		String Contact=request.getParameter("Contact");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/elearning","root","Jayashree@123");
			String Query="insert into elearning.details"+" values (?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,Email);
			ps.setString(2,Password);
			ps.setString(3,Firstname);
			ps.setString(4,Lastname);
			ps.setString(5,Contact);
			ps.execute();
			con.close();
		if(Firstname.isEmpty() || Email.isEmpty() ||Password.isEmpty())
			response.sendRedirect("register.jsp");
		else
			response.sendRedirect("login.jsp");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	}