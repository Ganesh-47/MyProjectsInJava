<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Seed</title>
<script src="Validate.js"></script>
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
}
h1:hover{
 color:yellow;
}
</style> 
</head>
<body>
<h1>Add New Seed</h1>
<div><form action="AddSeedServlet" method="post" class="col-md-5">
<div style="color:white;">Category Id: 		<input type="number" class="form-control" name="categoryid" id="id" onkeyup="validateId()" size="50" pattern="[0-9]{2,10}" title="Category Id should contains only numbers and length should be greater than 2 and not more than 10" required><p id="errorMessage12" style="color: red"></p></div>
<div style="color:white;">Seed Name: 		<input type="text" class="form-control" name="seedname" id="name" onkeyup="validateFirstname()" size="50" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="Seed Name should contains only Alphabates and shouldnot repeat 3 times and legth should be atleast 2 and not more than 20" required><p id="errorMessage" style="color: red"></p></div>
<div style="color:white;">Temperature: 		<input type="number" class="form-control" name="temperature" id="temperature" size="50" pattern="[0-9]{1,2}" title="Temperature should contains only numbers and length should be lessthan 3" required></div>
<div style="color:white;">Image Path: 		<input type="text" class="form-control" name="image" id="image" size="50" required></div>
<div style="color:white;">Kilograms In Stock:<input type="number" class="form-control" name="kginstock" id="kginstock" size="50" pattern="[0-9]{1,4}" title="Weight should contains only numbers and length should be lessthan 5" required></div>
<div style="color:white;">Deposit Unit Price:<input type="number" class="form-control" name="depositprice" id="depositprice" size="50" pattern="[0-9]{1,3}" title="Temperature should contains only numbers and length should be lessthan 4" required></div>
<div style="color:white;">Selling Unit Price:<input type="number" class="form-control" name="sellingprice" id="sellingprice" size="50" pattern="[0-9]{1,3}" title="Temperature should contains only numbers and length should be lessthan 4" required></div>
<div><center><input type="submit" name="submit" id="submit" class="btn btn-primary my-3" value="Add Seed"></center></div>
</form>
</div>
</body>
</html>