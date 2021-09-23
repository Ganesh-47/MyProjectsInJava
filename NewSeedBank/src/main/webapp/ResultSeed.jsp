<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.aspire.seedbank.entity.SeedView"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seed Details</title>
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
</style>
</head>
<body>
<h1>Seed Details</h1>
<div>
<%
SeedView seed=(SeedView)request.getAttribute("seed");
out.write("<h2>Seed Id: "+String.valueOf(seed.getSeedid())+"</h2><br>");
out.write("<h2>Category Id: "+String.valueOf(seed.getCategoryid())+"</h2><br>");
out.write("<h2>Category Name: "+seed.getCategoryname()+"</h2><br>");
out.write("<h2>Seed Name: "+seed.getSeedname()+"</h2><br>");
out.write("<h2>Temperature: "+seed.getTemperature()+"</h2><br>");
out.write("<h2>Image: "+seed.getImage()+"</h2><br>");
out.write("<h2>Kilograms in Stock: "+seed.getKilogramsinstock()+"</h2><br>");
out.write("<h2>Price per Kilogram (deposite): "+seed.getPriceperkilogramdeposite()+"</h2><br>");
out.write("<h2>Price per Kilogram(withdraw): "+seed.getPriceperkilogramwithdraw()+"</h2><br>");
%>
</div>

</body>
</html>