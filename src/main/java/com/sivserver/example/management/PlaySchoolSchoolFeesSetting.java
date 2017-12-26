package com.sivserver.example.management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 02/11/2017.
 */
@Entity
@Table(name="playschoolschoolfeessetting")
public class PlaySchoolSchoolFeesSetting {

    private Date feessettingdate;

    @Id
    Management_Playschool_Fees_Compound_Key managementplayschoolfeescompoundkey;

    private Double registrationfees;

    private Double materialkitfees;

    private Double activityfees;

    private Double tuitionfees;

    private Double totalfees;

    private Double installment1fees;

    private Double installment2fees;

    private Date installment1duedate;

    private Date installment2duedate;

    private String loginuser;

    public PlaySchoolSchoolFeesSetting() {
    }

    public Date getFeessettingdate() {
        return feessettingdate;
    }

    public void setFeessettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public Management_Playschool_Fees_Compound_Key getManagementplayschoolfeescompoundkey() {
        return managementplayschoolfeescompoundkey;
    }

    public void setManagementplayschoolfeescompoundkey(Management_Playschool_Fees_Compound_Key managementplayschoolfeescompoundkey) {
        this.managementplayschoolfeescompoundkey = managementplayschoolfeescompoundkey;
    }

    public Double getRegistrationfees() {
        return registrationfees;
    }

    public void setRegistrationfees(Double registrationfees) {
        this.registrationfees = registrationfees;
    }

    public Double getMaterialkitfees() {
        return materialkitfees;
    }

    public void setMaterialkitfees(Double materialkitfees) {
        this.materialkitfees = materialkitfees;
    }

    public Double getActivityfees() {
        return activityfees;
    }

    public void setActivityfees(Double activityfees) {
        this.activityfees = activityfees;
    }

    public Double getTuitionfees() {
        return tuitionfees;
    }

    public void setTuitionfees(Double tuitionfees) {
        this.tuitionfees = tuitionfees;
    }

    public Double getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Double totalfees) {
        this.totalfees = totalfees;
    }

    public Double getInstallment1fees() {
        return installment1fees;
    }

    public void setInstallment1fees(Double installment1fees) {
        this.installment1fees = installment1fees;
    }

    public Double getInstallment2fees() {
        return installment2fees;
    }

    public void setInstallment2fees(Double installment2fees) {
        this.installment2fees = installment2fees;
    }

    public Date getInstallment1duedate() {
        return installment1duedate;
    }

    public void setInstallment1duedate(Date installment1duedate) {
        this.installment1duedate = installment1duedate;
    }

    public Date getInstallment2duedate() {
        return installment2duedate;
    }

    public void setInstallment2duedate(Date installment2duedate) {
        this.installment2duedate = installment2duedate;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
