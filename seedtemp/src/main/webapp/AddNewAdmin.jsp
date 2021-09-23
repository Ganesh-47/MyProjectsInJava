<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Admin</title>
</head>
<body>
<h1>New Admin Registration Form</h1>
<div><form action="AddNewAdminServlet" method="post">
<div>Name: <input type="text" name="adminname" id="adminname" required></div>
<div>Email: <input type="text" name="adminemail" id="adminemail" required></div>
<div>Phone: <input type="text" name="adminphone" id="adminphone" required></div>
<div>Address: <input type="text" name="adminaddress" id="adminaddress" required></div>
<div>City: <input type="text" name="admincity" id="admincity" required></div>
<div>Pin Code: <input type="text" name="adminpincode" id="adminpincode" required></div>
<div>New Password: <input type="password" name="adminpassword" id="adminpassword" required></div>
<div><input type="submit" name="adminsubmit" id="adminsubmit" value="Register"></div>
</form>
</div>
</body>
</html>