<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
  background-image: Images.jpg;
  background-repeat: no-repeat;
  background-attachment: fixed; 
  background-size: 100% 100%;
  
 }
    </style>
</head>
<body background="Fit1.jpg">
<div class = "menu-bar">
		<ul>
			
			<li class="active"><a href="main.jsp"><i class="fa fa-home"></i>Home</a></li>
			<li class="active"><a href="Training.jsp"><i class="fa fa-user"></i>Plans</a></li>
			<li class="active"><a href="NewFile.jsp"><i class="fa fa-list"></i>Subscription</a>
			<li class="active"><a href="pay1.jsp"><i class="fa fa-list"></i>Payment</a>
			 
			<li class="active"><a href="ContactUs.jsp"><i class="fa fa-phone"></i>Contact Us</a></li>
		</ul>
		</div>
<form action="otp.jsp">
<div class="creditCardForm">
    <div class="heading">
        <h1>Confirm Purchase</h1>
    </div>
    <div class="payment">
        <form>
            <div class="form-group owner">
                <label for="owner">Owner</label>
                <input type="text" class="form-control" id="owner">
            </div>
            <div class="form-group CVV">
                <label for="cvv">CVV</label>
                <input type="tel" class="form-control" id="cvv" pattern="^\d{3}$">
            </div>
            <div class="form-group" id="card-number-field">
                <label for="cardNumber">Card Number</label>
                <input type="tel" class="form-control" id="cardNumber" pattern="^\d{16}$">
            </div>
            <div class="form-group" id="expiration-date">
                <label>Valid Thru</label>
                <select>
                    <option value="01">January</option>
                    <option value="02">February </option>
                    <option value="03">March</option>
                    <option value="04">April</option>
                    <option value="05">May</option>
                    <option value="06">June</option>
                    <option value="07">July</option>
                    <option value="08">August</option>
                    <option value="09">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select>
                <select>
                    <option value="22"> 2022</option>
                    <option value="23"> 2023</option>
                    <option value="24"> 2024</option>
                    <option value="25"> 2025</option>
                    <option value="26"> 2026</option>
                    <option value="27"> 2027</option>
                    <option value="28"> 2028</option>
                    <option value="29"> 2029</option>
                    <option value="30"> 2030</option>
                    <option value="31"> 2031</option>
                    <option value="32"> 2032</option>
                    <option value="33"> 2033</option>
                    <option value="34"> 2034</option>
                    <option value="35"> 2035</option>
                    <option value="36"> 2036</option>
                    <option value="37"> 2037</option>
                </select>
            </div>
            <div>
            <ul class="w3-xxxlarge">
            <i class="fa fa-cc-visa"></i>
            <i class="fa fa-cc-mastercard"></i>
            <i class="fa fa-cc-amex"></i>
            </ul>
            </div>
            
            <div class="form-group" id="pay-now">
                <button type="submit" class="btn btn-default" id="confirm-purchase">Confirm</button>
            </div>
        </form>
    </div>
 </form>
</div>
</body>
</html>