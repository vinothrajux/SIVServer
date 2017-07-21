package com.sivserver.example.transport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 17-Jul-17.
 */
@Entity
@Table(name = "trainconcession")

public class TrainConcession {

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

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getBranchname() {
        return branchname;
    }
    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
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
    public void setPresentaddress2(String presentaddress2) {this.presentaddress2 = presentaddress2;}

    public String getPresentmobileno() {
        return presentmobileno;
    }
    public void setPresentmobileno(String presentmobileno) {
        this.presentmobileno = presentmobileno;
    }

    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCertno() {
        return certno;
    }
    public void setCertno(String certno) {
        this.certno = certno;
    }


    public Date getCertdate() {
        return certdate;
    }
    public void setCertdate(Date certdate) {this.certdate = certdate;}

    public String getPeriodfrom() {
        return periodfrom;
    }
    public void setPeriodFrom(String periodfrom) {
        this.periodfrom = periodfrom;
    }


    public String getPeriodto() {
        return periodto;
    }
    public void setPeriodto(String periodto) {
        this.periodto = periodto;
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
    private String name;

    @NotNull
    private Integer semester;

    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @NotNull
    private String academicyear;

    @NotNull
    private String presentaddress1;

    @NotNull
    private String presentaddress2;

    @NotNull
    private String presentmobileno;

    @NotNull
    private String emailid;

    @NotNull
    private String gender;

    @NotNull
    private String dob;

    @NotNull
    private String certno;

    @NotNull
    private Date certdate;

    @NotNull
    private String periodfrom;

    @NotNull
    private String periodto;

    @NotNull
    private String loginuser;


}


