<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Thanks for your registration ${customer.firstName} ${customer.lastName}</h1>
	Number of Free passes : ${customer.freePasses}
	Pincode : ${customer.pincode}
	Course Code : ${customer.courseCode}

	
</body>
</html>