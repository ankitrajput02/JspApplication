package com.bridgelabz.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Check User name and password is present in database or not

public class LoginDataAccess {
	static String url = "jdbc:mysql://localhost:3306/UserRecord?useSSL=false";
	static String uname = "ankit";
	static String password = "password";
	String loginQuery = "SELECT * FROM user_data WHERE email=? AND firstPass=?";

	/**
	 * @param uName email
	 * @param pswd	password
	 * @return true if data found else false
	 */
	public boolean checkDetails(String uName, String pswd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, uname, password);
			PreparedStatement preparedStatement = connection.prepareStatement(loginQuery);
			preparedStatement.setString(1, uName);
			preparedStatement.setString(2, pswd);
			ResultSet rs = preparedStatement.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
