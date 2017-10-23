
<%@page import="com.liferay.customtools.model.Task"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%
   ResultRow row = (ResultRow) request
         .getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
   Task task = (Task) row.getObject();
   
   System.out.println("Acciones -> " + task);
   
%>



<liferay-ui:icon-list >
	<portlet:renderURL var="editTaskURL">
	    <portlet:param name="mvcPath" value="/editTask.jsp"></portlet:param>
	    <portlet:param name="taskId" value="<%=task.getTaskId()%>"></portlet:param>
	</portlet:renderURL>
 	<liferay-ui:icon image="edit" message="EDIT" url="${editTaskURL}" />
 			
 	<portlet:actionURL var="deleteTaskURL">
	    <portlet:param name="taskId" value="<%=task.getTaskId()%>"></portlet:param>
	</portlet:actionURL>		
 	<liferay-ui:icon image="delete" message="DELETE" url="${deleteTaskURL}" />
</liferay-ui:icon-list>

