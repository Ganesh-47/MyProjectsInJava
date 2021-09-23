<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New Admin</title>
<script src="Validate.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<style>
h1{
color:white;
text-align:center;
}
body{
background-image:url("sky.jpg");
background-size:100%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
form{
margin-left:370px;
}
span{
color:red;
}
</style>
</head>
<body>
<h1 class="my-3">New Admin Registration Form</h1>
<div><form action="AddNewAdminServlet" method="post">
<table>
<tr class="my-2"><td style="color:white;">Name  <span>*</span></td><td><input type="text" class="form-control" name="adminname" id="name" onkeyup="validateFirstname()" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="Name should contains only Alphabetes and shouldnot repeat 3 times and length should be atleast 2 and not more than 20" size="50" placeholder="Enter Here" required><p id="errorMessage" style="color: red"></p></td></tr>
<tr class="my-2"><td style="color:white;">Email   <span>*</span>   </td><td><input type="email" class="form-control" name="adminemail" id="email" onkeyup="validateEmail()" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="Email contains only one @ and the domain should be valid!!!" size="50" placeholder="Enter Here" required></td><p id="errorMessage3" style="color: red"></p></tr>
<tr class="my-2"><td style="color:white;">Phone   <span>*</span>   </td><td><input type="tel" class="form-control" name="adminphone" id="phone" onkeyup="validatePhoneno()" pattern="[6789][0-9]{9,9}" title="Mobile number should contains only numbers and start with 6,7,8 or 9 and length should be 10" size="50" placeholder="Enter Here" required><p id="errorMessage1" style="color: red"></td></tr>
<tr class="my-2"><td style="color:white;">Address   <span>*</span> </td><td><input type="text" class="form-control" name="adminaddress" id="address" onkeyup="validateAddress()" pattern="^[#.0-9a-zA-Z\s,-]+$"  title="Address in the format '1, North Street, Chennai - 11' " size="50" placeholder="Enter Here" required><p id="errorMessage2" style="color: red"></td></tr>
<tr class="my-2"><td style="color:white;">City   <span>*</span>    </td><td><input type="text" class="form-control" name="admincity" id="city" onkeyup="validateCity()" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="City should contains only Alphabetes and shouldnot repeat 3 times and length should be atleast 2 and not more than 20" size="50" placeholder="Enter Here" required><p id="errorMessage5" style="color: red"></p></td></tr>
<tr class="my-2"><td style="color:white;">Pin Code   <span>*</span></td><td><input type="tel" class="form-control" name="adminpincode" id="pincode" onkeyup="validatePincode()" pattern="[6789][0-9]{5,5}" title="Pincode should contains only numbers and length should be 6" required size="50" placeholder="Enter Here"></td><p id="errorMessage" style="color: red"></p></tr>
<tr class="my-2"><td style="color:white;">New Password   <span>*</span> </td><td><input type="password" class="form-control" name="adminpassword" id="password" onkeyup="validatePassword()" pattern="/[a-zA-Z!@#\$%\^\&*_=+-]{8,12}$/g" title="password should contains atleast 1 upper case, one lower case, one number, one special character and length should be greaterthan 8" placeholder="Enter Here" size="50" required><p id="errorMessage4" style="color: red"></p></td></tr>
<tr class="my-2"><td style="color:white;">Re Enter Password   <span>*</span> </td><td><input type="password" class="form-control" name="adminpassword" id="repassword" onkeyup="reconform()" pattern="/[a-zA-Z!@#\$%\^\&*_=+-]{8,12}$/g" title="password should contains atleast 1 upper case, one lower case, one number, one special character and length should be greaterthan 8" placeholder="Enter Here" size="50" required><p id="errorMessage11" style="color: red"></p></td></tr>
<tr class="my-2"><td colspan="2"><center><input type="submit" name="adminsubmit" id="adminsubmit" class="btn btn-primary" value="Register"></center></td></tr>
</table></form>
</div>
</body>
</html>