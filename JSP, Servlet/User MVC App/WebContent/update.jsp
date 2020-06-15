<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User form</title>
</head>
<body>
<h2>User Update Form</h2>
<form method = "POST" action = "UpdateController">
Username : <input type = "text" name = "username" value = "${user.getUsername()}"><br><br>
Password : <input type = "text" name = "password" value = "${user.getPassword()}"><br><br>
<input type = "hidden" name = "ID" value = "${user.getId()}">
<input type = "submit" value = "Submit">
</form>
</body>
</html>