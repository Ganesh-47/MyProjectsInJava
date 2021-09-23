<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seed Management</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
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
</style>
</head>
<body>
<center><h1 class="my-3">Seed Management System</h1></center>
<div class="row">
<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="AddSeed.jsp" class="nav-link" align="center">Add New Seed</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="UpdateSeed.jsp" class="nav-link" align="center">Update Seed's Details</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="DeleteSeed.jsp" class="nav-link" align="center">Remove Seed</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="FindSeed.jsp" class="nav-link" align="center">Find Seed's Details</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="ViewAllSeedServlet" class="nav-link" align="center">View All Seed's Details</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="AddCategory.jsp" class="nav-link" align="center">Add New Category</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="UpdateCategory.jsp" class="nav-link" align="center">Update Category's Details</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="FindCategory.jsp" class="nav-link" align="center">Find Category's Details</a>
	</div>
	<div class="col-md-4"></div>
	</div>
	<div class="row">
	<div class="col-md-4"></div>
	<div class="card col-md-4 my-2">
		<a href="ViewAllCategoryServlet" class="nav-link" align="center">View All Category's Details</a>
	</div>
	<div class="col-md-4"></div>
	</div>
</div>

</body>
</html>