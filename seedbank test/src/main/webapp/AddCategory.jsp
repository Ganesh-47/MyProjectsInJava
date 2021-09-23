<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Category</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<style>
h1{
color:white;
text-align:center;
}
body{
background-image:url("sky.jpg");
background-size:100%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
form{
margin-left:475px;
margin-top:200px;
}
</style>
</head>
<body>
<h1 class="mb-5">Add New Seed</h1>
<div class="mx-5">
<form action="AddCategoryServlet" method="post" class="col-md-4 my-2">
<label style="color:white;">Category Name :</label> <span style="color:red;">*</span><input type="text" class="form-control my-2" name="categoryname" id="categoryname" placeholder="Enter Here" pattern="^(?!.*([A-Za-z])\1{2})[A-Za-z]+$"  title="Category Name should contains only Alphabetes and shouldnot repeat 3 times and legth should be atleast 2" required>
<div><input type="submit" name="submit" class="btn btn-primary" id="submit" value="Add"></div>
</form>
</div>
</body>
</html>