package com.sivserver.example.hod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 04/07/2017.
 */
@Entity
@Table(name = "diplomainternalsem2testtimetabledetail")

public class DiplomaInternalSem2TestTimetableDetail {

    @Id
    private String testid;

    @Column(name = "regno")
    private String regno;

    private Diploma_Hod_Compound_Key_Internal_Test fetch_details;

    private String admissionno;


    private Integer subject1Mark;


    private Character subject1Attendance;


    private String subject1Result;


    private Integer subject2Mark;


    private Character subject2Attendance;


    private String subject2Result;


    private Integer subject3Mark;


    private Character subject3Attendance;


    private String subject3Result;


    private Integer subject4Mark;


    private Character subject4Attendance;


    private String subject4Result;


    private Integer subject5Mark;


    private Character subject5Attendance;


    private String subject5Result;


    private Integer subject6Mark;


    private Character subject6Attendance;


    private String subject6Result;



    private String OverallResult;


    private Integer rank;

    public DiplomaInternalSem2TestTimetableDetail() {
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public Diploma_Hod_Compound_Key_Internal_Test getFetch_details() {
        return fetch_details;
    }

    public void setFetch_details(Diploma_Hod_Compound_Key_Internal_Test fetch_details) {
        this.fetch_details = fetch_details;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public Integer getSubject1Mark() {
        return subject1Mark;
    }

    public void setSubject1Mark(Integer subject1Mark) {
        this.subject1Mark = subject1Mark;
    }

    public Character getSubject1Attendance() {
        return subject1Attendance;
    }

    public void setSubject1Attendance(Character subject1Attendance) {
        this.subject1Attendance = subject1Attendance;
    }

    public String getSubject1Result() {
        return subject1Result;
    }

    public void setSubject1Result(String subject1Result) {
        this.subject1Result = subject1Result;
    }

    public Integer getSubject2Mark() {
        return subject2Mark;
    }

    public void setSubject2Mark(Integer subject2Mark) {
        this.subject2Mark = subject2Mark;
    }

    public Character getSubject2Attendance() {
        return subject2Attendance;
    }

    public void setSubject2Attendance(Character subject2Attendance) {
        this.subject2Attendance = subject2Attendance;
    }

    public String getSubject2Result() {
        return subject2Result;
    }

    public void setSubject2Result(String subject2Result) {
        this.subject2Result = subject2Result;
    }

    public Integer getSubject3Mark() {
        return subject3Mark;
    }

    public void setSubject3Mark(Integer subject3Mark) {
        this.subject3Mark = subject3Mark;
    }

    public Character getSubject3Attendance() {
        return subject3Attendance;
    }

    public void setSubject3Attendance(Character subject3Attendance) {
        this.subject3Attendance = subject3Attendance;
    }

    public String getSubject3Result() {
        return subject3Result;
    }

    public void setSubject3Result(String subject3Result) {
        this.subject3Result = subject3Result;
    }

    public Integer getSubject4Mark() {
        return subject4Mark;
    }

    public void setSubject4Mark(Integer subject4Mark) {
        this.subject4Mark = subject4Mark;
    }

    public Character getSubject4Attendance() {
        return subject4Attendance;
    }

    public void setSubject4Attendance(Character subject4Attendance) {
        this.subject4Attendance = subject4Attendance;
    }

    public String getSubject4Result() {
        return subject4Result;
    }

    public void setSubject4Result(String subject4Result) {
        this.subject4Result = subject4Result;
    }

    public Integer getSubject5Mark() {
        return subject5Mark;
    }

    public void setSubject5Mark(Integer subject5Mark) {
        this.subject5Mark = subject5Mark;
    }

    public Character getSubject5Attendance() {
        return subject5Attendance;
    }

    public void setSubject5Attendance(Character subject5Attendance) {
        this.subject5Attendance = subject5Attendance;
    }

    public String getSubject5Result() {
        return subject5Result;
    }

    public void setSubject5Result(String subject5Result) {
        this.subject5Result = subject5Result;
    }

    public Integer getSubject6Mark() {
        return subject6Mark;
    }

    public void setSubject6Mark(Integer subject6Mark) {
        this.subject6Mark = subject6Mark;
    }

    public Character getSubject6Attendance() {
        return subject6Attendance;
    }

    public void setSubject6Attendance(Character subject6Attendance) {
        this.subject6Attendance = subject6Attendance;
    }

    public String getSubject6Result() {
        return subject6Result;
    }

    public void setSubject6Result(String subject6Result) {
        this.subject6Result = subject6Result;
    }

    public String getOverallResult() {
        return OverallResult;
    }

    public void setOverallResult(String overallResult) {
        OverallResult = overallResult;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}
