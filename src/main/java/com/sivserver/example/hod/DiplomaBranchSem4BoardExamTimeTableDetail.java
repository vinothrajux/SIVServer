package com.sivserver.example.hod;

import com.sivserver.example.student.StudentBaseInformation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "diplomabranchsem4boardexamtimetabledetail")

public class DiplomaBranchSem4BoardExamTimeTableDetail {

    @Id
    @Column(name = "regno")
    private String regno;

    private String admissionno;

    private Integer subject1IntMark;

    private Integer subject1ExtMark;

    private Integer subject1TotMark;

    private Character subject1Attendance;

    private String subject1Result;

    private Integer subject2IntMark;

    private Integer subject2ExtMark;

    private Integer subject2TotMark;

    private Character subject2Attendance;

    private String subject2Result;

    private Integer subject3IntMark;

    private Integer subject3ExtMark;

    private Integer subject3TotMark;

    private Character subject3Attendance;

    private String subject3Result;

    private Integer subject4IntMark;

    private Integer subject4ExtMark;

    private Integer subject4TotMark;

    private Character subject4Attendance;

    private String subject4Result;

    private Integer subject5IntMark;

    private Integer subject5ExtMark;

    private Integer subject5TotMark;

    private Character subject5Attendance;

    private String subject5Result;

    private Integer subject6IntMark;

    private Integer subject6ExtMark;

    private Integer subject6TotMark;

    private Character subject6Attendance;

    private String subject6Result;

    private Integer subject7IntMark;

    private Integer subject7ExtMark;

    private Integer subject7TotMark;

    private Character subject7Attendance;

    private String subject7Result;

    private String OverallResult;

    private Integer rank;

    private String monthandyearofexam;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private StudentBaseInformation student_base_regno;

