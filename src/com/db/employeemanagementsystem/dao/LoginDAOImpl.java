package com.db.employeemanagementsystem.dao;

import java.sql.*;
import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.util.DBUtil;

public class LoginDAOImpl implements LoginDAO {

	public boolean authentication(LoginBean login) {
	
		String query = "select * from login_table where username= ? and password= ?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet= null; 
		
		
		connection = DBUtil.getConnection();
		// now we need to take statement or prepared statements or CallableStatement
		// statement is used DML- delete, update,insert ---- DDL- create, alter, drop
		// prepared statement compiles the structure only once and hits the db whenever necessary.
		// callable is the fastest one , it deals with procedures
		
		
		try {
			// the prepared statement is going to check whether the query string is valid or not
			preparedStatement = connection.prepareStatement(query);
			// in setString the parameterIndex is the order of question marks in query string
			preparedStatement.setString(1, login.getUserName());
			preparedStatement.setString(2, login.getPassword());
			
			// there are three methods to use
			// executeQuery() -- DQL -- select
			// executeUpdate() -- DML -- insert, delete, update
			// executeMethd() --DDL -- create, alter, drop
			
			resultSet = preparedStatement.executeQuery();
			
			// now to search the result set we can use if or loop
			// in situation ( if we have max one record ) "if" gives better performance
			
			//resultSet.next() returns a boolean value
			if( resultSet.next() ) {
				System.out.println("inside result set");
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		finally {
			// finally block will be called before returning the value to the callable (the execution if return statement)
			// all closure work is done in this work
			// here we need to close the connection
			DBUtil.closeConnection(connection);
		}
		
		return false;
	}

}
