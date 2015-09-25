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

package org.oep.core.datamgt.parameter.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.core.datamgt.parameter.model.UserParameter;
import org.oep.core.datamgt.parameter.service.UserParameterService;
import org.oep.core.datamgt.parameter.service.persistence.DefaultParameterPersistence;
import org.oep.core.datamgt.parameter.service.persistence.UserParameterPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the user parameter remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.core.datamgt.parameter.service.impl.UserParameterServiceImpl}.
 * </p>
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.parameter.service.impl.UserParameterServiceImpl
 * @see org.oep.core.datamgt.parameter.service.UserParameterServiceUtil
 * @generated
 */
public abstract class UserParameterServiceBaseImpl extends BaseServiceImpl
	implements UserParameterService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.core.datamgt.parameter.service.UserParameterServiceUtil} to access the user parameter remote service.
	 */

	/**
	 * Returns the default parameter local service.
	 *
	 * @return the default parameter local service
	 */
	public org.oep.core.datamgt.parameter.service.DefaultParameterLocalService getDefaultParameterLocalService() {
		return defaultParameterLocalService;
	}

	/**
	 * Sets the default parameter local service.
	 *
	 * @param defaultParameterLocalService the default parameter local service
	 */
	public void setDefaultParameterLocalService(
		org.oep.core.datamgt.parameter.service.DefaultParameterLocalService defaultParameterLocalService) {
		this.defaultParameterLocalService = defaultParameterLocalService;
	}

	/**
	 * Returns the default parameter remote service.
	 *
	 * @return the default parameter remote service
	 */
	public org.oep.core.datamgt.parameter.service.DefaultParameterService getDefaultParameterService() {
		return defaultParameterService;
	}

	/**
	 * Sets the default parameter remote service.
	 *
	 * @param defaultParameterService the default parameter remote service
	 */
	public void setDefaultParameterService(
		org.oep.core.datamgt.parameter.service.DefaultParameterService defaultParameterService) {
		this.defaultParameterService = defaultParameterService;
	}

	/**
	 * Returns the default parameter persistence.
	 *
	 * @return the default parameter persistence
	 */
	public DefaultParameterPersistence getDefaultParameterPersistence() {
		return defaultParameterPersistence;
	}

	/**
	 * Sets the default parameter persistence.
	 *
	 * @param defaultParameterPersistence the default parameter persistence
	 */
	public void setDefaultParameterPersistence(
		DefaultParameterPersistence defaultParameterPersistence) {
		this.defaultParameterPersistence = defaultParameterPersistence;
	}

	/**
	 * Returns the user parameter local service.
	 *
	 * @return the user parameter local service
	 */
	public org.oep.core.datamgt.parameter.service.UserParameterLocalService getUserParameterLocalService() {
		return userParameterLocalService;
	}

	/**
	 * Sets the user parameter local service.
	 *
	 * @param userParameterLocalService the user parameter local service
	 */
	public void setUserParameterLocalService(
		org.oep.core.datamgt.parameter.service.UserParameterLocalService userParameterLocalService) {
		this.userParameterLocalService = userParameterLocalService;
	}

	/**
	 * Returns the user parameter remote service.
	 *
	 * @return the user parameter remote service
	 */
	public org.oep.core.datamgt.parameter.service.UserParameterService getUserParameterService() {
		return userParameterService;
	}

	/**
	 * Sets the user parameter remote service.
	 *
	 * @param userParameterService the user parameter remote service
	 */
	public void setUserParameterService(
		org.oep.core.datamgt.parameter.service.UserParameterService userParameterService) {
		this.userParameterService = userParameterService;
	}

	/**
	 * Returns the user parameter persistence.
	 *
	 * @return the user parameter persistence
	 */
	public UserParameterPersistence getUserParameterPersistence() {
		return userParameterPersistence;
	}

	/**
	 * Sets the user parameter persistence.
	 *
	 * @param userParameterPersistence the user parameter persistence
	 */
	public void setUserParameterPersistence(
		UserParameterPersistence userParameterPersistence) {
		this.userParameterPersistence = userParameterPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return UserParameter.class;
	}

	protected String getModelClassName() {
		return UserParameter.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = userParameterPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = org.oep.core.datamgt.parameter.service.DefaultParameterLocalService.class)
	protected org.oep.core.datamgt.parameter.service.DefaultParameterLocalService defaultParameterLocalService;
	@BeanReference(type = org.oep.core.datamgt.parameter.service.DefaultParameterService.class)
	protected org.oep.core.datamgt.parameter.service.DefaultParameterService defaultParameterService;
	@BeanReference(type = DefaultParameterPersistence.class)
	protected DefaultParameterPersistence defaultParameterPersistence;
	@BeanReference(type = org.oep.core.datamgt.parameter.service.UserParameterLocalService.class)
	protected org.oep.core.datamgt.parameter.service.UserParameterLocalService userParameterLocalService;
	@BeanReference(type = org.oep.core.datamgt.parameter.service.UserParameterService.class)
	protected org.oep.core.datamgt.parameter.service.UserParameterService userParameterService;
	@BeanReference(type = UserParameterPersistence.class)
	protected UserParameterPersistence userParameterPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private UserParameterServiceClpInvoker _clpInvoker = new UserParameterServiceClpInvoker();
}