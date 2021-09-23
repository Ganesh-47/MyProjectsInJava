<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notification</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
</head>
<body>
<%
out.write("<h1>"+request.getAttribute("notify")+"</h1>");
%>
<a href="Welcome.jsp" >Home</a>
</body>
</html>