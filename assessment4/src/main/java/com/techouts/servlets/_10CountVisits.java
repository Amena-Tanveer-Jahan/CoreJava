package com.techouts.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/countVisit")
public class _10CountVisits extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		HttpSession session = req.getSession();
		Integer count = (Integer) session.getAttribute("count");
		if(count==null) {
			count=1;
		}else {
			count++;
		}
		session.setAttribute("count", count);
		out.println("<h3>The number of visits till now are : "+count+" </h3>");
	}
	

}
