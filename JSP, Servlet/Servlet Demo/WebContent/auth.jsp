<html>
<head>
<title>auth</title>
</head>
<body>
<%

	if((session.getAttribute("username") != null)&&(session.getAttribute("password") != null)){
		out.println("You are logged in successfully... welcome to the site");
	}
	else if((request.getParameter("username").equals("admin"))&&(request.getParameter("password").equals("admin"))){
		out.println("You are logged in successfully... welcome to the site");
		Cookie userNameCookie = new Cookie("userNameCookie", request.getParameter("username"));
		userNameCookie.setMaxAge(60*60*24);
		response.addCookie(userNameCookie);
		if((session.getAttribute("username") == null)&&(session.getAttribute("password") == null)){
			session.setAttribute("username", request.getParameter("username"));
			session.setAttribute("password", request.getParameter("password"));
		}
		
	}
	else if(!(request.getParameter("username").equals("admin"))){
		out.println("Wrong username");
	}
	else if(!(request.getParameter("password").equals("admin"))){
		out.println("Wrong password ");
	}
	
%>

</body>
</html>