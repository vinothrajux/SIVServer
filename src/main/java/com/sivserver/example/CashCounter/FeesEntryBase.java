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
public class FeesEntryBase {
    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {this.regno = regno;}


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

    public Long getTransportfees() {
        return transportFees;
    }
    public void setTransportfees(Long transportFees) {this.transportFees = transportFees;}

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
    public void setTextbookstationaryfees(Long textbookstationaryfees) {this.textbookstationaryfees = textbookstationaryfees;}

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

    public Long getPrevioubalancefees() {
        return previousbalancefees;
    }
    public void setPreviousbalancefees(Long previousbalancefees) {
        this.previousbalancefees = previousbalancefees;
    }

    public Long getGroupinsurancefees() {return groupinsurancefees; }
    public void setGroupinsurancefees(Long groupinsurancefees) {this.groupinsurancefees = groupinsurancefees; }

    public Long getOthersfees() {return othersfees; }
    public void setOthersfees(Long othersfees) {this.othersfees = othersfees; }

    public Long getTotalfees() {return totalfees; }
    public void setTotalfees(Long totalfees) {this.totalfees = totalfees; }

    public String getAcademicyear() {return academicyear; }
    public void setAcademicyear(String academicyear) {this.academicyear = academicyear; }

    public String getLoginuser() {return loginuser; }
    public void setLoginuser(String loginuser) {this.loginuser = loginuser; }

    @Id
    private String regno;


    @NotNull
    private String admissionno;

    @NotNull
    private Long admissionfees;

    @NotNull
    private Long tuitionfees;


    @NotNull
    private Long transportFees;


    @NotNull
    private Long hostelfees;


    @NotNull
    private Long foodfees;

    @NotNull
    private Long textbookstationaryfees;

    @NotNull
    private Long miscellaneousfees;

    @NotNull
    private Long specialfees;

    @NotNull
    private Long penaltyfees;


    @NotNull
    private Long previousbalancefees;

    @NotNull
    private Long groupinsurancefees;

    @NotNull
    private Long othersfees;

    @NotNull
    private Long totalfees;

    @NotNull
    private String academicyear;

    @NotNull
    private String loginuser;

}
