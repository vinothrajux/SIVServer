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


    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public Long getAdmissionFees() {
        return admissionfees;
    }
    public void setAdmissionFees(Long admissionfees) {
        this.admissionfees = admissionfees;
    }

    public Long getTuitionFees() {
        return tuitionfees;
    }
    public void setTuitionFees(Long tuitionfees) {
        this.tuitionfees = tuitionfees;
    }

    public Long getTransportFees() {
        return transportFees;
    }
    public void setTransportFees(Long transportFees) {
        this.transportFees = transportFees;
    }

    public Long getHostelFees() {
        return hostelfees;
    }
    public void setHostelFees(Long hostelfees) {
        this.hostelfees = hostelfees;
    }


    public Long getFoodFees() {
        return foodfees;
    }
    public void setFoodFees(Long foodfees) {
        this.foodfees = foodfees;
    }


    public Long getTextBookStationaryFees() {
        return textbookstationaryfees;
    }
    public void setTextBookStationaryFees(Long textbookstationaryfees) {
        this.textbookstationaryfees = textbookstationaryfees;
    }

    public Long getMiscellaneousFees() {
        return miscellaneousfees;
    }
    public void setMiscellaneousFees(Long miscellaneousfees) {
        this.miscellaneousfees = miscellaneousfees;
    }

    public Long getSpecialFees() {
        return specialfees;
    }
    public void setSpecialFees(Long specialfees) {
        this.specialfees = specialfees;
    }

    public Long getPenaltyFees() {
        return penaltyfees;
    }
    public void setPenaltyFees(Long penaltyfees) {
        this.penaltyfees = penaltyfees;
    }

    public Long getPreviouBalanceFees() {
        return previousbalancefees;
    }
    public void setPreviousBalanceFees(Long previousbalancefees) {
        this.previousbalancefees = previousbalancefees;
    }

    public Long getGroupInsuranceFees() {return groupinsurancefees; }
    public void setGroupInsuranceFees(Long groupinsurancefees) {this.groupinsurancefees = groupinsurancefees; }

    public Long getOthersFees() {return othersfees; }
    public void setOthersFees(Long othersfees) {this.othersfees = othersfees; }

    public Long getTotalFees() {return totalfees; }
    public void setTotalFees(Long totalfees) {this.totalfees = totalfees; }

    public String getAcademicYear() {return academicyear; }
    public void setAcademicYear(String academicyear) {this.academicyear = academicyear; }

    public String getLoginUser() {return loginuser; }
    public void setLoginUser(String loginuser) {this.loginuser = loginuser; }

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
