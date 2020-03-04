package com.bridgelabz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Insert data into database table
 *
 */
public class UserDataAccess {
	
	public int insertUserDetails(UserDetails user) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/UserRecord?useSSL=false";
		String uname = "ankit";
		String password = "password";
		Connection connection = DriverManager.getConnection(url, uname, password);
		String insertQuery = "INSERT INTO user_data(firstName,lastName,email,mobile,firstPass,lastPass) VALUES(?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
		preparedStatement.setString(1, user.getFirstName());
		preparedStatement.setString(2, user.getLastName());
		preparedStatement.setString(3, user.getEmail());
		preparedStatement.setString(4, user.getMobile());
		preparedStatement.setString(5, user.getFirstPass());
		preparedStatement.setString(6, user.getLastPass());
		preparedStatement.executeUpdate();
		return 0;

	}
}
