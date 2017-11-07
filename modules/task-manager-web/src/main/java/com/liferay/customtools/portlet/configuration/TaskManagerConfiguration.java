package com.liferay.customtools.portlet.configuration;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

import com.liferay.customtools.constants.TaskManagerPortletKeys;
import com.liferay.portal.kernel.portlet.ConfigurationAction;
import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + TaskManagerPortletKeys.TaskManager
		},
		service = ConfigurationAction.class
	)
public class TaskManagerConfiguration extends DefaultConfigurationAction {

	
	@Override
	public String getJspPath(HttpServletRequest request) {
		return "/configuration.jsp";
	}
	
	@Override
	public void processAction(PortletConfig portletConfig, ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		// TODO Auto-generated method stub
		String rootPath = getParameter(actionRequest, "rootPath");
		
		System.out.println("rootPath -> " + rootPath);
		
		super.processAction(portletConfig, actionRequest, actionResponse);
	}
	
}
