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
		<s:form action="registerDo">
			<s:textfield name = "person.firstName" label="First Name"></s:textfield>
			<s:textfield name = "person.lastName" label="Last Name"></s:textfield>
			<s:textfield name = "person.address" label="Address"></s:textfield>
			<s:textfield name = "person.age" label="Age"></s:textfield>
			<s:submit value = "Submit"></s:submit>
		</s:form>
	</article>
	<article>
		<s:property value = "message"/>

	</article>
</body>
</html>