package com.techouts.assessment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class _17Fetch {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 final String url = "jdbc:postgresql://localhost:5432/userdata";
		   final String username = "postgres";
		   final String pswd = "admin";
		   Class.forName("org.postgresql.Driver");
		   try(
		   Connection con = DriverManager.getConnection(url,username,pswd);Statement s = con.createStatement();){
			   ResultSet rs=s.executeQuery("SELECT *FROM usertable");
		     while(rs.next()) {
		    	 System.out.println(rs.getInt(1)+" \t "+rs.getString(2)+" \t "+ rs.getString(3));
		   }
		   }

	}

}
