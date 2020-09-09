<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    <%@ taglib prefix="botDetect" uri="https://captcha.com/java/jsp"%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<s:head/>
</head>
<body>
	<s:form action="register.do">
		<s:textfield name = "firstName" label="First Name" id = "firstNameText"></s:textfield>
		<s:textfield name = "lastName" label="Last Name" id = "lastNameText"></s:textfield>
		<s:textfield name = "email" label="Email" id = "emailField"></s:textfield><span id="emailError"></span>
		<s:textfield name = "username" label="Username" id = "usernameText"></s:textfield>
		<s:textfield name = "password" label="Password" id = "passwordText"></s:textfield>
		<s:textfield name = "confirmPassword" label="Confirm Password" id = "confirmPassword"></s:textfield><br><br>
		<s:submit value = "Submit" id = "submitButton"></s:submit>
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