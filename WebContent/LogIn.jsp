<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogIn Window</title>
</head>
<body>
	<form action="Login" method="post">
	<div align="center">
		<h1>Log in to Page</h1>
		<table>
			<tr>
				<td><label for="uName">User name:</label></td>
				<td><input type="email" id="uName" name="uName"
					placeholder="Email Address" required><br></td>
			</tr>
			<tr>
				<td><label for="pswd">Password:</label></td>
				<td><input type="password" id="pswd" name="pswd"
					pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
					title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
					placeholder="Password" required> <input type="checkbox"
					onclick="Toggle()"> Show Password <br></td>
			</tr>
			<tr>

				<td><a href="registerWindow.jsp">New User</a></td>

				<td><button type="submit">Log In</button></td>


			</tr>
		</table>
		</div>
	</form>
	<script> 
    // Change the type of input to password or text 
        function Toggle() { 
            var temp = document.getElementById("pswd"); 
            if (temp.type === "password") { 
                temp.type = "text"; 
            } 
            else { 
                temp.type = "password"; 
            } 
        } 
</script>
</body>
</html>