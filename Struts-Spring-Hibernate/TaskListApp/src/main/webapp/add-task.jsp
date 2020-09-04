<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Task Form</title>
<s:head/>
</head>
<body>
	<s:form action="addTask.do">
		<s:textfield name = "title" label="Title"></s:textfield>
		<s:submit value = "Submit"></s:submit>
	</s:form>
</body>
</html>