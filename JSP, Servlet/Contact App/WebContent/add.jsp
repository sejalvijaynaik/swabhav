<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add contact form</title>
</head>
<body>
<%
if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
	response.sendRedirect("home.jsp");
}
%>
<h2>Add Contact</h2>
<form method = "POST" action = "AddContactController">
First Name : <input type = "text" name = "firstName"><br><br>
Last Name : <input type = "text" name = "lastName"><br><br>
Number : <input type = "text" name = "number"><br><br>
Email : <input type = "text" name = "email"><br><br>
<input type = "submit" value = "Submit">
</form>
</body>
</html>