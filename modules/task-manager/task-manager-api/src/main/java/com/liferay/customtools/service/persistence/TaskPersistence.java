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

package com.liferay.customtools.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.customtools.exception.NoSuchTaskException;
import com.liferay.customtools.model.Task;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the task service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.customtools.service.persistence.impl.TaskPersistenceImpl
 * @see TaskUtil
 * @generated
 */
@ProviderType
public interface TaskPersistence extends BasePersistence<Task> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TaskUtil} to access the task persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the tasks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching tasks
	*/
	public java.util.List<Task> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the tasks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByUuid(java.lang.String uuid, int start,
		int end);

	/**
	* Returns an ordered range of all the tasks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where uuid = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByUuid_PrevAndNext(long taskId, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of tasks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching tasks
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the task where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTaskException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTaskException;

	/**
	* Returns the task where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the task where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the task where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the task that was removed
	*/
	public Task removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchTaskException;

	/**
	* Returns the number of tasks where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching tasks
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching tasks
	*/
	public java.util.List<Task> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByUuid_C_PrevAndNext(long taskId, java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of tasks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching tasks
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the tasks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching tasks
	*/
	public java.util.List<Task> findByGroupId(long groupId);

	/**
	* Returns a range of all the tasks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByGroupId(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the tasks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByGroupId(long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where groupId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByGroupId_PrevAndNext(long taskId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of tasks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching tasks
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the tasks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching tasks
	*/
	public java.util.List<Task> findByUserId(long userId);

	/**
	* Returns a range of all the tasks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByUserId(long userId, int start, int end);

	/**
	* Returns an ordered range of all the tasks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUserId(long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUserId_First(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUserId_Last(long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where userId = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByUserId_PrevAndNext(long taskId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByUserId(long userId);

	/**
	* Returns the number of tasks where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching tasks
	*/
	public int countByUserId(long userId);

	/**
	* Returns all the tasks where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the matching tasks
	*/
	public java.util.List<Task> findByUserId_Status(long userId, int status);

	/**
	* Returns a range of all the tasks where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByUserId_Status(long userId, int status,
		int start, int end);

	/**
	* Returns an ordered range of all the tasks where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUserId_Status(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where userId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUserId_Status(long userId, int status,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUserId_Status_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUserId_Status_First(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUserId_Status_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUserId_Status_Last(long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where userId = &#63; and status = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param userId the user ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByUserId_Status_PrevAndNext(long taskId, long userId,
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where userId = &#63; and status = &#63; from the database.
	*
	* @param userId the user ID
	* @param status the status
	*/
	public void removeByUserId_Status(long userId, int status);

	/**
	* Returns the number of tasks where userId = &#63; and status = &#63;.
	*
	* @param userId the user ID
	* @param status the status
	* @return the number of matching tasks
	*/
	public int countByUserId_Status(long userId, int status);

	/**
	* Returns all the tasks where status = &#63;.
	*
	* @param status the status
	* @return the matching tasks
	*/
	public java.util.List<Task> findByStatus(int status);

	/**
	* Returns a range of all the tasks where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByStatus(int status, int start, int end);

	/**
	* Returns an ordered range of all the tasks where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByStatus(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByStatus(int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByStatus_First(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where status = &#63;.
	*
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByStatus_Last(int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where status = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByStatus_PrevAndNext(long taskId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where status = &#63; from the database.
	*
	* @param status the status
	*/
	public void removeByStatus(int status);

	/**
	* Returns the number of tasks where status = &#63;.
	*
	* @param status the status
	* @return the number of matching tasks
	*/
	public int countByStatus(int status);

	/**
	* Returns all the tasks where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the matching tasks
	*/
	public java.util.List<Task> findByG_S(long groupId, int status);

	/**
	* Returns a range of all the tasks where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByG_S(long groupId, int status, int start,
		int end);

	/**
	* Returns an ordered range of all the tasks where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByG_S(long groupId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where groupId = &#63; and status = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param status the status
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByG_S(long groupId, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByG_S_First(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByG_S_Last(long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where groupId = &#63; and status = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param groupId the group ID
	* @param status the status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByG_S_PrevAndNext(long taskId, long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where groupId = &#63; and status = &#63; from the database.
	*
	* @param groupId the group ID
	* @param status the status
	*/
	public void removeByG_S(long groupId, int status);

	/**
	* Returns the number of tasks where groupId = &#63; and status = &#63;.
	*
	* @param groupId the group ID
	* @param status the status
	* @return the number of matching tasks
	*/
	public int countByG_S(long groupId, int status);

	/**
	* Returns all the tasks where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the matching tasks
	*/
	public java.util.List<Task> findByUserId_Name(long userId,
		java.lang.String name);

	/**
	* Returns a range of all the tasks where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of matching tasks
	*/
	public java.util.List<Task> findByUserId_Name(long userId,
		java.lang.String name, int start, int end);

	/**
	* Returns an ordered range of all the tasks where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUserId_Name(long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks where userId = &#63; and name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param name the name
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching tasks
	*/
	public java.util.List<Task> findByUserId_Name(long userId,
		java.lang.String name, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first task in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUserId_Name_First(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the first task in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUserId_Name_First(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the last task in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task
	* @throws NoSuchTaskException if a matching task could not be found
	*/
	public Task findByUserId_Name_Last(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Returns the last task in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching task, or <code>null</code> if a matching task could not be found
	*/
	public Task fetchByUserId_Name_Last(long userId, java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns the tasks before and after the current task in the ordered set where userId = &#63; and name = &#63;.
	*
	* @param taskId the primary key of the current task
	* @param userId the user ID
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task[] findByUserId_Name_PrevAndNext(long taskId, long userId,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator)
		throws NoSuchTaskException;

	/**
	* Removes all the tasks where userId = &#63; and name = &#63; from the database.
	*
	* @param userId the user ID
	* @param name the name
	*/
	public void removeByUserId_Name(long userId, java.lang.String name);

	/**
	* Returns the number of tasks where userId = &#63; and name = &#63;.
	*
	* @param userId the user ID
	* @param name the name
	* @return the number of matching tasks
	*/
	public int countByUserId_Name(long userId, java.lang.String name);

	/**
	* Caches the task in the entity cache if it is enabled.
	*
	* @param task the task
	*/
	public void cacheResult(Task task);

	/**
	* Caches the tasks in the entity cache if it is enabled.
	*
	* @param tasks the tasks
	*/
	public void cacheResult(java.util.List<Task> tasks);

	/**
	* Creates a new task with the primary key. Does not add the task to the database.
	*
	* @param taskId the primary key for the new task
	* @return the new task
	*/
	public Task create(long taskId);

	/**
	* Removes the task with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param taskId the primary key of the task
	* @return the task that was removed
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task remove(long taskId) throws NoSuchTaskException;

	public Task updateImpl(Task task);

	/**
	* Returns the task with the primary key or throws a {@link NoSuchTaskException} if it could not be found.
	*
	* @param taskId the primary key of the task
	* @return the task
	* @throws NoSuchTaskException if a task with the primary key could not be found
	*/
	public Task findByPrimaryKey(long taskId) throws NoSuchTaskException;

	/**
	* Returns the task with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param taskId the primary key of the task
	* @return the task, or <code>null</code> if a task with the primary key could not be found
	*/
	public Task fetchByPrimaryKey(long taskId);

	@Override
	public java.util.Map<java.io.Serializable, Task> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the tasks.
	*
	* @return the tasks
	*/
	public java.util.List<Task> findAll();

	/**
	* Returns a range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @return the range of tasks
	*/
	public java.util.List<Task> findAll(int start, int end);

	/**
	* Returns an ordered range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tasks
	*/
	public java.util.List<Task> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator);

	/**
	* Returns an ordered range of all the tasks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TaskModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of tasks
	* @param end the upper bound of the range of tasks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of tasks
	*/
	public java.util.List<Task> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Task> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the tasks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of tasks.
	*
	* @return the number of tasks
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}