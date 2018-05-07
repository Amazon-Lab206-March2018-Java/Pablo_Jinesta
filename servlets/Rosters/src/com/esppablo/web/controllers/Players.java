package com.esppablo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.esppablo.web.models.Player;
import com.esppablo.web.models.Team;

/**
 * Servlet implementation class Players
 */
@WebServlet("/players")
public class Players extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Players() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/NewPlayer.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		// Get player team
		Team team = (Team) session.getAttribute("team");
		
		// Set new player
		String first_Name = request.getParameter("firstname");
		String last_Name = request.getParameter("lastname");
		int age = Integer.parseInt(request.getParameter("age"));
		
		Player newPlayer = new Player (first_Name, last_Name, age);
		
		team.addPlayer(newPlayer);
		
		int teamID = (Integer) session.getAttribute("id");
		
		response.sendRedirect("teams?id=" + teamID);
		
	}

}
