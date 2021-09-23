function validateFirstname(){
	var fname=document.getElementById('name').value;
	var patt = new RegExp("^(?!.*([A-Za-z])\1{2})[A-Za-z]+$");
	var patt1=new RegExp("\\b([a-zA-Z0-9])\\1\\1+\\b")
	if(patt.test(fname))
	{
		if(patt1.test(fname)){
			document.getElementById('errorMessage').innerHTML="<p>Name should be in alphabates only and shouldn't having more than 3 repeated characters'</p>";
		}
		else{
			document.getElementById('errorMessage').innerHTML="<p></p>";
		}
	}
	else
		{
		document.getElementById('errorMessage').innerHTML="<p>Name should be in alphabates only and shouldn't having more than 3 repeated characters'</p>";
		}
}
function validatePhoneno(){
	var phoneno=document.getElementById('phone').value;
	var patt = new RegExp("[6789][0-9]{9,9}");
	if(patt.test(phoneno)&&phoneno<10000000000)
	{
			document.getElementById('errorMessage1').innerHTML="<p></p>";
		}
	else
		{
		document.getElementById('errorMessage1').innerHTML="<p>Mobile number should contains only numbers and should not start with number below 6 and length should be equals to 10</p>";
		}
}
function validateAddress(){
	var address=document.getElementById('address').value;
	var patt = new RegExp("^[#.0-9a-zA-Z\s,-]+$");
	if(patt.test(address))
	{
		document.getElementById('errorMessage2').innerHTML="<p>Address should be in given format 1-North Street,Chennai-12</p>";
		
			//document.getElementById('errorMessage2').innerHTML="<p></p>";
		}
	else
		{
						document.getElementById('errorMessage2').innerHTML="<p></p>";

		//document.getElementById('errorMessage2').innerHTML="<p>Address should be in given format 1-North Street,Chennai-12</p>";
		}
}
function validateEmail(){
	var email=document.getElementById('email').value;
	console.log(email);
	var patt = new RegExp("[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$");
	if(patt.test(email))
	    {
			document.getElementById('errorMessage3').innerHTML="<p></p>";
		}
	else
		{
		document.getElementById('errorMessage3').innerHTML="<p>domain name is having multiple repeated characters or email format is invalid!!!Email should be in valid format</p>";
		}
}
function validatePassword(){
	var password=document.getElementById('password').value;
	console.log(password)
	var patt = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
	if(patt.test(password))
	    {
					document.getElementById('errorMessage4').innerHTML="<p></p>";
		}
	else
		{
		document.getElementById('errorMessage4').innerHTML="<p>Password should contains atleast 1 upper case, one lower case, one number, one special character and length should be greaterthan 8</p>";
		}
}

function validateCity(){
	var city=document.getElementById('city').value;
	var patt = new RegExp("^[a-zA-Z\s]+$");
	var patt1=new RegExp("\\b([a-zA-Z0-9])\\1\\1+\\b")
	if(patt.test(city))
	{
		if(patt1.test(city)){
			document.getElementById('errorMessage5').innerHTML="<p>City Name should be in alphabates only and should not have number of repeated characters</p>";
		}
		else{
			document.getElementById('errorMessage5').innerHTML="<p></p>";
		}
	}
	else
		{
		document.getElementById('errorMessage5').innerHTML="<p>City Name should be in alphabates only</p>";
		}
}
function validatePincode(){
	var pincode=document.getElementById('pincode').value;
	var patt = new RegExp("[6789][0-9]{5,5}");
	if(patt.test(pincode)&&pincode<1000000)
	{
			document.getElementById('errorMessage6').innerHTML="<p></p>";
		}
	else
		{
		document.getElementById('errorMessage6').innerHTML="<p>Pin Code should contains only numbers and should not start with number below 6 and length should be equals to 6</p>";
		}
}
function validateAccountnumber(){
	var account=document.getElementById('accountnumber').value;
	var patt = new RegExp("[0-9]{5,15}");
	if(patt.test(account)&&account<1000000000000000)
	{
			document.getElementById('errorMessage7').innerHTML="<p></p>";
		}
	else
		{
		document.getElementById('errorMessage7').innerHTML="<p>Account Number should contains only numbers and length should between 5 to 15</p>";
		}
}
function validateUpi(){
	var upi=document.getElementById('upiid').value;
	var patt = new RegExp("[a-z0-9@]{5,15}");
	if(patt.test(upi))
	{
			document.getElementById('errorMessage8').innerHTML="<p></p>";
		}
	else
		{
		document.getElementById('errorMessage8').innerHTML="<p>Upi contains only Small letters one @ and the domain should be valid and domain should not contain more than 2 repeated characters!!!</p>";
		}
}
function validateIfsc(){
	var ifsc=document.getElementById('ifsc').value;
	var patt = new RegExp("[0-9a-zA-Z]{5,}");
	if(patt.test(ifsc))
	{
		//document.getElementById('errorMessage16').innerHTML="<p>ifsc length should between 5-15!!!!!!</p>";
			document.getElementById('errorMessage9').innerHTML="<p></p>";
		}
	else
		{
			document.getElementById('errorMessage9').innerHTML="<p></p>";

		//document.getElementById('errorMessage16').innerHTML="<p>ifsc length should between 5-15!!!!!!</p>";
		}
}
function validateBranch(){
	var branch=document.getElementById('branch').value;
	var patt = new RegExp("^[a-zA-Z\s]+$");
	var patt1=new RegExp("\\b([a-zA-Z0-9])\\1\\1+\\b")
	if(patt.test(branch))
	{
		if(patt1.test(branch)){
			document.getElementById('errorMessage10').innerHTML="<p>Branch Name should be in alphabates only and shouldn't having more than 3 repeated characters'</p>";
		}
		else{
			document.getElementById('errorMessage10').innerHTML="<p></p>";
		}
	}
	else
		{
		document.getElementById('errorMessage10').innerHTML="<p>Branch Name should be in alphabates only and shouldn't having more than 3 repeated characters'</p>";
		}
}
function reconform(){
	var password=document.getElementById('password').value;
	var repassword=document.getElementById('repassword').value;
	if(password!=repassword){
		document.getElementById('errorMessage11').innerHTML="<p>Password Mismatch!!!</p>";
		
	}else{
		document.getElementById('errorMessage11').innerHTML="<p></p>";
		
	}
}