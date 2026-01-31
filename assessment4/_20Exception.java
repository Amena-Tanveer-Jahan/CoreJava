package com.techouts.assessment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class _20Exception {

	public static void main(String[] args) throws ClassNotFoundException {
		 final String url = "jdbc:postgresql://localhost:5432/userdata";
		   final String username = "postgres";
		   final String pswd = "admin";
		   Class.forName("org.postgresql.Driver");
		   try(Connection con = DriverManager.getConnection(url,username,pswd);
				   PreparedStatement ps = con.prepareStatement("UPDATE employee SET salary = ? WHERE id=?")){
			 
	}catch(SQLException e) {
		System.out.println(e);
	}
/*
 * here we are using try catch and throws for exception handling 
 * and we are using try with resources for resource closing
 */
}
}
