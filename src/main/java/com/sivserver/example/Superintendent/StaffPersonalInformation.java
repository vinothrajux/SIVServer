package com.sivserver.example.Superintendent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 28/09/2017.
 */
@Entity
@Table(name="staffpersonalinformation")
public class StaffPersonalInformation {

    @Id
    @Column(name = "staffid",nullable=false)
    private String staffid;

    private Date dob;

    private String gender;

    private String bloodgroup;

    private String physicallyhandicapped;

    private String aadharnumber;

    private String panno;

    private String candfathername;

    private String candmothername;

    private String fatheroccupation;

    private String maritialstatus;

    private String spousename;

    private String spouseoccupation;

    private String placeofbirth;

    private String community;

    private String caste;

    private String mothertoungue;

    private String referencedby;

    private String refererid;

    private String referername;

    private String presentaddress1;

    private String presentaddress2;

    private String presentarea;

    private String presentpincode;

    private String presentstate;

    private String presentmobileno;

    private String presentaltmobno;

    private String presentemail;

    private String presentaltemail;

    private String permanentaddress1;

    private String permanentaddress2;

    private String permanentarea;

    private String permanentpincode;

    private String permanentstate;

    private String permanentmobileno;

    private String permanentaltmobno;

    private String permanentemail;

    private String permanentaltemail;

    private String loginuser;

    public StaffPersonalInformation() {
    }

    public StaffPersonalInformation(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getPhysicallyhandicapped() {
        return physicallyhandicapped;
    }

    public void setPhysicallyhandicapped(String physicallyhandicapped) {
        this.physicallyhandicapped = physicallyhandicapped;
    }

    public String getAadharnumber() {
        return aadharnumber;
    }

    public void setAadharnumber(String aadharnumber) {
        this.aadharnumber = aadharnumber;
    }

    public String getPanno() {
        return panno;
    }

    public void setPanno(String panno) {
        this.panno = panno;
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

    public String getFatheroccupation() {
        return fatheroccupation;
    }

    public void setFatheroccupation(String fatheroccupation) {
        this.fatheroccupation = fatheroccupation;
    }

    public String getMaritialstatus() {
        return maritialstatus;
    }

    public void setMaritialstatus(String maritialstatus) {
        this.maritialstatus = maritialstatus;
    }

    public String getSpousename() {
        return spousename;
    }

    public void setSpousename(String spousename) {
        this.spousename = spousename;
    }

    public String getSpouseoccupation() {
        return spouseoccupation;
    }

    public void setSpouseoccupation(String spouseoccupation) {
        this.spouseoccupation = spouseoccupation;
    }

    public String getPlaceofbirth() {
        return placeofbirth;
    }

    public void setPlaceofbirth(String placeofbirth) {
        this.placeofbirth = placeofbirth;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getMothertoungue() {
        return mothertoungue;
    }

    public void setMothertoungue(String mothertoungue) {
        this.mothertoungue = mothertoungue;
    }

    public String getReferencedby() {
        return referencedby;
    }

    public void setReferencedby(String referencedby) {
        this.referencedby = referencedby;
    }

    public String getRefererid() {
        return refererid;
    }

    public void setRefererid(String refererid) {
        this.refererid = refererid;
    }

    public String getReferername() {
        return referername;
    }

    public void setReferername(String referername) {
        this.referername = referername;
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

    public String getPresentmobileno() {
        return presentmobileno;
    }

    public void setPresentmobileno(String presentmobileno) {
        this.presentmobileno = presentmobileno;
    }

    public String getPresentaltmobno() {
        return presentaltmobno;
    }

    public void setPresentaltmobno(String presentaltmobno) {
        this.presentaltmobno = presentaltmobno;
    }

    public String getPresentemail() {
        return presentemail;
    }

    public void setPresentemail(String presentemail) {
        this.presentemail = presentemail;
    }

    public String getPresentaltemail() {
        return presentaltemail;
    }

    public void setPresentaltemail(String presentaltemail) {
        this.presentaltemail = presentaltemail;
    }

    public String getPermanentaddress1() {
        return permanentaddress1;
    }

    public void setPermanentaddress1(String permanentaddress1) {
        this.permanentaddress1 = permanentaddress1;
    }

    public String getPermanentaddress2() {
        return permanentaddress2;
    }

    public void setPermanentaddress2(String permanentaddress2) {
        this.permanentaddress2 = permanentaddress2;
    }

    public String getPermanentarea() {
        return permanentarea;
    }

    public void setPermanentarea(String permanentarea) {
        this.permanentarea = permanentarea;
    }

    public String getPermanentpincode() {
        return permanentpincode;
    }

    public void setPermanentpincode(String permanentpincode) {
        this.permanentpincode = permanentpincode;
    }

    public String getPermanentstate() {
        return permanentstate;
    }

    public void setPermanentstate(String permanentstate) {
        this.permanentstate = permanentstate;
    }

    public String getPermanentmobileno() {
        return permanentmobileno;
    }

    public void setPermanentmobileno(String permanentmobileno) {
        this.permanentmobileno = permanentmobileno;
    }

    public String getPermanentaltmobno() {
        return permanentaltmobno;
    }

    public void setPermanentaltmobno(String permanentaltmobno) {
        this.permanentaltmobno = permanentaltmobno;
    }

    public String getPermanentemail() {
        return permanentemail;
    }

    public void setPermanentemail(String permanentemail) {
        this.permanentemail = permanentemail;
    }

    public String getPermanentaltemail() {
        return permanentaltemail;
    }

    public void setPermanentaltemail(String permanentaltemail) {
        this.permanentaltemail = permanentaltemail;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
