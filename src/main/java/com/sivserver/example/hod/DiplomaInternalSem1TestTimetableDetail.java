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
    public String getTestid(){
        return testid;
    }
    public void setTestid(String testid) {
        this.testid = testid;
    }

    public String getRegno(){
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

    public Integer getSubject1mark() {
        return subject1mark;
    }
    public void setgetSubject1mark(Integer subject1mark) {
        this.subject1mark = subject1mark;
    }

    public Character getSubject1attendance() {
        return subject1attendance;
    }
    public void setSubject1attendance(Character subject1attendance) {
        this.subject1attendance = subject1attendance;
    }

    public String getSubject1result() {
        return subject1result;
    }
    public void setSubject1result(String subject1result) {
        this.subject1result = subject1result;
    }

    public Integer getSubject2mark() {
        return subject2mark;
    }
    public void setgetSubject2mark(Integer subject2mark) {
        this.subject2mark = subject2mark;
    }

    public Character getSubject2attendance() {
        return subject2attendance;
    }
    public void setSubject2attendance(Character subject2attendance) {
        this.subject2attendance = subject2attendance;
    }

    public String getSubject2result() {
        return subject2result;
    }
    public void setSubject2result(String subject2result) {
        this.subject2result = subject2result;
    }

    public Integer getSubject3mark() {
        return subject3mark;
    }
    public void setgetSubject3mark(Integer subject3mark) {
        this.subject3mark = subject3mark;
    }

    public Character getSubject3attendance() {
        return subject3attendance;
    }
    public void setSubject3attendance(Character subject3attendance) {
        this.subject3attendance = subject3attendance;
    }

    public String getSubject3result() {
        return subject3result;
    }
    public void setSubject3result(String subject3result) {
        this.subject3result = subject3result;
    }

    public Integer getSubject4mark() {
        return subject4mark;
    }
    public void setgetSubject4mark(Integer subject4mark) {
        this.subject4mark = subject4mark;
    }

    public Character getSubject4attendance() {
        return subject4attendance;
    }
    public void setSubject4attendance(Character subject4attendance) {
        this.subject4attendance = subject4attendance;
    }

    public String getSubject4result() {
        return subject4result;
    }
    public void setSubject4result(String subject4result) {
        this.subject4result = subject4result;
    }

    public Integer getSubject5mark() {
        return subject5mark;
    }
    public void setgetSubject5mark(Integer subject5mark) {
        this.subject5mark = subject5mark;
    }

    public Character getSubject5attendance() {
        return subject5attendance;
    }
    public void setSubject5attendance(Character subject5attendance) {
        this.subject5attendance = subject5attendance;
    }

    public String getSubject5result() {
        return subject5result;
    }
    public void setSubject5result(String subject5result) {
        this.subject5result = subject5result;
    }

    public String getOverallresult() {
        return Overallresult;
    }
    public void setOverallresult(String Overallresult) {
        this.Overallresult = Overallresult;
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
    private Integer subject1mark;

    @NotNull
    private Character subject1attendance;

    @NotNull
    private String subject1result;

    @NotNull
    private Integer subject2mark;

    @NotNull
    private Character subject2attendance;

    @NotNull
    private String subject2result;

    @NotNull
    private Integer subject3mark;

    @NotNull
    private Character subject3attendance;

    @NotNull
    private String subject3result;

    @NotNull
    private Integer subject4mark;

    @NotNull
    private Character subject4attendance;

    @NotNull
    private String subject4result;

    @NotNull
    private Integer subject5mark;

    @NotNull
    private Character subject5attendance;

    @NotNull
    private String subject5result;

    @NotNull
    private String Overallresult;

    @NotNull
    private Integer rank;

}
