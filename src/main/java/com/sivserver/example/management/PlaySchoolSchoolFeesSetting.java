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

    private Date fees_setting_date;

    @Id
    Management_Playschool_Fees_Compound_Key management_Playschool_Fees_Compound_Key;

    private Long admissionfees;

    private Date admissionfees_due_date;

    private Long term1fees;

    private Date term1fees_due_date;

    private Long term2fees;

    private Date term2fees_due_date;

    private Long grandtotalfees;

    private String loginuser;

    public PlaySchoolSchoolFeesSetting() {
    }

    public Date getFees_setting_date() {
        return fees_setting_date;
    }

    public void setFees_setting_date(Date fees_setting_date) {
        this.fees_setting_date = fees_setting_date;
    }

    public Management_Playschool_Fees_Compound_Key getManagement_Playschool_Fees_Compound_Key() {
        return management_Playschool_Fees_Compound_Key;
    }

    public void setManagement_Playschool_Fees_Compound_Key(Management_Playschool_Fees_Compound_Key management_Playschool_Fees_Compound_Key) {
        this.management_Playschool_Fees_Compound_Key = management_Playschool_Fees_Compound_Key;
    }

    public Long getAdmissionfees() {
        return admissionfees;
    }

    public void setAdmissionfees(Long admissionfees) {
        this.admissionfees = admissionfees;
    }

    public Date getAdmissionfees_due_date() {
        return admissionfees_due_date;
    }

    public void setAdmissionfees_due_date(Date admissionfees_due_date) {
        this.admissionfees_due_date = admissionfees_due_date;
    }

    public Long getTerm1fees() {
        return term1fees;
    }

    public void setTerm1fees(Long term1fees) {
        this.term1fees = term1fees;
    }

    public Date getTerm1fees_due_date() {
        return term1fees_due_date;
    }

    public void setTerm1fees_due_date(Date term1fees_due_date) {
        this.term1fees_due_date = term1fees_due_date;
    }

    public Long getTerm2fees() {
        return term2fees;
    }

    public void setTerm2fees(Long term2fees) {
        this.term2fees = term2fees;
    }

    public Date getTerm2fees_due_date() {
        return term2fees_due_date;
    }

    public void setTerm2fees_due_date(Date term2fees_due_date) {
        this.term2fees_due_date = term2fees_due_date;
    }

    public Long getGrandtotalfees() {
        return grandtotalfees;
    }

    public void setGrandtotalfees(Long grandtotalfees) {
        this.grandtotalfees = grandtotalfees;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
