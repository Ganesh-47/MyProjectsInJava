<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.HashSet,com.aspire.seedbank.entity.Category"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category List</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
</head>
<body>
<div>
 <a href="Welcome.jsp" >Home</a>
 </div>
 <div id='categorylistform'>  
   <table class="table table-dark table-bordered"> 
   <tr class="bg-warning text-warning"> 
    <th  >Category Id</th> 
    <th  >Category Name</th> 
    </tr>
  <%
  HashSet<Category> seedhashset=(HashSet<Category>)request.getAttribute("categoryhashset");
  StringBuilder htmlbuilder=new StringBuilder(500);
  for(Category seed:seedhashset)
  {
   htmlbuilder.append("<tr name='categoryrow'"+seed.getCategoryid()+" >");
   htmlbuilder.append("<td >");
   htmlbuilder.append(String.valueOf(seed.getCategoryid()));
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(seed.getCategoryname());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     

</body>
</html>