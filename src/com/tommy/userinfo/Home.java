package com.tommy.userinfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String hometown = request.getParameter("hometown");
		if(firstName == null) {
			firstName = "Unknown";
		}
		if(lastName == null) {
			lastName = "Unknown";
		}
		if(favoriteLanguage == null) {
			favoriteLanguage = "Unknown";
		}
		if(hometown == null) {
			hometown = "Unknown";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<h1>Welcome, " + firstName + " " +  lastName +  "</h1>");
		out.write("<h3>Your favorite language is: " + favoriteLanguage + "</h3>");
		out.write("<h3>Your hometown is: " + hometown + "</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