    public DiplomaBranchSem4BoardExamTimeTableDetail() {
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public Integer getSubject1IntMark() {
        return subject1IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject1IntMark(Integer subject1IntMark) {
        this.subject1IntMark = subject1IntMark;
        return this;
    }

    public Integer getSubject1ExtMark() {
        return subject1ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject1ExtMark(Integer subject1ExtMark) {
        this.subject1ExtMark = subject1ExtMark;
        return this;
    }

    public Integer getSubject1TotMark() {
        return subject1TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject1TotMark(Integer subject1TotMark) {
        this.subject1TotMark = subject1TotMark;
        return this;
    }

    public Character getSubject1Attendance() {
        return subject1Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject1Attendance(Character subject1Attendance) {
        this.subject1Attendance = subject1Attendance;
        return this;

    }

    public String getSubject1Result() {
        return subject1Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject1Result(String subject1Result) {
        this.subject1Result = subject1Result;
        return this;
    }

    public Integer getSubject2IntMark() {
        return subject2IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject2IntMark(Integer subject2IntMark) {
        this.subject2IntMark = subject2IntMark;
        return this;
    }

    public Integer getSubject2ExtMark() {
        return subject2ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject2ExtMark(Integer subject2ExtMark) {
        this.subject2ExtMark = subject2ExtMark;
        return this;
    }

    public Integer getSubject2TotMark() {
        return subject2TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject2TotMark(Integer subject2TotMark) {
        this.subject2TotMark = subject2TotMark;
        return this;
    }

    public Character getSubject2Attendance() {
        return subject2Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject2Attendance(Character subject2Attendance) {
        this.subject2Attendance = subject2Attendance;
        return this;
    }

    public String getSubject2Result() {
        return subject2Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject2Result(String subject2Result) {
        this.subject2Result = subject2Result;
        return this;
    }

    public Integer getSubject3IntMark() {
        return subject3IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject3IntMark(Integer subject3IntMark) {
        this.subject3IntMark = subject3IntMark;
        return this;
    }

    public Integer getSubject3ExtMark() {
        return subject3ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject3ExtMark(Integer subject3ExtMark) {
        this.subject3ExtMark = subject3ExtMark;
        return this;
    }

    public Integer getSubject3TotMark() {
        return subject3TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject3TotMark(Integer subject3TotMark) {
        this.subject3TotMark = subject3TotMark;
        return this;
    }

    public Character getSubject3Attendance() {
        return subject3Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject3Attendance(Character subject3Attendance) {
        this.subject3Attendance = subject3Attendance;
        return this;
    }

    public String getSubject3Result() {
        return subject3Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject3Result(String subject3Result) {
        this.subject3Result = subject3Result;
        return this;
    }

    public Integer getSubject4IntMark() {
        return subject4IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject4IntMark(Integer subject4IntMark) {
        this.subject4IntMark = subject4IntMark;
        return this;
    }

    public Integer getSubject4ExtMark() {
        return subject4ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject4ExtMark(Integer subject4ExtMark) {
        this.subject4ExtMark = subject4ExtMark;
        return this;
    }

    public Integer getSubject4TotMark() {
        return subject4TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject4TotMark(Integer subject4TotMark) {
        this.subject4TotMark = subject4TotMark;
        return this;
    }

    public Character getSubject4Attendance() {
        return subject4Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject4Attendance(Character subject4Attendance) {
        this.subject4Attendance = subject4Attendance;
        return this;
    }

    public String getSubject4Result() {
        return subject4Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject4Result(String subject4Result) {
        this.subject4Result = subject4Result;
        return this;
    }

    public Integer getSubject5IntMark() {
        return subject5IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject5IntMark(Integer subject5IntMark) {
        this.subject5IntMark = subject5IntMark;
        return this;
    }

    public Integer getSubject5ExtMark() {
        return subject5ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject5ExtMark(Integer subject5ExtMark) {
        this.subject5ExtMark = subject5ExtMark;
        return this;
    }

    public Integer getSubject5TotMark() {
        return subject5TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject5TotMark(Integer subject5TotMark) {
        this.subject5TotMark = subject5TotMark;
        return this;
    }

    public Character getSubject5Attendance() {
        return subject5Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject5Attendance(Character subject5Attendance) {
        this.subject5Attendance = subject5Attendance;
        return this;
    }

    public String getSubject5Result() {
        return subject5Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject5Result(String subject5Result) {
        this.subject5Result = subject5Result;
        return this;
    }

    public Integer getSubject6IntMark() {
        return subject6IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject6IntMark(Integer subject6IntMark) {
        this.subject6IntMark = subject6IntMark;
        return this;
    }

    public Integer getSubject6ExtMark() {
        return subject6ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject6ExtMark(Integer subject6ExtMark) {
        this.subject6ExtMark = subject6ExtMark;
        return this;
    }

    public Integer getSubject6TotMark() {
        return subject6TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject6TotMark(Integer subject6TotMark) {
        this.subject6TotMark = subject6TotMark;
        return this;
    }

    public Character getSubject6Attendance() {
        return subject6Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject6Attendance(Character subject6Attendance) {
        this.subject6Attendance = subject6Attendance;
        return this;
    }

    public String getSubject6Result() {
        return subject6Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject6Result(String subject6Result) {
        this.subject6Result = subject6Result;
        return this;
    }

    public Integer getSubject7IntMark() {
        return subject7IntMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject7IntMark(Integer subject7IntMark) {
        this.subject7IntMark = subject7IntMark;
        return this;
    }

    public Integer getSubject7ExtMark() {
        return subject7ExtMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject7ExtMark(Integer subject7ExtMark) {
        this.subject7ExtMark = subject7ExtMark;
        return this;
    }

    public Integer getSubject7TotMark() {
        return subject7TotMark;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject7TotMark(Integer subject7TotMark) {
        this.subject7TotMark = subject7TotMark;
        return this;
    }

    public Character getSubject7Attendance() {
        return subject7Attendance;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject7Attendance(Character subject7Attendance) {
        this.subject7Attendance = subject7Attendance;
        return this;
    }

    public String getSubject7Result() {
        return subject7Result;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setSubject7Result(String subject7Result) {
        this.subject7Result = subject7Result;
        return this;
    }

    public String getOverallResult() {
        return OverallResult;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setOverallResult(String overallResult) {
        OverallResult = overallResult;
        return this;
    }

    public Integer getRank() {
        return rank;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    public String getMonthandyearofexam() {
        return monthandyearofexam;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setMonthandyearofexam(String monthandyearofexam) {
        this.monthandyearofexam = monthandyearofexam;
        return this;
    }

    public StudentBaseInformation getStudent_base_regno() {
        return student_base_regno;
    }

    public DiplomaBranchSem4BoardExamTimeTableDetail setStudent_base_regno(StudentBaseInformation student_base_regno) {
        this.student_base_regno = student_base_regno;
        return this;
    }

}
