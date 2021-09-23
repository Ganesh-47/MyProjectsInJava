<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>
</head>
<body>
<%
out.write("<h1>Hi "+request.getAttribute("adminname")+" !!!</h1>");
%>
<h1>User Management System</h1><br>
<h2>Menu</h2>
	<div>
		<a href="AddNewUser.jsp">Add New User</a>
	</div>
	<div>
		<a href="UpdateUser.jsp">Update User Details</a>
	</div>
	<div>
		<a href="ApproveUser.jsp">Approve New Users</a>
	</div>
	<div>
		<a href="DeleteUser.jsp">Remove User</a>
	</div>
	<div>
		<a href="FindUser.jsp">Find User Details</a>
	</div>
	<div>
		<a href="ViewAllUsers.jsp">View All User's Details</a>
	</div>

</body>
</html>