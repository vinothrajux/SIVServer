package com.sivserver.example.admission;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by GBCorp on 31/10/2017.
 */
@Entity
@Table(name="admissionplayschool")
public class AdmissionPlaySchool {

    @Id
    @Column(name="applno",nullable = false)
    private String applno;

    private Date admissiondate;

    private String appfor;

    private String admissionstatus;

    @NaturalId
    private String registernumber;

    private String section;

    private String transport;

    private String transportstage;

    private String academicyear;

    private String loginuser;

    private Integer instituteid;

    @OneToOne
    @JoinColumn(name="couns_applno",nullable = false,referencedColumnName = "applno" )
    private ApplicationSalePlaySchool appsale;

    public AdmissionPlaySchool() {
    }

    public AdmissionPlaySchool(String applno) {
        applno = applno;
    }

    public String getApplno() {
        return applno;
    }

    public AdmissionPlaySchool setApplno(String applno) {
        this.applno = applno;
        return this;
    }

    public Date getAdmissiondate() {
        return admissiondate;
    }

    public AdmissionPlaySchool setAdmissiondate(Date admissiondate) {
        this.admissiondate = admissiondate;
        return this;
    }

    public String getAppfor() {
        return appfor;
    }

    public AdmissionPlaySchool setAppfor(String appfor) {
        this.appfor = appfor;
        return this;
    }

    public String getAdmissionstatus() {
        return admissionstatus;
    }

    public AdmissionPlaySchool setAdmissionstatus(String admissionstatus) {
        this.admissionstatus = admissionstatus;
        return this;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public AdmissionPlaySchool setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getSection() {
        return section;
    }

    public AdmissionPlaySchool setSection(String section) {
        this.section = section;
        return this;
    }

    public String getTransport() {
        return transport;
    }

    public AdmissionPlaySchool setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public String getTransportstage() {
        return transportstage;
    }

    public AdmissionPlaySchool setTransportstage(String transportstage) {
        this.transportstage = transportstage;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public AdmissionPlaySchool setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public AdmissionPlaySchool setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }
    public Integer getInstituteid() {
        return instituteid;
    }

    public AdmissionPlaySchool setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

    public ApplicationSalePlaySchool getAppsale() {
        return appsale;
    }

    public AdmissionPlaySchool setAppsale(ApplicationSalePlaySchool appsale) {
        this.appsale = appsale;
        return this;
    }

}

