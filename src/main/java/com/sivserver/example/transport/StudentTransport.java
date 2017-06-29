package com.sivserver.example.transport;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "studenttransport")
public class StudentTransport {


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
        return branchCode;
    }
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
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

    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }

    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }

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
    private String regno;


    @NotNull
    private String branch;

     @NotNull
    private String branchCode;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private String route;

    @NotNull
    private String stage;

    @NotNull
    private Long amount;

    @NotNull
    private String loginuser;

}
