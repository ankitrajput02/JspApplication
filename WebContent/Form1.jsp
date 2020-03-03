<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First Page</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control","no-catch,no-store,must-revalidate");
		if(session.getAttribute("uName")==null){
			response.sendRedirect("LogIn.jsp");
		}
	%>
<div align="center">
<h1 align="center">User is Log In</h1>
<form action="LogOut">

<input type="submit" value="LogOut">
</form>
</div>
</body>
</html>