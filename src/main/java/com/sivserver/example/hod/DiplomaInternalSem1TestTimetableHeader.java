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
@Table(name = "diplomainternalsem1testtimetableheader")

public class DiplomaInternalSem1TestTimetableHeader {
    public String getTestid(){
        return testid;
    }
    public void setTestid(String testid) {
        this.testid = testid;
    }


    public Date getEntrydate(){
        return entrydate;
    }
    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
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

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getTesttype() {
        return testtype;
    }
    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public Integer getMaximummarks() {
        return maxmarks;
    }
    public void setMaximummarks(Integer maxmarks) {
        this.maxmarks = maxmarks;
    }

    public Integer getSubject1columnno() {
        return subject1colno;
    }
    public void setSubject1columnno(Integer subject1colno) {
        this.subject1colno = subject1colno;
    }

    public String getSubject1codeno() {
        return subject1codeno;
    }
    public void setSubject1codeno(String subject1codeno) {
        this.subject1codeno = subject1codeno;
    }

    public Date getSubject1date() {
        return subject1testdate;
    }
    public void setSubject1date(Date subject1testdate) {
        this.subject1testdate = subject1testdate;
    }

    public String getSubject1day() {
        return subject1testday;
    }
    public void setSubject1day(String subject1testday) {
        this.subject1testday = subject1testday;
    }

    public Integer getSubject2columnno() {
        return subject2colno;
    }
    public void setSubject2columnno(Integer subject2colno) {
        this.subject2colno = subject2colno;
    }

    public String getSubject2codeno() {
        return subject2codeno;
    }
    public void setSubject2codeno(String subject2codeno) {
        this.subject2codeno = subject2codeno;
    }

    public Date getSubject2date() {
        return subject2testdate;
    }
    public void setSubject2date(Date subject2testdate) {
        this.subject2testdate = subject2testdate;
    }

    public String getSubject2day() {
        return subject2testday;
    }
    public void setSubject2day(String subject2testday) {
        this.subject2testday = subject2testday;
    }

    public Integer getSubject3columnno() {
        return subject3colno;
    }
    public void setSubject3columnno(Integer subject3colno) {
        this.subject3colno = subject3colno;
    }

    public String getSubject3codeno() {
        return subject3codeno;
    }
    public void setSubject3codeno(String subject3codeno) {
        this.subject3codeno = subject3codeno;
    }

    public Date getSubject3date() {
        return subject3testdate;
    }
    public void setSubject3date(Date subject3testdate) {
        this.subject3testdate = subject3testdate;
    }

    public String getSubject3day() {
        return subject3testday;
    }
    public void setSubject3day(String subject3testday) {
        this.subject3testday = subject3testday;
    }

    public Integer getSubject4columnno() {
        return subject4colno;
    }
    public void setSubject4columnno(Integer subject4colno) {
        this.subject4colno = subject4colno;
    }

    public String getSubject4codeno() {
        return subject4codeno;
    }
    public void setSubject4codeno(String subject4codeno) {
        this.subject4codeno = subject4codeno;
    }

    public Date getSubject4date() {
        return subject4testdate;
    }
    public void setSubject4date(Date subject4testdate) {
        this.subject4testdate = subject4testdate;
    }

    public String getSubject4day() {
        return subject4testday;
    }
    public void setSubject4day(String subject4testday) {
        this.subject4testday = subject4testday;
    }

    public Integer getSubject5columnno() {
        return subject5colno;
    }
    public void setSubject5columnno(Integer subject5colno) {
        this.subject5colno = subject5colno;
    }

    public String getSubject5codeno() {
        return subject5codeno;
    }
    public void setSubject5CodeNo(String subject5codeno) {
        this.subject5codeno = subject5codeno;
    }

    public Date getSubject5date() {
        return subject5testdate;
    }
    public void setSubject5date(Date subject5testdate) {
        this.subject5testdate = subject5testdate;
    }

    public String getSubject5day() {
        return subject5testday;
    }
    public void setSubject5day(String subject5testday) {
        this.subject5testday = subject5testday;
    }

    public String getLoginuser() {return loginuser;}
    public void setLoginuser(String loginuser) {this.loginuser = loginuser;}


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
    private Integer subject1colno;

    @NotNull
    private String subject1codeno;

    @NotNull
    private Date subject1testdate;

    @NotNull
    private String subject1testday;

    @NotNull
    private Integer subject2colno;

    @NotNull
    private String subject2codeno;

    @NotNull
    private Date subject2testdate;

    @NotNull
    private String subject2testday;

    @NotNull
    private Integer subject3colno;

    @NotNull
    private String subject3codeno;

    @NotNull
    private Date subject3testdate;

    @NotNull
    private String subject3testday;

    @NotNull
    private Integer subject4colno;

    @NotNull
    private String subject4codeno;

    @NotNull
    private Date subject4testdate;

    @NotNull
    private String subject4testday;

    @NotNull
    private Integer subject5colno;

    @NotNull
    private String subject5codeno;

    @NotNull
    private Date subject5testdate;

    @NotNull
    private String subject5testday;

    @NotNull
    private String loginuser;

}

