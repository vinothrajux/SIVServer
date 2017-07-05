package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "studentremarksentry")

public class StudentRemarksEntry {
    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }


    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
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

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getRemarks() {return remarks;}
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getPrimaryAction() {
        return primaryaction;
    }
    public void setPrimaryAction(String primaryaction) {
        this.primaryaction = primaryaction;
    }

    public Date getRemarkDate() {
        return remarkdate;
    }
    public void setRemarkDate(Date remarkdate) {
        this.remarkdate = remarkdate;
    }

    public String getRemarkDay() {
        return remarkday;
    }
    public void setRemarkDay(String remarkday) {
        this.remarkday = remarkday;
    }

    public String getLoginUser() {return loginuser;}
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private String regno;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @Id
    private String remarks;

    @NotNull
    private String primaryaction;

    @NotNull
    private Date remarkdate;

    @NotNull
    private String remarkday;

    @NotNull
    private String loginuser;


}
