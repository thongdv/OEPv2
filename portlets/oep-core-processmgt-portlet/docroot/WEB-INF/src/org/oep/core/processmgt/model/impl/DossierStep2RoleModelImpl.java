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

package org.oep.core.processmgt.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.oep.core.processmgt.model.DossierStep2Role;
import org.oep.core.processmgt.model.DossierStep2RoleModel;
import org.oep.core.processmgt.model.DossierStep2RoleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierStep2Role service. Represents a row in the &quot;oep_processmgt_DossierStep2Role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.processmgt.model.DossierStep2RoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierStep2RoleImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierStep2RoleImpl
 * @see org.oep.core.processmgt.model.DossierStep2Role
 * @see org.oep.core.processmgt.model.DossierStep2RoleModel
 * @generated
 */
@JSON(strict = true)
public class DossierStep2RoleModelImpl extends BaseModelImpl<DossierStep2Role>
	implements DossierStep2RoleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier step2 role model instance should use the {@link org.oep.core.processmgt.model.DossierStep2Role} interface instead.
	 */
	public static final String TABLE_NAME = "oep_processmgt_DossierStep2Role";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "dossierStepId", Types.BIGINT },
			{ "roleId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_processmgt_DossierStep2Role (id_ LONG not null primary key,companyId LONG,dossierStepId LONG,roleId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_processmgt_DossierStep2Role";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierStep2Role.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_processmgt_DossierStep2Role.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.processmgt.model.DossierStep2Role"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.processmgt.model.DossierStep2Role"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierStep2Role toModel(DossierStep2RoleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierStep2Role model = new DossierStep2RoleImpl();

		model.setId(soapModel.getId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setDossierStepId(soapModel.getDossierStepId());
		model.setRoleId(soapModel.getRoleId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierStep2Role> toModels(
		DossierStep2RoleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierStep2Role> models = new ArrayList<DossierStep2Role>(soapModels.length);

		for (DossierStep2RoleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.processmgt.model.DossierStep2Role"));

	public DossierStep2RoleModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return DossierStep2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierStep2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dossierStepId", getDossierStepId());
		attributes.put("roleId", getRoleId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long dossierStepId = (Long)attributes.get("dossierStepId");

		if (dossierStepId != null) {
			setDossierStepId(dossierStepId);
		}

		Long roleId = (Long)attributes.get("roleId");

		if (roleId != null) {
			setRoleId(roleId);
		}
	}

	@JSON
	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getDossierStepId() {
		return _dossierStepId;
	}

	@Override
	public void setDossierStepId(long dossierStepId) {
		_dossierStepId = dossierStepId;
	}

	@JSON
	@Override
	public long getRoleId() {
		return _roleId;
	}

	@Override
	public void setRoleId(long roleId) {
		_roleId = roleId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			DossierStep2Role.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierStep2Role toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierStep2Role)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierStep2RoleImpl dossierStep2RoleImpl = new DossierStep2RoleImpl();

		dossierStep2RoleImpl.setId(getId());
		dossierStep2RoleImpl.setCompanyId(getCompanyId());
		dossierStep2RoleImpl.setDossierStepId(getDossierStepId());
		dossierStep2RoleImpl.setRoleId(getRoleId());

		dossierStep2RoleImpl.resetOriginalValues();

		return dossierStep2RoleImpl;
	}

	@Override
	public int compareTo(DossierStep2Role dossierStep2Role) {
		long primaryKey = dossierStep2Role.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DossierStep2Role)) {
			return false;
		}

		DossierStep2Role dossierStep2Role = (DossierStep2Role)obj;

		long primaryKey = dossierStep2Role.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<DossierStep2Role> toCacheModel() {
		DossierStep2RoleCacheModel dossierStep2RoleCacheModel = new DossierStep2RoleCacheModel();

		dossierStep2RoleCacheModel.id = getId();

		dossierStep2RoleCacheModel.companyId = getCompanyId();

		dossierStep2RoleCacheModel.dossierStepId = getDossierStepId();

		dossierStep2RoleCacheModel.roleId = getRoleId();

		return dossierStep2RoleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", dossierStepId=");
		sb.append(getDossierStepId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.DossierStep2Role");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStepId</column-name><column-value><![CDATA[");
		sb.append(getDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierStep2Role.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierStep2Role.class
		};
	private long _id;
	private long _companyId;
	private long _dossierStepId;
	private long _roleId;
	private DossierStep2Role _escapedModel;
}