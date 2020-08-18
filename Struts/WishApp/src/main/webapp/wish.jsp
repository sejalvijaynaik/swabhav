<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<article>
		<s:form action = "wish.do">
		<s:textfield key = "name" label = "Name"></s:textfield>
		<s:submit key = "submit" name = "submit"></s:submit>
		</s:form>
	</article>
	<article>
		<h3><s:property value = "message"/></h3>
	</article>
</body>
</html>