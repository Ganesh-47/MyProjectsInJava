<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.HashSet,com.aspire.seedbank.entity.SeedView"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Seed List</title>
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
 <div id='seedlistform'>  
 
   <table class="table table-dark table-bordered"> 
   <tr  class="bg-warning text-warning"> 
    <th  >Seed Id</th> 
    <th  >Category Id</th> 
    <th  >Category Name</th> 
    <th  >Seed Name</th> 
    <th  >Temperature</th> 
    <th  >Image</th> 
    <th  >Kilograms in Stock</th> 
    <th  >Priceper Kilogram ()Deposit)</th> 
    <th  >Priceper Kilogram (Withdraw)</th> 
   </tr>
  <%
  HashSet<SeedView> seedhashset=(HashSet<SeedView>)request.getAttribute("seedhashset");
  StringBuilder htmlbuilder=new StringBuilder(500);
  for(SeedView seed:seedhashset)
  {
   htmlbuilder.append("<tr name='seedrow'"+seed.getSeedid()+" >");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(seed.getSeedid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(seed.getCategoryid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(seed.getCategoryname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  > ");
   htmlbuilder.append(seed.getSeedname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(seed.getTemperature());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(seed.getImage());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(seed.getKilogramsinstock());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(seed.getPriceperkilogramdeposite());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(seed.getPriceperkilogramwithdraw());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     

</body>
</html>