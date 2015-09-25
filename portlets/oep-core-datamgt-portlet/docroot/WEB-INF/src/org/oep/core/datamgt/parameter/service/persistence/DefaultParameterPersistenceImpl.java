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

package org.oep.core.datamgt.parameter.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import org.oep.core.datamgt.parameter.NoSuchDefaultParameterException;
import org.oep.core.datamgt.parameter.model.DefaultParameter;
import org.oep.core.datamgt.parameter.model.impl.DefaultParameterImpl;
import org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the default parameter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author TrungDK
 * @see DefaultParameterPersistence
 * @see DefaultParameterUtil
 * @generated
 */
public class DefaultParameterPersistenceImpl extends BasePersistenceImpl<DefaultParameter>
	implements DefaultParameterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DefaultParameterUtil} to access the default parameter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DefaultParameterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
			DefaultParameterModelImpl.FINDER_CACHE_ENABLED,
			DefaultParameterImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
			DefaultParameterModelImpl.FINDER_CACHE_ENABLED,
			DefaultParameterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
			DefaultParameterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public DefaultParameterPersistenceImpl() {
		setModelClass(DefaultParameter.class);
	}

	/**
	 * Caches the default parameter in the entity cache if it is enabled.
	 *
	 * @param defaultParameter the default parameter
	 */
	@Override
	public void cacheResult(DefaultParameter defaultParameter) {
		EntityCacheUtil.putResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
			DefaultParameterImpl.class, defaultParameter.getPrimaryKey(),
			defaultParameter);

		defaultParameter.resetOriginalValues();
	}

	/**
	 * Caches the default parameters in the entity cache if it is enabled.
	 *
	 * @param defaultParameters the default parameters
	 */
	@Override
	public void cacheResult(List<DefaultParameter> defaultParameters) {
		for (DefaultParameter defaultParameter : defaultParameters) {
			if (EntityCacheUtil.getResult(
						DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
						DefaultParameterImpl.class,
						defaultParameter.getPrimaryKey()) == null) {
				cacheResult(defaultParameter);
			}
			else {
				defaultParameter.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all default parameters.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DefaultParameterImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DefaultParameterImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the default parameter.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DefaultParameter defaultParameter) {
		EntityCacheUtil.removeResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
			DefaultParameterImpl.class, defaultParameter.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<DefaultParameter> defaultParameters) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DefaultParameter defaultParameter : defaultParameters) {
			EntityCacheUtil.removeResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
				DefaultParameterImpl.class, defaultParameter.getPrimaryKey());
		}
	}

	/**
	 * Creates a new default parameter with the primary key. Does not add the default parameter to the database.
	 *
	 * @param defaultParameterId the primary key for the new default parameter
	 * @return the new default parameter
	 */
	@Override
	public DefaultParameter create(long defaultParameterId) {
		DefaultParameter defaultParameter = new DefaultParameterImpl();

		defaultParameter.setNew(true);
		defaultParameter.setPrimaryKey(defaultParameterId);

		return defaultParameter;
	}

	/**
	 * Removes the default parameter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param defaultParameterId the primary key of the default parameter
	 * @return the default parameter that was removed
	 * @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter remove(long defaultParameterId)
		throws NoSuchDefaultParameterException, SystemException {
		return remove((Serializable)defaultParameterId);
	}

	/**
	 * Removes the default parameter with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the default parameter
	 * @return the default parameter that was removed
	 * @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter remove(Serializable primaryKey)
		throws NoSuchDefaultParameterException, SystemException {
		Session session = null;

		try {
			session = openSession();

			DefaultParameter defaultParameter = (DefaultParameter)session.get(DefaultParameterImpl.class,
					primaryKey);

			if (defaultParameter == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDefaultParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(defaultParameter);
		}
		catch (NoSuchDefaultParameterException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DefaultParameter removeImpl(DefaultParameter defaultParameter)
		throws SystemException {
		defaultParameter = toUnwrappedModel(defaultParameter);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(defaultParameter)) {
				defaultParameter = (DefaultParameter)session.get(DefaultParameterImpl.class,
						defaultParameter.getPrimaryKeyObj());
			}

			if (defaultParameter != null) {
				session.delete(defaultParameter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (defaultParameter != null) {
			clearCache(defaultParameter);
		}

		return defaultParameter;
	}

	@Override
	public DefaultParameter updateImpl(
		org.oep.core.datamgt.parameter.model.DefaultParameter defaultParameter)
		throws SystemException {
		defaultParameter = toUnwrappedModel(defaultParameter);

		boolean isNew = defaultParameter.isNew();

		Session session = null;

		try {
			session = openSession();

			if (defaultParameter.isNew()) {
				session.save(defaultParameter);

				defaultParameter.setNew(false);
			}
			else {
				session.merge(defaultParameter);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
			DefaultParameterImpl.class, defaultParameter.getPrimaryKey(),
			defaultParameter);

		return defaultParameter;
	}

	protected DefaultParameter toUnwrappedModel(
		DefaultParameter defaultParameter) {
		if (defaultParameter instanceof DefaultParameterImpl) {
			return defaultParameter;
		}

		DefaultParameterImpl defaultParameterImpl = new DefaultParameterImpl();

		defaultParameterImpl.setNew(defaultParameter.isNew());
		defaultParameterImpl.setPrimaryKey(defaultParameter.getPrimaryKey());

		defaultParameterImpl.setDefaultParameterId(defaultParameter.getDefaultParameterId());
		defaultParameterImpl.setCompanyId(defaultParameter.getCompanyId());
		defaultParameterImpl.setCreateDate(defaultParameter.getCreateDate());
		defaultParameterImpl.setModifiedDate(defaultParameter.getModifiedDate());
		defaultParameterImpl.setApplicationName(defaultParameter.getApplicationName());
		defaultParameterImpl.setParameterName(defaultParameter.getParameterName());
		defaultParameterImpl.setTitle(defaultParameter.getTitle());
		defaultParameterImpl.setParameterValue(defaultParameter.getParameterValue());
		defaultParameterImpl.setChangeable(defaultParameter.getChangeable());

		return defaultParameterImpl;
	}

	/**
	 * Returns the default parameter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the default parameter
	 * @return the default parameter
	 * @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDefaultParameterException, SystemException {
		DefaultParameter defaultParameter = fetchByPrimaryKey(primaryKey);

		if (defaultParameter == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDefaultParameterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return defaultParameter;
	}

	/**
	 * Returns the default parameter with the primary key or throws a {@link org.oep.core.datamgt.parameter.NoSuchDefaultParameterException} if it could not be found.
	 *
	 * @param defaultParameterId the primary key of the default parameter
	 * @return the default parameter
	 * @throws org.oep.core.datamgt.parameter.NoSuchDefaultParameterException if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter findByPrimaryKey(long defaultParameterId)
		throws NoSuchDefaultParameterException, SystemException {
		return findByPrimaryKey((Serializable)defaultParameterId);
	}

	/**
	 * Returns the default parameter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the default parameter
	 * @return the default parameter, or <code>null</code> if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		DefaultParameter defaultParameter = (DefaultParameter)EntityCacheUtil.getResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
				DefaultParameterImpl.class, primaryKey);

		if (defaultParameter == _nullDefaultParameter) {
			return null;
		}

		if (defaultParameter == null) {
			Session session = null;

			try {
				session = openSession();

				defaultParameter = (DefaultParameter)session.get(DefaultParameterImpl.class,
						primaryKey);

				if (defaultParameter != null) {
					cacheResult(defaultParameter);
				}
				else {
					EntityCacheUtil.putResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
						DefaultParameterImpl.class, primaryKey,
						_nullDefaultParameter);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DefaultParameterModelImpl.ENTITY_CACHE_ENABLED,
					DefaultParameterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return defaultParameter;
	}

	/**
	 * Returns the default parameter with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param defaultParameterId the primary key of the default parameter
	 * @return the default parameter, or <code>null</code> if a default parameter with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public DefaultParameter fetchByPrimaryKey(long defaultParameterId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)defaultParameterId);
	}

	/**
	 * Returns all the default parameters.
	 *
	 * @return the default parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DefaultParameter> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<DefaultParameter> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the default parameters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.oep.core.datamgt.parameter.model.impl.DefaultParameterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of default parameters
	 * @param end the upper bound of the range of default parameters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of default parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<DefaultParameter> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DefaultParameter> list = (List<DefaultParameter>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DEFAULTPARAMETER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DEFAULTPARAMETER;

				if (pagination) {
					sql = sql.concat(DefaultParameterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DefaultParameter>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<DefaultParameter>(list);
				}
				else {
					list = (List<DefaultParameter>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the default parameters from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (DefaultParameter defaultParameter : findAll()) {
			remove(defaultParameter);
		}
	}

	/**
	 * Returns the number of default parameters.
	 *
	 * @return the number of default parameters
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DEFAULTPARAMETER);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the default parameter persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.org.oep.core.datamgt.parameter.model.DefaultParameter")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<DefaultParameter>> listenersList = new ArrayList<ModelListener<DefaultParameter>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<DefaultParameter>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DefaultParameterImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DEFAULTPARAMETER = "SELECT defaultParameter FROM DefaultParameter defaultParameter";
	private static final String _SQL_COUNT_DEFAULTPARAMETER = "SELECT COUNT(defaultParameter) FROM DefaultParameter defaultParameter";
	private static final String _ORDER_BY_ENTITY_ALIAS = "defaultParameter.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DefaultParameter exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DefaultParameterPersistenceImpl.class);
	private static DefaultParameter _nullDefaultParameter = new DefaultParameterImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<DefaultParameter> toCacheModel() {
				return _nullDefaultParameterCacheModel;
			}
		};

	private static CacheModel<DefaultParameter> _nullDefaultParameterCacheModel = new CacheModel<DefaultParameter>() {
			@Override
			public DefaultParameter toEntityModel() {
				return _nullDefaultParameter;
			}
		};
}