package com.bridgelabz.submit;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@SuppressWarnings("serial")
@WebServlet("/Register")
public class Register extends HttpServlet {
	static String url = "jdbc:mysql://localhost:3306/UserRecord?useSSL=false";
	static String uname = "ankit";
	static String password = "password";
	String firstName,lastName,email,mobile,firstPass,lastPass;
	String insertQuery="INSERT INTO user_data VALUES('"+firstName+"','"+lastName+"','"+email+"',"+mobile+",'"+firstPass+"','"+lastPass+"')";
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/html");
		firstName= request.getParameter("firstName").toString();
		lastName = request.getParameter("lastName").toString();
		email = request.getParameter("emailID").toString();
		mobile = request.getParameter("contact").toString();
		firstPass = request.getParameter("pswd").toString();
		lastPass = request.getParameter("pswd1").toString();
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Driver Not Loaded");
			e1.printStackTrace();
		}
		try {
			
			connection=DriverManager.getConnection(url, uname, password);
		} catch (SQLException e) {
			System.out.println("Connection Problem");
			e.printStackTrace();
		}
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.executeUpdate();
			System.out.println("Data Inserted");
		} catch (SQLException e) {
			printWriter.println(e);
		}
	}

}
