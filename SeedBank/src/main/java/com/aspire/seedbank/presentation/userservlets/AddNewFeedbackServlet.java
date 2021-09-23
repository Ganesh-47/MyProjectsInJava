package com.aspire.seedbank.presentation.userservlets;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;

import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.control.UserController;
import com.aspire.seedbank.entity.Feedback;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class AddNewFeedbackServlet
 */
@WebServlet("/AddNewFeedbackServlet")
public class AddNewFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddNewFeedbackServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Random random=new Random();
		int maximum=999999999,min=123;
		int feedbackid=random.nextInt((maximum-min)+1)+min;
		Feedback feedback=new Feedback(feedbackid);
		String url="/Message.jsp";
		int currentfeedbackid=0;
		try {
			feedback.setUserid(Integer.parseInt((String)session.getAttribute("userid")));
			feedback.setOrderid(Integer.parseInt(request.getParameter("orderid")));
			feedback.setFeedback(request.getParameter("feedback"));
			feedback.setDateoffeedback(Date.valueOf(LocalDate.now()));
			Controller usercontroller=new UserController();
			currentfeedbackid=usercontroller.addNewFeedBack(feedback);
			if(currentfeedbackid>0) {
				request.setAttribute("message", "Feedback Registered!!! Feedback Id is: "+currentfeedbackid);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Register Feedback ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
			
		}catch(Exception exception) {
			throw new ServletException(exception);
		}
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
