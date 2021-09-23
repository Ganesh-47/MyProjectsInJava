<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accounting And Finance</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<style>
h1{
color:white;
}
body{
background-image:url("sky.jpg");
background-size:100%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
</style>
</head>
<body>
<h1 class="my-3">Accounts And Finance Management System</h1>
<center>
	<div class="card col-md-4 mt-5 mb-2">
		<a href="DepositDetailsServlet" class="nav-link">Seed Deposit Details</a>
	</div>
	<div class="card col-md-4 my-2">
		<a href="WithdrawDetailsServlet" class="nav-link">Seed Withdraw Details</a>
	</div>
	<div class="card col-md-4 my-2">
		<a href="ViewAllTransactionServlet" class="nav-link">View All Transaction</a>
	</div>
	<div class="card col-md-4 my-2">
		<a href="FindDeposit.jsp" class="nav-link">Find Deposit Details of Single User</a>
	</div>
	<div class="card col-md-4 my-2">
		<a href="FindWithdraw.jsp" class="nav-link">Find Order Details of Single User</a>
	</div>
</center>
</body>
</html>