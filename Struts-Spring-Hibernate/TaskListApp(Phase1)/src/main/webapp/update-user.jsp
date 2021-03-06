<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>  
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update user form</title>
<sb:head/>
</head>
<body>
	<h1 class ="display-1" style = "text-align: center">UPDATE USER</h1>

	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    <div>
	    <s:url var="displayImageLink" value="/displayImage">
			<s:param name="userId" value="%{userId}"></s:param>
		</s:url>
		<img width="100" height="100" src="${displayImageLink}">
	</div>
    
	<s:form action="updateUser.do" theme="bootstrap" cssClass="form-horizontal" method = "post" enctype = "multipart/form-data">
		<input type="hidden" name = "userId" value="${userId}">
		<s:textfield name = "firstName" label="First Name" style = "width: 50%"></s:textfield>
		<s:textfield name = "lastName" label="Last name" style = "width: 50%"></s:textfield>
		<s:textfield name = "email" label="Email" style = "width: 50%"></s:textfield>
		<s:textfield name = "username" label="Username" style = "width: 50%"></s:textfield>
		<s:textfield name = "password" label="Password" style = "width: 50%"></s:textfield>
		<s:file name = "imageFile" label = "Profile Picture" style = "width: 50%"></s:file>
		<s:submit value = "Submit" theme="bootstrap" cssClass="btn" style="left: 25%; position: relative"></s:submit>
	</s:form>
</body>
</html>