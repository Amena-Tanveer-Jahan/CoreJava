package com.techouts.assessment4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _15DBConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	final String url = "jdbc:postgresql://localhost:5432/userdata";
	final String username = "postgres";
	final String pswd = "admin";
    Class.forName("org.postgresql.Driver");
    Connection con = DriverManager.getConnection(url,username,pswd);
    System.out.println("Connected");
    con.close();

	}
}

