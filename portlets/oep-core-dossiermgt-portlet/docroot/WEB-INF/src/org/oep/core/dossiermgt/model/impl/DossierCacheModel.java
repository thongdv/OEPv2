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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import org.oep.core.dossiermgt.model.Dossier;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Dossier in entity cache.
 *
 * @author trungdk
 * @see Dossier
 * @generated
 */
public class DossierCacheModel implements CacheModel<Dossier>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(71);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", organizationId=");
		sb.append(organizationId);
		sb.append(", dossierProcId=");
		sb.append(dossierProcId);
		sb.append(", govAgentNo=");
		sb.append(govAgentNo);
		sb.append(", govAgentName=");
		sb.append(govAgentName);
		sb.append(", submitterName=");
		sb.append(submitterName);
		sb.append(", actorType=");
		sb.append(actorType);
		sb.append(", actorNo=");
		sb.append(actorNo);
		sb.append(", actorName=");
		sb.append(actorName);
		sb.append(", address=");
		sb.append(address);
		sb.append(", cityNo=");
		sb.append(cityNo);
		sb.append(", cityName=");
		sb.append(cityName);
		sb.append(", districtNo=");
		sb.append(districtNo);
		sb.append(", districtName=");
		sb.append(districtName);
		sb.append(", wardNo=");
		sb.append(wardNo);
		sb.append(", wardName=");
		sb.append(wardName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", note=");
		sb.append(note);
		sb.append(", receptionNo=");
		sb.append(receptionNo);
		sb.append(", submissionDate=");
		sb.append(submissionDate);
		sb.append(", receptionDate=");
		sb.append(receptionDate);
		sb.append(", resubmissionDate=");
		sb.append(resubmissionDate);
		sb.append(", appointmentDate=");
		sb.append(appointmentDate);
		sb.append(", releaseDate=");
		sb.append(releaseDate);
		sb.append(", completionDate=");
		sb.append(completionDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusName=");
		sb.append(statusName);
		sb.append(", feedbackNote=");
		sb.append(feedbackNote);
		sb.append(", paymentConfirmed=");
		sb.append(paymentConfirmed);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Dossier toEntityModel() {
		DossierImpl dossierImpl = new DossierImpl();

		if (uuid == null) {
			dossierImpl.setUuid(StringPool.BLANK);
		}
		else {
			dossierImpl.setUuid(uuid);
		}

		dossierImpl.setDossierId(dossierId);
		dossierImpl.setUserId(userId);
		dossierImpl.setGroupId(groupId);
		dossierImpl.setCompanyId(companyId);

		if (createDate == Long.MIN_VALUE) {
			dossierImpl.setCreateDate(null);
		}
		else {
			dossierImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dossierImpl.setModifiedDate(null);
		}
		else {
			dossierImpl.setModifiedDate(new Date(modifiedDate));
		}

		dossierImpl.setOrganizationId(organizationId);
		dossierImpl.setDossierProcId(dossierProcId);

		if (govAgentNo == null) {
			dossierImpl.setGovAgentNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setGovAgentNo(govAgentNo);
		}

		if (govAgentName == null) {
			dossierImpl.setGovAgentName(StringPool.BLANK);
		}
		else {
			dossierImpl.setGovAgentName(govAgentName);
		}

		if (submitterName == null) {
			dossierImpl.setSubmitterName(StringPool.BLANK);
		}
		else {
			dossierImpl.setSubmitterName(submitterName);
		}

		dossierImpl.setActorType(actorType);

		if (actorNo == null) {
			dossierImpl.setActorNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setActorNo(actorNo);
		}

		if (actorName == null) {
			dossierImpl.setActorName(StringPool.BLANK);
		}
		else {
			dossierImpl.setActorName(actorName);
		}

		if (address == null) {
			dossierImpl.setAddress(StringPool.BLANK);
		}
		else {
			dossierImpl.setAddress(address);
		}

		if (cityNo == null) {
			dossierImpl.setCityNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setCityNo(cityNo);
		}

		if (cityName == null) {
			dossierImpl.setCityName(StringPool.BLANK);
		}
		else {
			dossierImpl.setCityName(cityName);
		}

		if (districtNo == null) {
			dossierImpl.setDistrictNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setDistrictNo(districtNo);
		}

		if (districtName == null) {
			dossierImpl.setDistrictName(StringPool.BLANK);
		}
		else {
			dossierImpl.setDistrictName(districtName);
		}

		if (wardNo == null) {
			dossierImpl.setWardNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setWardNo(wardNo);
		}

		if (wardName == null) {
			dossierImpl.setWardName(StringPool.BLANK);
		}
		else {
			dossierImpl.setWardName(wardName);
		}

		if (description == null) {
			dossierImpl.setDescription(StringPool.BLANK);
		}
		else {
			dossierImpl.setDescription(description);
		}

		if (note == null) {
			dossierImpl.setNote(StringPool.BLANK);
		}
		else {
			dossierImpl.setNote(note);
		}

		if (receptionNo == null) {
			dossierImpl.setReceptionNo(StringPool.BLANK);
		}
		else {
			dossierImpl.setReceptionNo(receptionNo);
		}

		if (submissionDate == Long.MIN_VALUE) {
			dossierImpl.setSubmissionDate(null);
		}
		else {
			dossierImpl.setSubmissionDate(new Date(submissionDate));
		}

		if (receptionDate == Long.MIN_VALUE) {
			dossierImpl.setReceptionDate(null);
		}
		else {
			dossierImpl.setReceptionDate(new Date(receptionDate));
		}

		if (resubmissionDate == Long.MIN_VALUE) {
			dossierImpl.setResubmissionDate(null);
		}
		else {
			dossierImpl.setResubmissionDate(new Date(resubmissionDate));
		}

		if (appointmentDate == Long.MIN_VALUE) {
			dossierImpl.setAppointmentDate(null);
		}
		else {
			dossierImpl.setAppointmentDate(new Date(appointmentDate));
		}

		if (releaseDate == Long.MIN_VALUE) {
			dossierImpl.setReleaseDate(null);
		}
		else {
			dossierImpl.setReleaseDate(new Date(releaseDate));
		}

		if (completionDate == Long.MIN_VALUE) {
			dossierImpl.setCompletionDate(null);
		}
		else {
			dossierImpl.setCompletionDate(new Date(completionDate));
		}

		if (status == null) {
			dossierImpl.setStatus(StringPool.BLANK);
		}
		else {
			dossierImpl.setStatus(status);
		}

		if (statusName == null) {
			dossierImpl.setStatusName(StringPool.BLANK);
		}
		else {
			dossierImpl.setStatusName(statusName);
		}

		if (feedbackNote == null) {
			dossierImpl.setFeedbackNote(StringPool.BLANK);
		}
		else {
			dossierImpl.setFeedbackNote(feedbackNote);
		}

		dossierImpl.setPaymentConfirmed(paymentConfirmed);

		dossierImpl.resetOriginalValues();

		return dossierImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		dossierId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		organizationId = objectInput.readLong();
		dossierProcId = objectInput.readLong();
		govAgentNo = objectInput.readUTF();
		govAgentName = objectInput.readUTF();
		submitterName = objectInput.readUTF();
		actorType = objectInput.readInt();
		actorNo = objectInput.readUTF();
		actorName = objectInput.readUTF();
		address = objectInput.readUTF();
		cityNo = objectInput.readUTF();
		cityName = objectInput.readUTF();
		districtNo = objectInput.readUTF();
		districtName = objectInput.readUTF();
		wardNo = objectInput.readUTF();
		wardName = objectInput.readUTF();
		description = objectInput.readUTF();
		note = objectInput.readUTF();
		receptionNo = objectInput.readUTF();
		submissionDate = objectInput.readLong();
		receptionDate = objectInput.readLong();
		resubmissionDate = objectInput.readLong();
		appointmentDate = objectInput.readLong();
		releaseDate = objectInput.readLong();
		completionDate = objectInput.readLong();
		status = objectInput.readUTF();
		statusName = objectInput.readUTF();
		feedbackNote = objectInput.readUTF();
		paymentConfirmed = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(dossierId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(organizationId);
		objectOutput.writeLong(dossierProcId);

		if (govAgentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentNo);
		}

		if (govAgentName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgentName);
		}

		if (submitterName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(submitterName);
		}

		objectOutput.writeInt(actorType);

		if (actorNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actorNo);
		}

		if (actorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(actorName);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (cityNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityNo);
		}

		if (cityName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cityName);
		}

		if (districtNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtNo);
		}

		if (districtName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(districtName);
		}

		if (wardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardNo);
		}

		if (wardName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(wardName);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (note == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(note);
		}

		if (receptionNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receptionNo);
		}

		objectOutput.writeLong(submissionDate);
		objectOutput.writeLong(receptionDate);
		objectOutput.writeLong(resubmissionDate);
		objectOutput.writeLong(appointmentDate);
		objectOutput.writeLong(releaseDate);
		objectOutput.writeLong(completionDate);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		if (statusName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusName);
		}

		if (feedbackNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(feedbackNote);
		}

		objectOutput.writeInt(paymentConfirmed);
	}

	public String uuid;
	public long dossierId;
	public long userId;
	public long groupId;
	public long companyId;
	public long createDate;
	public long modifiedDate;
	public long organizationId;
	public long dossierProcId;
	public String govAgentNo;
	public String govAgentName;
	public String submitterName;
	public int actorType;
	public String actorNo;
	public String actorName;
	public String address;
	public String cityNo;
	public String cityName;
	public String districtNo;
	public String districtName;
	public String wardNo;
	public String wardName;
	public String description;
	public String note;
	public String receptionNo;
	public long submissionDate;
	public long receptionDate;
	public long resubmissionDate;
	public long appointmentDate;
	public long releaseDate;
	public long completionDate;
	public String status;
	public String statusName;
	public String feedbackNote;
	public int paymentConfirmed;
}