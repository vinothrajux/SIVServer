package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 04/07/2017.
 */
@Entity
@Table(name = "diplomainternalsem1testtimetabledetail")

public class DiplomaInternalSem1TestTimetableDetail {
    public String getTestId(){
        return testid;
    }
    public void setTestId(String testid) {
        this.testid = testid;
    }

    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }


    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public Integer getSubject1Mark() {
        return subject1Mark;
    }
    public void setgetSubject1Mark(Integer subject1Mark) {
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
    public void setgetSubject2Mark(Integer subject2Mark) {
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
    public void setgetSubject3Mark(Integer subject3Mark) {
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
    public void setgetSubject4Mark(Integer subject4Mark) {
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
    public void setgetSubject5Mark(Integer subject5Mark) {
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

    public String getOverallResult() {
        return OverallResult;
    }
    public void setOverallResult(String OverallResult) {
        this.OverallResult = OverallResult;
    }

    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Id
    private String testid;

    @NotNull
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private Integer subject1Mark;

    @NotNull
    private Character subject1Attendance;

    @NotNull
    private String subject1Result;

    @NotNull
    private Integer subject2Mark;

    @NotNull
    private Character subject2Attendance;

    @NotNull
    private String subject2Result;

    @NotNull
    private Integer subject3Mark;

    @NotNull
    private Character subject3Attendance;

    @NotNull
    private String subject3Result;

    @NotNull
    private Integer subject4Mark;

    @NotNull
    private Character subject4Attendance;

    @NotNull
    private String subject4Result;

    @NotNull
    private Integer subject5Mark;

    @NotNull
    private Character subject5Attendance;

    @NotNull
    private String subject5Result;

    @NotNull
    private String OverallResult;

    @NotNull
    private Integer rank;

}
