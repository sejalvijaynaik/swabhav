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
    <button id="submit">Employee List</button><br><br>
    <p id = 'display'>
    <p id = 'display2'>
    <table id="displayTable" class="tableDecorate">
        <tbody></tbody>
    </table>
    
    <script>
	    var $result = [];
		
	   	$("#submit").click(function(){
	       var completeUrl = "http://localhost:8080/JSONEmployeeList/getJson";
	       $.ajax({ type: "GET", url: completeUrl, dataType: "json", success: function(result){
	           $result = result;
	           $('#display').text($result);
	           var myString = JSON.stringify($result);
	           var myObj = JSON.parse(myString);
	           $('#display2').text(myObj);
	       }});
	   	})
	   	
        
    </script>

  <%--    <script>
    	var $result;
	   	$("#submit").click(function(){
	       var completeUrl = "http://localhost:8080/JSONEmployeeList/getJson";
	       $.ajax({ type: "GET", url: completeUrl, success: function(result){
	           $.ajax({ type: "GET", url: actualUrl, success: function(result){
	        	   $result = result;
	        	   $('#display').text(result);
	               $("#displayTable tbody").empty();
	               $("#displayTable tbody").append("<tr></tr>");
	               $("#displayTable tbody tr:last").append("<th>ID</th>");
	               $("#displayTable tbody tr:last").append("<th>Name</th>");
	               $("#displayTable tbody tr:last").append("<th>Salary</th>");
	               $("#displayTable tbody tr:last").append("<th>Designation</th>");

	               for(var i = 0; i < result.length; i++){
	                   $("#displayTable tbody").append("<tr></tr>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].id + "</td>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].name + "</td>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].salary + "</td>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].designation + "</td>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].date + "</td>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].isMale + "</td>");
	                   $("#displayTable tbody tr:last").append("<td>" + result[i].id + "</td>");
	               }    
	           }});
	       }});
	   	})
	   	
        
    </script>--%>

</body>
</html>