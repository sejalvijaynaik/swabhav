<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
</head>
<body>
<s:form action = "bye">
	<s:submit value = "BYE"></s:submit>
</s:form>
<h1><s:property value = "message"/></h1>
</body>
</html>