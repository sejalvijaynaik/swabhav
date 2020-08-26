<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add contact form</title>
</head>
<body>
<h2>Add Contact</h2>
<form method = "POST" action = "AddContact">
First Name : <input type = "text" name = "firstName" value="${firstName}" required><br><br>
Last Name : <input type = "text" name = "lastName" value="${lastName}" required><br><br>
Number : <input type = "text" name = "number" value="${number}" required><br><br>
Email : <input type = "text" name = "email" value="${email}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>