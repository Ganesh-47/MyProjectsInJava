<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.aspire.seedbank.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Details</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>

<style>
h2{
font-size:20px;
}
body{
background-image:url("sky.jpg");
background-size:100%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
.user{
margin-left:150px;
margin-top:20px;
}
</style>
</head>
<body>
<center><h1 class="my-3">User Details</h1></center>
<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4 user">

<%
User user=(User)request.getAttribute("user");
out.write("<h2> User Id: "+ String.valueOf(user.getUserid())+"</h2>");
out.write("<h2> Name: "+ user.getUsername()+"</h2>");
out.write("<h2> Email: "+ user.getUseremail()+"</h2>");
out.write("<h2> Mobile: "+ String.valueOf(user.getUserphone())+"</h2>");
out.write("<h2> Address: "+ user.getUseraddress()+"</h2>");
out.write("<h2> City: "+ user.getUsercity()+"</h2>");
out.write("<h2> Pincode: "+ user.getUserpincode()+"</h2>");
out.write("<h2> User Accountnumber: "+ String.valueOf(user.getAccountnumber())+"</h2>");
out.write("<h2> Upi Id: "+ user.getUserupiid()+"</h2>");
out.write("<h2> Ifsc Code: "+ user.getUserifsc()+"</h2>");
out.write("<h2> Branch: "+ user.getUserbranch()+"</h2>");

%>
</div>
<div class="col-md-4"></div>
</div>
</body>
</html>