package com.sivserver.example.placement;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "campusrequestheader")

public class CampusRequestHeader {

    private Date entrydate;

    @Id
    @Column(name="requestid")
    private String requestid;

    @Column(name="corporateid")
    private String corporateid;

    private String requesttype;

    private Date campusreqfromdate;

    private Date campusreqtodate;

    private String academicyear;

    private String remarks;

    private Date followupdate;

    private String loginuser;

    @OneToMany
    @JoinColumn(name="requestid",referencedColumnName = "requestid")
    private List<CampusRequestDetail> campusRequestDetail_requestid;

    public CampusRequestHeader() {
    }

    public CampusRequestHeader(String requestid) {
        this.requestid = requestid;
    }

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

    public List<CampusRequestDetail> getCampusRequestDetail_requestid() {
        return campusRequestDetail_requestid;
    }

    public void setCampusRequestDetail_requestid(List<CampusRequestDetail> campusRequestDetail_requestid) {
        this.campusRequestDetail_requestid = campusRequestDetail_requestid;
    }
}

