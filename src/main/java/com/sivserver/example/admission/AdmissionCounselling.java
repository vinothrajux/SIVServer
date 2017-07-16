package com.sivserver.example.admission;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "admissioncounselling")
public class AdmissionCounselling {

    public String getAdmissionType(){
        return admissiontype;
    }
    public void setAdmissionType(String admissiontype) {
        this.admissiontype = admissiontype;
    }

    public String getApplno() {
        return applno;
    }
    public void setApplno(String applno) {
        this.applno = applno;
    }

    public Date getCounsellingDate() {
        return counsellingdate;
    }
    public void setCounsellingDate(Date counsellingdate) {
        this.counsellingdate = counsellingdate;
    }

    public String getAllotedCourse() {
        return allotedcourse;
    }
    public void setAllotedCourse(String allotedcourse) {
        this.allotedcourse = allotedcourse;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getTransport() {
        return transport;
    }
    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTransportStage() {
        return transportstage;
    }
    public void setTransportStage(String transportstage) {
        this.transportstage = transportstage;
    }

    public String getHostel() {
        return hostel;
    }
    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getFood() {
        return food;
    }
    public void setFood(String food) {
        this.food = food;
    }

    public String getCounsellingStatus() {
        return counsellingstatus;
    }
    public void setCounsellingStatus(String counsellingstatus) {
        this.counsellingstatus = counsellingstatus;
    }

    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public Long getTotalFees() {
        return totalfees;
    }
    public void setTotalFees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public Date getFollowupDate() {
        return followupdate;
    }
    public void setFollowupDate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private String admissiontype;

    @NotNull
    private String applno;

    @NotNull
    private Date counsellingdate;

    @NotNull
    private String allotedcourse;

    @NotNull
    private String branchcode;

    @NotNull
    private String transport;

    @NotNull
    private String transportstage;

    @NotNull
    private String hostel;

    @NotNull
    private String food;

    @NotNull
    private String counsellingstatus;

    @Id
    private String admissionno;

    @NotNull
    private Long totalfees;

    @NotNull
    private Date followupdate;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;

 //  @OneToMany(mappedBy="applicationno")
 //  private Set<ApplicationSale> appsale;

}
