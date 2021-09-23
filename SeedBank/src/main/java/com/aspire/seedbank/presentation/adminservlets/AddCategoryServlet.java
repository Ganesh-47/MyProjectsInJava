package com.aspire.seedbank.presentation.adminservlets;

import java.io.IOException;
import java.util.Random;

import com.aspire.seedbank.control.AdminController;
import com.aspire.seedbank.control.Controller;
import com.aspire.seedbank.entity.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCategoryServlet
 */
@WebServlet("/AddCategoryServlet")
public class AddCategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddCategoryServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random rand=new Random();
		int maximum=999999999,minimum=123;
		int categoryid=rand.nextInt((maximum-minimum)+1)+minimum;
		Category category=new Category(categoryid);
		String url="/Message.jsp";
		int currentadminid=0;
		try {
			category.setCategoryname(request.getParameter("categoryname"));
			Controller admincontroller=new AdminController();
			currentadminid=admincontroller.addNewCategory(category);
			if(currentadminid>0) {
				request.setAttribute("message", "Added !!! Category Id is: "+currentadminid);
				getServletContext().getRequestDispatcher(url).include(request, response);
				categoryid++;
			}else {
				request.setAttribute("message", "Failed To Add New Category ");
				getServletContext().getRequestDispatcher(url).include(request, response);
			}
			
		}catch(Exception eeception) {
			throw new ServletException(eeception);
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
