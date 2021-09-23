<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.HashSet,com.aspire.seedbank.entity.Admin"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin List</title>
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
<div>
 <a href="Welcome.jsp" >Home</a>
 </div>
 <div id='adminlistform'>

   <table class="table table-dark table-bordered"> 
   <tr  class="bg-warning text-warning"> 
    <th  >Admin Id</th> 
    <th  >Admin Name</th> 
    <th  >Email</th> 
    <th  >Phone</th> 
    <th  >Address</th> 
    <th  >City</th> 
    <th  >Pincode</th> 
   </tr>
  <%
  HashSet<Admin> adminhashset=(HashSet<Admin>)request.getAttribute("adminhashset");
  StringBuilder htmlbuilder=new StringBuilder(500);
  for(Admin admin:adminhashset)
  {
   htmlbuilder.append("<tr name='adminrow'"+admin.getAdminid()+" >");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(admin.getAdminid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(admin.getAdminname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(admin.getAdminemail());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  > ");
   htmlbuilder.append(String.valueOf(admin.getAdminphone()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(admin.getAdminaddress());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(admin.getAdmincity());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(admin.getAdminpincode());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     
</body>
</html>