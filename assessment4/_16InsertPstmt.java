package com.techouts.assessment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _16InsertPstmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	   final String url = "jdbc:postgresql://localhost:5432/userdata";
	   final String username = "postgres";
	   final String pswd = "admin";
	   Class.forName("org.postgresql.Driver");
	   try(
	   Connection con = DriverManager.getConnection(url,username,pswd);
	   PreparedStatement ps = con.prepareStatement("INSERT INTO usertable VALUES(?,?,?)");Scanner sc = new Scanner(System.in);){
		   System.out.println("Enter id");
		   int id=sc.nextInt();
		   System.out.println("Enter username");
		   String uname = sc.next();
		   System.out.println("Enter password");
		   String password = sc.next();
		   ps.setInt(1,id );
		   ps.setString(2, uname);
		   ps.setString(3, password);
		   int rs=ps.executeUpdate();
		   System.out.println(rs + " inserted");
	   

	}

}
}