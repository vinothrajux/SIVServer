package com.sivserver.example.hod;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "studentremarksentry")

public class StudentRemarksEntry {

    @Id
    @Column(name="remarkid")
    private String remarkid;

    @Column(name="regno")
    private String regno;


    private String branchcode;


    private String batch;


    private Integer semester;


    private String academicyear;


    private String remarks;


    private String primaryaction;


    private Date remarkdate;


    private String remarkday;


    private String loginuser;

    @OneToMany
    @JoinColumn(name="remarkid",referencedColumnName = "remarkid")
    private List<StudentRemarksAction> StudentRemarksAction_remarkid;


    public StudentRemarksEntry() {
    }

    public StudentRemarksEntry(String remarkid) {
        this.remarkid = remarkid;
    }

    public String getRemarkid() {
        return remarkid;
    }

    public void setRemarkid(String remarkid) {
        this.remarkid = remarkid;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPrimaryaction() {
        return primaryaction;
    }

    public void setPrimaryaction(String primaryaction) {
        this.primaryaction = primaryaction;
    }

    public Date getRemarkdate() {
        return remarkdate;
    }

    public void setRemarkdate(Date remarkdate) {
        this.remarkdate = remarkdate;
    }

    public String getRemarkday() {
        return remarkday;
    }

    public void setRemarkday(String remarkday) {
        this.remarkday = remarkday;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<StudentRemarksAction> getStudentRemarksAction_remarkid() {
        return StudentRemarksAction_remarkid;
    }

    public void setStudentRemarksAction_remarkid(List<StudentRemarksAction> studentRemarksAction_remarkid) {
        StudentRemarksAction_remarkid = studentRemarksAction_remarkid;
    }
}
