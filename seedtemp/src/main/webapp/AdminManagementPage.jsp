<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Management</title>
</head>
<body>
<%
out.write("<h1>Hi "+request.getAttribute("adminname")+" !!!</h1>");
%>
<h1>Admin Management System</h1><br>
<h2>Menu</h2>
	<div>
		<a href="AddNewAdmin.jsp">Add New Admin</a>
	</div>
	<div>
		<a href="UpdateAdmin.jsp">Update Admin Details</a>
	</div>
	<div>
		<a href="DeleteAdmin.jsp">Remove Admin</a>
	</div>
	<div>
		<a href="FindAdmin.jsp">Find Admin Details</a>
	</div>
	<div>
		<a href="ViewAllAdmin.jsp">View All Admin's Details</a>
	</div>

</body>
</html>