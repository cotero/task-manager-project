package com.liferay.customtools.asset;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.AssetRendererFactory;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.customtools.constants.TaskManagerPortletKeys;
import com.liferay.customtools.model.Task;
import com.liferay.customtools.service.TaskLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.LiferayPortletRequest;
import com.liferay.portal.kernel.portlet.LiferayPortletResponse;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;

@Component(immediate = true, 
property = {"javax.portlet.name=" + TaskManagerPortletKeys.TaskManager}, 
service = AssetRendererFactory.class
)
public class TaskAssetRendererFactory extends BaseAssetRendererFactory<Task> {
	
	private TaskLocalService _taskLocalService;
    private static final boolean _LINKABLE = true;
    public static final String CLASS_NAME = Task.class.getName();
    public static final String TYPE = "task";

	public TaskAssetRendererFactory() {
	    setClassName(CLASS_NAME);
	    setLinkable(_LINKABLE);
	    setPortletId(TaskManagerPortletKeys.TaskManager);
	    setSearchable(true);
	    setSelectable(true);
	}
	
	@Override
	public AssetRenderer<Task> getAssetRenderer(long classPK, int type) throws PortalException {

		Task task = _taskLocalService.getTask(classPK);

	  TaskAssetRenderer taskAssetRenderer = new TaskAssetRenderer(task);

	  taskAssetRenderer.setAssetRendererType(type);
	  taskAssetRenderer.setServletContext(_servletContext);

	  return taskAssetRenderer;
	}
	
	
	@Override
	public String getClassName() {
	    return CLASS_NAME;
	}

	@Override
	public String getType() {
	    return TYPE;
	}
	
	@Override
	public boolean hasPermission(PermissionChecker permissionChecker, long classPK, String actionId) throws Exception {

//	  Guestbook guestbook = _guestbookLocalService.getGuestbook(classPK);
//	  return GuestbookPermission.contains(permissionChecker, guestbook, 
//	  actionId);
		return true;
	}
	
    @Override
    public PortletURL getURLAdd(LiferayPortletRequest liferayPortletRequest,
        LiferayPortletResponse liferayPortletResponse, long classTypeId) {
      PortletURL portletURL = null;

      try {
        ThemeDisplay themeDisplay = (ThemeDisplay) 
        liferayPortletRequest.getAttribute(WebKeys.THEME_DISPLAY);

        portletURL = liferayPortletResponse.createLiferayPortletURL(getControlPanelPlid(themeDisplay),
        		TaskManagerPortletKeys.TaskManager, PortletRequest.RENDER_PHASE);
        portletURL.setParameter("mvcRenderCommandName", "/taskmanagerwebportlet/edit_task");
        portletURL.setParameter("showback", Boolean.FALSE.toString());
      } catch (PortalException e) {
      }

      return portletURL;
    }

    @Override
    public boolean isLinkable() {
    	return _LINKABLE;
    }

    @Override
    public String getIconCssClass() {
        return "bookmarks";
    }

    @Reference(target = "(osgi.web.symbolicname=com.liferay.customtools.portlet)",
          unbind = "-")
    public void setServletContext(ServletContext servletContext) {
          _servletContext = servletContext;
    }
    private ServletContext _servletContext;

    @Reference(unbind = "-")
    protected void setGuestbookLocalService(TaskLocalService taskLocalService) {
    	_taskLocalService = taskLocalService; 
    }


}
