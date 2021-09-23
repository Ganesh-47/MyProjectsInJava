package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.SeedView;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindSeedServlet
 */
@WebServlet("/FindSeedServlet")
public class FindSeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FindSeedServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url="";
		SeedView seed=null;
		try {
			int seedid=Integer.parseInt(request.getParameter("seedid"));
			Controller admincontroller=new AdminController();
			seed=admincontroller.findSeedById(seedid);
			if(seed!=null) {
				url="/ResultSeed.jsp";
				request.setAttribute("seed",seed);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Find Seed!!! Check Seed Id Once and Try again ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
		}catch(Exception exception) {
			exception.printStackTrace();
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
