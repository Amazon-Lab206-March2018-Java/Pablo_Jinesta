package com.esppablo.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.esppablo.web.models.Roster;
import com.esppablo.web.models.Team;

/**
 * Servlet implementation class Teams
 */
@WebServlet("/teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if (request.getParameter("id") == null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/NewTeam.jsp");
	        view.forward(request, response);
		}
		
		else {
			int id = Integer.parseInt(request.getParameter("id"));	
			session.setAttribute("id", id);
			session.setAttribute("team", ((Roster) session.getAttribute("roster")).getTeam(id));
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/TeamInfo.jsp");
	        view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String teamName = request.getParameter("teamName");
		
		Team newTeam = new Team(teamName);
		Roster roster = (Roster) session.getAttribute("roster");
		
		roster.addTeam(newTeam);
		int id = roster.getRosterSize()-1;
		
		response.sendRedirect("teams?id=" + id);
		
	}

}
