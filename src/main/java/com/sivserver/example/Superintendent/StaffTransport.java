package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 01-Jul-17.
 */

@Entity
@Table(name = "stafftransport")
public class StaffTransport {

    public String getStaffID(){
        return staffid;
    }
    public void setStaffID(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffName(){return staffname;}
    public void setStaffName(String staffname) {
        this.staffname = staffname;
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

    public String getAcadYear() {
        return academicYear;
    }
    public void setAcadYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getTransportMode() {
        return transportmode;
    }
    public void setTransportMode(String transportmode) {
        this.transportmode = transportmode;
    }


    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }

    public String getRouteNo() {
        return routeno;
    }
    public void setRouteNo(String routeno) {
        this.routeno = routeno;
    }


    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getFacility() {
        return facility;
    }
    public void setFacility(String facility) {this.facility = facility;}


    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private String staffid;


    @NotNull
    private String staffname;

    @NotNull
    private String branch;


    @NotNull
    private String branchcode;

    @NotNull
    private String academicYear;

    @NotNull
    private String designation;


    @NotNull
    private String transportmode;

    @NotNull
    private String route;

    @NotNull
    private String routeno;

    @NotNull
    private String stage;

    @NotNull
    private String facility;

    @NotNull
    private Long amount;

    @NotNull
    private String loginuser;

}
