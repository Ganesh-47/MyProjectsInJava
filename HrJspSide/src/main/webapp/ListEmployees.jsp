<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.Iterator,hr.entity.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<link rel="stylesheet" href="styles/main.css" type="text/css"/> 
</head>
<body>
 <div>
 <a href="Welcome.jsp" >Home</a>
 </div>
 <div id='emplistform'>   
   <table > 
   <tr> 
    <th  >ID</th> 
    <th  >Name</th> 
    <th  >City</th> 
    <th  >Salary</th> 
   </tr> 
  <%
  Iterator<Employee> empiterator=(Iterator<Employee>)request.getAttribute("empiterator");
  StringBuilder htmlbuilder=new StringBuilder(500);
  while(empiterator.hasNext())
  {
   Employee emp= empiterator.next();
   htmlbuilder.append("<tr name='emprow'"+emp.getId()+" >");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(emp.getId());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  >");
   htmlbuilder.append(emp.getName());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td >");
   htmlbuilder.append(emp.getCity());
   htmlbuilder.append("</td>");
   htmlbuilder.append("<td  > ");
   htmlbuilder.append(emp.getSalary());
   htmlbuilder.append("</td>");
   htmlbuilder.append("</tr>");
  } 
  out.write(htmlbuilder.toString());
  %>
   </table> 
 
 </div>     

</body>
</html>