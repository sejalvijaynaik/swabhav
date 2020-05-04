<html>
<head>
<title>Session Practice</title>
</head>

<body>

<% 
int sessionCount = 0;
if(session.getAttribute("sessionCount") == null){
	session.setAttribute("sessionCount", sessionCount);
}

else{
	sessionCount = (int)session.getAttribute("sessionCount") + 1;
	session.setAttribute("sessionCount", sessionCount);
}

out.println("Session Count :" + session.getAttribute("sessionCount"));

%>

</body>

