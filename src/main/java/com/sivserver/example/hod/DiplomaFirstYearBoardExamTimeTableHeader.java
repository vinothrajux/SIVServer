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
    @Id
    Hod_Compound_Key diploma_Board_Exam_Time_Table_Compound_Key;

    private Date entrydate;

    private Integer maxmarks;

    private Integer subject1Colno;

    private String subject1Codeno;

    private Date subject1TestDate;

    private String subject1TestDay;

    private Integer subject2Colno;

    private String subject2Codeno;

    private Date subject2TestDate;

    private String subject2TestDay;

    private Integer subject3Colno;

    private String subject3Codeno;

    private Date subject3TestDate;

    private String subject3TestDay;

    private Integer subject4Colno;

    private String subject4Codeno;

    private Date subject4TestDate;

    private String subject4TestDay;

    private Integer subject5Colno;

    private String subject5Codeno;

    private Date subject5TestDate;

    private String subject5TestDay;

    private Integer subject6Colno;

    private String subject6Codeno;

    private Date subject6TestDate;

    private String subject6TestDay;

    private Integer subject7Colno;

    private String subject7Codeno;

    private Date subject7TestDate;

    private String subject7TestDay;

    private Integer subject8Colno;

    private String subject8Codeno;

    private Date subject8TestDate;

    private String subject8TestDay;

    private String monthandyearofexam;

    private String loginuser;

    public DiplomaFirstYearBoardExamTimeTableHeader() {
    }

    public Hod_Compound_Key getDiploma_Board_Exam_Time_Table_Compound_Key() {
        return diploma_Board_Exam_Time_Table_Compound_Key;
    }

    public void setDiploma_Board_Exam_Time_Table_Compound_Key(Hod_Compound_Key diploma_Board_Exam_Time_Table_Compound_Key) {
        this.diploma_Board_Exam_Time_Table_Compound_Key = diploma_Board_Exam_Time_Table_Compound_Key;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }


    public Integer getMaxmarks() {
        return maxmarks;
    }

    public void setMaxmarks(Integer maxmarks) {
        this.maxmarks = maxmarks;
    }

    public Integer getSubject1Colno() {
        return subject1Colno;
    }

    public void setSubject1Colno(Integer subject1Colno) {
        this.subject1Colno = subject1Colno;
    }

    public String getSubject1Codeno() {
        return subject1Codeno;
    }

    public void setSubject1Codeno(String subject1Codeno) {
        this.subject1Codeno = subject1Codeno;
    }

    public Date getSubject1TestDate() {
        return subject1TestDate;
    }

    public void setSubject1TestDate(Date subject1TestDate) {
        this.subject1TestDate = subject1TestDate;
    }

    public String getSubject1TestDay() {
        return subject1TestDay;
    }

    public void setSubject1TestDay(String subject1TestDay) {
        this.subject1TestDay = subject1TestDay;
    }

    public Integer getSubject2Colno() {
        return subject2Colno;
    }

    public void setSubject2Colno(Integer subject2Colno) {
        this.subject2Colno = subject2Colno;
    }

    public String getSubject2Codeno() {
        return subject2Codeno;
    }

    public void setSubject2Codeno(String subject2Codeno) {
        this.subject2Codeno = subject2Codeno;
    }

    public Date getSubject2TestDate() {
        return subject2TestDate;
    }

    public void setSubject2TestDate(Date subject2TestDate) {
        this.subject2TestDate = subject2TestDate;
    }

    public String getSubject2TestDay() {
        return subject2TestDay;
    }

    public void setSubject2TestDay(String subject2TestDay) {
        this.subject2TestDay = subject2TestDay;
    }

    public Integer getSubject3Colno() {
        return subject3Colno;
    }

    public void setSubject3Colno(Integer subject3Colno) {
        this.subject3Colno = subject3Colno;
    }

    public String getSubject3Codeno() {
        return subject3Codeno;
    }

    public void setSubject3Codeno(String subject3Codeno) {
        this.subject3Codeno = subject3Codeno;
    }

    public Date getSubject3TestDate() {
        return subject3TestDate;
    }

    public void setSubject3TestDate(Date subject3TestDate) {
        this.subject3TestDate = subject3TestDate;
    }

    public String getSubject3TestDay() {
        return subject3TestDay;
    }

    public void setSubject3TestDay(String subject3TestDay) {
        this.subject3TestDay = subject3TestDay;
    }

    public Integer getSubject4Colno() {
        return subject4Colno;
    }

    public void setSubject4Colno(Integer subject4Colno) {
        this.subject4Colno = subject4Colno;
    }

    public String getSubject4Codeno() {
        return subject4Codeno;
    }

    public void setSubject4Codeno(String subject4Codeno) {
        this.subject4Codeno = subject4Codeno;
    }

    public Date getSubject4TestDate() {
        return subject4TestDate;
    }

    public void setSubject4TestDate(Date subject4TestDate) {
        this.subject4TestDate = subject4TestDate;
    }

    public String getSubject4TestDay() {
        return subject4TestDay;
    }

    public void setSubject4TestDay(String subject4TestDay) {
        this.subject4TestDay = subject4TestDay;
    }

    public Integer getSubject5Colno() {
        return subject5Colno;
    }

    public void setSubject5Colno(Integer subject5Colno) {
        this.subject5Colno = subject5Colno;
    }

    public String getSubject5Codeno() {
        return subject5Codeno;
    }

    public void setSubject5Codeno(String subject5Codeno) {
        this.subject5Codeno = subject5Codeno;
    }

    public Date getSubject5TestDate() {
        return subject5TestDate;
    }

    public void setSubject5TestDate(Date subject5TestDate) {
        this.subject5TestDate = subject5TestDate;
    }

    public String getSubject5TestDay() {
        return subject5TestDay;
    }

    public void setSubject5TestDay(String subject5TestDay) {
        this.subject5TestDay = subject5TestDay;
    }

    public Integer getSubject6Colno() {
        return subject6Colno;
    }

    public void setSubject6Colno(Integer subject6Colno) {
        this.subject6Colno = subject6Colno;
    }

    public String getSubject6Codeno() {
        return subject6Codeno;
    }

    public void setSubject6Codeno(String subject6Codeno) {
        this.subject6Codeno = subject6Codeno;
    }

    public Date getSubject6TestDate() {
        return subject6TestDate;
    }

    public void setSubject6TestDate(Date subject6TestDate) {
        this.subject6TestDate = subject6TestDate;
    }

    public String getSubject6TestDay() {
        return subject6TestDay;
    }

    public void setSubject6TestDay(String subject6TestDay) {
        this.subject6TestDay = subject6TestDay;
    }

    public Integer getSubject7Colno() {
        return subject7Colno;
    }

    public void setSubject7Colno(Integer subject7Colno) {
        this.subject7Colno = subject7Colno;
    }

    public String getSubject7Codeno() {
        return subject7Codeno;
    }

    public void setSubject7Codeno(String subject7Codeno) {
        this.subject7Codeno = subject7Codeno;
    }

    public Date getSubject7TestDate() {
        return subject7TestDate;
    }

    public void setSubject7TestDate(Date subject7TestDate) {
        this.subject7TestDate = subject7TestDate;
    }

    public String getSubject7TestDay() {
        return subject7TestDay;
    }

    public void setSubject7TestDay(String subject7TestDay) {
        this.subject7TestDay = subject7TestDay;
    }

    public Integer getSubject8Colno() {
        return subject8Colno;
    }

    public void setSubject8Colno(Integer subject8Colno) {
        this.subject8Colno = subject8Colno;
    }

    public String getSubject8Codeno() {
        return subject8Codeno;
    }

    public void setSubject8Codeno(String subject8Codeno) {
        this.subject8Codeno = subject8Codeno;
    }

    public Date getSubject8TestDate() {
        return subject8TestDate;
    }

    public void setSubject8TestDate(Date subject8TestDate) {
        this.subject8TestDate = subject8TestDate;
    }

    public String getSubject8TestDay() {
        return subject8TestDay;
    }

    public void setSubject8TestDay(String subject8TestDay) {
        this.subject8TestDay = subject8TestDay;
    }

    public String getMonthandyearofexam() {
        return monthandyearofexam;
    }

    public void setMonthandyearofexam(String monthandyearofexam) {
        this.monthandyearofexam = monthandyearofexam;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
