package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.print.attribute.Integer;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 30-Jun-17.
 */
@Entity
@Table(name = "staffleaveletterentry")

public class StaffLeaveLetterEntry {


    public Date getCurrentDate(){
        return currentdate;
    }
    public void setCurrentDate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getStaffID() {
        return staffid;
    }
    public void setStaffID(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffName() {
        return staffname;
    }
    public void setStaffName(String staffname) {
        this.staffname = staffname;
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

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTypeOfLeave() {
        return typeofleave;
    }
    public void setTypeOfLeave(String typeofleave) {this.typeofleave = typeofleave;}

    public Integer getNoOfDays() {return noofdays;}
    public void setNoOfDays(Integer noofdays) {
        this.noofdays = noofdays;
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

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }



    @NotNull
    private Date currentdate;

    @Id
    private String staffid;

    @NotNull
    private String staffname;

    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @NotNull
    private String designation;

    @NotNull
    private String typeofleave;

    @NotNull
    private Integer noofdays;

    @NotNull
    private Date fromdate;

    @NotNull
    private Date todate;

    @NotNull
    private String reason;

    @NotNull
    private String loginuser;

}



