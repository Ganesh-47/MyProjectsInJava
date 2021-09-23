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
<div><form action="AddNewUserServlet" method="post">
<div>Name: <input type="text" name="username" id="username" required></div>
<div>Email: <input type="text" name="useremail" id="useremail" required></div>
<div>Phone: <input type="text" name="userphone" id="userphone" required></div>
<div>Address: <input type="text" name="useraddress" id="useraddress" required></div>
<div>City: <input type="text" name="usercity" id="usercity" required></div>
<div>Pin Code: <input type="text" name="userpincode" id="userpincode" required></div>
<div>Account Number: <input type="text" name="accountnumber" id="newuseraccountnumber" required></div>
<div>UPI Id: <input type="text" name="userupiid" id="userupiid" required></div>
<div>IFSC Code: <input type="text" name="userifsc" id="userifsc" required></div>
<div>Branch Name: <input type="text" name="userbranch" id="userbranch" required></div>
<div>New Password: <input type="password" name="userpassword" id="userpassword" required></div>
<div><input type="submit" name="usersubmit" id="usersubmit" value="Register"></div>
</form>
</div>
</body>
</html>