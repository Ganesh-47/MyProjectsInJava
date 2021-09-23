<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Seed</title>
</head>
<body>
<h1>Remove Seed</h1>
<div><form action="DeleteSeedServlet" method="post">
<div>Seed Id: <input type="text" name="userid" id="userid" required></div>
<div><input type="submit" name="submit" id="submit" value="Remove"></div>
</form>
</div>
</body>
</html>