<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.aspire.seedbank.entity.Admin"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Details</title>
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
<h1>Admin Details</h1>
<div>
<%
Admin admin=(Admin)request.getAttribute("admin");
out.write("<h2>Admin Id: "+String.valueOf(admin.getAdminid())+"</h2><br>");
out.write("<h2>Name: "+admin.getAdminname()+"</h2><br>");
out.write("<h2>Email: "+admin.getAdminemail()+"</h2><br>");
out.write("<h2>Phone: "+String.valueOf(admin.getAdminphone())+"</h2><br>");
out.write("<h2>Address: "+admin.getAdminaddress()+"</h2><br>");
out.write("<h2>City: "+admin.getAdmincity()+"</h2><br>");
out.write("<h2>Pincode: "+admin.getAdminpincode()+"</h2><br>");

%>
</div>
</body>
</html>