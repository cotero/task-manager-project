package com.liferay.customtools.portlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.customtools.constants.TaskManagerPortletConstants;
import com.liferay.customtools.constants.TaskManagerPortletKeys;
import com.liferay.customtools.model.Task;
import com.liferay.customtools.service.TaskLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author carlos
 */


@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.social",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Task Manager",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + TaskManagerPortletKeys.TaskManager,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class TaskManagerPortlet extends MVCPortlet {	
	
	private static Log log = LogFactoryUtil.getLog(TaskManagerPortlet.class);
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {		
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		if (!themeDisplay.isSignedIn()){
			renderRequest.setAttribute(WebKeys.PORTLET_CONFIGURATOR_VISIBILITY, false);
		}
		super.render(renderRequest, renderResponse);
	}
	
	/**
	 * Alta/Edición tarea
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void addTask(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long groupId = themeDisplay.getScopeGroupId();
        long userId = themeDisplay.getUserId();
        
        long taskId = ParamUtil.getLong(actionRequest, "taskId");
        
        String name = ParamUtil.getString(actionRequest, "name");
        String description = ParamUtil.getString(actionRequest, "description");	        
        int status = 0;
        if (ParamUtil.getBoolean(actionRequest, "status")==true){
        	status = 1;
        }        
        
        // Validaciones de los campos 
        if (name==null || name.isEmpty() || name.length()>TaskManagerPortletConstants.FIELD_NAME_MAX_SIZE ||
        	description==null || description.isEmpty() || description.length()>TaskManagerPortletConstants.FIELD_DESCRIPTION_MAX_SIZE) {
        	SessionErrors.add(actionRequest, "task-manager-web.edit.error");
        } else {
	        log.info("TAREA " + taskId);
	        log.info("Name -> " + name);
	        log.info("Description -> " + description);
	        log.info("status -> " + status);        
	        
	        if (taskId>0){
	        	// Edición tarea
				try {
					Task task = TaskLocalServiceUtil.getTask(taskId);
					task.setName(name);
		        	task.setDescription(description);
		        	task.setStatus(status);
		        	TaskLocalServiceUtil.updateTask(task);
				} catch (PortalException e) {
					SessionErrors.add(actionRequest, "task-manager-web.edit.error");
					e.printStackTrace();
				}        	
	        } else {
	        	// Nueva Tarea
	        	try {
					TaskLocalServiceUtil.addTask(groupId, userId, name, description, status);
				} catch (PortalException e) {
					SessionErrors.add(actionRequest, "task-manager-web.add.error");
					e.printStackTrace();
				}
	        }
        }
	}
	
	
	/**
	 * Borrado de la tarea
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void deleteTask(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {		
		long taskId = ParamUtil.getLong(actionRequest, "taskId");		
		log.info("Tarea a borrar -> " + taskId);		
		try {
			TaskLocalServiceUtil.deleteTask(taskId);
		} catch (PortalException e) {
			SessionErrors.add(actionRequest, "task-manager-web.delete.error");
			e.printStackTrace();
		}
	}
	
	
	
}