package com.sivserver.example.CashCounter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 30-Jun-17.
 */

@Entity
@Table(name = "feesfollowup")
public class FeesFollowup {

    public Date getCurrentDate(){
        return currentdate;
    }
    public void setCurrentDate(Date currentdate) {this.currentdate = currentdate;}


    public String getRegNo() {
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }


    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }


    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Date getLastPaymentDate() {
        return lastpaymtdate;
    }
    public void setLastPaymentDate(Date lastpaymtdate) {
        this.lastpaymtdate = lastpaymtdate;
    }

    public Long getLastPaymentAmount() {
        return lastpaymtamount;
    }
    public void setLastPaymentAmount(Long lastpaymtamount) {
        this.lastpaymtamount = lastpaymtamount;
    }

    public Date getDueDate() {
        return duedate;
    }
    public void setDueDate(Date duedate) {
        this.duedate = duedate;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginUser() {return loginuser; }
    public void setLoginUser(String loginuser) {this.loginuser = loginuser; }



    @NotNull
    private Date currentdate;


    @Id
    private String regno;


    @NotNull
    private String admissionno;

    @NotNull
    private String name;

    @NotNull
    private String semester;


    @NotNull
    private String branchname;


    @NotNull
    private String branchcode;


    @NotNull
    private String academicyear;

    @NotNull
    private Date lastpaymtdate;

    @NotNull
    private Long lastpaymtamount;

    @NotNull
    private Date duedate;

    @NotNull
    private String remarks;


    @NotNull
    private String loginuser;

}
