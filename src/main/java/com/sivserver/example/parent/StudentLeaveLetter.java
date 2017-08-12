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
    public Date getLeaveentrydate(){
        return entrydate;
    }
    public void setLeaveentrydate(Date entrydate) {
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

    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getAcadyear() {
        return academicYear;
    }
    public void setAcadyear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Date getFromdate() {
        return fromdate;
    }
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }
    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Integer getNoofdays() {
        return noofdays;
    }
    public void setNoofdays(Integer noofdays) {
        this.noofdays = noofdays;
    }

    public String getLeavereason() {
        return leavereason;
    }
    public void setLeavereason(String leavereason) {
        this.leavereason = leavereason;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
