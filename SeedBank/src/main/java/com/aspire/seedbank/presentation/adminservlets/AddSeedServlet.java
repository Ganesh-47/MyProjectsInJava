package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.Random;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Seed;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddSeedServlet
 */
@WebServlet("/AddSeedServlet")
public class AddSeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddSeedServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random=new Random();
		int max=999999999,min=123;
		int seedid=random.nextInt((max-min)+1)+min;
		Seed seed=new Seed(seedid);
		String url="/Message.jsp";
		int currentseedid=0;
		try {
			seed.setSeedname(request.getParameter("seedname"));
			seed.setTemperature(Integer.parseInt(request.getParameter("temperature")));
			seed.setImage(request.getParameter("image"));
			seed.setKilogramsinstock(Integer.parseInt(request.getParameter("kginstock")));
			seed.setPriceperkilogramdeposite(Integer.parseInt(request.getParameter("depositprice")));
			seed.setPriceperkilogramwithdraw(Integer.parseInt(request.getParameter("sellingprice")));
			seed.setCategoryid(Integer.parseInt(request.getParameter("categoryid")));
			Controller admincontroller=new AdminController();
			currentseedid=admincontroller.addNewSeed(seed);
			if(currentseedid>0) {
				request.setAttribute("message", "Seed Added!!! Seed Id is: "+currentseedid);
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Add New Seed ");
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
