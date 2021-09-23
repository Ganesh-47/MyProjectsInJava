<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login Page</title>
<script src="Validate.js"></script>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
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
 font-size:60px;
 font-family: 'Grey Qo', cursive;
 font-family: 'Lobster', cursive;
}
h1:hover{
 color:yellow;
}
.ps1{
margin-left:7px;
width:240px;
}
.ps2{
margin-left:20px;
width:240px;
}
</style>
</head>
<body>
<center><h1 class="my-4">User Login</h1></center>
<center>
<div>
<form action="UserLoginServlet" method="post" >

<div class="form-floating col-md-2 ps1">
  <input type="email" class="form-control" name="useremail" id="email" placeholder="Email" onkeyup="validateEmail()" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" title="Email contains only one @ and the domain should be valid!!!" required><p id="errorMessage3" style="color: red"></p>
  <label>Email Id</label>
</div>
<div class="form-floating ps2">
<input type="password" name="userpassword" class="form-control" id="passwordl" onkeyup="validatePassword()" pattern="/[a-zA-Z!@#\$%\^\&*_=+-]{8,}$/g" title="password should contains atleast 1 upper case, one lower case, one number, one special character and length should be greaterthan 8" placeholder="Password" required><p id="errorMessage4" style="color: red"></p>
<label>Password</label>

<div><input type="submit" name="usersubmit"  id="usersubmit" value="Login" class="btn btn-lg my-3 btn-primary"></div>
</div>
</form>
</div>
</center>
</body>
</html>