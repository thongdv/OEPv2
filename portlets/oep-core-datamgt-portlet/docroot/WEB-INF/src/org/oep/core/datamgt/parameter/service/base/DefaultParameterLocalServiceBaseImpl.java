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
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import org.oep.core.datamgt.parameter.model.DefaultParameter;
import org.oep.core.datamgt.parameter.service.DefaultParameterLocalService;
import org.oep.core.datamgt.parameter.service.persistence.DefaultParameterPersistence;
import org.oep.core.datamgt.parameter.service.persistence.UserParameterPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the default parameter local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.oep.core.datamgt.parameter.service.impl.DefaultParameterLocalServiceImpl}.
 * </p>
 *
 * @author TrungDK
 * @see org.oep.core.datamgt.parameter.service.impl.DefaultParameterLocalServiceImpl
 * @see org.oep.core.datamgt.parameter.service.DefaultParameterLocalServiceUtil
 * @generated
 */
public abstract class DefaultParameterLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements DefaultParameterLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link org.oep.core.datamgt.parameter.service.DefaultParameterLocalServiceUtil} to access the default parameter local service.
	 */

	/**
	 * Adds the default parameter to the database. Also notifies the appropriate model listeners.
	 *
	 * @param defaultParameter the default parameter
	 * @return the default parameter that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DefaultParameter addDefaultParameter(
		DefaultParameter defaultParameter) throws SystemException {
		defaultParameter.setNew(true);

		return defaultParameterPersistence.update(defaultParameter);
	}

	/**
	 * Creates a new default parameter with the primary key. Does not add the default parameter to the database.
	 *
	 * @param defaultParameterId the primary key for the new default parameter
	 * @return the new default parameter
	 */
	@Override
	public DefaultParameter createDefaultParameter(long defaultParameterId) {
		return defaultParameterPersistence.create(defaultParameterId);
	}

	/**
	 * Deletes the default parameter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param defaultParameterId the primary key of the default parameter
	 * @return the default parameter that was removed
	 * @throws PortalException if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DefaultParameter deleteDefaultParameter(long defaultParameterId)
		throws PortalException, SystemException {
		return defaultParameterPersistence.remove(defaultParameterId);
	}

	/**
	 * Deletes the default parameter from the database. Also notifies the appropriate model listeners.
	 *
	 * @param defaultParameter the default parameter
	 * @return the default parameter that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DefaultParameter deleteDefaultParameter(
		DefaultParameter defaultParameter) throws SystemException {
		return defaultParameterPersistence.remove(defaultParameter);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(DefaultParameter.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return defaultParameterPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return defaultParameterPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return defaultParameterPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return defaultParameterPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return defaultParameterPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public DefaultParameter fetchDefaultParameter(long defaultParameterId)
		throws SystemException {
		return defaultParameterPersistence.fetchByPrimaryKey(defaultParameterId);
	}

	/**
	 * Returns the default parameter with the primary key.
	 *
	 * @param defaultParameterId the primary key of the default parameter
	 * @return the default parameter
	 * @throws PortalException if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter getDefaultParameter(long defaultParameterId)
		throws PortalException, SystemException {
		return defaultParameterPersistence.findByPrimaryKey(defaultParameterId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return defaultParameterPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the default parameters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of default parameters
	 * @param end the upper bound of the range of default parameters (not inclusive)
	 * @return the range of default parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DefaultParameter> getDefaultParameters(int start, int end)
		throws SystemException {
		return defaultParameterPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of default parameters.
	 *
	 * @return the number of default parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getDefaultParametersCount() throws SystemException {
		return defaultParameterPersistence.countAll();
	}

	/**
	 * Updates the default parameter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param defaultParameter the default parameter
	 * @return the default parameter that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DefaultParameter updateDefaultParameter(
		DefaultParameter defaultParameter) throws SystemException {
		return defaultParameterPersistence.update(defaultParameter);
	}

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

		PersistedModelLocalServiceRegistryUtil.register("org.oep.core.datamgt.parameter.model.DefaultParameter",
			defaultParameterLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"org.oep.core.datamgt.parameter.model.DefaultParameter");
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
		return DefaultParameter.class;
	}

	protected String getModelClassName() {
		return DefaultParameter.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = defaultParameterPersistence.getDataSource();

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
	private DefaultParameterLocalServiceClpInvoker _clpInvoker = new DefaultParameterLocalServiceClpInvoker();
}