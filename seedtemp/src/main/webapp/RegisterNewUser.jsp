<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New User</title>
</head>
<body>
<h1>New User Registration Form</h1>
<div><form action="NewUserRegistrationServlet" method="post">
<div>Name: <input type="text" name="newusername" id="newusername" required></div>
<div>Email: <input type="text" name="newuseremail" id="newuseremail" required></div>
<div>Phone: <input type="text" name="newuserphone" id="newuserphone" required></div>
<div>Address: <input type="text" name="newuseraddress" id="newuseraddress" required></div>
<div>City: <input type="text" name="newusercity" id="newusercity" required></div>
<div>Pin Code: <input type="text" name="newuserpincode" id="newuserpincode" required></div>
<div>Account Number: <input type="text" name="newuseraccountnumber" id="newuseraccountnumber" required></div>
<div>UPI Id: <input type="text" name="newuserupiid" id="newuserupiid" required></div>
<div>IFSC Code: <input type="text" name="newuserifsc" id="newuserifsc" required></div>
<div>Branch Name: <input type="text" name="newuserbranch" id="newuserbranch" required></div>
<div>New Password: <input type="password" name="newuserpassword" id="newuserpassword" required></div>
<div><input type="submit" name="newusersubmit" id="newusersubmit" value="Register"></div>
</form>
</div>
</body>
</html>