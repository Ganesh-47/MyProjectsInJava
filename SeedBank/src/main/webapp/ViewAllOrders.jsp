<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.HashSet,com.aspire.seedbank.entity.OrderViewer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdraw List</title>
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
 <div id='withdrawform'>

   <table class="table table-striped table-dark"> 
   <tr class="text-warning"> 
    <th  >Order Id</th> 
    <th  >User Id</th> 
    <th  >User Name</th> 
    <th  >Seed Id</th> 
    <th  >Seed Name</th> 
    <th  >Category Id</th> 
    <th  >Category Name</th> 
    <th  >Quantity</th> 
    <th  >Order Date</th> 
    <th  >Transaction Id</th> 
    <th  >Amount</th> 
    <th  >Account Number</th> 
    <th  >Date of Transaction</th> 
    <th  >Ifsc</th> 
   </tr>
  <%
  HashSet<OrderViewer> orderhashset=(HashSet<OrderViewer>)request.getAttribute("orderhashset");
  StringBuilder htmlbuilder=new StringBuilder(500);
  for(OrderViewer order:orderhashset)
  {
   htmlbuilder.append("<tr name='orderrow'"+order.getOrderid()+" >");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(order.getOrderid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(order.getUserid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getUsername());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  > ");
   htmlbuilder.append(String.valueOf(order.getSeedid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(order.getSeedname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(order.getCategoryid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getCategoryname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getQuantity());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getOrdereddate());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(String.valueOf(order.getTransacionid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getAmount());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getAccountnumber());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getDateoftransaction());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(order.getIfsc());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     


</body>
</html>