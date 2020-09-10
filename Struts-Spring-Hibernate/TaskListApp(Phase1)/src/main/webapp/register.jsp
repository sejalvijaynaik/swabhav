<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    <%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%> 
     <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<sb:head/>
</head>
<body>
	<h1 class ="display-1" style = "text-align: center">REGISTER FORM</h1>

	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
  
	<s:form action="register.do" theme="bootstrap" cssClass="form-horizontal">
	 	<span id="emailError"></span> 
		<s:textfield name = "firstName" label="First Name"></s:textfield>
		<s:textfield name = "lastName" label="Last Name"></s:textfield>
		<s:textfield name = "email" label="Email" id = "emailField"></s:textfield>
		<s:textfield name = "username" label="Username"></s:textfield>
		<s:textfield name = "password" label="Password"></s:textfield>
		<s:textfield name = "confirmPassword" label="Confirm Password"></s:textfield><br><br>
		<s:submit value = "Submit" id = "submitButton" theme="bootstrap" cssClass="btn"></s:submit>
	</s:form>
	<script>
	
		$("#submitButton").attr("disabled", true);
		$(':input').keyup(function() {

	        var empty = false;
	        $(':input').each(function() {
	            if ($(this).val() == '') {
	                empty = true;
	            }
	        });

	        if (empty) {
	            $('#submitButton').attr('disabled', 'true'); 
	        } else {
	        	 $('#submitButton').removeAttr('disabled');
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
		    			   $("#submitButton").attr("disabled", true);
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