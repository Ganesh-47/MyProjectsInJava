<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Seed</title>
</head>
<body>
<h1>Find Seed</h1>
<div><form action="FindSeedServlet" method="post">
<div>Seed Id: <input type="text" name="seedid" id="seedid" required></div>
<div><input type="submit" name="submit" id="submit" value="Find"></div>
</form>
</div>
</body>
</html>