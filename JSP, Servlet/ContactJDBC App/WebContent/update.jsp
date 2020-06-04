<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
<h1>Update Contact Form</h1>
<form method = "POST" action = "UpdateController">
First Name : <input type = "text" name = "firstName" value = "${contact.getFirstName()}"><br><br>
Last Name : <input type = "text" name = "lastName" value = "${contact.getLastName()}"><br><br>
Number : <input type = "text" name = "number" value = "${contact.getNumber()}"><br><br>
email : <input type = "text" name = "email" value = "${contact.getEmail()}"><br><br>
<input type = "hidden" name = "ID" value = "${contact.getId()}">
<input type = "submit" value = "Submit">
</form>
</body>
</html>