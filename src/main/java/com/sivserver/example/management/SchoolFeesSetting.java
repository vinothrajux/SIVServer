package com.sivserver.example.management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Seetha on 31-Mar-18.
 */
@Entity
@Table(name = "schoolfeessetting")
public class SchoolFeesSetting {
    private Date feessettingdate;

    @Id
    Management_School_Fees_Compound_Key managementschoolfeescompoundkey;

    private Double facilityfees;

    private Double tuitionfeesmonthly;

    private Double tuitionfeestermly;

    private Double booksnotebookfees;

    private Double othersfees;

    private Double totalfees;

    private Date facilityfeesduedate;

    private Date tuitionfeesmonthlyduedate;

    private Date tuitionfeestermlyduedate;

    private Date booksnotebookfeesduedate;

    private Date othersfeesduedate;

    private String loginuser;

    public SchoolFeesSetting() {
    }

    public Date getFeessettingdate() {
        return feessettingdate;
    }

    public void setFeessettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public Management_School_Fees_Compound_Key getManagementschoolfeescompoundkey() {
        return managementschoolfeescompoundkey;
    }

    public void setManagementschoolfeescompoundkey(Management_School_Fees_Compound_Key managementschoolfeescompoundkey) {
        this.managementschoolfeescompoundkey = managementschoolfeescompoundkey;
    }

    public Double getFacilityfees() {
        return facilityfees;
    }

    public void setFacilityfees(Double facilityfees) {
        this.facilityfees = facilityfees;
    }

    public Double getTuitionfeesmonthly() {
        return tuitionfeesmonthly;
    }

    public void setTuitionfeesmonthly(Double tuitionfeesmonthly) {
        this.tuitionfeesmonthly = tuitionfeesmonthly;
    }

    public Double getTuitionfeestermly() {
        return tuitionfeestermly;
    }

    public void setTuitionfeestermly(Double tuitionfeestermly) {
        this.tuitionfeestermly = tuitionfeestermly;
    }

    public Double getBooksnotebookfees() {
        return booksnotebookfees;
    }

    public void setBooksnotebookfees(Double booksnotebookfees) {
        this.booksnotebookfees = booksnotebookfees;
    }

    public Double getOthersfees() {
        return othersfees;
    }

    public void setOthersfees(Double othersfees) {
        this.othersfees = othersfees;
    }

    public Double getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Double totalfees) {
        this.totalfees = totalfees;
    }

    public Date getFacilityfeesduedate() {
        return facilityfeesduedate;
    }

    public void setFacilityfeesduedate(Date facilityfeesduedate) {
        this.facilityfeesduedate = facilityfeesduedate;
    }

    public Date getTuitionfeesmonthlyduedate() {
        return tuitionfeesmonthlyduedate;
    }

    public void setTuitionfeesmonthlyduedate(Date tuitionfeesmonthlyduedate) {
        this.tuitionfeesmonthlyduedate = tuitionfeesmonthlyduedate;
    }

    public Date getTuitionfeestermlyduedate() {
        return tuitionfeestermlyduedate;
    }

    public void setTuitionfeestermlyduedate(Date tuitionfeestermlyduedate) {
        this.tuitionfeestermlyduedate = tuitionfeestermlyduedate;
    }

    public Date getBooksnotebookfeesduedate() {
        return booksnotebookfeesduedate;
    }

    public void setBooksnotebookfeesduedate(Date booksnotebookfeesduedate) {
        this.booksnotebookfeesduedate = booksnotebookfeesduedate;
    }

    public Date getOthersfeesduedate() {
        return othersfeesduedate;
    }

    public void setOthersfeesduedate(Date othersfeesduedate) {
        this.othersfeesduedate = othersfeesduedate;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
