package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import projects.exception.DbException;

public class DbConnection {
	private static String HOST = "localhost";
	private static String PASSWORD = "Kppe2331";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "twright";
	
	public static Connection getConnection() throws DbException {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s", HOST, PORT, SCHEMA, USER, PASSWORD);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Connection to tschema " + SCHEMA + " is successful.");
			return conn;
			}catch (SQLException e) {
			 System.out.println("Unable to get connection at " + url);
			 throw new DbException("Unable to get connection at " + url);
		}
	}
}
