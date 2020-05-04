<html>
<head>
<title>Application Practice</title>
</head>

<body>

<% 
String oldValue = "0";
String newValue ="1";

if((application.getAttribute("oldValue") == null)&&(application.getAttribute("newValue") == null)){
	application.setAttribute("oldValue", oldValue);
	application.setAttribute("newValue", newValue);
}

else{
	oldValue = (String)(application.getAttribute("oldValue"));
	newValue = (String)(application.getAttribute("newValue"));
	int oldValueInInt = Integer.parseInt(oldValue) + 1;
	int newVlaueInInt = Integer.parseInt(newValue) + 1;
	oldValue = String.valueOf(oldValueInInt);
	newValue = String.valueOf(newVlaueInInt);
	application.setAttribute("oldValue", oldValue);
	application.setAttribute("newValue", newValue);
}

out.println("Old Value :" + application.getAttribute("oldValue"));
out.println("New Value :" + application.getAttribute("newValue"));

%>
<a href = "summary.jsp">Back</a>
</body>

