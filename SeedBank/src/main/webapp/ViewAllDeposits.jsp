<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.HashSet,com.aspire.seedbank.entity.DepositViewer"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit List</title>
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
 <div id='depositlistform'>
   <table class="table table-striped table-dark"> 
   <tr class="text-warning"> 
    <th  >Deposit Id</th> 
    <th  >User Id</th> 
    <th  >User Name</th> 
    <th  >Seed Id</th> 
    <th  >Seed Name</th> 
    <th  >Category Id</th> 
    <th  >Category Name</th> 
    <th  >Quantity</th> 
    <th  >Deposit Date</th> 
    <th  >Transaction Id</th> 
    <th  >Amount</th> 
    <th  >Account Number</th> 
    <th  >Date of Transaction</th> 
    <th  >Ifsc</th> 
   </tr>
  <%
  HashSet<DepositViewer> deposithashset=(HashSet<DepositViewer>)request.getAttribute("deposithashset");
  StringBuilder htmlbuilder=new StringBuilder(500);
  for(DepositViewer deposit:deposithashset)
  {
   htmlbuilder.append("<tr name='depositrow'"+deposit.getDepositid()+" >");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(deposit.getDepositid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(deposit.getUserid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getUsername());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  > ");
   htmlbuilder.append(String.valueOf(deposit.getSeedid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(deposit.getSeedname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(String.valueOf(deposit.getCategoryid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getCategoryname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getQuantity());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getDepositdate());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(String.valueOf(deposit.getTransactionid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getAmount());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(String.valueOf(deposit.getAccountnumber()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getDateoftransaction());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(deposit.getIfsc());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     


</body>
</html>