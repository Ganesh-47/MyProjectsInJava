<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Management</title>
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
<h1>User Management System</h1><br>
<h1>Menu</h1>
<center>
	<div class="card col-md-5 my-2">
		<a href="AddNewUser.jsp" class="nav-link">Add New User</a>
	</div>
	<div class="card col-md-5 my-2">
		<a href="UpdateUserByAdmin.jsp" class="nav-link">Update User Details</a>
	</div>
	<div class="card col-md-5 my-2">
		<a href="DeleteUser.jsp" class="nav-link">Remove User</a>
	</div>
	<div class="card col-md-5 my-2">
		<a href="FindUser.jsp" class="nav-link">Find User Details</a>
	</div>
	<div class="card col-md-5 my-2">
		<a href="ViewAllUserServlet" class="nav-link">View All User's Details</a>
	</div>
</center>

</body>
</html>