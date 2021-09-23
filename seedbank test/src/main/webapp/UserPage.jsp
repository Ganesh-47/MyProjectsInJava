<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
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
<%
out.write("<h1>Hi "+request.getAttribute("username")+" !!!</h1>");
%>
<center>
<div>
<a href="DepositSeed.jsp" class="card nav-link my-1 col-md-5"> Deposit Seed</a><br>
<a href="WithdrawSeed.jsp" class="card nav-link my-1 col-md-5"> Purchase Seed</a><br>
<a href="FindDepositByUserServlet" class="card nav-link my-1 col-md-5"> History of Deposit</a><br>
<a href="FindWithdrawByUserServlet" class="card nav-link my-1 col-md-5"> History of Withdraw</a><br>
<a href="AddNewFeedBack.jsp" class="card nav-link my-1 col-md-5"> Report An Issue</a><br>
<a href="ViewAllSeedServlet" class="card nav-link my-1 col-md-5"> View All Seed</a>
</div>
</center>
</body>
</html>