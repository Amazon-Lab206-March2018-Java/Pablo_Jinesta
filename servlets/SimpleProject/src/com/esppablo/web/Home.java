package com.esppablo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		// Get the values for the query parameter

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String hometown = request.getParameter("hometown");
			


        // Sets the content type of the response
        response.setContentType("text/html");
        
        // Writes the response
        
        PrintWriter out = response.getWriter();
        
        if (request.getParameter("firstName") == null || request.getParameter("lastName") == null) {
        	out.write("<h1>Welcome!</h1>");
        } else {
        	out.write("<h1>Welcome, " + firstName + " " + lastName + "</h1>");
        }
        
        if (request.getParameter("favoriteLanguage") == null) {
            out.write("<p>Your favorite language is: Uknown</p>");
        } else {
        	out.write("<p>Your favorite language is: " + favoriteLanguage + "</p>");
        }
        

        if (request.getParameter("hometown") == null) {
            out.write("<p>Your hometown is: Uknown</p>");	
        } else {
        	out.write("<p>Your hometown is: " + hometown + "</p>");
        }
        
        // Home?firstName=Pablo&lastName=Jinesta&favoriteLanguage=Python
        // Home?firstName=Pablo&lastName=Jinesta&favoriteLanguage=Python&hometown=Costa+Rica
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
