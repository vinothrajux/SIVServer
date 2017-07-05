package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 01-Jul-17.
 */

@Entity
@Table(name = "scholarship")
public class Scholarship {

    public Date getCurrentDate(){
        return currentdate;
    }
    public void setCurrentDate(Date currentdate) {this.currentdate = currentdate;}


    public String getRegNo() {
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }


    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }


    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }


    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getFatherName() {
        return fathername;
    }
    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }

    public Long getMobileNo() {
        return mobileno;
    }
    public void setMobileNo(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getCommunity() {
        return community;
    }
    public void setCommunity(String community) {
        this.community = community;
    }

    public Long getScholarshipAmount() {
        return scholarshipamount;
    }
    public void setScholarshipAmount(Long scholarshipamount) {
        this.scholarshipamount = scholarshipamount;
    }

    public Date getAppliedDate() {  return applieddate;}
    public void setAppliedDate(Date applieddate) {
        this.applieddate = applieddate;
    }

    public String getStatus() {return status;}
    public void setStatus(String status) {
        this.status = status;
    }

    public String getScholarshipType() {  return scholarshiptype;}
    public void setScholarshipType(String scholarshiptype) {
        this.scholarshiptype = scholarshiptype;
    }

    public Date getSactionedDate() {
        return sactioneddate;
    }
    public void setSactionedDate(Date sactioneddate) {
        this.sactioneddate = sactioneddate;
    }

    public String getAccountNo() {  return bankaccountno;}
    public void setAccountNo(String bankaccountno) {
        this.bankaccountno = bankaccountno;
    }

    public String getBankAccountName() {  return bankaccountname;}
    public void setBankAccountName(String bankaccountname) {
        this.bankaccountname = bankaccountname;
    }

    public String getIFSCCode() {  return ifsccode;}
    public void setIFSCCode(String ifsccode) {this.ifsccode = ifsccode; }

    public String getBankBranch() {  return bankbranch;}
    public void setBankBranch(String bankbranch) {
        this.bankbranch = bankbranch;
    }

    public String getLoginUser() {return loginuser; }
    public void setLoginUser(String loginuser) {this.loginuser = loginuser; }



    @NotNull
    private Date currentdate;


    @Id
    private String regno;

    @NotNull
    private String admissionno;


    @NotNull
    private String branchname;


    @NotNull
    private String branchcode;

    @NotNull
    private String batch;


    @NotNull
    private String semester;

    @NotNull
    private String academicyear;


    @NotNull
    private String name;


    @NotNull
    private String fathername;

    @NotNull
    private Long mobileno;

    @NotNull
    private String community;

    @NotNull
    private Long scholarshipamount;

    @NotNull
    private Date applieddate;

    @NotNull
    private String status;

    @NotNull
    private String scholarshiptype;

    @NotNull
    private Date sactioneddate;

    @NotNull
    private String bankaccountno;

    @NotNull
    private String bankaccountname;

    @NotNull
    private String ifsccode;

    @NotNull
    private String bankbranch;



    @NotNull
    private String loginuser;

}
