<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
 
<body background="fitnessimage.jpg">


<form action="main.jsp" method="post">
<div>

<h1 class="heading">Login</h1>

			
				<tr>
					<td >Email</td>
					<td><input type="text" name="Email"  required="true" requiredMessage="Name is required" pattern=".+@gmail.com" required/></td>
				</tr><br><br>
				<tr>
					<td>Password</td>
					<td><input type="Password" name="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required/></td>
				</tr><br><br>
			
				<input type="submit" value="Login" /></form>
		
                <form action="register.jsp" method="post">
                <div>
                <a href="register.jsp" class="form-log-in-with-existing">You Don't have an account? <b> Register here </b></a>
                </div>
            </div>
            </div>
        </form>

    </div>
   </body> 