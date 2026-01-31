package com.techouts.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class _14DisplayServlets extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		try(Connection con = DBUtil.getConnection(); 
				Statement s = con.createStatement()){
			ResultSet rs = s.executeQuery("SELECT * FROM usertable");
			
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<h1>Employee Details: </h1>");
			while(rs.next()) {
				out.println(rs.getInt(1) +" &nbsp;&nbsp;&nbsp"+rs.getString(2)+ "&nbsp;&nbsp;&nbsp;&nbsp "+ rs.getString(3)+"<br>");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
