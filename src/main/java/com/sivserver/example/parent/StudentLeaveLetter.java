package com.sivserver.example.parent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 29/06/2017.
 */
@Entity
@Table(name = "studentleaveletter")
public class StudentLeaveLetter {
    public Date getLeaveEntryDate(){
        return entrydate;
    }
    public void setLeaveEntryDate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getAcadYear() {
        return academicYear;
    }
    public void setAcadYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Date getFromDate() {
        return fromdate;
    }
    public void setFromDate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getToDate() {
        return todate;
    }
    public void setToDate(Date todate) {
        this.todate = todate;
    }

    public Integer getNoofDays() {
        return noofdays;
    }
    public void setNoofDays(Integer noofdays) {
        this.noofdays = noofdays;
    }

    public String getLeavReason() {
        return leavereason;
    }
    public void setLeaveReason(String leavereason) {
        this.leavereason = leavereason;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date entrydate;

    @Id
    private String regno;

    @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private Date fromdate;

    @NotNull
    private Date todate;

    @NotNull
    private Integer noofdays;

    @NotNull
    private String leavereason;

    @NotNull
    private String loginuser;

}
