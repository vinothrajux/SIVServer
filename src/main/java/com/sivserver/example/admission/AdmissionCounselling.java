package com.sivserver.example.admission;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "admissioncounselling")
public class AdmissionCounselling {

    private String admissiontype;
    @Id
    @Column(name="applno")
    private String applno;


    private Date counsellingdate;


    private String allotedcourse;


    private String branchcode;


    private String transport;


    private String transportstage;


    private String hostel;


    private String food;


    private String counsellingstatus;

    @NaturalId
    private String admissionno;


    private Long totalfees;


    private Date followupdate;


    private String remarks;


    private String loginuser;

    @OneToOne
    @JoinColumn(name="couns_applno",nullable = false,referencedColumnName = "applno" )
    private ApplicationSale appsale;

    public AdmissionCounselling() {
    }

    public AdmissionCounselling(String applno) {
        this.applno = applno;
    }

    public String getAdmissiontype(){
        return admissiontype;
    }
    public AdmissionCounselling setAdmissiontype(String admissiontype) {
        this.admissiontype = admissiontype;
        return this;
    }

    public String getApplno() {
        return applno;
    }
    public AdmissionCounselling setApplno(String applno) {
        this.applno = applno;
        return this;
    }

    public Date getCounsellingdate() {
        return counsellingdate;
    }
    public AdmissionCounselling setCounsellingdate(Date counsellingdate) {
        this.counsellingdate = counsellingdate;
        return this;
    }

    public String getAllotedcourse() {
        return allotedcourse;
    }
    public AdmissionCounselling setAllotedcourse(String allotedcourse) {
        this.allotedcourse = allotedcourse;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public AdmissionCounselling setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getTransport() {
        return transport;
    }
    public AdmissionCounselling setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public String getTransportstage() {
        return transportstage;
    }
    public AdmissionCounselling setTransportstage(String transportstage) {
        this.transportstage = transportstage;
        return this;
    }

    public String getHostel() {
        return hostel;
    }
    public AdmissionCounselling setHostel(String hostel) {
        this.hostel = hostel;
        return this;
    }

    public String getFood() {
        return food;
    }
    public AdmissionCounselling setFood(String food) {
        this.food = food;
        return this;
    }

    public String getCounsellingstatus() {
        return counsellingstatus;
    }
    public AdmissionCounselling setCounsellingstatus(String counsellingstatus) {
        this.counsellingstatus = counsellingstatus;
        return this;
    }

    public String getAdmissionno() {
        return admissionno;
    }
    public AdmissionCounselling setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public Long getTotalfees() {
        return totalfees;
    }
    public AdmissionCounselling setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
        return this;
    }

    public Date getFollowupdate() {
        return followupdate;
    }
    public AdmissionCounselling setFollowupdate(Date followupdate) {
        this.followupdate = followupdate;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }
    public AdmissionCounselling setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public AdmissionCounselling setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public ApplicationSale getAppsale() {
        return appsale;
    }

    public AdmissionCounselling setAppsale(ApplicationSale appsale) {
        this.appsale = appsale;
        return this;
    }

}
