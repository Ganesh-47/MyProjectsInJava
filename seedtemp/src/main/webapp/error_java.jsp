<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Error</title>
</head>
<body>
<h1>Java Error</h1>
<p>Java Has Thrown An Exception</p>
<p>To Continue click the button</p>
<h2>Details</h2>
<p>Type: ${pageContext.exception["class"] }</p>
<p>Message: ${pageContext.exception.message }</p>
</body>
</html>