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

    private Long admissionfees;

    private Date admissionfeesduedate;

    private Long materialkitfees;

    private Long activityfees;

    private Long tuitionfees;

    private Long totalfees;

    private Long installment1fees;

    private Long installment2fees;

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

    public Long getAdmissionfees() {
        return admissionfees;
    }

    public void setAdmissionfees(Long admissionfees) {
        this.admissionfees = admissionfees;
    }

    public Date getAdmissionfeesduedate() {
        return admissionfeesduedate;
    }

    public void setAdmissionfeesduedate(Date admissionfeesduedate) {
        this.admissionfeesduedate = admissionfeesduedate;
    }

    public Long getMaterialkitfees() {
        return materialkitfees;
    }

    public void setMaterialkitfees(Long materialkitfees) {
        this.materialkitfees = materialkitfees;
    }

    public Long getActivityfees() {
        return activityfees;
    }

    public void setActivityfees(Long activityfees) {
        this.activityfees = activityfees;
    }

    public Long getTuitionfees() {
        return tuitionfees;
    }

    public void setTuitionfees(Long tuitionfees) {
        this.tuitionfees = tuitionfees;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public Long getInstallment1fees() {
        return installment1fees;
    }

    public void setInstallment1fees(Long installment1fees) {
        this.installment1fees = installment1fees;
    }

    public Long getInstallment2fees() {
        return installment2fees;
    }

    public void setInstallment2fees(Long installment2fees) {
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
