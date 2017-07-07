package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */
@Entity
@Table(name = "studentpersonalinformation")
public class StudentPersonalInformation {


    public String getRegNo(){
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionno() {
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Date getDateofbirth() {
        return dob;
    }
    public void setDateofbirth(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return fathername;
    }
    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }

    public String getMotherName() {
        return mothername;
    }
    public void setMotherName(String mothername) {this.mothername = mothername;}

    public String getPresentAddress1() {
        return presentaddress1;
    }
    public void setPresentAddress1(String presentaddress1) {
        this.presentaddress1 = presentaddress1;
    }

    public String getPresentAddress2() {
        return presentaddress2;
    }
    public void setPresentAddress2(String presentaddress2) {
        this.presentaddress2 = presentaddress2;
    }

    public String getPresentArea() {
        return presentarea;
    }
    public void setPresentArea(String presentarea) {
        this.presentarea = presentarea;
    }

    public Long getPresentPincode() {
        return presentpincode;
    }
    public void setPresentPincode(Long presentpincode) {
        this.presentpincode = presentpincode;
    }

    public Long getPresentMobileNo() {
        return presentmobileno;
    }
    public void setPresentMobileNo(Long presentmobileno) {
        this.presentmobileno = presentmobileno;
    }

    public Long getPresentAltMobileNo() {
        return presentaltmobno;
    }
    public void setPresentAltMobileNo(Long presentaltmobno) {
        this.presentaltmobno = presentaltmobno;
    }

    public String getPresentEmail() {
        return presentemail;
    }
    public void setPresentEmail(String presentemail) {
        this.presentemail = presentemail;
    }

    public String getPresentAltEmail() {
        return presentaltemail;
    }
    public void setPresentAltEmail(String presentaltemail) {
        this.presentaltemail = presentaltemail;
    }

    public String getPermanentAddress1() {
        return permanentaddress1;
    }
    public void setPermanentAddress1(String permanentaddress1) {
        this.permanentaddress1 = permanentaddress1;
    }

    public String getPermanentAddress2() {
        return permanentaddress2;
    }
    public void setPermanentAddress2(String permanentaddress2) {
        this.permanentaddress2 = permanentaddress2;
    }

    public String getPermanentArea() {
        return permanentarea;
    }
    public void setPermanentArea(String permanentarea) {
        this.permanentarea = permanentarea;
    }

    public Long getPermanentPincode() {
        return permanentpincode;
    }
    public void setPermanentPincode(Long permanentpincode) {
        this.permanentpincode = permanentpincode;
    }

    public Long getPermanenttMobileNo() {
        return permanentmobileno;
    }
    public void setPermanentMobileNo(Long permanentmobileno) {
        this.permanentmobileno = permanentmobileno;
    }

    public Long getPermanentAltMobileNo() {
        return permanentaltmobileno;
    }
    public void setPermanentAltMobileNo(Long permanentaltmobileno) {
        this.permanentaltmobileno = permanentaltmobileno;
    }

    public String getPermanentEmail() {
        return permanentemail;
    }
    public void setPermanentEmail(String permanentemail) {
        this.permanentemail = permanentemail;
    }

    public String getPermanentAltEmail() {
        return permanentaltemail;
    }
    public void setPermanentAltEmail(String permanentaltemail) {
        this.permanentaltemail = permanentaltemail;
    }


    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String academicyear;

    @NotNull
    private Date dob;

    @NotNull
    private String gender;

    @NotNull
    private String fathername;

    @NotNull
    private String mothername;

    @NotNull
    private String presentaddress1;

    @NotNull
    private String presentaddress2;

    @NotNull
    private String presentarea;

    @NotNull
    private Long presentpincode;

    @NotNull
    private Long presentmobileno;

    @NotNull
    private Long presentaltmobno;

    @NotNull
    private String presentemail;

    @NotNull
    private String presentaltemail;

    @NotNull
    private String permanentaddress1;

    @NotNull
    private String permanentaddress2;

    @NotNull
    private String permanentarea;

    @NotNull
    private Long permanentpincode;

    @NotNull
    private Long permanentmobileno;

    @NotNull
    private Long permanentaltmobileno;

    @NotNull
    private String permanentemail;

    @NotNull
    private String permanentaltemail;


    @NotNull
    private String reference;

    @NotNull
    private String loginuser;
}
