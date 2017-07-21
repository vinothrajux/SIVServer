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

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getCorporateid() {
        return corporateid;
    }

    public void setCorporateid(String corporateid) {
        this.corporateid = corporateid;
    }

    public String getRequesttype() {
        return requesttype;
    }

    public void setRequesttype(String requesttype) {
        this.requesttype = requesttype;
    }

    public Date getCampusreqfromdate() {
        return campusreqfromdate;
    }

    public void setCampusreqfromdate(Date campusreqfromdate) {
        this.campusreqfromdate = campusreqfromdate;
    }

    public Date getCampusreqtodate() {
        return campusreqtodate;
    }

    public void setCampusreqtodate(Date campusreqtodate) {
        this.campusreqtodate = campusreqtodate;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getFollowupdate() {
        return followupdate;
    }

    public void setFollowupdate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date entrydate;

    @Id
    private String requestid;

    @NotNull
    private String corporateid;

    @NotNull
    private String requesttype;

    @NotNull
    private Date campusreqfromdate;

    @NotNull
    private Date campusreqtodate;

    @NotNull
    private String academicyear;

    @NotNull
    private String remarks;

    @NotNull
    private Date followupdate;

    @NotNull
    private String loginuser;

}

