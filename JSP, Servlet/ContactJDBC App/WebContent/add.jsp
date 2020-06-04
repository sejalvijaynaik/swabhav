<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact Form</title>
</head>
<body>
<h2>Add Contact</h2>
<form method = "POST" action = "AddController">
First Name : <input type = "text" name = "firstName"><br><br>
Last Name : <input type = "text" name = "lastName"><br><br>
Number : <input type = "text" name = "number"><br><br>
Email : <input type = "text" name = "email"><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>