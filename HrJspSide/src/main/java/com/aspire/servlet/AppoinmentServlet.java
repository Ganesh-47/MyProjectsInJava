package com.aspire.servlet;

import java.io.IOException;

import com.aspire.vaccine.Appointment;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AppoinmentServlet
 */
public class AppoinmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AppoinmentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Appointment vaccineappointment=new Appointment();
		vaccineappointment.setAppointmentNumber(1000);
		vaccineappointment.setName("Ganesh");
		vaccineappointment.setTime(34);
		vaccineappointment.setDate(5);
		String url="/Appointment.jsp";
		request.setAttribute("appoinment", vaccineappointment);
		RequestDispatcher dispatcher= request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		}

}
