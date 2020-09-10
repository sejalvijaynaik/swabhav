<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
    <%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
<sb:head/>
</head>
<body>
	
	<h1 class ="display-1" style = "text-align: center">SUBTASK LIST</h1>
	
	<button onclick="window.location.href = 'taskList'" class="btn btn-primary">TASKS</button>
	
	<s:form action="addSubTask">
		<label class="label label-default">TITLE</label><span>  </span><s:textfield name = "title" theme="simple"></s:textfield>
		<s:submit value="ADD SUBTASK" class="btn btn-primary" theme="simple"></s:submit>
	</s:form>
	<br>
	<s:form action="updateSubTask.do">
		<input type="hidden" name = "subTaskId" value="${subTaskId}">
		<label class="label label-default">TITLE</label><span>  </span><s:textfield name = "newTitle" theme="simple"></s:textfield>
		<s:submit value="UPDATE" class="btn btn-primary" theme="simple"></s:submit>
	</s:form>
	<br><br>
	<table class="table">
		<tr>
			<th>Title</th>
			<th>Date</th>
			<th>Done</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<s:iterator value="subTasks">
			<tr>
				<td>
					<s:if test="done == true">
						<span style="text-decoration: line-through"><s:property value="title" /></span>
					</s:if>
					<s:else>
						<s:property value="title" />
					</s:else>
				</td>
				<td><s:property value="date"/></td>
				<td>
					<s:url var="updateSubTaskDoneLink" value="/updateSubTaskDone">
						<s:param name="subTaskId" value="%{id}"></s:param>
					</s:url>
					<s:checkbox name = "done" theme="simple" onclick="window.location.href='%{updateSubTaskDoneLink}'"></s:checkbox>
				</td>
				<td>
				<s:form action = "updateSubTask">
					<input type="hidden" name="subTaskId" value="${id}">
					<s:submit value = "UPDATE" class="btn btn-primary"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "deleteSubTask">
					<input type="hidden" name="subTaskId" value="${id}">
					<s:submit value = "DELETE" class="btn btn-primary" onclick="if (confirm('Are you sure you want to delete?')) form.action='deleteSubTask'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>