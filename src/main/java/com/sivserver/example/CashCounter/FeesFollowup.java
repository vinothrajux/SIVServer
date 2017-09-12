package com.sivserver.example.CashCounter;

import com.sivserver.example.student.StudentBaseInformation;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 30-Jun-17.
 */

@Entity
@Table(name = "feesfollowup")
public class FeesFollowup {

    private Date currentdate;

    @Id
    private String regno;

    private String admissionno;

    private String branchcode;

    private String batch;

    private String semester;

    private String academicyear;

    private Date lastpaymtdate;

    private Long lastpaymtamount;

    private Long balance;

    private Date duedate;

    private String remarks;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_regno",nullable=false,referencedColumnName = "regno")
    private Current_Academic_Student_Actual_Fees current_Academic_Student_Actual_Fees_regno;


    public FeesFollowup() {
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public FeesFollowup setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
        return this;
    }

    public String getRegno() {
        return regno;
    }

    public FeesFollowup setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public FeesFollowup setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public FeesFollowup setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public String getBatch() {
        return batch;
    }

    public FeesFollowup setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public String getSemester() {
        return semester;
    }

    public FeesFollowup setSemester(String semester) {
        this.semester = semester;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public FeesFollowup setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public Date getLastpaymtdate() {
        return lastpaymtdate;
    }

    public FeesFollowup setLastpaymtdate(Date lastpaymtdate) {
        this.lastpaymtdate = lastpaymtdate;
        return this;
    }

    public Long getLastpaymtamount() {
        return lastpaymtamount;
    }

    public FeesFollowup setLastpaymtamount(Long lastpaymtamount) {
        this.lastpaymtamount = lastpaymtamount;
        return this;
    }

    public Long getBalance() {
        return balance;
    }

    public FeesFollowup setBalance(Long balance) {
        this.balance = balance;
        return this;
    }

    public Date getDuedate() {
        return duedate;
    }

    public FeesFollowup setDuedate(Date duedate) {
        this.duedate = duedate;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public FeesFollowup setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public FeesFollowup setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public Current_Academic_Student_Actual_Fees getCurrent_Academic_Student_Actual_Fees_regno() {
        return current_Academic_Student_Actual_Fees_regno;
    }

    public FeesFollowup setCurrent_Academic_Student_Actual_Fees_regno(Current_Academic_Student_Actual_Fees current_Academic_Student_Actual_Fees_regno) {
        this.current_Academic_Student_Actual_Fees_regno = current_Academic_Student_Actual_Fees_regno;
        return this;
    }
}
