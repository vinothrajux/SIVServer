package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 04/07/2017.
 */
@Entity
@Table(name = "diplomainternalsem2testtimetableheader")

public class DiplomaInternalSem2TestTimetableHeader {
    public String getTestId(){
        return testid;
    }
    public void setTestId(String testid) {
        this.testid = testid;
    }


    public Date getEntryDate(){
        return entrydate;
    }
    public void setEntryDate(Date entrydate) {
        this.entrydate = entrydate;
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

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getTestType() {
        return testtype;
    }
    public void setTestType(String testtype) {
        this.testtype = testtype;
    }

    public Integer getMaximumMarks() {
        return maxmarks;
    }
    public void setMaximumMarks(Integer maxmarks) {
        this.maxmarks = maxmarks;
    }

    public Integer getSubject1ColumnNo() {
        return subject1Colno;
    }
    public void setSubject1ColumnNo(Integer subject1Colno) {
        this.subject1Colno = subject1Colno;
    }

    public String getSubject1CodeNo() {
        return subject1Codeno;
    }
    public void setSubject1CodeNo(String subject1Codeno) {
        this.subject1Codeno = subject1Codeno;
    }

    public Date getSubject1Date() {
        return subject1TestDate;
    }
    public void setSubject1Date(Date subject1TestDate) {
        this.subject1TestDate = subject1TestDate;
    }

    public String getSubject1Day() {
        return subject1TestDay;
    }
    public void setSubject1Day(String subject1TestDay) {
        this.subject1TestDay = subject1TestDay;
    }

    public Integer getSubject2ColumnNo() {
        return subject2Colno;
    }
    public void setSubject2ColumnNo(Integer subject2Colno) {
        this.subject2Colno = subject2Colno;
    }

    public String getSubject2CodeNo() {
        return subject2Codeno;
    }
    public void setSubject2CodeNo(String subject2Codeno) {
        this.subject2Codeno = subject2Codeno;
    }

    public Date getSubject2Date() {
        return subject2TestDate;
    }
    public void setSubject2Date(Date subject2TestDate) {
        this.subject2TestDate = subject2TestDate;
    }

    public String getSubject2Day() {
        return subject2TestDay;
    }
    public void setSubject2Day(String subject2TestDay) {
        this.subject2TestDay = subject2TestDay;
    }

    public Integer getSubject3ColumnNo() {
        return subject3Colno;
    }
    public void setSubject3ColumnNo(Integer subject3Colno) {
        this.subject3Colno = subject3Colno;
    }

    public String getSubject3CodeNo() {
        return subject3Codeno;
    }
    public void setSubject3CodeNo(String subject3Codeno) {
        this.subject3Codeno = subject3Codeno;
    }

    public Date getSubject3Date() {
        return subject3TestDate;
    }
    public void setSubject3Date(Date subject3TestDate) {
        this.subject3TestDate = subject3TestDate;
    }

    public String getSubject3Day() {
        return subject3TestDay;
    }
    public void setSubject3Day(String subject3TestDay) {
        this.subject3TestDay = subject3TestDay;
    }

    public Integer getSubject4ColumnNo() {
        return subject4Colno;
    }
    public void setSubject4ColumnNo(Integer subject4Colno) {
        this.subject4Colno = subject4Colno;
    }

    public String getSubject4CodeNo() {
        return subject4Codeno;
    }
    public void setSubject4CodeNo(String subject4Codeno) {
        this.subject4Codeno = subject4Codeno;
    }

    public Date getSubject4Date() {
        return subject4TestDate;
    }
    public void setSubject4Date(Date subject4TestDate) {
        this.subject4TestDate = subject4TestDate;
    }

    public String getSubject4Day() {
        return subject4TestDay;
    }
    public void setSubject4Day(String subject4TestDay) {
        this.subject4TestDay = subject4TestDay;
    }

    public Integer getSubject5ColumnNo() {
        return subject5Colno;
    }
    public void setSubject5ColumnNo(Integer subject5Colno) {
        this.subject5Colno = subject5Colno;
    }

    public String getSubject5CodeNo() {
        return subject5Codeno;
    }
    public void setSubject5CodeNo(String subject5Codeno) {
        this.subject5Codeno = subject5Codeno;
    }

    public Date getSubject5Date() {
        return subject5TestDate;
    }
    public void setSubject5Date(Date subject5TestDate) {
        this.subject5TestDate = subject5TestDate;
    }

    public String getSubject5Day() {
        return subject5TestDay;
    }
    public void setSubject5Day(String subject5TestDay) {
        this.subject5TestDay = subject5TestDay;
    }

    public Integer getSubject6ColumnNo() {
        return subject6Colno;
    }
    public void setSubject6ColumnNo(Integer subject6Colno) {
        this.subject6Colno = subject6Colno;
    }

    public String getSubject6CodeNo() {
        return subject6Codeno;
    }
    public void setSubject6CodeNo(String subject6Codeno) {
        this.subject6Codeno = subject6Codeno;
    }

    public Date getSubject6Date() {
        return subject6TestDate;
    }
    public void setSubject6Date(Date subject6TestDate) {
        this.subject6TestDate = subject6TestDate;
    }

    public String getSubject6Day() {
        return subject6TestDay;
    }
    public void setSubject6Day(String subject6TestDay) {
        this.subject6TestDay = subject6TestDay;
    }

    public String getLoginUser() {return loginuser;}
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String testid;

    @NotNull
    private Date entrydate;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String testtype;

    @NotNull
    private Integer maxmarks;

    @NotNull
    private Integer subject1Colno;

    @NotNull
    private String subject1Codeno;

    @NotNull
    private Date subject1TestDate;

    @NotNull
    private String subject1TestDay;

    @NotNull
    private Integer subject2Colno;

    @NotNull
    private String subject2Codeno;

    @NotNull
    private Date subject2TestDate;

    @NotNull
    private String subject2TestDay;

    @NotNull
    private Integer subject3Colno;

    @NotNull
    private String subject3Codeno;

    @NotNull
    private Date subject3TestDate;

    @NotNull
    private String subject3TestDay;

    @NotNull
    private Integer subject4Colno;

    @NotNull
    private String subject4Codeno;

    @NotNull
    private Date subject4TestDate;

    @NotNull
    private String subject4TestDay;

    @NotNull
    private Integer subject5Colno;

    @NotNull
    private String subject5Codeno;

    @NotNull
    private Date subject5TestDate;

    @NotNull
    private String subject5TestDay;

    @NotNull
    private Integer subject6Colno;

    @NotNull
    private String subject6Codeno;

    @NotNull
    private Date subject6TestDate;

    @NotNull
    private String subject6TestDay;

    @NotNull
    private String loginuser;

}
