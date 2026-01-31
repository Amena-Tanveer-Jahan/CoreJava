package com.techouts.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookies")
public class _13CookieServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		Cookie cookies = new Cookie("username","Tanveer");
		res.addCookie(cookies);
		out.print("<h3> Cookie is set </h3>");
		Cookie[] cooki = req.getCookies();
		if(cooki!=null) {
			for(Cookie c:cooki) {
				out.print(c.getName()+" "+c.getValue()+"<br>");
			}
		}
	}

}
