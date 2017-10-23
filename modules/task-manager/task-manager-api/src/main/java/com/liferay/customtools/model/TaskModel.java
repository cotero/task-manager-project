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

package com.liferay.customtools.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Task service. Represents a row in the &quot;custom_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.customtools.model.impl.TaskModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.customtools.model.impl.TaskImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Task
 * @see com.liferay.customtools.model.impl.TaskImpl
 * @see com.liferay.customtools.model.impl.TaskModelImpl
 * @generated
 */
@ProviderType
public interface TaskModel extends BaseModel<Task>, ShardedModel, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a task model instance should use the {@link Task} interface instead.
	 */

	/**
	 * Returns the primary key of this task.
	 *
	 * @return the primary key of this task
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this task.
	 *
	 * @param primaryKey the primary key of this task
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this task.
	 *
	 * @return the uuid of this task
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this task.
	 *
	 * @param uuid the uuid of this task
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the task ID of this task.
	 *
	 * @return the task ID of this task
	 */
	public long getTaskId();

	/**
	 * Sets the task ID of this task.
	 *
	 * @param taskId the task ID of this task
	 */
	public void setTaskId(long taskId);

	/**
	 * Returns the group ID of this task.
	 *
	 * @return the group ID of this task
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this task.
	 *
	 * @param groupId the group ID of this task
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this task.
	 *
	 * @return the company ID of this task
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this task.
	 *
	 * @param companyId the company ID of this task
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this task.
	 *
	 * @return the user ID of this task
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this task.
	 *
	 * @param userId the user ID of this task
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this task.
	 *
	 * @return the user uuid of this task
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this task.
	 *
	 * @param userUuid the user uuid of this task
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this task.
	 *
	 * @return the create date of this task
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this task.
	 *
	 * @param createDate the create date of this task
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this task.
	 *
	 * @return the modified date of this task
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this task.
	 *
	 * @param modifiedDate the modified date of this task
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this task.
	 *
	 * @return the name of this task
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this task.
	 *
	 * @param name the name of this task
	 */
	public void setName(String name);

	/**
	 * Returns the description of this task.
	 *
	 * @return the description of this task
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this task.
	 *
	 * @param description the description of this task
	 */
	public void setDescription(String description);

	/**
	 * Returns the status of this task.
	 *
	 * @return the status of this task
	 */
	public int getStatus();

	/**
	 * Sets the status of this task.
	 *
	 * @param status the status of this task
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Task task);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Task> toCacheModel();

	@Override
	public Task toEscapedModel();

	@Override
	public Task toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}