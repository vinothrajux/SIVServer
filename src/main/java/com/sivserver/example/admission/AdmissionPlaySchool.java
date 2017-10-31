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
    @Column(name="applno")
    private String applno;

    private Date admissiondate;

    private String fathersoccupation;

    private String fathersofficename;

    private String fathersofficeaddress1;

    private String fathersofficeaddress2;

    private String fathersofficearea;

    private String fathersofficepincode;

    private String fathersofficestate;

    private String fathersofficephoneno;

    private String fathersofficealtphoneno;

    private String fathersofficeextensionno;

    private String mothersoccupation;

    private String mothersofficename;

    private String mothersofficeaddress1;

    private String mothersofficeaddress2;

    private String mothersofficearea;

    private String mothersofficepincode;

    private String mothersofficestate;

    private String mothersofficephoneno;

    private String mothersofficealtphoneno;

    private String mothersofficeextensionno;

    private Date fathersdob;

    private Date mothersdob;

    private Date parentsweddingdate;

    private String pickuppersonname;

    private String pickuppersoncontactno;

    private String pickuppersonaltcontactno;

    private String pickuppersonrelationship;

    private String admissionstatus;

    @NaturalId
    private String registernumber;

    private String transport;

    private String transportstage;

    private String loginuser;

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
        applno = applno;
        return this;

    }

    public Date getAdmissiondate() {
        return admissiondate;
    }

    public AdmissionPlaySchool setAdmissiondate(Date admissiondate) {
        this.admissiondate = admissiondate;
        return this;
    }

    public String getFathersoccupation() {
        return fathersoccupation;
    }

    public AdmissionPlaySchool setFathersoccupation(String fathersoccupation) {
        this.fathersoccupation = fathersoccupation;
        return this;
    }

    public String getFathersofficename() {
        return fathersofficename;
    }

    public AdmissionPlaySchool setFathersofficename(String fathersofficename) {
        this.fathersofficename = fathersofficename;
        return this;
    }

    public String getFathersofficeaddress1() {
        return fathersofficeaddress1;
    }

    public AdmissionPlaySchool setFathersofficeaddress1(String fathersofficeaddress1) {
        this.fathersofficeaddress1 = fathersofficeaddress1;
        return this;
    }

    public String getFathersofficeaddress2() {
        return fathersofficeaddress2;
    }

    public AdmissionPlaySchool setFathersofficeaddress2(String fathersofficeaddress2) {
        this.fathersofficeaddress2 = fathersofficeaddress2;
        return this;
    }

    public String getFathersofficearea() {
        return fathersofficearea;
    }

    public AdmissionPlaySchool setFathersofficearea(String fathersofficearea) {
        this.fathersofficearea = fathersofficearea;
        return this;
    }

    public String getFathersofficepincode() {
        return fathersofficepincode;
    }

    public AdmissionPlaySchool setFathersofficepincode(String fathersofficepincode) {
        this.fathersofficepincode = fathersofficepincode;
        return this;
    }

    public String getFathersofficestate() {
        return fathersofficestate;
    }

    public AdmissionPlaySchool setFathersofficestate(String fathersofficestate) {
        this.fathersofficestate = fathersofficestate;
        return this;
    }

    public String getFathersofficephoneno() {
        return fathersofficephoneno;
    }

    public AdmissionPlaySchool setFathersofficephoneno(String fathersofficephoneno) {
        this.fathersofficephoneno = fathersofficephoneno;
        return this;
    }

    public String getFathersofficealtphoneno() {
        return fathersofficealtphoneno;
    }

    public AdmissionPlaySchool setFathersofficealtphoneno(String fathersofficealtphoneno) {
        this.fathersofficealtphoneno = fathersofficealtphoneno;
        return this;
    }

    public String getFathersofficeextensionno() {
        return fathersofficeextensionno;
    }

    public AdmissionPlaySchool setFathersofficeextensionno(String fathersofficeextensionno) {
        this.fathersofficeextensionno = fathersofficeextensionno;
        return this;
    }

    public String getMothersoccupation() {
        return mothersoccupation;
    }

    public AdmissionPlaySchool setMothersoccupation(String mothersoccupation) {
        this.mothersoccupation = mothersoccupation;
        return this;
    }

    public String getMothersofficename() {
        return mothersofficename;
    }

    public AdmissionPlaySchool setMothersofficename(String mothersofficename) {
        this.mothersofficename = mothersofficename;
        return this;
    }

    public String getMothersofficeaddress1() {
        return mothersofficeaddress1;
    }

    public AdmissionPlaySchool setMothersofficeaddress1(String mothersofficeaddress1) {
        this.mothersofficeaddress1 = mothersofficeaddress1;
        return this;
    }

    public String getMothersofficeaddress2() {
        return mothersofficeaddress2;
    }

    public AdmissionPlaySchool setMothersofficeaddress2(String mothersofficeaddress2) {
        this.mothersofficeaddress2 = mothersofficeaddress2;
        return this;
    }

    public String getMothersofficearea() {
        return mothersofficearea;
    }

    public AdmissionPlaySchool setMothersofficearea(String mothersofficearea) {
        this.mothersofficearea = mothersofficearea;
        return this;
    }

    public String getMothersofficepincode() {
        return mothersofficepincode;
    }

    public AdmissionPlaySchool setMothersofficepincode(String mothersofficepincode) {
        this.mothersofficepincode = mothersofficepincode;
        return this;
    }

    public String getMothersofficestate() {
        return mothersofficestate;
    }

    public AdmissionPlaySchool setMothersofficestate(String mothersofficestate) {
        this.mothersofficestate = mothersofficestate;
        return this;
    }

    public String getMothersofficephoneno() {
        return mothersofficephoneno;
    }

    public AdmissionPlaySchool setMothersofficephoneno(String mothersofficephoneno) {
        this.mothersofficephoneno = mothersofficephoneno;
        return this;
    }

    public String getMothersofficealtphoneno() {
        return mothersofficealtphoneno;
    }

    public AdmissionPlaySchool setMothersofficealtphoneno(String mothersofficealtphoneno) {
        this.mothersofficealtphoneno = mothersofficealtphoneno;
        return this;
    }

    public String getMothersofficeextensionno() {
        return mothersofficeextensionno;
    }

    public AdmissionPlaySchool setMothersofficeextensionno(String mothersofficeextensionno) {
        this.mothersofficeextensionno = mothersofficeextensionno;
        return this;
    }

    public Date getFathersdob() {
        return fathersdob;
    }

    public AdmissionPlaySchool setFathersdob(Date fathersdob) {
        this.fathersdob = fathersdob;
        return this;
    }

    public Date getMothersdob() {
        return mothersdob;
    }

    public AdmissionPlaySchool setMothersdob(Date mothersdob) {
        this.mothersdob = mothersdob;
        return this;
    }

    public Date getParentsweddingdate() {
        return parentsweddingdate;
    }

    public AdmissionPlaySchool setParentsweddingdate(Date parentsweddingdate) {
        this.parentsweddingdate = parentsweddingdate;
        return this;
    }

    public String getPickuppersonname() {
        return pickuppersonname;
    }

    public AdmissionPlaySchool setPickuppersonname(String pickuppersonname) {
        this.pickuppersonname = pickuppersonname;
        return this;
    }

    public String getPickuppersoncontactno() {
        return pickuppersoncontactno;
    }

    public AdmissionPlaySchool setPickuppersoncontactno(String pickuppersoncontactno) {
        this.pickuppersoncontactno = pickuppersoncontactno;
        return this;
    }

    public String getPickuppersonaltcontactno() {
        return pickuppersonaltcontactno;
    }

    public AdmissionPlaySchool setPickuppersonaltcontactno(String pickuppersonaltcontactno) {
        this.pickuppersonaltcontactno = pickuppersonaltcontactno;
        return this;
    }

    public String getPickuppersonrelationship() {
        return pickuppersonrelationship;
    }

    public AdmissionPlaySchool setPickuppersonrelationship(String pickuppersonrelationship) {
        this.pickuppersonrelationship = pickuppersonrelationship;
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

    public String getLoginuser() {
        return loginuser;
    }

    public AdmissionPlaySchool setLoginuser(String loginuser) {
        this.loginuser = loginuser;
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

