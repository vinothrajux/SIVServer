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
    @Id
    private Date examdate;

    private String examday;

    private String examsession;

    private String monthandyearofexam;

    private String questioncode;

    private String branchcode;

    private Integer semester;

    private String academicyear;

    private String subjectcode;

    private Integer columnno;

    private Integer totalpresent;

    private Integer totalabsent;

    private Integer totalmalpractice;

    private String loginuser;

    public Ex2Header() {
    }

    public Date getExamdate() {
        return examdate;
    }

    public void setExamdate(Date examdate) {
        this.examdate = examdate;
    }

    public String getExamday() {
        return examday;
    }

    public void setExamday(String examday) {
        this.examday = examday;
    }

    public String getExamsession() {
        return examsession;
    }

    public void setExamsession(String examsession) {
        this.examsession = examsession;
    }

    public String getMonthandyearofexam() {
        return monthandyearofexam;
    }

    public void setMonthandyearofexam(String monthandyearofexam) {
        this.monthandyearofexam = monthandyearofexam;
    }

    public String getQuestioncode() {
        return questioncode;
    }

    public void setQuestioncode(String questioncode) {
        this.questioncode = questioncode;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
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

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public Integer getColumnno() {
        return columnno;
    }

    public void setColumnno(Integer columnno) {
        this.columnno = columnno;
    }

    public Integer getTotalpresent() {
        return totalpresent;
    }

    public void setTotalpresent(Integer totalpresent) {
        this.totalpresent = totalpresent;
    }

    public Integer getTotalabsent() {
        return totalabsent;
    }

    public void setTotalabsent(Integer totalabsent) {
        this.totalabsent = totalabsent;
    }

    public Integer getTotalmalpractice() {
        return totalmalpractice;
    }

    public void setTotalmalpractice(Integer totalmalpractice) {
        this.totalmalpractice = totalmalpractice;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
