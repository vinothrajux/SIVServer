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
@Table(name = "diplomabranchboardexamtimetableheader")

public class DiplomaBranchBoardExamTimeTableHeader {
    public String getExamid(){
        return examid;
    }
    public void setExamid(String examid) {
        this.examid = examid;
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

    public String getMonthofexam() {
        return monthofexam;
    }
    public void setMonthofexam(String monthofexam) {
        this.monthofexam = monthofexam;
    }

    public String getYearofexam() {
        return yearofexam;
    }
    public void setYearofexam(String yearofexam) {
        this.yearofexam = yearofexam;
    }

    public Integer getMaximummarks() {
        return maxmarks;
    }
    public void setMaximummarks(Integer maxmarks) {
        this.maxmarks = maxmarks;
    }

    public Integer getSubject1columnno() {
        return subject1columnno;
    }
    public void setSubject1columnno(Integer subject1columnno) {
        this.subject1columnno = subject1columnno;
    }

    public String getSubject1codeno() {
        return subject1codeno;
    }
    public void setSubject1codeno(String subject1codeno) {
        this.subject1codeno = subject1codeno;
    }

    public Date getSubject1date() {return subject1date;}
    public void setSubject1date(Date subject1date) {
        this.subject1date = subject1date;
    }

    public String getSubject1day() {
        return subject1day;
    }
    public void setSubject1day(String subject1day) {
        this.subject1day = subject1day;
    }

    public Integer getSubject2columnno() {
        return subject2columnno;
    }
    public void setSubject2columnno(Integer subject2columnno) {this.subject2columnno = subject2columnno;}

    public String getSubject2codeno() {
        return subject2codeno;
    }
    public void setSubject2codeno(String subject2codeno) {this.subject2codeno = subject2codeno;}

    public Date getSubject2date() {
        return subject2date;
    }
    public void setSubject2date(Date subject2date) {this.subject2date = subject2date;}

    public String getSubject2day() {
        return subject2day;
    }
    public void setSubject2day(String subject2day) {
        this.subject2day = subject2day;
    }

    public Integer getSubject3columnno() {
        return subject3columnno;
    }
    public void setSubject3columnno(Integer subject3columnno) {
        this.subject3columnno = subject3columnno;
    }

    public String getSubject3codeno() {
        return subject3codeno;
    }
    public void setSubject3codeno(String subject3codeno) {
        this.subject3codeno = subject3codeno;
    }

    public Date getSubject3date() {
        return subject3date;
    }
    public void setSubject3date(Date subject3date) {
        this.subject3date = subject3date;
    }

    public String getSubject3day() {
        return subject3day;
    }
    public void setSubject3day(String subject3day) {
        this.subject3day = subject3day;
    }

    public Integer getSubject4columnno() {
        return subject4colno;
    }
    public void setSubject4columnno(Integer subject4colno) {this.subject4colno = subject4colno;}

    public String getSubject4codeno() {
        return subject4codeno;
    }
    public void setSubject4codeno(String subject4codeno) {
        this.subject4codeno = subject4codeno;
    }

    public Date getSubject4date() {
        return subject4date;
    }
    public void setSubject4date(Date subject4date) {
        this.subject4date = subject4date;
    }

    public String getSubject4day() {
        return subject4day;
    }
    public void setSubject4day(String subject4day) {
        this.subject4day = subject4day;
    }

    public Integer getSubject5columnno() {
        return subject5columnno;
    }
    public void setSubject5columnno(Integer subject5columnno) {
        this.subject5columnno = subject5columnno;
    }

    public String getSubject5codeno() {
        return subject5codeno;
    }
    public void setSubject5codeno(String subject5codeno) {
        this.subject5codeno = subject5codeno;
    }

    public Date getSubject5date() {
        return subject5date;
    }
    public void setSubject5date(Date subject5date) {
        this.subject5date = subject5date;
    }

    public String getSubject5day() {
        return subject5day;
    }
    public void setSubject5day(String subject5day) {
        this.subject5day = subject5day;
    }

    public Integer getSubject6columnno() {
        return subject6columnno;
    }
    public void setSubject6columnno(Integer subject6columnno) {
        this.subject6columnno = subject6columnno;
    }

    public String getSubject6codeno() {
        return subject6codeno;
    }
    public void setSubject6codeno(String subject6codeno) {
        this.subject6codeno = subject6codeno;
    }

    public Date getSubject6date() {
        return subject6date;
    }
    public void setSubject6date(Date subject6date) {
        this.subject6date = subject6date;
    }

    public String getSubject6day() {
        return subject6day;
    }
    public void setSubject6day(String subject6day) {
        this.subject6day = subject6day;
    }

    public Integer getSubject7columnno() {
        return subject7columnolno;
    }
    public void setSubject7columnno(Integer subject7columnolno) {
        this.subject7columnolno = subject7columnolno;
    }

    public String getSubject7codeno() {
        return subject7codeno;
    }
    public void setSubject7codeno(String subject7codeno) {
        this.subject7codeno = subject7codeno;
    }

    public Date getSubject7date() {
        return subject7date;
    }
    public void setSubject7date(Date subject7date) {
        this.subject7date = subject7date;
    }

    public String getSubject7day() {
        return subject7day;
    }
    public void setSubject7day(String subject7day) {
        this.subject7day = subject7day;
    }

    public String getLoginuser() {return loginuser;}
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String examid;

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
    private String monthofexam;

    @NotNull
    private String yearofexam;

    @NotNull
    private Integer maxmarks;

    @NotNull
    private Integer subject1columnno;

    @NotNull
    private String subject1codeno;

    @NotNull
    private Date subject1date;

    @NotNull
    private String subject1day;

    @NotNull
    private Integer subject2columnno;

    @NotNull
    private String subject2codeno;

    @NotNull
    private Date subject2date;

    @NotNull
    private String subject2day;

    @NotNull
    private Integer subject3columnno;

    @NotNull
    private String subject3codeno;

    @NotNull
    private Date subject3date;

    @NotNull
    private String subject3day;

    @NotNull
    private Integer subject4colno;

    @NotNull
    private String subject4codeno;

    @NotNull
    private Date subject4date;

    @NotNull
    private String subject4day;

    @NotNull
    private Integer subject5columnno;

    @NotNull
    private String subject5codeno;

    @NotNull
    private Date subject5date;

    @NotNull
    private String subject5day;

    @NotNull
    private Integer subject6columnno;

    @NotNull
    private String subject6codeno;

    @NotNull
    private Date subject6date;

    @NotNull
    private String subject6day;

    @NotNull
    private Integer subject7columnolno;

    @NotNull
    private String subject7codeno;

    @NotNull
    private Date subject7date;

    @NotNull
    private String subject7day;

    @NotNull
    private String loginuser;

}
