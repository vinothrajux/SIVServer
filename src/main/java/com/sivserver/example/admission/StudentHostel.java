package com.sivserver.example.admission;

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
@Table(name = "studenthostel")
public class StudentHostel {


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

    public String getAcadyear() {
        return academicYear;
    }
    public void setAcadyear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getOptedfacility() {
        return optdFacility;
    }
    public void setOptedfacility(String optdFacility) {
        this.optdFacility = optdFacility;
    }

    public String getFoodtype() {
        return foodtype;
    }
    public void setFoodtype(String foodtype) {
        this.foodtype = foodtype;
    }

    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
    private String optdFacility;

    @NotNull
    private String foodtype;

    @NotNull
    private Long amount;

    @NotNull
    private String loginuser;
}
