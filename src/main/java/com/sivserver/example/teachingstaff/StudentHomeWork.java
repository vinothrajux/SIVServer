package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 29/06/2017.
 */
@Entity
@Table(name = "studenthomework")

public class StudentHomeWork {
    public Date getHomeWorkEntryDate(){
        return entrydate;
    }
    public void setHomeWorkEntryDate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
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

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getAcadYear() {
        return academicYear;
    }
    public void setAcadYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getSubjectName() {
        return subjectname;
    }
    public void setSubjectName(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectCode() {
        return subjectcode;
    }
    public void setSubjectCode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getHomeWorkContent() {
        return homeworkcontent;
    }
    public void setHomeWorkContent(String homeworkcontent) {
        this.homeworkcontent = homeworkcontent;
    }

    public String getStaffId() {
        return staffID;
    }
    public void setStaffId(String staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }
    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date entrydate;

     @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private String subjectname;

    @Id
    private String subjectcode;

    @NotNull
    private String homeworkcontent;

    @NotNull
    private String staffID;

    @NotNull
    private String staffName;

    @NotNull
    private String loginuser;

}


