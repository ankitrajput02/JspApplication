<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registration</title>
</head>
<body>
	<form action="UserServlet" method="post">
		<h1 align="center">Registration Form</h1>
		<div align="center">
			<table>
				<tr>
					<td><label for="firstName">First Name:</label></td>
					<td><input type="text" id="firstName" maxlength="12"
						name="firstName" placeholder="Your name" required><br></td>
				</tr>
				<tr>
					<td><label for="lastName">Last Name:</label></td>
					<td><input type="text" id="lastName" maxlength="12"
						name="lastName" placeholder="Your last name" required><br></td>
				</tr>
				<tr>
					<td><label for="email">Email Address:</label></td>
					<td><input type="email" id="email" name="email"
						placeholder="abc@example.com" required><br></td>
				</tr>
				<tr>
					<td><label for="contact">Mobile No:</label></td>
					<td><input type="tel" id="contact" min="10" maxlength="10"
						name="contact" placeholder="Phone number" required><br></td>
				</tr>
				<tr>
					<td><label for="pswd">Password:</label></td>
					<td><input type="password" id="pswd" name="pswd"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
						placeholder="Password" required><br></td>
				</tr>
				<tr>
					<td><label for="pswd1">Confirm Password:</label></td>
					<td><input type="password" id="pswd1" name="pswd1"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"
						placeholder="Confirm Password" required><br></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" id="btnSubmit" value="Submit"
						onclick="return Validate()" /></td>
					<!-- <td><button type="submit">Submit</button></td> -->
				</tr>
			</table>
		</div>
		<div align="center">
			<table>
				<tr>
					<td><p>
							If Already Register..<a href="LogIn.jsp">Log In</a>
						</p></td>

				</tr>
			</table>
		</div>
	</form>
	<script>
		function Validate() {
			var password = document.getElementById("pswd").value;
			var confirmPassword = document.getElementById("pswd1").value;
			if (password != confirmPassword) {
				alert("Passwords do not match.");
				return false;
			}
			return true;
		}
	</script>
</body>
</html>