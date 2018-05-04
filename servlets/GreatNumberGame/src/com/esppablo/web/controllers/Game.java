package com.esppablo.web.controllers;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Game
 */
@WebServlet("/")
public class Game extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	private String newGreatNumber() {
		
		Random randomGreatNumber = new Random();
		String digits = "0123456789";
		String greatNumber = "";
		
		for(int i = 0; i < 2; i++) {
			int newrandomGreatNumber = (int)randomGreatNumber.nextInt(10);
			greatNumber += digits.charAt(newrandomGreatNumber);
		}
		
		return greatNumber;
		
	}
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Game() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Process Request:
		HttpSession session = request.getSession();
		
		// Generate a new number on first-time visits or after the game has ended

		if (session.getAttribute("thinkNumber") == null) {
			session.setAttribute("thinkNumber", newGreatNumber());
		}		
		System.out.println(session.getAttribute("thinkNumber"));

		
		// Only reset the number when the player asks to play again.
		
		// View handle request
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/view/index.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Retain the value of the number across incorrect guesses while providing feedback to the user
		System.out.println(Integer.parseInt(request.getParameter("guess")));


		
		doGet(request, response);
	}

}
