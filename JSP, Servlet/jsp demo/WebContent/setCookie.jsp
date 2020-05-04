<html>
<head>
<title>Cookie set</title>
</head>
<body>
<%

Cookie redCookie = new Cookie("redCookie", "red");
redCookie.setMaxAge(60*60*24);
response.addCookie(redCookie);
%>

<a href = "getCookie.jsp">Go back</a>

</body>

</html>