package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "ex2header")

public class Ex2Header {
    public Date getExamDate(){
        return examdate;
    }
    public void setExamDate(Date examdate) {
        this.examdate = examdate;
    }
    public String getExamDay(){
        return examday;
    }
    public void setExamDay(String examday) {
        this.examday = examday;
    }

    public String getExamSession(){
        return examsession;
    }
    public void setExamSession(String examsession) {
        this.examsession = examsession;
    }

    public String getQuestionCode() {
        return questioncode;
    }
    public void setQuestionCode(String questioncode) {
        this.questioncode = questioncode;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {return academicyear;}
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getSubjectCode() {
        return subjectcode;
    }
    public void setSubjectCode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public Integer getSubjectColumnNo() {
        return columnno;
    }
    public void setSubjectColumnNo(Integer columnno) {
        this.columnno = columnno;
    }

    public Integer getTotalPresent() {
        return totalpresent;
    }
    public void setTotalPresent(Integer totalpresent) {
        this.totalpresent = totalpresent;
    }

    public Integer getTotalAbsent() {return totalabsent;}
    public void setTotalAbsent(Integer totalabsent) {
        this.totalabsent = totalabsent;
    }

    public Integer getTotalMalPractice() {return totalmalpractice;}
    public void setTotalMalPractice(Integer totalmalpractice) {
        this.totalmalpractice = totalmalpractice;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private Date examdate;

    @NotNull
    private String examday;

    @NotNull
    private String examsession;

    @NotNull
    private String questioncode;


    @NotNull
    private String branchcode;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String subjectcode;

    @NotNull
    private Integer columnno;

    @NotNull
    private Integer totalpresent;

    @NotNull
    private Integer totalabsent;

    @NotNull
    private Integer totalmalpractice;

    @NotNull
    private String loginuser;

}
