package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "diplomafirstyearboardexamtimetableheader")

public class DiplomaFirstYearBoardExamTimeTableHeader {
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
        return subject1date;
    }
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
        return subject2date;
    }
    public void setSubject2date(Date subject2date) {
        this.subject2date = subject2date;
    }

    public String getSubject2day() {
        return subject2day;
    }
    public void setSubject2day(String subject2day) {
        this.subject2day = subject2day;
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
        return subject5colno;
    }
    public void setSubject5columnno(Integer subject5colno) {
        this.subject5colno = subject5colno;
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
        return subject6colno;
    }
    public void setSubject6columnno(Integer subject6colno) {
        this.subject6colno = subject6colno;
    }

    public String getSubject6codeno() {
        return subject6codeno;
    }
    public void setSubject6codeno(String subject6codeno) {
        this.subject6codeno = subject6codeno;
    }

    public Date getSubject6date(){return subject6date;}
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
        return subject7colno;
    }
    public void setSubject7columnno(Integer subject7colno) {
        this.subject7colno = subject7colno;
    }

    public String getSubject7codeno() {
        return subject7codeno;
    }
    public void setSubject7codeno(String subject7codeno) {
        this.subject7codeno = subject7codeno;
    }

    public Date getSubject7cate() {
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

    public Integer getSubject8columnno() {
        return subject8colno;
    }
    public void setSubject8columnno(Integer subject8colno) {
        this.subject8colno = subject8colno;
    }

    public String getSubject8codeno() {
        return subject8codeno;
    }
    public void setSubject8codeno(String subject8codeno) {
        this.subject8codeno = subject8codeno;
    }

    public Date getSubject8date() {
        return subject8date;
    }
    public void setSubject8date(Date subject8date) {
        this.subject8date = subject8date;
    }

    public String getSubject8day() {
        return subject8day;
    }
    public void setSubject8day(String subject8day) {
        this.subject8day = subject8day;
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
    private Integer subject1colno;

    @NotNull
    private String subject1codeno;

    @NotNull
    private Date subject1date;

    @NotNull
    private String subject1day;

    @NotNull
    private Integer subject2colno;

    @NotNull
    private String subject2codeno;

    @NotNull
    private Date subject2date;

    @NotNull
    private String subject2day;

    @NotNull
    private Integer subject3colno;

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
    private Integer subject5colno;

    @NotNull
    private String subject5codeno;

    @NotNull
    private Date subject5date;

    @NotNull
    private String subject5day;

    @NotNull
    private Integer subject6colno;

    @NotNull
    private String subject6codeno;

    @NotNull
    private Date subject6date;

    @NotNull
    private String subject6day;

    @NotNull
    private Integer subject7colno;

    @NotNull
    private String subject7codeno;

    @NotNull
    private Date subject7date;

    @NotNull
    private String subject7day;

    @NotNull
    private Integer subject8colno;

    @NotNull
    private String subject8codeno;

    @NotNull
    private Date subject8date;

    @NotNull
    private String subject8day;

    @NotNull
    private String loginuser;

}
