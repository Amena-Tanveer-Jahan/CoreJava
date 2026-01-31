package com.techouts.assessment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class _18UpdateEmployee {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		 final String url = "jdbc:postgresql://localhost:5432/userdata";
		   final String username = "postgres";
		   final String pswd = "admin";
		   Class.forName("org.postgresql.Driver");
		   try(
		   Connection con = DriverManager.getConnection(url,username,pswd);
				   PreparedStatement ps = con.prepareStatement("UPDATE employee SET salary = ? WHERE id=?");
				   Scanner sc = new Scanner(System.in)){
			    System.out.println("Enter id: ");
			    int id = sc.nextInt();
			    System.out.println("Enter salary: ");
			    int salary = sc.nextInt();
			    ps.setInt(2, id);
			    ps.setInt(1, salary);
			   int rs = ps.executeUpdate();
			   System.out.println(rs + " Updated");
		   }
		   }
	}


