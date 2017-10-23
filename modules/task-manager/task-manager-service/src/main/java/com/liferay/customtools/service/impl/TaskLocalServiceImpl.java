/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.customtools.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.customtools.model.Task;
import com.liferay.customtools.service.base.TaskLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

/**
 * The implementation of the task local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.customtools.service.TaskLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TaskLocalServiceBaseImpl
 * @see com.liferay.customtools.service.TaskLocalServiceUtil
 */
public class TaskLocalServiceImpl extends TaskLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.customtools.service.TaskLocalServiceUtil} to access the task local service.
	 */
	
	
	public Task addTask(long groupId, long userId, String name, String description, int status) throws PortalException {

	    User user = userLocalService.getUserById(userId);
	    Date now = new Date();

	    long taskId = counterLocalService.increment();
	    Task task = taskPersistence.create(taskId);
	    
	    task.setGroupId(groupId);	    
	    task.setCompanyId(user.getCompanyId());
	    task.setUserId(userId);
	    task.setCreateDate(now);
	    task.setModifiedDate(now);	    
	    task.setName(name);
	    task.setDescription(description);
	    task.setStatus(status);	    
	    
	    taskPersistence.update(task);

	    return task;
	}
	
	public List<Task> getTasksByGroupId(long groupId) {
	    return taskPersistence.findByGroupId(groupId);
	}
	
	public List<Task> getTasksByUserId(long userId) {
	    return taskPersistence.findByUserId(userId);
	}
	
	public List<Task> getTasksByUserId_Status(long userId, int status) {
	    return taskPersistence.findByUserId_Status(userId, status);
	}
	
	public List<Task> getTasksByUserId_Status(long userId, String name) {
	    return taskPersistence.findByUserId_Name(userId, name);
	}
	
	public int getTasksByGroupIdCount(long groupId) {
	    return taskPersistence.countByGroupId(groupId);
	}
	
	public int getTasksByUserIdCount(long userId) {
	    return taskPersistence.countByUserId(userId);
	}
	
	public List<Task> getTasksByUserId(long userId, int start, int end) {
	    return taskPersistence.findByUserId(userId, start, end);
	}
	
}