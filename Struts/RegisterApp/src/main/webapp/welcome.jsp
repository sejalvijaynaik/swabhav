<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
	<article>
		<h3>Thanks for your registration</h3>
		<s:label value = "First Name : "></s:label>
		<s:property value = "firstName"/><br>
		<s:label value = "Last Name : "></s:label>
		<s:property value = "lastName"/><br>
		<s:label value = "Address : "></s:label>
		<s:property value = "address"/><br>
		<s:label value = "Age : "></s:label>
		<s:property value = "age"/>
	</article>
</body>
</html>