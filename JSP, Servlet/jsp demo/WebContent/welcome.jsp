<html>
<head>
<title>Welcome</title>
</head>
<body>

<form method='get' action = 'welcome.jsp'>
Enter your name:<input type = 'text' name = 'myName'>
<input type="submit" value="Submit" name="submitName"/>
</form>

<%if(request.getParameter("myName")!=null){
	out.println("hello " + request.getParameter("myName"));
}
%>
</body>

</html>