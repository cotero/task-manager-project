<%@include file="../../init.jsp"%>

<%@page import="com.liferay.customtools.model.Task"%>

<%
Task task = (Task)request.getAttribute("t_task");

task = task.toEscapedModel();
%>

<dl>
        <dt>Name</dt>
        <dd><%= task.getName() %></dd>
        <dt>Description</dt>
        <dd><%= task.getDescription() %></dd>
        
</dl>