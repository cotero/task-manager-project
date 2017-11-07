<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@ include file="/init.jsp" %>

<%

String rootPath = StringPool.BLANK;
long viewSizeLimit = 0;
long maxDownloadFolderSize = 0;
int maxDownloadFolderItems = 0;
boolean allowAddFileFolder = false;
boolean allowEditFile = false;
boolean allowDeleteFileFolder = false;
boolean allowUploads = false;

String addsAllowed = String.valueOf(allowAddFileFolder);
String deletesAllowed = String.valueOf(allowDeleteFileFolder);
String editsAllowed = String.valueOf(allowEditFile);


%>

<liferay-portlet:actionURL portletConfiguration="<%= true %>"
	var="configurationActionURL"
/>

<liferay-portlet:renderURL portletConfiguration="<%= true %>"
	var="configurationRenderURL"
/>

<aui:form action="<%= configurationActionURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden"
		value="<%= Constants.UPDATE %>"
	/>

	<aui:input name="redirect" type="hidden"
		value="<%= configurationRenderURL %>"
	/>

	<aui:fieldset>
		<aui:input autoFocus="true" helpMessage="root-path-help" label="root-path" name="rootPath" type="text" value="<%= rootPath%>" />

		<aui:input helpMessage="adds-allowed-help" label="adds-allowed" name="addsAllowed" type="checkbox" value="<%= addsAllowed %>" />

	</aui:fieldset>

	<aui:button-row>
		<aui:button type="submit"></aui:button>
	</aui:button-row>
</aui:form>