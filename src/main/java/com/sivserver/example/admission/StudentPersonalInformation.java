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

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
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

    public String getFathername() {
        return fathername;
    }
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMothername() {
        return mothername;
    }
    public void setMothername(String mothername) {this.mothername = mothername;}

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

    public Long getPresentpincode() {
        return presentpincode;
    }
    public void setPresentpincode(Long presentpincode) {
        this.presentpincode = presentpincode;
    }

    public Long getPresentmobileno() {
        return presentmobileno;
    }
    public void setPresentmobileno(Long presentmobileno) {
        this.presentmobileno = presentmobileno;
    }

    public Long getPresentaltmobileno() {
        return presentaltmobno;
    }
    public void setPresentaltmobileno(Long presentaltmobno) {
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

    public Long getPermanentpincode() {
        return permanentpincode;
    }
    public void setPermanentpincode(Long permanentpincode) {
        this.permanentpincode = permanentpincode;
    }

    public Long getPermanenttmobileno() {
        return permanentmobileno;
    }
    public void setPermanentmobileno(Long permanentmobileno) {
        this.permanentmobileno = permanentmobileno;
    }

    public Long getPermanentaltmobileno() {
        return permanentaltmobileno;
    }
    public void setPermanentaltmobileno(Long permanentaltmobileno) {
        this.permanentaltmobileno = permanentaltmobileno;
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


    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
