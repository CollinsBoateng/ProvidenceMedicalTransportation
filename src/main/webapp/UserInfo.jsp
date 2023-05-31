<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<link rel="stylesheet" href="StyleSheet.css">
<title>PMTLLC</title>
</head>

<body>

<header>
	
	<img src="Logo.jpg" width="100%" height="350">

	<!-- Navigation Bar -->
	<div class="topnav">
		
		<a class="active" href="HomePage.jsp">Home</a> 
		<a href="OurServices.jsp">Our Services</a> 
		<a href="OurTeam.jsp">Our Team</a>
		<a href="ContactUs.jsp">Contact Us</a>
	</div>
</header>
<h2>Please fill out the following: </h2>
	<form action="Info" method="Post">
	First name: <input type="text" name="fName"></br>
	Last name:<input type="text" name="lName"></br>
	Email adreess:<input type="email" name="eMail"></br>
	Phone number: <input type="text" name="mNumber"></br>
	<input type="submit" ></br>
	</form>

</body>

	


<footer>

	<div style="text-align: center;">
		<a class="active" href="HomePage.jsp">Back to the Top</a>

	</div>

</footer>
</html>