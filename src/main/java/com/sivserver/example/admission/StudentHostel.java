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

    public StudentHostel() {
    }

    public StudentHostel(String regno) {
        this.regno = regno;
    }

    public String getRegno() {
        return regno;
    }

    public StudentHostel setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getBranch() {
        return branch;
    }

    public StudentHostel setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public StudentHostel setBranchCode(String branchCode) {
        this.branchCode = branchCode;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }

    public StudentHostel setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public StudentHostel setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
        return this;
    }

    public String getOptdFacility() {
        return optdFacility;
    }

    public StudentHostel setOptdFacility(String optdFacility) {
        this.optdFacility = optdFacility;
        return this;
    }

    public String getFoodtype() {
        return foodtype;
    }

    public StudentHostel setFoodtype(String foodtype) {
        this.foodtype = foodtype;
        return this;
    }

    public Long getAmount() {
        return amount;
    }

    public StudentHostel setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StudentHostel setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    @Id
    @Column(name="regno")
    private String regno;



    private String branch;


    private String branchCode;


    private Integer semester;


    private String academicYear;


    private String optdFacility;


    private String foodtype;


    private Long amount;


    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_hostel_regno",nullable=false,referencedColumnName = "regno")
    private StudentPersonalInformation student_personal_regno;

}
