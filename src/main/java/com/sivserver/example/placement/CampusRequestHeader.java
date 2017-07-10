package com.sivserver.example.placement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "campusrequestheader")

public class CampusRequestHeader {

    public Date getEntryDate() {
        return entrydate;
    }

    public void setEntryDate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCorporateId() {
        return corporateid;
    }

    public void setCorporateId(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public Date getCampusReqFromDate() {
        return campusreqfromDate;
    }

    public void setCampusReqFromDate(Date campusreqfromDate) {
        this.campusreqfromDate = campusreqfromDate;
    }

    public Date getCampusReqToDate() {
        return campusreqtoDate;
    }

    public void setCampusReqToDate(Date campusreqtoDate) {
        this.campusreqtoDate = campusreqtoDate;
    }

    public String getAcademicYear() {
        return academicyear;
    }

    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getFollowUpDate() {
        return followupdate;
    }

    public void setFollowUpDate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public String getLoginUser() {
        return loginuser;
    }

    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date entrydate;

    @Id
    private String requestId;

    @NotNull
    private String corporateid;

    @NotNull
    private String requestType;

    @NotNull
    private Date campusreqfromDate;

    @NotNull
    private Date campusreqtoDate;

    @NotNull
    private String academicyear;

    @NotNull
    private String remarks;

    @NotNull
    private Date followupdate;

    @NotNull
    private String loginuser;

}

