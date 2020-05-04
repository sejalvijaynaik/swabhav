<html>
<head>
<title>summary</title>
</head>

<body>
<%
Integer counter = (Integer)application.getAttribute("counter");
if (counter == null)
{
counter = 0;
}
else{
	counter = counter + 1;
}
application.setAttribute("counter", counter);
out.println("Count :  " + counter);
%>
<a href = "session.jsp">Session</a>
<a href = "application.jsp">Application</a>
</body>

