<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>


<body background="dumble.jpg">

<h1 style="color:white;font-size:25px;font-style:papyrus"> Register Form</h1>
<form action="MainController" method="post">
<h1 style="color:white;font-size:20px;font-style:garamond"> 
			<table style="with: 50%">
			<table class="center">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="Firstname" required="true" requiredMessage="Name is required" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="Lastname" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="Username" required="true" requiredMessage="Name is required" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="Address" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="Contact" /></td>
				</tr></table></h1>
			<a href="login.jsp" ></a><input type="submit" value="Submit" /></form>
			
</body>
</html>