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
import javax.servlet.http.HttpServletRequest;

import com.bridgelabz.connection.LoginDataAccess;

/**
 * Servlet Filter implementation class loginFilter
 */
@WebFilter("/Login")
public class loginFilter implements Filter {
	LoginDataAccess loginDataAccess=new LoginDataAccess();
	public void destroy() {
	
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter printWriter=response.getWriter();
		//HttpServletRequest httpServletRequest=(HttpServletRequest) request;
		String uName = request.getParameter("uName");
		String pswd = request.getParameter("pswd");
		if (loginDataAccess.checkDetails(uName, pswd)) {
			chain.doFilter(request, response);
		}
		else {
			printWriter.println("Invalid username or password");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
