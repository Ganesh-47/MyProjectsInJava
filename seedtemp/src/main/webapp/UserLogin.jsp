<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
</head>
<body>
<h1>User Login</h1>
<div>
<form action="UserLoginServlet" method="post">
<div>Enter Email Id: <input type="text" name="useremail" id="useremail"></div>
<div>Enter Password: <input type="password" name="userpassword" id="userpasswordl"></div>
<div><input type="submit" name="usersubmit" id="usersubmit" value="Login"></div>
</form>
</div>
</body>
</html>