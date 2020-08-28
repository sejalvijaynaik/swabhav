<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Numbers API</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
    <button id="submit">SUBMIT</button><br><br>
    <p id = display>

    <script>
	    var $result;
	
	   	$("#submit").click(function(){
	       var completeUrl = "http://localhost:8080/JSONDemoApp/getJson";
	       $.ajax({ type: "GET", url: completeUrl, success: function(result){
	           $result = result;
	           $('#display').text($result.id + " " + $result.name);
	       }});
	   	})
	   	
        
    </script>

</body>
</html>