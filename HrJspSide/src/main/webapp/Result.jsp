<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="hr.entity.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
</head>
<body>
<%
Employee emp=(Employee)request.getAttribute("employee");
out.write("<h2>"+emp.getId()+"</h2><br>");
out.write("<h2>"+emp.getName()+"</h2><br>");
out.write("<h2>"+emp.getCity()+"</h2><br>");
out.write("<h2>"+emp.getSalary()+"</h2>");
%>
</body>
</html>