package com.sivserver.example.hod;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.nio.charset.CharacterCodingException;
import java.util.Date;

/**
 * Created by GBCorp on 03/07/2017.
 */
@Entity
@Table(name = "diplomainternalbranchtesttimetabledetail")

public class DiplomaInternalBranchTestTimetableDetail {

    @Id
    private Integer id;

    @Column(name="regno")
    private String regno;


    private String admissionno;

    private Diploma_Hod_Compound_Key_Internal_Test fetch_details;

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

    private String OverallResult;

    private Integer rank;

    public DiplomaInternalBranchTestTimetableDetail() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public Diploma_Hod_Compound_Key_Internal_Test getFetch_details() {
        return fetch_details;
    }

    public void setFetch_details(Diploma_Hod_Compound_Key_Internal_Test fetch_details) {
        this.fetch_details = fetch_details;
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
