<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
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
.admin{
 margin-top:200px;
 margin-left:20px;
}
</style>
</head>
<body>
  <div class="admin">
  <center>
<%
out.write("<h1>Hi "+request.getAttribute("adminname")+" !!!</h1>");
%></center>
    <div class="row my-2">
    <div class="col-md-4"></div>
	<div class="col-md-4 card" align="center">
		<a href="UserManagementPage.jsp" class="nav-link" align="center">User Management System</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row my-2">
	<div class="col-md-4"></div>
	<div class="col-md-4 card">
		<a href="AdminManagementPage.jsp" class="nav-link" align="center">Admin Management System</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row my-2">
	<div class="col-md-4"></div>
	<div class="col-md-4 card">
		<a href="SeedManagementPage.jsp" class="nav-link" align="center">Seed Management System</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row my-2">
	<div class="col-md-4"></div>
	<div class="col-md-4 card">
		<a href="AccountingAndFinancePage.jsp" class="nav-link" align="center">Accounting And Finance Management System</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row my-2">
	<div class="col-md-4"></div>
	<div class="col-md-4 card">
		<a href="ViewFeedback" class="nav-link" align="center">Feedback Management System </a>
	</div>
	<div class="col-md-4"></div>
	</div>
  </div>
</body>
</html>