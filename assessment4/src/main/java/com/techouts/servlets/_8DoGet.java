package com.techouts.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/doget")
public class _8DoGet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to my servlet </h2>");
		
	}
}
