package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import com.bridgelabz.connection.LoginDataAccess;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter("/Login")
public class loginFilter implements Filter {
	LoginDataAccess loginDataAccess = new LoginDataAccess();

	public void init(FilterConfig fConfig) throws ServletException {

	}

	/**
	 * The doFilter method of the Filter is called by the container each time a
	 * request/response pair is passed through the chain due to a client request for
	 * a resource at the end of the chain
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		PrintWriter printWriter = response.getWriter();
		String uName = request.getParameter("uName");
		String pswd = request.getParameter("pswd");
		if (loginDataAccess.checkDetails(uName, pswd)) {
			chain.doFilter(request, response);
		} else {
			printWriter.println("Invalid username or password");
		}
	}

	public void destroy() {

	}

}