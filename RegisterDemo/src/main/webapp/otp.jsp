<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="credit.css">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/fontawesome.min.css">
<link rel="stylesheet" href="css/font-awesome-ie7.min.css">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">

<style>
        .tab {
            display: inline-block;
            margin-left: 40px;
        }
        
        input.largerCheckbox {
            width: 40px;
            height: 40px;
        }
        input.largerbox {
            width: 80px;
            height: 50px;
        }
        .container {
  height: 200px;
  position: relative;
  border: 3px solid green;
}

.vertical-center {
  margin: 0;
  position: absolute;
  top: 50%;
  -ms-transform: translateY(-50%);
  transform: translateY(-50%);
}
        
        #row1 {
background-image:linear-gradient(to right,pink,yellow);
color:black;
border: none;
width:170px;
height: 50px;
font-size: 25px;
border-radius: 15px;
text-align: center;
cursor: pointer;
}
#row1:hover {
background-image: linear-gradient(to bottom left,#FF00FF,#7CFC00);
 color:white;
}
         body{
  background-image: url(Images/groc.jpg);
  background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: 100% 100%;
  
 }
    </style>
</head>
<body background="contact.jpg">
<form action="lastpg.jsp">
<div class = "menu-bar">
		<ul>
			<li class="active"><a href="main.jsp"><i class="fa fa-home"></i>Home</a></li>
			<li class="active"><a href="Training.jsp"><i class="fa fa-user"></i>Plans</a></li>
			<li class="active"><a href="NewFile.jsp"><i class="fa fa-list"></i>Subscription</a>
			<li class="active"><a href="pay1.jsp"><i class="fa fa-list"></i>Payment</a>
			 
			<li class="active"><a href="ContactUs.jsp"><i class="fa fa-phone"></i>Contact Us</a></li>
		</ul>
		</div>
		
	<div class="creditCardForm">
		
    	<div class="heading">
        	<h1>Enter OTP</h1>
    	</div>
    	<h4>The OTP is sent to your registered mobile number.</h4>
    	<div class="form-group OTP">
                <label for="otp">Enter 6 Digit OTP</label>
                <input type="tel" class="form-control" id="otp" pattern="^\d{6}$">
		</div>
	 	<div class="form-group" id="pay-now">
                <button  type="submit" class="btn btn-default" id="confirm-purchase" align="center">Verify</button>
      	</div>
      </div>
</form>
</body>
</html>