package com.sivserver.example.admission;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
@Entity
@Table(name="admissionschool")
public class AdmissionSchool {

    @Id
    @Column(name="applno",nullable = false)
    private String applno;

    private Date admissiondate;

    private String appfor;

    private String admissionstatus;

    private String admittedinto;

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
    private ApplicationSaleSchool appsale;

    public AdmissionSchool() {
    }

    public AdmissionSchool(String applno) {
        this.applno = applno;
    }

    public String getApplno() {
        return applno;
    }

    public AdmissionSchool setApplno(String applno) {
        this.applno = applno;
        return this;
    }

    public Date getAdmissiondate() {
        return admissiondate;
    }

    public AdmissionSchool setAdmissiondate(Date admissiondate) {
        this.admissiondate = admissiondate;
        return this;
    }

    public String getAppfor() {
        return appfor;
    }

    public AdmissionSchool setAppfor(String appfor) {
        this.appfor = appfor;
        return this;
    }

    public String getAdmissionstatus() {
        return admissionstatus;
    }

    public AdmissionSchool setAdmissionstatus(String admissionstatus) {
        this.admissionstatus = admissionstatus;
        return this;
    }

    public String getAdmittedinto() {
        return admittedinto;
    }

    public void setAdmittedinto(String admittedinto) {
        this.admittedinto = admittedinto;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public AdmissionSchool setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getSection() {
        return section;
    }

    public AdmissionSchool setSection(String section) {
        this.section = section;
        return this;
    }

    public String getTransport() {
        return transport;
    }

    public AdmissionSchool setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public String getTransportstage() {
        return transportstage;
    }

    public AdmissionSchool setTransportstage(String transportstage) {
        this.transportstage = transportstage;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public AdmissionSchool setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public AdmissionSchool setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public AdmissionSchool setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

    public ApplicationSaleSchool getAppsale() {
        return appsale;
    }

    public AdmissionSchool setAppsale(ApplicationSaleSchool appsale) {
        this.appsale = appsale;
        return this;
    }
}
