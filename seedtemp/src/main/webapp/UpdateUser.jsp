<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User Details</title>
</head>
<body>
<h1>Update User Details</h1>
<div><form action="UpdateUser" method="post">
<div>UserId: <input type="text" name="userid" id="userid" required></div>
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
<div><input type="submit" name="usersubmit" id="usersubmit" value="Update"></div>
</form>
</div>
</body>
</html>