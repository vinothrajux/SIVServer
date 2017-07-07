package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 30-Jun-17.
 */

@Entity
@Table(name = "firstaidentry")
public class FirstAidEntry {

    public Date getCurrentDate(){
        return currentdate;
    }
    public void setCurrentDate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getRegNo(){
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo(){
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getReasonForFirstAid() {
        return reasonforfirstaid;
    }
    public void setReasonForFirstAid(String reasonforfirstaid) {
        this.reasonforfirstaid = reasonforfirstaid;
    }

    public String getFirstAidDetails() {
        return firstaiddetails;
    }
    public void setFirstAidDetails(String firstaiddetails) {
        this.firstaiddetails = firstaiddetails;
    }

    public String getHospitalName() {
        return hospitalname;
    }
    public void setHospitalName(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public Long getHospitalFees() {
        return hospitalfees;
    }
    public void setHospitalFees(Long hospitalfees) {
        this.hospitalfees = hospitalfees;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }







    @Id
    private Date currentdate;

    @NotNull
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String name;

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
    private String reasonforfirstaid;

    @NotNull
    private String firstaiddetails;

    @NotNull
    private String hospitalname;

    @NotNull
    private Long hospitalfees;

    @NotNull
    private String remarks;


    @NotNull
    private String loginuser;

}


