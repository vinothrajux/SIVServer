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

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {this.currentdate = currentdate;}


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

    public String getBranchname() {
        return branchname;
    }
    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }


    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }


    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Date getLastpaymentdate() {
        return lastpaymtdate;
    }
    public void setLastpaymentdate(Date lastpaymtdate) {
        this.lastpaymtdate = lastpaymtdate;
    }

    public Long getLastpaymentamount() {
        return lastpaymtamount;
    }
    public void setLastpaymentamount(Long lastpaymtamount) {
        this.lastpaymtamount = lastpaymtamount;
    }

    public Date getDuedate() {
        return duedate;
    }
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {return loginuser; }
    public void setLoginuser(String loginuser) {this.loginuser = loginuser; }



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
