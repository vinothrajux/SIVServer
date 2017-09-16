package com.sivserver.example.Superintendent;

import javax.persistence.Column;
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

    @Id
    private String scholarshipid;

    private Date currentdate;

    @Column(name="regno")
    private String regno;

    private String admissionno;

    private String branchname;

    private String branchcode;

    private String batch;

    private String semester;

    private String academicyear;

    private String name;

    private String fathername;

    private Long mobileno;

    private String community;

    private Long scholarshipamount;

    private Date applieddate;

    private String status;

    private String scholarshiptype;

    private Date sactioneddate;

    private String bankaccountno;

    private String bankaccountname;

    private String ifsccode;

    private String bankbranch;

    private String loginuser;

    public Scholarship() {
    }

    public String getScholarshipid() {
        return scholarshipid;
    }

    public void setScholarshipid(String scholarshipid) {
        this.scholarshipid = scholarshipid;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getRegno() {
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

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public Long getMobileno() {
        return mobileno;
    }

    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public Long getScholarshipamount() {
        return scholarshipamount;
    }

    public void setScholarshipamount(Long scholarshipamount) {
        this.scholarshipamount = scholarshipamount;
    }

    public Date getApplieddate() {
        return applieddate;
    }

    public void setApplieddate(Date applieddate) {
        this.applieddate = applieddate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScholarshiptype() {
        return scholarshiptype;
    }

    public void setScholarshiptype(String scholarshiptype) {
        this.scholarshiptype = scholarshiptype;
    }

    public Date getSactioneddate() {
        return sactioneddate;
    }

    public void setSactioneddate(Date sactioneddate) {
        this.sactioneddate = sactioneddate;
    }

    public String getBankaccountno() {
        return bankaccountno;
    }

    public void setBankaccountno(String bankaccountno) {
        this.bankaccountno = bankaccountno;
    }

    public String getBankaccountname() {
        return bankaccountname;
    }

    public void setBankaccountname(String bankaccountname) {
        this.bankaccountname = bankaccountname;
    }

    public String getIfsccode() {
        return ifsccode;
    }

    public void setIfsccode(String ifsccode) {
        this.ifsccode = ifsccode;
    }

    public String getBankbranch() {
        return bankbranch;
    }

    public void setBankbranch(String bankbranch) {
        this.bankbranch = bankbranch;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
