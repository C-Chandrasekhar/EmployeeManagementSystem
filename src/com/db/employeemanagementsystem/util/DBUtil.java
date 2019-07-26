package com.db.employeemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static final String USER_NAME = "root";
	public static final String PASSWORD = "";
	public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String URI = "jdbc:mysql://localhost:3306/sample" ;

	public static Connection getConnection() {
		
		Connection connection= null;
		
		try {
			Class.forName(DRIVER_NAME);
			connection = DriverManager.getConnection(URI, USER_NAME , PASSWORD);
			return connection;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
		
	}
	
	public static void closeConnection (Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 1. load driver class
	// 2. get the connection from get connection method of driver manager class
	// 3. 
	
}
