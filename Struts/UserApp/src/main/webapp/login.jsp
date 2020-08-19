<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<article>
		<s:form action="login.do">
			<s:textfield name="username" label="Name : "></s:textfield>
			<s:textfield name="password" label="Pssword : "></s:textfield>
			<s:submit value="Submit"></s:submit>
		</s:form>
	</article>
	<article>

		<s:if test="%{message == 'hello'}">
			<h1>Hello <s:property value = "username"/></h1>
		</s:if>
		<s:else>
			<span style = "color:red"><s:property value = "message"/></span>
		</s:else>

	</article>
</body>
</html>