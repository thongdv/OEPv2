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

package org.oep.core.processmgt.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.oep.core.processmgt.service.ClpSerializer;
import org.oep.core.processmgt.service.StepTransitionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author trungdk
 */
public class StepTransitionClp extends BaseModelImpl<StepTransition>
	implements StepTransition {
	public StepTransitionClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return StepTransition.class;
	}

	@Override
	public String getModelClassName() {
		return StepTransition.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _stepTransionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setStepTransionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _stepTransionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("stepTransionId", getStepTransionId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("dossierProcessId", getDossierProcessId());
		attributes.put("preDossierStepId", getPreDossierStepId());
		attributes.put("postDossierStepId", getPostDossierStepId());
		attributes.put("precondition", getPrecondition());
		attributes.put("transitionName", getTransitionName());
		attributes.put("daysDuration", getDaysDuration());
		attributes.put("dossierStatus", getDossierStatus());
		attributes.put("userAssignment", getUserAssignment());
		attributes.put("newOrder", getNewOrder());
		attributes.put("errorMessage", getErrorMessage());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long stepTransionId = (Long)attributes.get("stepTransionId");

		if (stepTransionId != null) {
			setStepTransionId(stepTransionId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long dossierProcessId = (Long)attributes.get("dossierProcessId");

		if (dossierProcessId != null) {
			setDossierProcessId(dossierProcessId);
		}

		Long preDossierStepId = (Long)attributes.get("preDossierStepId");

		if (preDossierStepId != null) {
			setPreDossierStepId(preDossierStepId);
		}

		Long postDossierStepId = (Long)attributes.get("postDossierStepId");

		if (postDossierStepId != null) {
			setPostDossierStepId(postDossierStepId);
		}

		String precondition = (String)attributes.get("precondition");

		if (precondition != null) {
			setPrecondition(precondition);
		}

		String transitionName = (String)attributes.get("transitionName");

		if (transitionName != null) {
			setTransitionName(transitionName);
		}

		Integer daysDuration = (Integer)attributes.get("daysDuration");

		if (daysDuration != null) {
			setDaysDuration(daysDuration);
		}

		String dossierStatus = (String)attributes.get("dossierStatus");

		if (dossierStatus != null) {
			setDossierStatus(dossierStatus);
		}

		Integer userAssignment = (Integer)attributes.get("userAssignment");

		if (userAssignment != null) {
			setUserAssignment(userAssignment);
		}

		Integer newOrder = (Integer)attributes.get("newOrder");

		if (newOrder != null) {
			setNewOrder(newOrder);
		}

		String errorMessage = (String)attributes.get("errorMessage");

		if (errorMessage != null) {
			setErrorMessage(errorMessage);
		}
	}

	@Override
	public long getStepTransionId() {
		return _stepTransionId;
	}

	@Override
	public void setStepTransionId(long stepTransionId) {
		_stepTransionId = stepTransionId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setStepTransionId", long.class);

				method.invoke(_stepTransitionRemoteModel, stepTransionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_stepTransitionRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_stepTransitionRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_stepTransitionRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_stepTransitionRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_stepTransitionRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	@Override
	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierProcessId",
						long.class);

				method.invoke(_stepTransitionRemoteModel, dossierProcessId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPreDossierStepId() {
		return _preDossierStepId;
	}

	@Override
	public void setPreDossierStepId(long preDossierStepId) {
		_preDossierStepId = preDossierStepId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPreDossierStepId",
						long.class);

				method.invoke(_stepTransitionRemoteModel, preDossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPostDossierStepId() {
		return _postDossierStepId;
	}

	@Override
	public void setPostDossierStepId(long postDossierStepId) {
		_postDossierStepId = postDossierStepId;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPostDossierStepId",
						long.class);

				method.invoke(_stepTransitionRemoteModel, postDossierStepId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPrecondition() {
		return _precondition;
	}

	@Override
	public void setPrecondition(String precondition) {
		_precondition = precondition;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setPrecondition", String.class);

				method.invoke(_stepTransitionRemoteModel, precondition);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTransitionName() {
		return _transitionName;
	}

	@Override
	public void setTransitionName(String transitionName) {
		_transitionName = transitionName;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setTransitionName",
						String.class);

				method.invoke(_stepTransitionRemoteModel, transitionName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getDaysDuration() {
		return _daysDuration;
	}

	@Override
	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setDaysDuration", int.class);

				method.invoke(_stepTransitionRemoteModel, daysDuration);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDossierStatus() {
		return _dossierStatus;
	}

	@Override
	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setDossierStatus", String.class);

				method.invoke(_stepTransitionRemoteModel, dossierStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getUserAssignment() {
		return _userAssignment;
	}

	@Override
	public void setUserAssignment(int userAssignment) {
		_userAssignment = userAssignment;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setUserAssignment", int.class);

				method.invoke(_stepTransitionRemoteModel, userAssignment);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNewOrder() {
		return _newOrder;
	}

	@Override
	public void setNewOrder(int newOrder) {
		_newOrder = newOrder;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setNewOrder", int.class);

				method.invoke(_stepTransitionRemoteModel, newOrder);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getErrorMessage() {
		return _errorMessage;
	}

	@Override
	public void setErrorMessage(String errorMessage) {
		_errorMessage = errorMessage;

		if (_stepTransitionRemoteModel != null) {
			try {
				Class<?> clazz = _stepTransitionRemoteModel.getClass();

				Method method = clazz.getMethod("setErrorMessage", String.class);

				method.invoke(_stepTransitionRemoteModel, errorMessage);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getStepTransitionRemoteModel() {
		return _stepTransitionRemoteModel;
	}

	public void setStepTransitionRemoteModel(
		BaseModel<?> stepTransitionRemoteModel) {
		_stepTransitionRemoteModel = stepTransitionRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _stepTransitionRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_stepTransitionRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			StepTransitionLocalServiceUtil.addStepTransition(this);
		}
		else {
			StepTransitionLocalServiceUtil.updateStepTransition(this);
		}
	}

	@Override
	public StepTransition toEscapedModel() {
		return (StepTransition)ProxyUtil.newProxyInstance(StepTransition.class.getClassLoader(),
			new Class[] { StepTransition.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		StepTransitionClp clone = new StepTransitionClp();

		clone.setStepTransionId(getStepTransionId());
		clone.setUserId(getUserId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDossierProcessId(getDossierProcessId());
		clone.setPreDossierStepId(getPreDossierStepId());
		clone.setPostDossierStepId(getPostDossierStepId());
		clone.setPrecondition(getPrecondition());
		clone.setTransitionName(getTransitionName());
		clone.setDaysDuration(getDaysDuration());
		clone.setDossierStatus(getDossierStatus());
		clone.setUserAssignment(getUserAssignment());
		clone.setNewOrder(getNewOrder());
		clone.setErrorMessage(getErrorMessage());

		return clone;
	}

	@Override
	public int compareTo(StepTransition stepTransition) {
		long primaryKey = stepTransition.getPrimaryKey();

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

		if (!(obj instanceof StepTransitionClp)) {
			return false;
		}

		StepTransitionClp stepTransition = (StepTransitionClp)obj;

		long primaryKey = stepTransition.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{stepTransionId=");
		sb.append(getStepTransionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", dossierProcessId=");
		sb.append(getDossierProcessId());
		sb.append(", preDossierStepId=");
		sb.append(getPreDossierStepId());
		sb.append(", postDossierStepId=");
		sb.append(getPostDossierStepId());
		sb.append(", precondition=");
		sb.append(getPrecondition());
		sb.append(", transitionName=");
		sb.append(getTransitionName());
		sb.append(", daysDuration=");
		sb.append(getDaysDuration());
		sb.append(", dossierStatus=");
		sb.append(getDossierStatus());
		sb.append(", userAssignment=");
		sb.append(getUserAssignment());
		sb.append(", newOrder=");
		sb.append(getNewOrder());
		sb.append(", errorMessage=");
		sb.append(getErrorMessage());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("org.oep.core.processmgt.model.StepTransition");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>stepTransionId</column-name><column-value><![CDATA[");
		sb.append(getStepTransionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierProcessId</column-name><column-value><![CDATA[");
		sb.append(getDossierProcessId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>preDossierStepId</column-name><column-value><![CDATA[");
		sb.append(getPreDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postDossierStepId</column-name><column-value><![CDATA[");
		sb.append(getPostDossierStepId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>precondition</column-name><column-value><![CDATA[");
		sb.append(getPrecondition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>transitionName</column-name><column-value><![CDATA[");
		sb.append(getTransitionName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>daysDuration</column-name><column-value><![CDATA[");
		sb.append(getDaysDuration());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dossierStatus</column-name><column-value><![CDATA[");
		sb.append(getDossierStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userAssignment</column-name><column-value><![CDATA[");
		sb.append(getUserAssignment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>newOrder</column-name><column-value><![CDATA[");
		sb.append(getNewOrder());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>errorMessage</column-name><column-value><![CDATA[");
		sb.append(getErrorMessage());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _stepTransionId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _dossierProcessId;
	private long _preDossierStepId;
	private long _postDossierStepId;
	private String _precondition;
	private String _transitionName;
	private int _daysDuration;
	private String _dossierStatus;
	private int _userAssignment;
	private int _newOrder;
	private String _errorMessage;
	private BaseModel<?> _stepTransitionRemoteModel;
	private Class<?> _clpSerializerClass = org.oep.core.processmgt.service.ClpSerializer.class;
}