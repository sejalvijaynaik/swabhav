 <%@ page import="com.techlabs.contact.model.Contact" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update form</title>
</head>
<body>
<h2>Update Contact</h2>
<form method = "POST" action = "updateContact">
First Name : <input type = "text" name = "firstName" value = "${firstName}" required><br><br>
Last Name : <input type = "text" name = "lastName" value = "${lastName}" required><br><br>
Number : <input type = "text" name = "number" value = "${number}" required><br><br>
email : <input type = "text" name = "email" value = "${email}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>