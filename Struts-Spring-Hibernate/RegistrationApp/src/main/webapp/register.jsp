<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<s:head/>
</head>
<body>
	<article>
		<s:form action="register.do" method = "get">
			<s:textfield name = "firstName" label="First Name"></s:textfield>
			<s:textfield name = "lastName" label="Last Name"></s:textfield>
			<s:textfield name = "email" label="Email"></s:textfield>
			<s:textfield name = "age" label="Age"></s:textfield>
			<label for="captchaCode">Retype the characters from the picture:</label>
      
	        <!-- Adding BotDetect Captcha to the page -->    
	        <botDetect:captcha id="formCaptcha" userInputID="captchaCode"/>
	        
	        <br/>
	        <s:textfield name="captchaCode" id="captchaCode" class="textbox" />
	        <s:submit name="validateCaptchaButton" label="Validate" id="validateCaptchaButton"/>
		</s:form>
	</article>
</body>
</html>