<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feedback Form</title>
<script src="Validate.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<style>
h1{
color:white;
text-align:center;
}
h1:hover{
color:yellow;
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
margin-top:100px;
}
span{
color:red;
}
</style>
</head>
<body>
<h1>Feedback Form</h1>
<div><form action="AddNewFeedbackServlet" method="post">
<table>
<tr><td>Order Id <span>*</span></td><td><input type="number" placeholder="Enter Here" class="form-control my-2" name="orderid" id="id" onkeyup="validateId()" pattern="[0-9]{2,10}" title="Order Id should contains only numbers and length should be greater than 2 and not more than 10" size="50" required><p id="errorMessage12" style="color: red"></p></td></tr>
<tr><td>Feedback <span>*</span></td><td><input type="text" placeholder="Enter Here" class="form-control my-2" name="feedback" id="feedback"  title=" (contains number of repeating characters)" size="50" required></td></tr>
<tr><td colspan="2"><center><input type="submit" name="submit" id="submit" class="btn btn-primary" value="Register Issue"></center></td></tr>
</table>
</form>
</div>
</body>
</html>