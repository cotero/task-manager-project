package com.liferay.customtools.asset;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.PortletURL;
import javax.portlet.WindowState;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.asset.kernel.model.BaseJSPAssetRenderer;
import com.liferay.customtools.constants.TaskManagerPortletKeys;
//import com.liferay.docs.guestbook.service.permission.GuestbookPermission;
import com.liferay.customtools.model.Task;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringUtil;

public class TaskAssetRenderer extends BaseJSPAssetRenderer<Task> {
	
	private Task _task;

	public TaskAssetRenderer(Task _task) {
		_task = _task;
	}
	
	
	@Override
	public boolean hasEditPermission(PermissionChecker permissionChecker) 
	throws PortalException {

//	  long taskId = _task.getTaskId();
//	  return TaskPermission.contains(permissionChecker, taskId, ActionKeys.UPDATE);
		return true;
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker) 
	throws PortalException {

//		long taskId = _task.getTaskId();
//		return TaskPermission.contains(permissionChecker, taskId, ActionKeys.VIEW);
		return true;
	}

	@Override
	public Task getAssetObject() {
		// TODO Auto-generated method stub
		return _task;
	}

	@Override
	public long getGroupId() {
		// TODO Auto-generated method stub
		return _task.getGroupId();
	}

	@Override
	public long getUserId() {
		// TODO Auto-generated method stub
		return _task.getUserId();
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		String userName = "";
//		try {
//			userName = UserLocalServiceUtil.getUser(_task.getUserId()).getScreenName();
//		} catch (PortalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return String.valueOf(_task.getUserId());
	}

	@Override
	public String getUuid() {
		// TODO Auto-generated method stub
		return _task.getUuid();
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return Task.class.getName();
	}

	@Override
	public long getClassPK() {
		// TODO Auto-generated method stub
		return _task.getTaskId();
	}

	@Override
	public String getSummary(PortletRequest portletRequest, PortletResponse portletResponse) {
		// TODO Auto-generated method stub
		return "Name: " + _task.getName();
	}

	@Override
	public String getTitle(Locale locale) {
		// TODO Auto-generated method stub
		return _task.getName();
	}

	@Override
	public String getJspPath(HttpServletRequest request, String template) {
		if (template.equals(TEMPLATE_FULL_CONTENT)) {
			request.setAttribute("t_task", _task);
			return "/asset/task/" + template + ".jsp";
	    } else {
	      return null;
	    }
	}
	
	@Override
	public boolean include(HttpServletRequest request, HttpServletResponse response, String template) throws Exception {
	    request.setAttribute("TASK", _task);
	    request.setAttribute("HtmlUtil", HtmlUtil.getHtml());
	    request.setAttribute("StringUtil", new StringUtil());
	    return super.include(request, response, template);
	}
	
	@Override
	public PortletURL getURLEdit(LiferayPortletRequest liferayPortletRequest, LiferayPortletResponse liferayPortletResponse) throws Exception {
	    PortletURL portletURL = liferayPortletResponse.createLiferayPortletURL(
	        getControlPanelPlid(liferayPortletRequest), TaskManagerPortletKeys.TaskManager,
	        PortletRequest.RENDER_PHASE);
	    portletURL.setParameter("mvcRenderCommandName", "/taskmanagerwebportlet/edit_task");
	    portletURL.setParameter("taskId", String.valueOf(_task.getTaskId()));
	    portletURL.setParameter("showback", Boolean.FALSE.toString());
	    return portletURL;
	}
	
	@Override
	public String getURLViewInContext(LiferayPortletRequest liferayPortletRequest,
	      LiferayPortletResponse liferayPortletResponse, String noSuchEntryRedirect) throws Exception {
	    try {
	      long plid = PortalUtil.getPlidFromPortletId(_task.getGroupId(),
	    		  TaskManagerPortletKeys.TaskManager);

	      PortletURL portletURL;
	      if (plid == LayoutConstants.DEFAULT_PLID) {
	        portletURL = liferayPortletResponse.createLiferayPortletURL(getControlPanelPlid(liferayPortletRequest),
	        		TaskManagerPortletKeys.TaskManager, PortletRequest.RENDER_PHASE);
	      } else {
	        portletURL = PortletURLFactoryUtil.create(liferayPortletRequest,
	        		TaskManagerPortletKeys.TaskManager, plid, PortletRequest.RENDER_PHASE);
	      }

	      portletURL.setParameter("mvcRenderCommandName", "/taskmanagerwebportlet/view");
	      portletURL.setParameter("taskId", String.valueOf(_task.getTaskId()));

	      String currentUrl = PortalUtil.getCurrentURL(liferayPortletRequest);

	      portletURL.setParameter("redirect", currentUrl);

	      return portletURL.toString();

	    } catch (PortalException e) {

	    } catch (SystemException e) {
	    }

	    return noSuchEntryRedirect;
	}
	  
	@Override
	public String getURLView(LiferayPortletResponse liferayPortletResponse, 
	  WindowState windowState) throws Exception {

	    return super.getURLView(liferayPortletResponse, windowState);
	}

}
