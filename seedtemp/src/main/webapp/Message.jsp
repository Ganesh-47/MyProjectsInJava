<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message</title>
</head>
<body>
		<%
			out.write("<h1>"+request.getAttribute("message")+"</h1>");
			out.write("<a href='Welcome.jsp'>Back to Home Page</a>");
		%>
</body>
</html>