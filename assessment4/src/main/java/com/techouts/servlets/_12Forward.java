package com.techouts.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/forward")
public class _12Forward extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("tect/html");
		PrintWriter out = res.getWriter();
		out.print("<h3>Helloo</h3>");
		
		req.getRequestDispatcher("pages/hello.jsp").forward(req, res);
	}

}
