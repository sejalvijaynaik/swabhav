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
<%
if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
	response.sendRedirect("login.jsp");
}
%>
<h2>Update Contact</h2>
<form method = "POST" action = "UpdateContactController">
First Name : <input type = "text" name = "firstName" value = "${contact.getFirstName()}"><br><br>
Last Name : <input type = "text" name = "lastName" value = "${contact.getLastName()}"><br><br>
Number : <input type = "text" name = "number" value = "${contact.getNumber()}"><br><br>
email : <input type = "text" name = "email" value = "${contact.getEmail()}"><br><br>
<input type = "hidden" name = "ID" value = "${contact.getId()}">
<input type = "submit" value = "Submit">
</form>

</body>
</html>