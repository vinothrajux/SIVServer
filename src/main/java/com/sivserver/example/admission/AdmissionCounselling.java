package com.sivserver.example.admission;

import org.hibernate.annotations.NaturalId;

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

    public AdmissionCounselling()
    {

    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getAdmissiontype(){
        return admissiontype;
    }
    public void setAdmissiontype(String admissiontype) {
        this.admissiontype = admissiontype;
    }

    public String getApplno(){
        return applno;
    }
    public void setApplno(String applno) {
        this.applno = applno;
    }

    public Date getCounsellingdate() {
        return counsellingdate;
    }
    public void setCounsellingdate(Date counsellingdate) {
        this.counsellingdate = counsellingdate;
    }

    public String getAllotedcourse() {
        return allotedcourse;
    }
    public void setAllotedcourse(String allotedcourse) {
        this.allotedcourse = allotedcourse;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getTransport() {
        return transport;
    }
    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getTransportstage() {
        return transportstage;
    }
    public void setTransportstage(String transportstage) {
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

    public String getCounsellingstatus() {
        return counsellingstatus;
    }
    public void setCounsellingstatus(String counsellingstatus) {
        this.counsellingstatus = counsellingstatus;
    }

    public String getAdmissionno() {
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public Long getTotalfees() {
        return totalfees;
    }
    public void setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public Date getFollowupdate() {
        return followupdate;
    }
    public void setFollowupdate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    @Column(name="COUNSELLING_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    private String admissiontype;

   // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "APPLICATION_ID")
    // private ApplicationSale applicationid;

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

    @NaturalId
    private String admissionno;

    @NotNull
    private Long totalfees;

    @NotNull
    private Date followupdate;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;

 //  @OneToMany(mappedBy="applicationno") This will insert more than one row with same value in child table
 //   @OneToMany(mappedBy="applicationno")
 //   private Set<ApplicationSale> appsale;


}
