<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.aspire.vaccine.Appointment"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment</title>
</head>
<body>
	<h2>
	id: ${appoinment.getAppointmentNumber() }
	</h2>
	<h2>name: ${appoinment.getName()}
	</h2>
</body>
</html>