package com.sivserver.example.student;

import org.hibernate.annotations.NaturalId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 01/11/2017.
 */
@Entity
@Table(name="playschoolstudentpersonalinformation")
public class PlaySchoolStudentPersonalInformation {



    @Id
    @Column(name="registernumber",nullable=false)
    private String registernumber;

    private String candidatename;

    private Date dateofbirth;

    private Long age;

    private String gender;

    private String candfathername;

    private String candmothername;

    private String presentaddress1;

    private String presentaddress2;

    private String presentarea;

    private String presentpincode;

    private String presentstate;

    private String fathersmobileno;

    private String fathersaltmobno;

    private String mothersmobileno;

    private String mothersaltmobno;

    private String fathersemail;

    private String mothersemail;

    private String reference;

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

    private String religion;

    private String pickuppersonname;

    private String pickuppersoncontactno;

    private String pickuppersonaltcontactno;

    private String pickuppersonrelationship;

    private String transport;

    private String transportstage;

    private String academicyear;

    private String loginuser;

    public PlaySchoolStudentPersonalInformation() {
    }

    public PlaySchoolStudentPersonalInformation(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCandfathername() {
        return candfathername;
    }

    public void setCandfathername(String candfathername) {
        this.candfathername = candfathername;
    }

    public String getCandmothername() {
        return candmothername;
    }

    public void setCandmothername(String candmothername) {
        this.candmothername = candmothername;
    }

    public String getPresentaddress1() {
        return presentaddress1;
    }

    public void setPresentaddress1(String presentaddress1) {
        this.presentaddress1 = presentaddress1;
    }

    public String getPresentaddress2() {
        return presentaddress2;
    }

    public void setPresentaddress2(String presentaddress2) {
        this.presentaddress2 = presentaddress2;
    }

    public String getPresentarea() {
        return presentarea;
    }

    public void setPresentarea(String presentarea) {
        this.presentarea = presentarea;
    }

    public String getPresentpincode() {
        return presentpincode;
    }

    public void setPresentpincode(String presentpincode) {
        this.presentpincode = presentpincode;
    }

    public String getPresentstate() {
        return presentstate;
    }

    public void setPresentstate(String presentstate) {
        this.presentstate = presentstate;
    }

    public String getFathersmobileno() {
        return fathersmobileno;
    }

    public void setFathersmobileno(String fathersmobileno) {
        this.fathersmobileno = fathersmobileno;
    }

    public String getFathersaltmobno() {
        return fathersaltmobno;
    }

    public void setFathersaltmobno(String fathersaltmobno) {
        this.fathersaltmobno = fathersaltmobno;
    }

    public String getMothersmobileno() {
        return mothersmobileno;
    }

    public void setMothersmobileno(String mothersmobileno) {
        this.mothersmobileno = mothersmobileno;
    }

    public String getMothersaltmobno() {
        return mothersaltmobno;
    }

    public void setMothersaltmobno(String mothersaltmobno) {
        this.mothersaltmobno = mothersaltmobno;
    }

    public String getFathersemail() {
        return fathersemail;
    }

    public void setFathersemail(String fathersemail) {
        this.fathersemail = fathersemail;
    }

    public String getMothersemail() {
        return mothersemail;
    }

    public void setMothersemail(String mothersemail) {
        this.mothersemail = mothersemail;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getFathersoccupation() {
        return fathersoccupation;
    }

    public void setFathersoccupation(String fathersoccupation) {
        this.fathersoccupation = fathersoccupation;
    }

    public String getFathersofficename() {
        return fathersofficename;
    }

    public void setFathersofficename(String fathersofficename) {
        this.fathersofficename = fathersofficename;
    }

    public String getFathersofficeaddress1() {
        return fathersofficeaddress1;
    }

    public void setFathersofficeaddress1(String fathersofficeaddress1) {
        this.fathersofficeaddress1 = fathersofficeaddress1;
    }

    public String getFathersofficeaddress2() {
        return fathersofficeaddress2;
    }

    public void setFathersofficeaddress2(String fathersofficeaddress2) {
        this.fathersofficeaddress2 = fathersofficeaddress2;
    }

    public String getFathersofficearea() {
        return fathersofficearea;
    }

    public void setFathersofficearea(String fathersofficearea) {
        this.fathersofficearea = fathersofficearea;
    }

    public String getFathersofficepincode() {
        return fathersofficepincode;
    }

    public void setFathersofficepincode(String fathersofficepincode) {
        this.fathersofficepincode = fathersofficepincode;
    }

    public String getFathersofficestate() {
        return fathersofficestate;
    }

    public void setFathersofficestate(String fathersofficestate) {
        this.fathersofficestate = fathersofficestate;
    }

    public String getFathersofficephoneno() {
        return fathersofficephoneno;
    }

    public void setFathersofficephoneno(String fathersofficephoneno) {
        this.fathersofficephoneno = fathersofficephoneno;
    }

    public String getFathersofficealtphoneno() {
        return fathersofficealtphoneno;
    }

    public void setFathersofficealtphoneno(String fathersofficealtphoneno) {
        this.fathersofficealtphoneno = fathersofficealtphoneno;
    }

    public String getFathersofficeextensionno() {
        return fathersofficeextensionno;
    }

    public void setFathersofficeextensionno(String fathersofficeextensionno) {
        this.fathersofficeextensionno = fathersofficeextensionno;
    }

    public String getMothersoccupation() {
        return mothersoccupation;
    }

    public void setMothersoccupation(String mothersoccupation) {
        this.mothersoccupation = mothersoccupation;
    }

    public String getMothersofficename() {
        return mothersofficename;
    }

    public void setMothersofficename(String mothersofficename) {
        this.mothersofficename = mothersofficename;
    }

    public String getMothersofficeaddress1() {
        return mothersofficeaddress1;
    }

    public void setMothersofficeaddress1(String mothersofficeaddress1) {
        this.mothersofficeaddress1 = mothersofficeaddress1;
    }

    public String getMothersofficeaddress2() {
        return mothersofficeaddress2;
    }

    public void setMothersofficeaddress2(String mothersofficeaddress2) {
        this.mothersofficeaddress2 = mothersofficeaddress2;
    }

    public String getMothersofficearea() {
        return mothersofficearea;
    }

    public void setMothersofficearea(String mothersofficearea) {
        this.mothersofficearea = mothersofficearea;
    }

    public String getMothersofficepincode() {
        return mothersofficepincode;
    }

    public void setMothersofficepincode(String mothersofficepincode) {
        this.mothersofficepincode = mothersofficepincode;
    }

    public String getMothersofficestate() {
        return mothersofficestate;
    }

    public void setMothersofficestate(String mothersofficestate) {
        this.mothersofficestate = mothersofficestate;
    }

    public String getMothersofficephoneno() {
        return mothersofficephoneno;
    }

    public void setMothersofficephoneno(String mothersofficephoneno) {
        this.mothersofficephoneno = mothersofficephoneno;
    }

    public String getMothersofficealtphoneno() {
        return mothersofficealtphoneno;
    }

    public void setMothersofficealtphoneno(String mothersofficealtphoneno) {
        this.mothersofficealtphoneno = mothersofficealtphoneno;
    }

    public String getMothersofficeextensionno() {
        return mothersofficeextensionno;
    }

    public void setMothersofficeextensionno(String mothersofficeextensionno) {
        this.mothersofficeextensionno = mothersofficeextensionno;
    }

    public Date getFathersdob() {
        return fathersdob;
    }

    public void setFathersdob(Date fathersdob) {
        this.fathersdob = fathersdob;
    }

    public Date getMothersdob() {
        return mothersdob;
    }

    public void setMothersdob(Date mothersdob) {
        this.mothersdob = mothersdob;
    }

    public Date getParentsweddingdate() {
        return parentsweddingdate;
    }

    public void setParentsweddingdate(Date parentsweddingdate) {
        this.parentsweddingdate = parentsweddingdate;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getPickuppersonname() {
        return pickuppersonname;
    }

    public void setPickuppersonname(String pickuppersonname) {
        this.pickuppersonname = pickuppersonname;
    }

    public String getPickuppersoncontactno() {
        return pickuppersoncontactno;
    }

    public void setPickuppersoncontactno(String pickuppersoncontactno) {
        this.pickuppersoncontactno = pickuppersoncontactno;
    }

    public String getPickuppersonaltcontactno() {
        return pickuppersonaltcontactno;
    }

    public void setPickuppersonaltcontactno(String pickuppersonaltcontactno) {
        this.pickuppersonaltcontactno = pickuppersonaltcontactno;
    }

    public String getPickuppersonrelationship() {
        return pickuppersonrelationship;
    }

    public void setPickuppersonrelationship(String pickuppersonrelationship) {
        this.pickuppersonrelationship = pickuppersonrelationship;
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

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
