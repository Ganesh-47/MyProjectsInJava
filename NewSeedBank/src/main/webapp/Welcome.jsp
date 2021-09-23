<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Grey+Qo&family=Lobster&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<title>Welcome</title>
</head>
<style>
body{
background-image:url("sky.jpg");
background-size:100%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
.container {
  position: relative;
  text-align: center;
  color: white;
  
}
.top-left {
  color:black;
  position: absolute;
  top: 50%;
  left: 40%;
  transform: translate(-20%, -80%);
}
#banner img
{
width:100%;
padding-bottom:20px;
}
h1{
 margin-top:300px;
 margin-left:400px;
 font-size:60px;
 font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
.w3-bar-item{
font-size:20px;
}
h1:hover{
 color:yellow;
}
</style>
<body>
<div class="w3-bar w3-black p-3">
  <a class="w3-bar-item w3-button" href="AdminLogin.jsp">Admin Login</a>
  <a class="w3-bar-item w3-button" href="UserLogin.jsp">User Login</a>
  <a class="w3-bar-item w3-button" href="AddNewUser.jsp">Register New Account</a>
</div>
<h1><b>Seed Bank Management System</b></h1>
</body>
</html>