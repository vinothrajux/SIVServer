package com.sivserver.example.CashCounter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "feesentrybase")
public class AllFeesEntryBase {

    @Id
    Cash_Counter_Compound_Key cash_Counter_Compound_Key;

    private String admissionno;

    private String branchcode;

    private String batch;

    private String semester;

    private Long admissionfees;

    private Long tuitionfees;

    private Long transportFees;

    private Long hostelfees;

    private Long foodfees;

    private Long textbookstationaryfees;

    private Long miscellaneousfees;

    private Long specialfees;

    private Long penaltyfees;

    private Long previousbalancefees;

    private Long groupinsurancefees;

    private Long othersfees;

    private Long totalfees;

    private String loginuser;

    public AllFeesEntryBase() {
    }

    public Cash_Counter_Compound_Key getCash_Counter_Compound_Key() {
        return cash_Counter_Compound_Key;
    }

    public void setCash_Counter_Compound_Key(Cash_Counter_Compound_Key cash_Counter_Compound_Key) {
        this.cash_Counter_Compound_Key = cash_Counter_Compound_Key;
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

    public String getAdmissionno() {
        return admissionno;
    }

    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public Long getAdmissionfees() {
        return admissionfees;
    }

    public void setAdmissionfees(Long admissionfees) {
        this.admissionfees = admissionfees;
    }

    public Long getTuitionfees() {
        return tuitionfees;
    }

    public void setTuitionfees(Long tuitionfees) {
        this.tuitionfees = tuitionfees;
    }

    public Long getTransportFees() {
        return transportFees;
    }

    public void setTransportFees(Long transportFees) {
        this.transportFees = transportFees;
    }

    public Long getHostelfees() {
        return hostelfees;
    }

    public void setHostelfees(Long hostelfees) {
        this.hostelfees = hostelfees;
    }

    public Long getFoodfees() {
        return foodfees;
    }

    public void setFoodfees(Long foodfees) {
        this.foodfees = foodfees;
    }

    public Long getTextbookstationaryfees() {
        return textbookstationaryfees;
    }

    public void setTextbookstationaryfees(Long textbookstationaryfees) {
        this.textbookstationaryfees = textbookstationaryfees;
    }

    public Long getMiscellaneousfees() {
        return miscellaneousfees;
    }

    public void setMiscellaneousfees(Long miscellaneousfees) {
        this.miscellaneousfees = miscellaneousfees;
    }

    public Long getSpecialfees() {
        return specialfees;
    }

    public void setSpecialfees(Long specialfees) {
        this.specialfees = specialfees;
    }

    public Long getPenaltyfees() {
        return penaltyfees;
    }

    public void setPenaltyfees(Long penaltyfees) {
        this.penaltyfees = penaltyfees;
    }

    public Long getPreviousbalancefees() {
        return previousbalancefees;
    }

    public void setPreviousbalancefees(Long previousbalancefees) {
        this.previousbalancefees = previousbalancefees;
    }

    public Long getGroupinsurancefees() {
        return groupinsurancefees;
    }

    public void setGroupinsurancefees(Long groupinsurancefees) {
        this.groupinsurancefees = groupinsurancefees;
    }

    public Long getOthersfees() {
        return othersfees;
    }

    public void setOthersfees(Long othersfees) {
        this.othersfees = othersfees;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
