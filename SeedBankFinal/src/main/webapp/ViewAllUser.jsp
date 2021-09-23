<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.HashSet,com.aspire.seedbank.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users List</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<style>
body{
background-image:url("sky.jpg");
background-size:200%;
background-repeat:no-repeat;
position:center;
font-family: 'Grey Qo', cursive;
font-family: 'Lobster', cursive;
}
table tr td{
color:white;
}
</style>
</head>
<body background-image="sky.jpg">
<div>
 <a href="Welcome.jsp" class="btn btn-primary my-3">Home</a>
 </div>
 <div id='userlistform'> 
  
   <table class="table table-dark table-bordered"> 
   <tr class="bg-warning text-warning"> 
    <th  >User Id</th> 
    <th  >Name</th> 
    <th  >Email</th> 
    <th  >Phone</th> 
    <th  >Address</th> 
    <th  >City</th> 
    <th  >Pincode</th> 
    <th  >Account Number</th> 
    <th  >UPI Id</th> 
    <th  >IFSC</th> 
    <th  >Branch</th> 
   </tr>
  <%
  HashSet<User> userhashset=(HashSet<User>)request.getAttribute("userhashset");
  StringBuilder htmlbuilder=new StringBuilder(500);
  for(User user:userhashset)
  {
   htmlbuilder.append("<tr name='userrow'"+user.getUserid()+" >");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(user.getUserid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(user.getUsername());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(user.getUseremail());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  > ");
   htmlbuilder.append(String.valueOf(user.getUserphone()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(user.getUseraddress());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(user.getUsercity());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(user.getUserpincode());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(String.valueOf(user.getAccountnumber()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(user.getUserupiid());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(user.getUserifsc());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(user.getUserbranch());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     

</body>
</html>