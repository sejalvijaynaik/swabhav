<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task List</title>
</head>
<body>
	<input type="button" onclick="window.location.href = 'taskList'" value="TASKS">
	<s:form action="addSubTask">
		<s:textfield name = "title" label="Title" theme="simple"></s:textfield>
		<s:submit value="ADD SUBTASK" theme="simple"></s:submit>
	</s:form>
	
	<s:form action="updateSubTask.do">
		<input type="hidden" name = "subTaskId" value="${subTaskId}">
		Title : <s:textfield name = "newTitle" theme="simple"></s:textfield>
		<s:submit value="UPDATE" theme="simple"></s:submit>
	</s:form>
	
	<h2>SubTask List</h2>

	<table border="1">
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
					<s:submit value = "UPDATE"></s:submit>
				</s:form>
				</td>
				<td>
				<s:form action = "deleteSubTask">
					<input type="hidden" name="subTaskId" value="${id}">
					<s:submit value = "DELETE" onclick="if (confirm('Are you sure you want to delete?')) form.action='deleteSubTask'; else return false;"></s:submit>
				</s:form>
				</td>
			</tr>
		</s:iterator>
	</table>
</body>
</html>