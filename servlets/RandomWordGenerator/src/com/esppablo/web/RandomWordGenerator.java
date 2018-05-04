package com.esppablo.web;

import java.io.IOException;

import java.util.Random;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// website  allows users to create a random word. Once, a word is generated, also shows the last time that they have generated a word


/**
 * Servlet implementation class RandomWordGenerator
 */
@WebServlet("/Random")
public class RandomWordGenerator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public String randomWord;
	
	// create a random word with a mix of letters and numbers. Make it at least 10 characters long.
	private String newRandWord() {
		
		Random newrandomWord= new Random();
		String alphanums = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomWord = "";
		
		for(int i = 0; i < 14; i++) {
			int newRandWord= (int)newrandomWord.nextInt(36);
			randomWord += alphanums.charAt(newRandWord);
		}
		
		return randomWord;
		
}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RandomWordGenerator() {
        super();
        // TODO Auto-generated constructor stub
    }
    


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Create a counter for how many times a user has clicked on the Generate button.
		HttpSession session = request.getSession();
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		
		else {
			int counter = (Integer) session.getAttribute("counter");
			counter++;
			session.setAttribute("counter", counter);
		}
		
		// Once a user clicks on the Generate button, create a random word
		request.setAttribute("randomWord", newRandWord());
		
		// Keep track of the time that the user has last generated a word
		Date date = new Date();
		request.setAttribute("time", date.toString());

		
		// View handle request
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
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
