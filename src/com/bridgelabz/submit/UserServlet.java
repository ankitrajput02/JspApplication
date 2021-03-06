package com.bridgelabz.submit;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.connection.UserDataAccess;
import com.bridgelabz.connection.UserDetails;

/**
 * Servlet implementation class UserServlet
 */

@SuppressWarnings("serial")
@WebServlet("/UserServlet")
/**
 * HttpServlet:Provides an abstract class to be subclassed to create an HTTP servlet suitable for a Web site
 *
 */
public class UserServlet extends HttpServlet {
	UserDataAccess userDataAccess=new UserDataAccess();
	
	/**doPost () is used to update or post some information to the server.
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String mobile=request.getParameter("contact");
		String firstPass=request.getParameter("pswd");
		String lastPass=request.getParameter("pswd1");
		UserDetails userDetails=new UserDetails();
		userDetails.setFirstName(firstName);
		userDetails.setLastName(lastName);
		userDetails.setEmail(email);
		userDetails.setMobile(mobile);
		userDetails.setFirstPass(firstPass);
		userDetails.setLastPass(lastPass);
		try {
			userDataAccess.insertUserDetails(userDetails);
			response.sendRedirect("Form2.jsp");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		
	}

}
