<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Seed</title>
</head>
<body>
<h1>Add New Seed</h1>
<div><form action="AddSeed" method="post">
<div>Seed Id: <input type="text" name="seedid" id="seedid" required></div>
<div>Category Id: <input type="text" name="categoryid" id="categoryid" required></div>
<div>Seed Name: <input type="text" name="seedname" id="seedname" required></div>
<div>Temperature: <input type="text" name="temperature" id="temperature" required></div>
<div>Image Path: <input type="text" name="path" id="path" required></div>
<div>Kilograms In Stock: <input type="text" name="kginstock" id="kginstock" required></div>
<div>Deposit Unit Price: <input type="text" name="depositprice" id="depositprice" required></div>
<div>Selling Unit Price: <input type="text" name="sellingprice" id="sellingprice" required></div>
<div><input type="submit" name="submit" id="submit" value="Submit"></div>
</form>
</div>
</body>
</html>