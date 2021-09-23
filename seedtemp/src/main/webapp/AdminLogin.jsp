<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
<h1>Admin Login</h1>
<div>
<form action="AdminLoginServlet" method="post" >
<div>Enter Email Id: <input type="text" name="adminemail" id="adminemail"></div>
<div>Enter Password: <input type="password" name="adminpassword" id="adminpasswordl"></div>
<div><input type="submit" name="adminsubmit" id="adminsubmit" value="Login"></div>
</form>
</div>
</body>
</html>