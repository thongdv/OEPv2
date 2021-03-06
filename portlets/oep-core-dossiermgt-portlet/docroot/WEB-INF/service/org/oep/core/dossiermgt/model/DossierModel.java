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

package org.oep.core.dossiermgt.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Dossier service. Represents a row in the &quot;oep_dossiermgt_Dossier&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.oep.core.dossiermgt.model.impl.DossierModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.oep.core.dossiermgt.model.impl.DossierImpl}.
 * </p>
 *
 * @author trungdk
 * @see Dossier
 * @see org.oep.core.dossiermgt.model.impl.DossierImpl
 * @see org.oep.core.dossiermgt.model.impl.DossierModelImpl
 * @generated
 */
public interface DossierModel extends BaseModel<Dossier>, StagedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a dossier model instance should use the {@link Dossier} interface instead.
	 */

	/**
	 * Returns the primary key of this dossier.
	 *
	 * @return the primary key of this dossier
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this dossier.
	 *
	 * @param primaryKey the primary key of this dossier
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this dossier.
	 *
	 * @return the uuid of this dossier
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this dossier.
	 *
	 * @param uuid the uuid of this dossier
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the dossier ID of this dossier.
	 *
	 * @return the dossier ID of this dossier
	 */
	public long getDossierId();

	/**
	 * Sets the dossier ID of this dossier.
	 *
	 * @param dossierId the dossier ID of this dossier
	 */
	public void setDossierId(long dossierId);

	/**
	 * Returns the user ID of this dossier.
	 *
	 * @return the user ID of this dossier
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this dossier.
	 *
	 * @param userId the user ID of this dossier
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this dossier.
	 *
	 * @return the user uuid of this dossier
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this dossier.
	 *
	 * @param userUuid the user uuid of this dossier
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this dossier.
	 *
	 * @return the group ID of this dossier
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this dossier.
	 *
	 * @param groupId the group ID of this dossier
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this dossier.
	 *
	 * @return the company ID of this dossier
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this dossier.
	 *
	 * @param companyId the company ID of this dossier
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this dossier.
	 *
	 * @return the create date of this dossier
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this dossier.
	 *
	 * @param createDate the create date of this dossier
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this dossier.
	 *
	 * @return the modified date of this dossier
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this dossier.
	 *
	 * @param modifiedDate the modified date of this dossier
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the organization ID of this dossier.
	 *
	 * @return the organization ID of this dossier
	 */
	public long getOrganizationId();

	/**
	 * Sets the organization ID of this dossier.
	 *
	 * @param organizationId the organization ID of this dossier
	 */
	public void setOrganizationId(long organizationId);

	/**
	 * Returns the dossier proc ID of this dossier.
	 *
	 * @return the dossier proc ID of this dossier
	 */
	public long getDossierProcId();

	/**
	 * Sets the dossier proc ID of this dossier.
	 *
	 * @param dossierProcId the dossier proc ID of this dossier
	 */
	public void setDossierProcId(long dossierProcId);

	/**
	 * Returns the gov agent no of this dossier.
	 *
	 * @return the gov agent no of this dossier
	 */
	@AutoEscape
	public String getGovAgentNo();

	/**
	 * Sets the gov agent no of this dossier.
	 *
	 * @param govAgentNo the gov agent no of this dossier
	 */
	public void setGovAgentNo(String govAgentNo);

	/**
	 * Returns the gov agent name of this dossier.
	 *
	 * @return the gov agent name of this dossier
	 */
	@AutoEscape
	public String getGovAgentName();

	/**
	 * Sets the gov agent name of this dossier.
	 *
	 * @param govAgentName the gov agent name of this dossier
	 */
	public void setGovAgentName(String govAgentName);

	/**
	 * Returns the submitter name of this dossier.
	 *
	 * @return the submitter name of this dossier
	 */
	@AutoEscape
	public String getSubmitterName();

	/**
	 * Sets the submitter name of this dossier.
	 *
	 * @param submitterName the submitter name of this dossier
	 */
	public void setSubmitterName(String submitterName);

	/**
	 * Returns the actor type of this dossier.
	 *
	 * @return the actor type of this dossier
	 */
	public int getActorType();

	/**
	 * Sets the actor type of this dossier.
	 *
	 * @param actorType the actor type of this dossier
	 */
	public void setActorType(int actorType);

	/**
	 * Returns the actor no of this dossier.
	 *
	 * @return the actor no of this dossier
	 */
	@AutoEscape
	public String getActorNo();

	/**
	 * Sets the actor no of this dossier.
	 *
	 * @param actorNo the actor no of this dossier
	 */
	public void setActorNo(String actorNo);

	/**
	 * Returns the actor name of this dossier.
	 *
	 * @return the actor name of this dossier
	 */
	@AutoEscape
	public String getActorName();

	/**
	 * Sets the actor name of this dossier.
	 *
	 * @param actorName the actor name of this dossier
	 */
	public void setActorName(String actorName);

	/**
	 * Returns the address of this dossier.
	 *
	 * @return the address of this dossier
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this dossier.
	 *
	 * @param address the address of this dossier
	 */
	public void setAddress(String address);

	/**
	 * Returns the city no of this dossier.
	 *
	 * @return the city no of this dossier
	 */
	@AutoEscape
	public String getCityNo();

	/**
	 * Sets the city no of this dossier.
	 *
	 * @param cityNo the city no of this dossier
	 */
	public void setCityNo(String cityNo);

	/**
	 * Returns the city name of this dossier.
	 *
	 * @return the city name of this dossier
	 */
	@AutoEscape
	public String getCityName();

	/**
	 * Sets the city name of this dossier.
	 *
	 * @param cityName the city name of this dossier
	 */
	public void setCityName(String cityName);

	/**
	 * Returns the district no of this dossier.
	 *
	 * @return the district no of this dossier
	 */
	@AutoEscape
	public String getDistrictNo();

	/**
	 * Sets the district no of this dossier.
	 *
	 * @param districtNo the district no of this dossier
	 */
	public void setDistrictNo(String districtNo);

	/**
	 * Returns the district name of this dossier.
	 *
	 * @return the district name of this dossier
	 */
	@AutoEscape
	public String getDistrictName();

	/**
	 * Sets the district name of this dossier.
	 *
	 * @param districtName the district name of this dossier
	 */
	public void setDistrictName(String districtName);

	/**
	 * Returns the ward no of this dossier.
	 *
	 * @return the ward no of this dossier
	 */
	@AutoEscape
	public String getWardNo();

	/**
	 * Sets the ward no of this dossier.
	 *
	 * @param wardNo the ward no of this dossier
	 */
	public void setWardNo(String wardNo);

	/**
	 * Returns the ward name of this dossier.
	 *
	 * @return the ward name of this dossier
	 */
	@AutoEscape
	public String getWardName();

	/**
	 * Sets the ward name of this dossier.
	 *
	 * @param wardName the ward name of this dossier
	 */
	public void setWardName(String wardName);

	/**
	 * Returns the description of this dossier.
	 *
	 * @return the description of this dossier
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this dossier.
	 *
	 * @param description the description of this dossier
	 */
	public void setDescription(String description);

	/**
	 * Returns the note of this dossier.
	 *
	 * @return the note of this dossier
	 */
	@AutoEscape
	public String getNote();

	/**
	 * Sets the note of this dossier.
	 *
	 * @param note the note of this dossier
	 */
	public void setNote(String note);

	/**
	 * Returns the reception no of this dossier.
	 *
	 * @return the reception no of this dossier
	 */
	@AutoEscape
	public String getReceptionNo();

	/**
	 * Sets the reception no of this dossier.
	 *
	 * @param receptionNo the reception no of this dossier
	 */
	public void setReceptionNo(String receptionNo);

	/**
	 * Returns the submission date of this dossier.
	 *
	 * @return the submission date of this dossier
	 */
	public Date getSubmissionDate();

	/**
	 * Sets the submission date of this dossier.
	 *
	 * @param submissionDate the submission date of this dossier
	 */
	public void setSubmissionDate(Date submissionDate);

	/**
	 * Returns the reception date of this dossier.
	 *
	 * @return the reception date of this dossier
	 */
	public Date getReceptionDate();

	/**
	 * Sets the reception date of this dossier.
	 *
	 * @param receptionDate the reception date of this dossier
	 */
	public void setReceptionDate(Date receptionDate);

	/**
	 * Returns the resubmission date of this dossier.
	 *
	 * @return the resubmission date of this dossier
	 */
	public Date getResubmissionDate();

	/**
	 * Sets the resubmission date of this dossier.
	 *
	 * @param resubmissionDate the resubmission date of this dossier
	 */
	public void setResubmissionDate(Date resubmissionDate);

	/**
	 * Returns the appointment date of this dossier.
	 *
	 * @return the appointment date of this dossier
	 */
	public Date getAppointmentDate();

	/**
	 * Sets the appointment date of this dossier.
	 *
	 * @param appointmentDate the appointment date of this dossier
	 */
	public void setAppointmentDate(Date appointmentDate);

	/**
	 * Returns the release date of this dossier.
	 *
	 * @return the release date of this dossier
	 */
	public Date getReleaseDate();

	/**
	 * Sets the release date of this dossier.
	 *
	 * @param releaseDate the release date of this dossier
	 */
	public void setReleaseDate(Date releaseDate);

	/**
	 * Returns the completion date of this dossier.
	 *
	 * @return the completion date of this dossier
	 */
	public Date getCompletionDate();

	/**
	 * Sets the completion date of this dossier.
	 *
	 * @param completionDate the completion date of this dossier
	 */
	public void setCompletionDate(Date completionDate);

	/**
	 * Returns the status of this dossier.
	 *
	 * @return the status of this dossier
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this dossier.
	 *
	 * @param status the status of this dossier
	 */
	public void setStatus(String status);

	/**
	 * Returns the status name of this dossier.
	 *
	 * @return the status name of this dossier
	 */
	@AutoEscape
	public String getStatusName();

	/**
	 * Sets the status name of this dossier.
	 *
	 * @param statusName the status name of this dossier
	 */
	public void setStatusName(String statusName);

	/**
	 * Returns the feedback note of this dossier.
	 *
	 * @return the feedback note of this dossier
	 */
	@AutoEscape
	public String getFeedbackNote();

	/**
	 * Sets the feedback note of this dossier.
	 *
	 * @param feedbackNote the feedback note of this dossier
	 */
	public void setFeedbackNote(String feedbackNote);

	/**
	 * Returns the payment confirmed of this dossier.
	 *
	 * @return the payment confirmed of this dossier
	 */
	public int getPaymentConfirmed();

	/**
	 * Sets the payment confirmed of this dossier.
	 *
	 * @param paymentConfirmed the payment confirmed of this dossier
	 */
	public void setPaymentConfirmed(int paymentConfirmed);

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
	public int compareTo(Dossier dossier);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Dossier> toCacheModel();

	@Override
	public Dossier toEscapedModel();

	@Override
	public Dossier toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}