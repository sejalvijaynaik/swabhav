<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    <%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%> 
     <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
     <%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
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
				    <li><a href="login">LOGIN</a></li>
				    <li class="active"><a href="register">REGISTER</a></li>
				</ul>
	 		</div>
		</nav>
	<h1 class ="display-1" style = "text-align: center">REGISTER FORM</h1>

	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    
	<s:form action="register.do" theme="bootstrap" cssClass="form-horizontal">
	 	<span id="emailError" style="left: 25%; position: relative"></span> 
		<s:textfield name = "firstName" label="First Name" style = "width: 50%"></s:textfield>
		<s:textfield name = "lastName" label="Last Name" style = "width: 50%"></s:textfield>
		<s:textfield name = "email" label="Email" id = "emailField" style = "width: 50%"></s:textfield>
		<s:textfield name = "username" label="Username" style = "width: 50%"></s:textfield>
		<s:textfield name = "password" label="Password" style = "width: 50%"></s:textfield>
		<s:textfield name = "confirmPassword" label="Confirm Password" style = "width: 50%"></s:textfield>
	<!--<s:submit value = "Submit" id = "submitButton" theme="bootstrap" cssClass="btn" style="left: 25%; position: relative"></s:submit>-->
		
		<div style="left: 25%; position: relative">
		<label for="captchaCode">Retype the characters from the picture:</label>
        <botDetect:captcha id="formCaptcha" userInputID="captchaCode"/>
        <s:textfield name="captchaCode" id="captchaCode" class="textbox" style = "width: 50%"/>
        </div>
        <s:submit name="validateCaptchaButton" value = "Submit" id="validateCaptchaButton" theme="bootstrap" cssClass="btn" style="left: 25%; position: relative"/>
	
	</s:form>
	
	<script>
	
		$("#validateCaptchaButton").attr("disabled", true);
		$(':input').keyup(function() {

	        var empty = false;
	        $(':input').each(function() {
	            if ($(this).val() == '') {
	                empty = true;
	            }
	        });

	        if (empty) {
	            $('#validateCaptchaButton').attr('disabled', 'true'); 
	        } else {
	        	 $('#validateCaptchaButton').removeAttr('disabled');
	        }
	    });
		$("#emailField").keyup(function(){
			
			 var completeUrl = 'http://localhost:8080/TaskListApp(Phase1)/getEmailsJson';
		       $.ajax({ type: "GET", url: completeUrl, dataType: "json", success: function(result){
		           var emailField = $("#emailField").val();
		           var emailError = $("#emailError");
		    	   var emails = result["emails"];
		    	   //alert(emails.length);
		    	   for(var i = 0; i < emails.length; i++){
		    		   if(emails[i] == emailField){
		    			   alert("exits");
		    			   emailError.text("This email already exists");
		    			   emailError.css('color', 'red');
		    			   $("#validateCaptchaButton").attr("disabled", true);
		    			   break;
		    		   }
		    		   else{
		    			   
		    			   emailError.text("This is a unique email");
		    			   emailError.css('color', 'green');
		    		   }
		    	   }  
		       }});
			});
	
	</script>
</body>
</html>