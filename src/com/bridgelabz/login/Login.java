package com.bridgelabz.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.connection.LoginDataAccess;

/**
 * Servlet implementation class Login
 */
@SuppressWarnings("serial")
@WebServlet("/Login")
public class Login extends HttpServlet {
	LoginDataAccess loginDataAccess = new LoginDataAccess();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uName = request.getParameter("uName");
		String pswd = request.getParameter("pswd");
		if (loginDataAccess.checkDetails(uName, pswd)) {
			HttpSession session = request.getSession();
			session.setAttribute("uName", uName);
			String location = "Form1.jsp";
			response.sendRedirect(location);
		} else {
			response.sendRedirect("LogIn.jsp");
		}
	}

}
