<html>
<head>
<title>Form</title>
</head>
<%
String usernameFill = "";

Cookie[] cookies = request.getCookies();

if(cookies != null){
	for(Cookie tempCookie : cookies){
		if("userNameCookie".equals(tempCookie.getName())){
			usernameFill = tempCookie.getValue();
			break;
		}
	}
}

if((session.getAttribute("username") != null)&&(session.getAttribute("password") != null)){
	String redirectURL = "auth.jsp";
    response.sendRedirect(redirectURL);
}
%>
<body>
<form action = "auth.jsp" method="get">
Username : <input type = "text" name = "username" value = "<%= usernameFill%>"><br><br>
Password : <input type = "password" name = "password"><br><br>
<input type="submit" value = "SUBMIT">
</form>


</body>
</html>