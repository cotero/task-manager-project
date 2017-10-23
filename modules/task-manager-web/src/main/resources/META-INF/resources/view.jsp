<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.PropsUtil"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.customtools.service.TaskLocalServiceUtil"%>

<%@ include file="/init.jsp" %>

<div>
	<h3><liferay-ui:message key="task-manager-web.list.title"/></h3>
	
	<liferay-ui:search-container delta="10" 
						total="<%=TaskLocalServiceUtil.getTasksByUserIdCount(themeDisplay.getUserId())%>" 
						emptyResultsMessage="task-manager-web.list.empty"
						>
	<liferay-ui:search-container-results
	    results="<%=TaskLocalServiceUtil.getTasksByUserId(themeDisplay.getUserId(), 
	    			searchContainer.getStart(), searchContainer.getEnd())%>" />

	    <liferay-ui:search-container-row className="com.liferay.customtools.model.Task" keyProperty="taskId" modelVar="task">
	        <liferay-ui:search-container-column-text name="task-manager-web.list.column.name" value="${task.name}" />
	        <liferay-ui:search-container-column-text name="task-manager-web.list.column.description" value="${task.description}" />
	        
	       	<c:if test="${task.status!=0}">
	       		<liferay-ui:search-container-column-text name="task-manager-web.list.column.status" >
	       			<liferay-ui:message key="task-manager-web.list.column.status.finished"/>
	       		</liferay-ui:search-container-column-text>
	       	</c:if>
	       <c:if test="${task.status==0}">
	       		<liferay-ui:search-container-column-text name="task-manager-web.list.column.status" >
	       			<liferay-ui:message key="task-manager-web.list.column.status.notFinished"/>
	       		</liferay-ui:search-container-column-text>
	       	</c:if>
	       	
       		<portlet:renderURL var="editTaskURL">
			    <portlet:param name="mvcPath" value="/editTask.jsp"></portlet:param>
			    <portlet:param name="taskId" value="${task.taskId}"></portlet:param>
			</portlet:renderURL>			
		
			<liferay-ui:search-container-column-text name="task-manager-web.list.column.edit" align="right">
				<liferay-ui:icon-list>	
				 	<liferay-ui:icon image="edit" message="task-manager-web.list.button.edit" url="${editTaskURL}" /> 		
				</liferay-ui:icon-list>
			</liferay-ui:search-container-column-text>
			
			<liferay-ui:search-container-column-text name="task-manager-web.list.column.edit" align="right">
				<liferay-ui:icon-menu>
				 	<portlet:actionURL var="deleteTaskURL" name="deleteTask">
					    <portlet:param name="taskId" value="${task.taskId}"></portlet:param>
					</portlet:actionURL>		
				 	<liferay-ui:icon image="delete" message="DELETE" url="${deleteTaskURL}" />
				</liferay-ui:icon-menu>
			</liferay-ui:search-container-column-text>
	    </liferay-ui:search-container-row>
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container>
	
	
	<portlet:renderURL var="addTaskURL">
	    <portlet:param name="mvcPath" value="/editTask.jsp"></portlet:param>
	</portlet:renderURL>
	
	<aui:button-row>
	    <aui:button  value="task-manager-web.button.add" onClick="<%= addTaskURL.toString() %>"></aui:button>
	</aui:button-row>
	
</div>

