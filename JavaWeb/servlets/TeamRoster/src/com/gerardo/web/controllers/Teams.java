package com.gerardo.web.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gerardo.web.models.Roster;
import com.gerardo.web.models.Team;



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
		// TODO Auto-generated method stub
		
		if (request.getParameter("id")==null) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/AddTeam.jsp");
			view.forward(request, response);
		} else {
			int id = Integer.parseInt( request.getParameter("id") );
			HttpSession session = request.getSession();
			
			//pulls the team with id 'id' from the roster of teams (roster holds an arraylist and id is the index of a team in the list)
			session.setAttribute("id", id);
			session.setAttribute("team", ( (Roster) session.getAttribute("roster") ).getTeam(id) );
			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/ShowTeam.jsp");
			view.forward(request, response);
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
