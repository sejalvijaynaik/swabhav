<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
<h1>Registration Form</h1>
<s:form action = "registerAction">
	<s:textfield name = "firstName" label = "First name"></s:textfield>
	<s:textfield name = "lastName" label = "Last name"></s:textfield>
	<s:radio name = "gender" list = "{'Male', 'Female'}" label = "Gender"></s:radio>
	<s:textfield name = "age" label = "Age"></s:textfield>
	<s:textfield name = "email" label = "Email"></s:textfield>
	<s:submit value = "Submit"></s:submit>
</s:form>
</body>
</html>