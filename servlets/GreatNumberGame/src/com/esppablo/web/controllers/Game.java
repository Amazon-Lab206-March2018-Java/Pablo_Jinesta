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
       

	private static int newGreatNumber() {
		
		Random randomGreatNumber = new Random();
		int randomNum = 1 + randomGreatNumber.nextInt((100 - 1) + 1);
		return randomNum;
		
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
			request.setAttribute("action", "Submit");
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
		HttpSession session = request.getSession();
		int thinkNumber = (int) session.getAttribute("thinkNumber");

		// Retain the value of the number across incorrect guesses while providing feedback to the user
		int guess = Integer.parseInt(request.getParameter("guess"));
		System.out.println(Integer.parseInt(request.getParameter("guess")));

		if (guess == thinkNumber){
			System.out.println(guess + " was the number");
	        request.setAttribute("message", guess + " was the number!");
	        session.setAttribute("thinkNumber", newGreatNumber());
	        request.setAttribute("action", "Play Again!");
		}
		
		else if (guess > thinkNumber){
			System.out.println("Too high!");
	        request.setAttribute("message", "Too High!");

		}
		
		else if (guess < thinkNumber){
			System.out.println("Too low!");
	        request.setAttribute("message", "Too low!");

		}
		
		doGet(request, response);
	}

}
