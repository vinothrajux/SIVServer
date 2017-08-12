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

    public Date getCurrentdate(){return currentdate;}
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getRegNo(){
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionno(){
        return admissionno;
    }
    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    public String getReasonforfirstaid() {
        return reasonforfirstaid;
    }
    public void setReasonforfirstaid(String reasonforfirstaid) {
        this.reasonforfirstaid = reasonforfirstaid;
    }

    public String getFirstaiddetails() {
        return firstaiddetails;
    }
    public void setFirstaiddetails(String firstaiddetails) {
        this.firstaiddetails = firstaiddetails;
    }

    public String getHospitalname() {
        return hospitalname;
    }
    public void setHospitalname(String hospitalname) {this.hospitalname = hospitalname;}

    public Long getHospitalfees() {
        return hospitalfees;
    }
    public void setHospitalfees(Long hospitalfees) {
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


