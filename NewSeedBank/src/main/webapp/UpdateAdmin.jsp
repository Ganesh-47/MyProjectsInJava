<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Admin</title>
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
text-align:center;
}
form{
margin-left:450px;
color:white;
}
h1:hover{
 color:yellow;
}
span{
color:red;
}
</style>
</head>
<body>
<h1>Update Admin Details</h1>
<div style="margin-left:100px;" class="mt-3"><form action="UpdateAdminServlet" method="post">
<table>
<tr><td>Admin Id :<span>*</span>  </td><td><input type="number" class="form-control" placeholder="Enter Here" name="adminid" id="adminid" pattern="[0-9]{2,10}" title="Admin Id should contains only numbers and length should be greater than 2 and not more than 10"  required></td></tr>
<tr><td>Name :<span>*</span>  </td><td><input type="text" name="adminname" class="form-control" placeholder="Enter Here" id="adminname" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="Name should contains only Alphabetes and shouldnot repeat 3 times and legth should be atleast 2 and not more than 20"  required></td></tr>
<tr><td>Email :<span>*</span>  </td><td><input type="text" name="adminemail" class="form-control" placeholder="Enter Here" id="adminemail" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="Email contains only one @ and the domain should be valid!!!"  required></td></tr>
<tr><td>Phone :<span>*</span>  </td><td><input type="number" name="adminphone" class="form-control" placeholder="Enter Here" id="adminphone" pattern="[6789][0-9]{9,9}" title="Mobile number should contains only numbers and start with 6,7,8 or 9 and length should be 10"  required></td></tr>
<tr><td>Address :<span>*</span>  </td><td><input type="text" name="adminaddress" class="form-control" placeholder="Enter Here" id="adminaddress" pattern="^[#.0-9a-zA-Z\s,-]+$"  title="Address in the format '1, North Street, Chennai - 11' "  required></td></tr>
<tr><td>City :<span>*</span>  </td><td><input type="text" name="admincity" class="form-control" placeholder="Enter Here" id="admincity" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="City should contains only Alphabetes and shouldnot repeat 3 times and legth should be atleast 2 and not more than 20"  required></td></tr>
<tr><td>Pin Code :<span>*</span>  </td><td><input type="number" name="adminpincode" class="form-control" placeholder="Enter Here" id="adminpincode" pattern="[6789][0-9]{5,5}" title="Pincode should contains only numbers and length should be 6 and starts with number greaterthan 5"  required></td></tr>
<tr><td colspan="2"><center><input type="submit" name="adminsubmit" id="adminsubmit" class="btn btn-primary" value="Update"></center></td></tr>
</table>
</form>
</div>
</body>
</html>