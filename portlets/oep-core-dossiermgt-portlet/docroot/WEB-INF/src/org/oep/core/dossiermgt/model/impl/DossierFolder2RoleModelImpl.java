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

package org.oep.core.dossiermgt.model.impl;

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

import org.oep.core.dossiermgt.model.DossierFolder2Role;
import org.oep.core.dossiermgt.model.DossierFolder2RoleModel;
import org.oep.core.dossiermgt.model.DossierFolder2RoleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the DossierFolder2Role service. Represents a row in the &quot;oep_dossiermgt_DossierFolder2Role&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.oep.core.dossiermgt.model.DossierFolder2RoleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DossierFolder2RoleImpl}.
 * </p>
 *
 * @author trungdk
 * @see DossierFolder2RoleImpl
 * @see org.oep.core.dossiermgt.model.DossierFolder2Role
 * @see org.oep.core.dossiermgt.model.DossierFolder2RoleModel
 * @generated
 */
@JSON(strict = true)
public class DossierFolder2RoleModelImpl extends BaseModelImpl<DossierFolder2Role>
	implements DossierFolder2RoleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a dossier folder2 role model instance should use the {@link org.oep.core.dossiermgt.model.DossierFolder2Role} interface instead.
	 */
	public static final String TABLE_NAME = "oep_dossiermgt_DossierFolder2Role";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "dossierFolderId", Types.BIGINT },
			{ "roleId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table oep_dossiermgt_DossierFolder2Role (id_ LONG not null primary key,companyId LONG,dossierFolderId LONG,roleId LONG)";
	public static final String TABLE_SQL_DROP = "drop table oep_dossiermgt_DossierFolder2Role";
	public static final String ORDER_BY_JPQL = " ORDER BY dossierFolder2Role.id ASC";
	public static final String ORDER_BY_SQL = " ORDER BY oep_dossiermgt_DossierFolder2Role.id_ ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.oep.core.dossiermgt.model.DossierFolder2Role"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.oep.core.dossiermgt.model.DossierFolder2Role"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static DossierFolder2Role toModel(DossierFolder2RoleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		DossierFolder2Role model = new DossierFolder2RoleImpl();

		model.setId(soapModel.getId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setDossierFolderId(soapModel.getDossierFolderId());
		model.setRoleId(soapModel.getRoleId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<DossierFolder2Role> toModels(
		DossierFolder2RoleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<DossierFolder2Role> models = new ArrayList<DossierFolder2Role>(soapModels.length);

		for (DossierFolder2RoleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.oep.core.dossiermgt.model.DossierFolder2Role"));

	public DossierFolder2RoleModelImpl() {
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
		return DossierFolder2Role.class;
	}

	@Override
	public String getModelClassName() {
		return DossierFolder2Role.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("dossierFolderId", getDossierFolderId());
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

		Long dossierFolderId = (Long)attributes.get("dossierFolderId");

		if (dossierFolderId != null) {
			setDossierFolderId(dossierFolderId);
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
	public long getDossierFolderId() {
		return _dossierFolderId;
	}

	@Override
	public void setDossierFolderId(long dossierFolderId) {
		_dossierFolderId = dossierFolderId;
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
			DossierFolder2Role.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public DossierFolder2Role toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (DossierFolder2Role)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		DossierFolder2RoleImpl dossierFolder2RoleImpl = new DossierFolder2RoleImpl();

		dossierFolder2RoleImpl.setId(getId());
		dossierFolder2RoleImpl.setCompanyId(getCompanyId());
		dossierFolder2RoleImpl.setDossierFolderId(getDossierFolderId());
		dossierFolder2RoleImpl.setRoleId(getRoleId());

		dossierFolder2RoleImpl.resetOriginalValues();

		return dossierFolder2RoleImpl;
	}

	@Override
	public int compareTo(DossierFolder2Role dossierFolder2Role) {
		long primaryKey = dossierFolder2Role.getPrimaryKey();

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

		if (!(obj instanceof DossierFolder2Role)) {
			return false;
		}

		DossierFolder2Role dossierFolder2Role = (DossierFolder2Role)obj;

		long primaryKey = dossierFolder2Role.getPrimaryKey();

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
	public CacheModel<DossierFolder2Role> toCacheModel() {
		DossierFolder2RoleCacheModel dossierFolder2RoleCacheModel = new DossierFolder2RoleCacheModel();

		dossierFolder2RoleCacheModel.id = getId();

		dossierFolder2RoleCacheModel.companyId = getCompanyId();

		dossierFolder2RoleCacheModel.dossierFolderId = getDossierFolderId();

		dossierFolder2RoleCacheModel.roleId = getRoleId();

		return dossierFolder2RoleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", dossierFolderId=");
		sb.append(getDossierFolderId());
		sb.append(", roleId=");
		sb.append(getRoleId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.dossiermgt.model.DossierFolder2Role");
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
			"<column><column-name>dossierFolderId</column-name><column-value><![CDATA[");
		sb.append(getDossierFolderId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roleId</column-name><column-value><![CDATA[");
		sb.append(getRoleId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = DossierFolder2Role.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			DossierFolder2Role.class
		};
	private long _id;
	private long _companyId;
	private long _dossierFolderId;
	private long _roleId;
	private DossierFolder2Role _escapedModel;
}