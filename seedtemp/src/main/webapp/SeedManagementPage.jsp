<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seed Management</title>
</head>
<body>
<%
out.write("<h1>Hi "+request.getAttribute("adminname")+" !!!</h1>");
%>
<h1>Seed Management System</h1><br>
<h2>Menu</h2>
	<div>
		<a href="AddSeed.jsp">Add New Seed</a>
	</div>
	<div>
		<a href="UpdateSeed.jsp">Update Seed's Details</a>
	</div>
	<div>
		<a href="DeleteSeed.jsp">Remove Seed</a>
	</div>
	<div>
		<a href="FindSeed.jsp">Find Seed's Details</a>
	</div>
	<div>
		<a href="ViewAllSeed.jsp">View All Seed's Details</a>
	</div>
	<div>
		<a href="AddCategory.jsp">Add New Category</a>
	</div>
	<div>
		<a href="UpdateCategory.jsp">Update Category's Details</a>
	</div>
	<div>
		<a href="DeleteCategory.jsp">Remove Category</a>
	</div>
	<div>
		<a href="FindCategory.jsp">Find Category's Details</a>
	</div>
	<div>
		<a href="ViewAllCategory.jsp">View All Category's Details</a>
	</div>

</body>
</html>