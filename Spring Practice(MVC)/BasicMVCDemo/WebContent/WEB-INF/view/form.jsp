<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
	<h2>Normal welcome</h2>
	<form action="welcomeSimple" method="get">
		<input type="text" name="myName" placeholder="Whats your name?">
		<input type="submit" value="SUBMIT">
	</form>
	<h2>Uppercase welcome</h2>
	<form action="welcomeUpperCase" method="get">
		<input type="text" name="myName" placeholder="Whats your name?">
		<input type="submit" value="SUBMIT">
	</form>
	<h2>RequestParam welcome</h2>
	<form action="welcomeRequestParam" method="get">
		<input type="text" name="myName" placeholder="Whats your name?">
		<input type="submit" value="SUBMIT">
	</form>
</body>
</html>