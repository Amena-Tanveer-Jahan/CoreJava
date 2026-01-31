package com.techouts.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class _9DoPost extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		out.println("<h2> Username: "+username +"</h2>");
		out.println("<h2> Password : "+password+" </h2>");

}
}