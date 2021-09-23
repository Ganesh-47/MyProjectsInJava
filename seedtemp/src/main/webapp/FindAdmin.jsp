<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Admin</title>
</head>
<body>
<h1>Find Admin</h1>
<div><form action="FindAdminServlet" method="post">
<div>Admin Id: <input type="text" name="adminid" id="adminid" required></div>
<div><input type="submit" name="submit" id="submit" value="Find"></div>
</form>
</div>
</body>
</html>