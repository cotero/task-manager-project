<%@page import="com.liferay.customtools.model.Task"%>
<%@page import="com.liferay.customtools.service.TaskLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/init.jsp" %>

<p>

	<%
		String taskId = ParamUtil.get(request, "taskId", "");
		String name = "";
		String description = "";
		boolean status = false;	

		if (Validator.isNotNull(taskId)){
			Task task = TaskLocalServiceUtil.getTask(Long.valueOf(taskId));
			name = task.getName();
			description = task.getDescription();
			if (task.getStatus()!=0){
				status = true;
			} 			
	%>	
		<b><liferay-ui:message key="task-manager-web.edit.title"/></b>
	<%
		} else {
	%>	
		<b><liferay-ui:message key="task-manager-web.add.title"/></b>
	<%
		}
	%>	
	
	<portlet:actionURL name="addTask" var="addTaskURL">
		<portlet:param name="taskId" value="<%=taskId%>"></portlet:param>
	</portlet:actionURL>
	
	<portlet:renderURL var="cancelURL">
	    <portlet:param name="mvcPath" value="/view.jsp"></portlet:param>
	</portlet:renderURL>
	
	
	<aui:form action="${addTaskURL}" name="<portlet:namespace />fm">
        <aui:fieldset>
            <aui:input name="name" label="task-manager-web.edit.form.name" type="text" value="<%=name%>">
            	<aui:validator name="required" />
            </aui:input>
            <aui:input name="description" label="task-manager-web.edit.form.description" type="text" value="<%=description%>">
            	<aui:validator name="required" />
            </aui:input>
            <aui:input name="status" label="task-manager-web.edit.form.isFinished" type="checkbox" value="<%=status%>"></aui:input>
        </aui:fieldset>

        <aui:button-row>
            <aui:button type="submit" value="task-manager-web.button.save"></aui:button>
			<aui:button  value="task-manager-web.button.cancel" onClick="<%= cancelURL.toString() %>"></aui:button>
        </aui:button-row>
	</aui:form>

</p>