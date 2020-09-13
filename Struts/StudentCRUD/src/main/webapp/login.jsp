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
	
	<s:form action="login.do" theme="bootstrap">
		<div class="form-group row">
			<div class="col-sm-10">
				<s:textfield name="username" label="Username" class="form-control"></s:textfield>
			</div>
		</div>
		<div class="form-group row">
			<div class="col-sm-10">
				<s:textfield name="password" label="Password" class="form-control"></s:textfield>
			</div>
		</div>
		<div class="form-group row">
    		<div class="col-sm-10">
      			<button type="submit" class="btn btn-primary">Sign in</button>
    		</div>
  		</div>
	</s:form>
</body>
</html>