<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
<sb:head/>
</head>
<body>
	<h1 class ="display-1" style = "text-align: center">UPDATE STUDENT</h1>
	
	<s:actionerror theme="bootstrap"/>
    <s:actionmessage theme="bootstrap"/>
    <s:fielderror theme="bootstrap"/>
    
    <s:form action="update.do" theme="bootstrap">
    	<input type="hidden" name = "rollNo" value="${rollNo}">
		<div class="form-group row">
			 <label class="col-sm-2 col-form-label col-form-label-sm" style="text-align:right">Name</label>
			<div class="col-sm-10">
				<s:textfield name="name" class="form-control" style = "width: 50%"></s:textfield>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 col-form-label col-form-label-sm" style="text-align:right">Address</label>
			<div class="col-sm-10">
				<s:textfield name="address" class="form-control" style = "width: 50%"></s:textfield>
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 col-form-label col-form-label-sm" style="text-align:right">Age</label>
			<div class="col-sm-10">
				<s:textfield name="age" class="form-control" style = "width: 50%"></s:textfield>
			</div>
		</div>
		<div class="form-group row">
    		<div class="col-sm-10">
    			<s:submit class="btn btn-primary" style="margin-left: 150px"></s:submit>
    		</div>
  		</div>
	</s:form>
	
</body>
</html>