package com.techouts.servlets;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static String url = "jdbc:postgresql://localhost:5432/userdata";
	static String user="postgres";
	static String pswd="admin";

	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(url, user, pswd);
	}
}
