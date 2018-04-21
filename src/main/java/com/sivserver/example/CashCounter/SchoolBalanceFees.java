package com.sivserver.example.CashCounter;

import com.sivserver.example.student.SchoolStudentPersonalInformation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
@Entity
@Table(name="schoolbalancefees")
public class SchoolBalanceFees {

    @Id
    @Column(name="registernumber")
    private String registernumber;

    private String instituteregisternumber;

    private Double facilityfees;

    private Date facilityfeesduedate;

    private Double booksnotebookfees;

    private Date booksnotebookfeesduedate;

    private Double othersfees;

    private Date othersfeesduedate;

    private Double tuitionfeesmonthly;

    private Date tuitionfeesmonthlyduedate;

    private Double tuitionfeestermly;

    private Date tuitionfeestermlyduedate;

    private Double totalfees;

    private String tuitionfeesmethod;

    private String academicyear;

    private String loginuser;

    private Integer instituteid;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private SchoolStudentPersonalInformation school_student_personal_regno;

    public SchoolBalanceFees() {
    }

    public SchoolBalanceFees(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public SchoolBalanceFees setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getInstituteregisternumber() {
        return instituteregisternumber;
    }

    public SchoolBalanceFees setInstituteregisternumber(String instituteregisternumber) {
        this.instituteregisternumber = instituteregisternumber;
        return this;
    }

    public Double getFacilityfees() {
        return facilityfees;
    }

    public SchoolBalanceFees setFacilityfees(Double facilityfees) {
        this.facilityfees = facilityfees;
        return this;
    }

    public Date getFacilityfeesduedate() {
        return facilityfeesduedate;
    }

    public SchoolBalanceFees setFacilityfeesduedate(Date facilityfeesduedate) {
        this.facilityfeesduedate = facilityfeesduedate;
        return this;
    }

    public Double getBooksnotebookfees() {
        return booksnotebookfees;
    }

    public SchoolBalanceFees setBooksnotebookfees(Double booksnotebookfees) {
        this.booksnotebookfees = booksnotebookfees;
        return this;
    }

    public Date getBooksnotebookfeesduedate() {
        return booksnotebookfeesduedate;
    }

    public SchoolBalanceFees setBooksnotebookfeesduedate(Date booksnotebookfeesduedate) {
        this.booksnotebookfeesduedate = booksnotebookfeesduedate;
        return this;

    }

    public Double getOthersfees() {
        return othersfees;
    }

    public SchoolBalanceFees setOthersfees(Double othersfees) {
        this.othersfees = othersfees;
        return this;
    }

    public Date getOthersfeesduedate() {
        return othersfeesduedate;
    }

    public SchoolBalanceFees setOthersfeesduedate(Date othersfeesduedate) {
        this.othersfeesduedate = othersfeesduedate;
        return this;
    }

    public Double getTuitionfeesmonthly() {
        return tuitionfeesmonthly;
    }

    public SchoolBalanceFees setTuitionfeesmonthly(Double tuitionfeesmonthly) {
        this.tuitionfeesmonthly = tuitionfeesmonthly;
        return this;
    }

    public Date getTuitionfeesmonthlyduedate() {
        return tuitionfeesmonthlyduedate;
    }

    public SchoolBalanceFees setTuitionfeesmonthlyduedate(Date tuitionfeesmonthlyduedate) {
        this.tuitionfeesmonthlyduedate = tuitionfeesmonthlyduedate;
        return this;
    }

    public Double getTuitionfeestermly() {
        return tuitionfeestermly;
    }

    public SchoolBalanceFees setTuitionfeestermly(Double tuitionfeestermly) {
        this.tuitionfeestermly = tuitionfeestermly;
        return this;
    }

    public Date getTuitionfeestermlyduedate() {
        return tuitionfeestermlyduedate;
    }

    public SchoolBalanceFees setTuitionfeestermlyduedate(Date tuitionfeestermlyduedate) {
        this.tuitionfeestermlyduedate = tuitionfeestermlyduedate;
        return this;
    }

    public Double getTotalfees() {
        return totalfees;
    }

    public SchoolBalanceFees setTotalfees(Double totalfees) {
        this.totalfees = totalfees;
        return this;
    }

    public String getTuitionfeesmethod() {
        return tuitionfeesmethod;
    }

    public SchoolBalanceFees setTuitionfeesmethod(String tuitionfeesmethod) {
        this.tuitionfeesmethod = tuitionfeesmethod;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public SchoolBalanceFees setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public SchoolBalanceFees setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public SchoolBalanceFees setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

    public SchoolStudentPersonalInformation getSchool_student_personal_regno() {
        return school_student_personal_regno;
    }

    public SchoolBalanceFees setSchool_student_personal_regno(SchoolStudentPersonalInformation school_student_personal_regno) {
        this.school_student_personal_regno = school_student_personal_regno;
        return this;
    }

}
