<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Category</title>
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
<div><form action="UpdateCategoryServlet" method="post" class="col-md-5">
<div>Category Id: <input type="number" name="categoryid" class="form-control mb-2" placeholder="Enter Here" size="50" id="categoryid" pattern="[0-9]{2,10}" title="Category Id should contains only numbers and length should be greater than 2 and not more than 10" required></div>
<div>Category Name: <input type="text" name="categoryname" class="form-control mb-2" placeholder="Enter Here" size="50" id="categoryname" pattern="^[A-Za-z\s]{1,}[\.]{0,1}[A-Za-z\s]{2,20}$"  title="Category Name should contains only Alphabates and shouldnot repeat 3 times and legth should be atleast 2 and not more than 20" required></div>
<div><input type="submit" name="submit" id="submit" class="btn btn-primary" value="Update"></div>
</form>
</div>
</body>
</html>