package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 03/07/2017.
 */
@Entity
@Table(name = "diplomainternalbranchtesttimetableheader")

public class DiplomaInternalBranchTestTimetableHeader {

    @Id
    Diploma_Hod_Compound_Key_Internal_Test diploma_hod_compound_key_internal_test;

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

    private String loginuser;

    public DiplomaInternalBranchTestTimetableHeader() {
    }

    public Diploma_Hod_Compound_Key_Internal_Test getDiploma_hod_compound_key_internal_test() {
        return diploma_hod_compound_key_internal_test;
    }

    public void setDiploma_hod_compound_key_internal_test(Diploma_Hod_Compound_Key_Internal_Test diploma_hod_compound_key_internal_test) {
        this.diploma_hod_compound_key_internal_test = diploma_hod_compound_key_internal_test;
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

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
