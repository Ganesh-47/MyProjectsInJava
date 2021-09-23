<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register New User</title>
<script src="Validate.js"></script>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<style>
body{
background-image:url("sky.jpg");
background-size:100%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
table tr td{
 color:white;
 padding-bottom:10px;
}
h1{
 color:white;
 font-size:60px;
 font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
margin-top:30px;
}
h1:hover{
 color:yellow;
}
table{
margin-top:30px;
}
span{
color:red;
}
</style>
</head>
<body>
<center><h1>Register New User Form</h1></center>
<div>
<center>
<form action="AddNewUserServlet" name="registerform" method="post">
<table>
<tr><td>Name <span>*</span></td><td><input type="text" name="username" id="name" onkeyup="validateFirstname()" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="Name should contains only Alphabetes and shouldnot repeat 3 times and length should be atleast 2 and not more than 20"  class="form-control" placeholder="Enter Name Here" required><p id="errorMessage" style="color: red"></p></td></tr>
<tr><td>Email <span>*</span> </td><td><input type="email" name="useremail" id="email" onkeyup="validateEmail()" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="Email contains only one @ and the domain should be valid!!!" class="form-control" placeholder="Enter Mail Id" required><p id="errorMessage3" style="color: red"></p></td></tr>
<tr><td>Phone <span>*</span></td><td><input type="tel" name="userphone" id="phone" onkeyup="validatePhoneno()" pattern="[6789][0-9]{9,9}" title="Mobile number should contains only numbers and start with 6,7,8 or 9 and length should be 10" class="form-control" placeholder="Enter Phone Number" required><p id="errorMessage1" style="color: red"></p></td></tr>
<tr><td>Address <span>*</span> </td><td><input type="text" name="useraddress" id="address"  pattern="^[#.0-9a-zA-Z\s,-]+$"  title="Address in the format '1, North Street, Chennai - 11' " class="form-control" placeholder="Enter Address" required></p></td></tr>
<tr><td>City <span>*</span> </td><td><input type="text" name="usercity" id="city" onkeyup="validateCity()" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="City should contains only Alphabetes and shouldnot repeat 3 times and length should be atleast 2 and not more than 20" class="form-control" placeholder="Enter City" required><p id="errorMessage5" style="color: red"></p></td></tr>
<tr><td>Pin Code <span>*</span> </td><td><input type="tel" name="userpincode" id="pincode" onkeyup="validatePincode()" pattern="[6789][0-9]{5,5}" title="Pincode should contains only numbers and length should be 6 and starts with number greaterthan 5" class="form-control" placeholder="Enter Pincode" required><p id="errorMessage6" style="color: red"></td></tr>
<tr><td>Account Number <span>*</span> </td><td><input type="tel" name="accountnumber"id="accountnumber" onkeyup="validateAccountnumber()" pattern="[0-9]{5,15}" title="Account number should contains only numbers and length should be greaterthan 5 and less than 15"  class="form-control" placeholder="Enter Account Number" required><p id="errorMessage7" style="color: red"></td></tr>
<tr><td>UPI Id <span>*</span> </td><td><input type="text" name="userupiid" id="upiid" pattern="[a-z0-9@]{5,15}" title="Upi contains only Small letters one @ and the domain should be valid and domain should not contain more than 2 repeated characters!!!" class="form-control" placeholder="Enter UPI Id" required></td></tr>
<tr><td>IFSC Code <span>*</span> </td><td><input type="text" name="userifsc" id="ifsc" onkeyup="validateIfsc()" pattern="[0-9a-zA-Z]{5,15}" title="ifsc length should between 5-15!!!" class="form-control" placeholder="Enter IFSC Code" required><p id="errorMessage9" style="color: red"></td></tr>
<tr><td>Branch Name <span>*</span> </td><td><input type="text" name="userbranch" id="branch"  onkeyup="validateBranch()" pattern="^[A-Za-z\s]{1,}[\.]{0,1}[A-Za-z\s]{2,}$"  title="Branch should contains only Alphabetes and shouldnot repeat 3 times and legth should be atleast 2 and not more than 20" placeholder="Enter Branch Name" class="form-control" required><p id="errorMessage10" style="color: red"></td></tr>
<tr><td>New Password <span>*</span> </td><td><input type="password" name="userpassword" id="password" onkeyup="validatePassword()" pattern="/[a-zA-Z!@#\$%\^\&*_=+-]{8,}$/g" title="password should contains atleast 1 upper case, one lower case, one number, one special character and length should be greaterthan 8" placeholder="Enter New Password" class="form-control" required><p id="errorMessage4" style="color: red"></td></tr>
<tr><td>Reconform Password <span>*</span> </td><td><input type="password" name="userrepassword" id="repassword" onkeyup="reconform()" pattern="/[a-zA-Z!@#\$%\^\&*_=+-]{8,}$/g" title="password should contains atleast 1 upper case, one lower case, one number, one special character and length should be greaterthan 8" placeholder="Enter New Password" class="form-control" required><p id="errorMessage11" style="color: red"></td></tr>
<tr><td colspan="2"><center><input type="submit" name="usersubmit" id="usersubmit" class="btn btn-primary my-2" value="Register"></center></td></tr>
</table>
</form>
</center>
</div>
</body>
</html>