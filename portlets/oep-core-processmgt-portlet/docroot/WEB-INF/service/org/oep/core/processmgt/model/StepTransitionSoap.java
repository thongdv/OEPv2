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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link org.oep.core.processmgt.service.http.StepTransitionServiceSoap}.
 *
 * @author trungdk
 * @see org.oep.core.processmgt.service.http.StepTransitionServiceSoap
 * @generated
 */
public class StepTransitionSoap implements Serializable {
	public static StepTransitionSoap toSoapModel(StepTransition model) {
		StepTransitionSoap soapModel = new StepTransitionSoap();

		soapModel.setStepTransionId(model.getStepTransionId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDossierProcessId(model.getDossierProcessId());
		soapModel.setPreDossierStepId(model.getPreDossierStepId());
		soapModel.setPostDossierStepId(model.getPostDossierStepId());
		soapModel.setPrecondition(model.getPrecondition());
		soapModel.setTransitionName(model.getTransitionName());
		soapModel.setDaysDuration(model.getDaysDuration());
		soapModel.setDossierStatus(model.getDossierStatus());
		soapModel.setUserAssignment(model.getUserAssignment());
		soapModel.setNewOrder(model.getNewOrder());
		soapModel.setErrorMessage(model.getErrorMessage());

		return soapModel;
	}

	public static StepTransitionSoap[] toSoapModels(StepTransition[] models) {
		StepTransitionSoap[] soapModels = new StepTransitionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static StepTransitionSoap[][] toSoapModels(StepTransition[][] models) {
		StepTransitionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new StepTransitionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new StepTransitionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static StepTransitionSoap[] toSoapModels(List<StepTransition> models) {
		List<StepTransitionSoap> soapModels = new ArrayList<StepTransitionSoap>(models.size());

		for (StepTransition model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new StepTransitionSoap[soapModels.size()]);
	}

	public StepTransitionSoap() {
	}

	public long getPrimaryKey() {
		return _stepTransionId;
	}

	public void setPrimaryKey(long pk) {
		setStepTransionId(pk);
	}

	public long getStepTransionId() {
		return _stepTransionId;
	}

	public void setStepTransionId(long stepTransionId) {
		_stepTransionId = stepTransionId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getDossierProcessId() {
		return _dossierProcessId;
	}

	public void setDossierProcessId(long dossierProcessId) {
		_dossierProcessId = dossierProcessId;
	}

	public long getPreDossierStepId() {
		return _preDossierStepId;
	}

	public void setPreDossierStepId(long preDossierStepId) {
		_preDossierStepId = preDossierStepId;
	}

	public long getPostDossierStepId() {
		return _postDossierStepId;
	}

	public void setPostDossierStepId(long postDossierStepId) {
		_postDossierStepId = postDossierStepId;
	}

	public String getPrecondition() {
		return _precondition;
	}

	public void setPrecondition(String precondition) {
		_precondition = precondition;
	}

	public String getTransitionName() {
		return _transitionName;
	}

	public void setTransitionName(String transitionName) {
		_transitionName = transitionName;
	}

	public int getDaysDuration() {
		return _daysDuration;
	}

	public void setDaysDuration(int daysDuration) {
		_daysDuration = daysDuration;
	}

	public String getDossierStatus() {
		return _dossierStatus;
	}

	public void setDossierStatus(String dossierStatus) {
		_dossierStatus = dossierStatus;
	}

	public int getUserAssignment() {
		return _userAssignment;
	}

	public void setUserAssignment(int userAssignment) {
		_userAssignment = userAssignment;
	}

	public int getNewOrder() {
		return _newOrder;
	}

	public void setNewOrder(int newOrder) {
		_newOrder = newOrder;
	}

	public String getErrorMessage() {
		return _errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		_errorMessage = errorMessage;
	}

	private long _stepTransionId;
	private long _userId;
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
}