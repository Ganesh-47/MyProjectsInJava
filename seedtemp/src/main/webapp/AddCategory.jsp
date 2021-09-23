<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Category</title>
</head>
<body>
<h1>Add New Seed</h1>
<div><form action="AddCategory" method="post">
<div>Category Id: <input type="text" name="categoryid" id="categoryid" required></div>
<div>Category Name: <input type="text" name="categoryname" id="categoryname" required></div>
<div><input type="submit" name="submit" id="submit" value="Submit"></div>
</form>
</div>
</body>
</html>