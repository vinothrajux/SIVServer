package com.sivserver.example.CashCounter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 12/09/2017.
 */
@Entity
@Table(name = "allfeesbalance")
public class AllFeesBalance {
    @Id
    Cash_Counter_Compound_Key allFeesBalance_Compound_Key;

    private String branchcode;

    private String batch;

    private String semester;

    private Long admissionfeesbalance;

    private Long tuitionfeesbalance;

    private Long transportFeesbalance;

    private Long hostelfeesbalance;

    private Long foodfeesbalance;

    private Long textbookstationaryfeesbalance;

    private Long miscellaneousfeesbalance;

    private Long specialfeesbalance;

    private Long penaltyfeesbalance;

    private Long previousbalancefeesbalance;

    private Long groupinsurancefeesbalance;

    private Long othersfeesbalance;

    private Long totalfeesbalance;

    private String loginuser;

    public AllFeesBalance() {
    }

    public Cash_Counter_Compound_Key getAllFeesBalance_Compound_Key() {
        return allFeesBalance_Compound_Key;
    }

    public void setAllFeesBalance_Compound_Key(Cash_Counter_Compound_Key allFeesBalance_Compound_Key) {
        this.allFeesBalance_Compound_Key = allFeesBalance_Compound_Key;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Long getAdmissionfeesbalance() {
        return admissionfeesbalance;
    }

    public void setAdmissionfeesbalance(Long admissionfeesbalance) {
        this.admissionfeesbalance = admissionfeesbalance;
    }

    public Long getTuitionfeesbalance() {
        return tuitionfeesbalance;
    }

    public void setTuitionfeesbalance(Long tuitionfeesbalance) {
        this.tuitionfeesbalance = tuitionfeesbalance;
    }

    public Long getTransportFeesbalance() {
        return transportFeesbalance;
    }

    public void setTransportFeesbalance(Long transportFeesbalance) {
        this.transportFeesbalance = transportFeesbalance;
    }

    public Long getHostelfeesbalance() {
        return hostelfeesbalance;
    }

    public void setHostelfeesbalance(Long hostelfeesbalance) {
        this.hostelfeesbalance = hostelfeesbalance;
    }

    public Long getFoodfeesbalance() {
        return foodfeesbalance;
    }

    public void setFoodfeesbalance(Long foodfeesbalance) {
        this.foodfeesbalance = foodfeesbalance;
    }

    public Long getTextbookstationaryfeesbalance() {
        return textbookstationaryfeesbalance;
    }

    public void setTextbookstationaryfeesbalance(Long textbookstationaryfeesbalance) {
        this.textbookstationaryfeesbalance = textbookstationaryfeesbalance;
    }

    public Long getMiscellaneousfeesbalance() {
        return miscellaneousfeesbalance;
    }

    public void setMiscellaneousfeesbalance(Long miscellaneousfeesbalance) {
        this.miscellaneousfeesbalance = miscellaneousfeesbalance;
    }

    public Long getSpecialfeesbalance() {
        return specialfeesbalance;
    }

    public void setSpecialfeesbalance(Long specialfeesbalance) {
        this.specialfeesbalance = specialfeesbalance;
    }

    public Long getPenaltyfeesbalance() {
        return penaltyfeesbalance;
    }

    public void setPenaltyfeesbalance(Long penaltyfeesbalance) {
        this.penaltyfeesbalance = penaltyfeesbalance;
    }

    public Long getPreviousbalancefeesbalance() {
        return previousbalancefeesbalance;
    }

    public void setPreviousbalancefeesbalance(Long previousbalancefeesbalance) {
        this.previousbalancefeesbalance = previousbalancefeesbalance;
    }

    public Long getGroupinsurancefeesbalance() {
        return groupinsurancefeesbalance;
    }

    public void setGroupinsurancefeesbalance(Long groupinsurancefeesbalance) {
        this.groupinsurancefeesbalance = groupinsurancefeesbalance;
    }

    public Long getOthersfeesbalance() {
        return othersfeesbalance;
    }

    public void setOthersfeesbalance(Long othersfeesbalance) {
        this.othersfeesbalance = othersfeesbalance;
    }

    public Long getTotalfeesbalance() {
        return totalfeesbalance;
    }

    public void setTotalfeesbalance(Long totalfeesbalance) {
        this.totalfeesbalance = totalfeesbalance;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}

