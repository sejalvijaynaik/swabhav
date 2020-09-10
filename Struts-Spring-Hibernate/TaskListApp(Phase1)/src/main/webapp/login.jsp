<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login form</title>
<sb:head/>
</head>
<body>
	<h1 class ="display-1" style = "text-align: center">LOGIN FORM</h1>
	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    
	<span style="color:red"><s:property value="message"/></span>
	<s:form action="login.do"  theme="bootstrap" cssClass="form-horizontal">
		<s:textfield name="username" label="Username"></s:textfield>
		<s:textfield name="password" label="Password"></s:textfield>
		<s:checkbox name="admin" label="ADMIN"></s:checkbox>
		<s:submit value = "Submit" cssClass = "btn"></s:submit>
	</s:form>
</body>
</html>