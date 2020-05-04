<html>
<head>
<title>Welcome</title>
</head>
<body>

<form method='get' action = 'http://localhost:8080/basics/name 5 times.jsp'>
Enter your name:<input type = 'text' name = 'myName'>
<input type="submit" value="Submit" name="submitName"/>
</form>

<%if(request.getParameter("myName") != null){
	String message = "hello " + request.getParameter("myName");
	for(int i = 1; i <= 5; i++){
		out.println("<br>" + message);
	}
}
	

%>
</body>

</html>