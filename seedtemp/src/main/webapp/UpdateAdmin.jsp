<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Admin</title>
</head>
<body>
<h1>Update Admin Details</h1>
<div><form action="UpdateAdmin" method="post">
<div>Admin Id: <input type="text" name="adminid" id="adminid" required></div>
<div>Name: <input type="text" name="adminname" id="adminname" required></div>
<div>Email: <input type="text" name="adminemail" id="adminemail" required></div>
<div>Phone: <input type="text" name="adminphone" id="adminphone" required></div>
<div>Address: <input type="text" name="adminaddress" id="adminaddress" required></div>
<div>City: <input type="text" name="admincity" id="admincity" required></div>
<div>Pin Code: <input type="text" name="adminpincode" id="adminpincode" required></div>
<div><input type="submit" name="adminsubmit" id="adminsubmit" value="Register"></div>
</form>
</div>
</body>
</html>