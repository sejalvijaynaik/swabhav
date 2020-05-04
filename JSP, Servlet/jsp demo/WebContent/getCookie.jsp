<html>
<head>
<title>Cookie set</title>
</head>

<% 
String cookieColor = "white";

Cookie[] cookies = request.getCookies();

if(cookies != null){
	for(Cookie tempCookie : cookies){
		if("redCookie".equals(tempCookie.getName())){
			cookieColor = tempCookie.getValue();
			break;
		}
	}
}
%>
<BODY BGCOLOR = "<%= cookieColor %>">

To set the cookie click here:
<a href = "setCookie.jsp">Set cookie</a>

 
</body>

</html>