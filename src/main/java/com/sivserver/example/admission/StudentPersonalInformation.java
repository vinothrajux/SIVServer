package com.sivserver.example.admission;

import javax.persistence.Column;
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

    public StudentPersonalInformation() {
    }

    public StudentPersonalInformation(String regno) {
        this.regno = regno;
    }

    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAdmissionno() {
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
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

    public String getPresentaltmobileno() {
        return presentaltmobileno;
    }
    public void setPresentaltmobileno(String presentaltmobileno) {
        this.presentaltmobileno = presentaltmobileno;
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

    public String getPermanentaltmobileno() {
        return permanentaltmobileno;
    }
    public void setPermanentaltmobileno(String permanentaltmobileno) {
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
    @Column(name = "regno",nullable=false)
    private String regno;


    private String admissionno;

    private String name;


    private String academicyear;


    private Date dateofbirth;


    private String gender;


    private String fathername;


    private String mothername;


    private String presentaddress1;


    private String presentaddress2;


    private String presentarea;


    private String presentpincode;

    private String presentstate;


    private String presentmobileno;


    private String presentaltmobileno;


    private String presentemail;


    private String presentaltemail;


    private String permanentaddress1;


    private String permanentaddress2;


    private String permanentarea;


    private String permanentpincode;

    private String permanentstate;


    private String permanentmobileno;


    private String permanentaltmobileno;


    private String permanentemail;


    private String permanentaltemail;



    private String reference;


    private String loginuser;
}
