package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Seed;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateSeedServlet
 */
@WebServlet("/UpdateSeedServlet")
public class UpdateSeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UpdateSeedServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int seedid=Integer.parseInt(request.getParameter("seedid"));
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
			currentseedid=admincontroller.updateSeed(seed);
			if(currentseedid>0) {
				request.setAttribute("message", "Seed Id : "+currentseedid+" is Updated");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}else {
				request.setAttribute("message", "Failed To Update Seed Details ");
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
