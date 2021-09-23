<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Seed</title>
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
<h1>Update Seed</h1>
<div><form action="UpdateSeedServlet" method="post" class="my-3">
<table>
<tr><td>Seed Id <span>*</span> </td><td><input type="number" class="form-control" placeholder="Enter Here" name="seedid" id="seedid" pattern="[0-9]{2,10}" size="50" title="Seed Id should contains only numbers and length should be greater than 2 and not more than 10" required></td></tr>
<tr><td>Category Id <span>*</span> </td><td> <input type="number" class="form-control" placeholder="Enter Here" name="categoryid" id="categoryid" size="50" pattern="[0-9]{2,10}" title="Category Id should contains only numbers and length should be greater than 2 and not more than 10" required></td></tr>
<tr><td>Seed Name<span>*</span> </td><td><input type="text" class="form-control" placeholder="Enter Here" name="seedname" id="seedname" size="50" pattern="^[A-Za-z\s]{1,}[\.]{0,1}[A-Za-z\s]{2,20}$"  title="Seed Name should contains only Alphabates and shouldnot repeat 3 times and legth should be atleast 2 and not more than 20" required></td></tr>
<tr><td>Temperature<span>*</span> </td><td><input type="number" class="form-control" placeholder="Enter Here" name="temperature" size="50" id="temperature" pattern="[0-9]{1,2}" title="Temperature should contains only numbers and length should be lessthan 3" required></td></tr>
<tr><td>Image Path<span>*</span> </td><td><input type="text" class="form-control" placeholder="Enter Here" name="image" id="image" size="50" required></td></tr>
<tr><td>Kilograms In Stock<span>*</span> </td><td><input type="number" class="form-control" placeholder="Enter Here" name="kginstock" size="50" id="kginstock" pattern="[0-9]{1,4}" title="Weight should contains only numbers and length should be lessthan 5" required></td></tr>
<tr><td>Deposit Unit Price<span>*</span> </td><td><input type="number" class="form-control" placeholder="Enter Here" name="depositprice" size="50" id="depositprice" pattern="[0-9]{1,3}" title="Temperature should contains only numbers and length should be lessthan 4" required></td></tr>
<tr><td>Selling Unit Price<span>*</span> </td><td><input type="number" class="form-control" placeholder="Enter Here" name="sellingprice" size="50" id="sellingprice" required></td></tr>
<tr><td colspan="2"><center><input type="submit" name="submit" id="submit" class="btn btn-primary" value="Update"></center></td></tr>
</table>
</form>
</div>
</body>
</html>