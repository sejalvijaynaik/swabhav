<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add student form</title>
</head>
<body>
<h2>Add Student</h2>
<form method = "POST" action = "adminAdd">
First Name : <input type = "text" name = "firstName" value="${firstName}" required><br><br>
Last Name : <input type = "text" name = "lastName" value="${lastName}" required><br><br>
Address : <input type = "text" name = "address" value="${address}" required><br><br>
Date of birth : <input type = "text" name = "dob" value="${dob}" required><br><br>
CGPA : <input type = "text" name = "cgpa" value="${cgpa}" required><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>