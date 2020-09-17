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
	<nav class="navbar navbar-default">
	  		<div class="container-fluid">
				<div class="navbar-header">
				    <a class="navbar-brand" href="home">TASKLISTAPP</a>
				</div>
				<ul class="nav navbar-nav">
					<li><a href="home">HOME</a></li>
				    <li class="active"><a href="login">LOGIN</a></li>
				    <li><a href="register">REGISTER</a></li>
				</ul>
	 		</div>
		</nav>
	<h1 class ="display-1" style = "text-align: center">LOGIN FORM</h1>
	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    
	<span style="color:red"><s:property value="message"/></span>
	<s:form action="login.do"  theme="bootstrap" cssClass="form-horizontal">
		<s:textfield name="username" label="Username"  style = "width: 50%"></s:textfield>
		<s:textfield name="password" label="Password"  style = "width: 50%"></s:textfield>
		<s:checkbox name="admin" label="ADMIN"></s:checkbox>
		<s:submit value = "Submit" cssClass = "btn" style="left: 25%; position: relative"></s:submit>
	</s:form>
</body>
</html>