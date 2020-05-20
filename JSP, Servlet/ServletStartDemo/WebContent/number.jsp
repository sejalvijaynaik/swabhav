<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlet demo</title>
</head>
<body>

<%= session.getAttribute("number") %>

<form method = "post" action = "ServletStart">
<input type = "submit" value = "submit">
</form>

</body>
</html>