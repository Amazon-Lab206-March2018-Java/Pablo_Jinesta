package com.esppablo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.esppablo.web.models.Count;

/**
 * Servlet implementation class ShowCounter
 */
@WebServlet("/Counter")
public class ShowCounter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCounter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Create a Counter servlet that will render a JSP
		// Use Session to keep track of how many times a user clicks on your page.
		
		// Process Request:
		HttpSession session = request.getSession();
		if (session.getAttribute("count") == null) {
			Count count = (Count) session.getAttribute("count");
			int counter = 0;
			count.setCount(counter);
			session.setAttribute("count", count);
		}
		
		else {
			Count count = (Count) session.getAttribute("count");
			int counter = count.getCount()+1;
			count.setCount(counter);
			session.setAttribute("count", count);

		}

		// View handle request
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/showCounter.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
