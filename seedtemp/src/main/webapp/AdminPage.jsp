<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
<%
out.write("<h1>Hi "+request.getAttribute("adminname")+" !!!</h1>");
%>
	<div>
		<a href="UserManagementPage.jsp">User Management System</a>
	</div>
	<div>
		<a href="AdminManagementPage.jsp">Admin Management System</a>
	</div>
	<div>
		<a href="SeedManagementPage.jsp">Seed Management System</a>
	</div>
	<div>
		<a href="AccountingAndFinancePage.jsp">Accounting And Finance Management System</a>
	</div>
	<div>
		<a href="FeedbackActionPage.jsp">Feedback Management System </a>
	</div>
</body>
</html>