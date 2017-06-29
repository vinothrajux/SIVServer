package com.sivserver.example.management;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "collegefeessetting")
public class CollegeFeesSetting {

    public Date getFeesSettingDate(){
        return feessettingdate;
    }
    public void setFeesSettingDate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }
    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }
    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Long getAdmissionFees() {
        return admissionfees;
    }
    public void setAdmissionFees(Long admissionfees) {this.admissionfees = admissionfees;}

    public Long getTutionFees() {
        return tutionfees;
    }
    public void setTutionFees(Long tutionfees) {
        this.tutionfees = tutionfees;
    }

    public Long getTextBookFees() {return textbookfees; }
    public void setTextBookFees(Long textbookfees) {this.textbookfees = textbookfees;}

    public Long getMiscalleneousFees() {
        return miscalleneousfees;
    }
    public void setMiscalleneousFees(Long miscalleneousfees) {
        this.miscalleneousfees = miscalleneousfees;
    }

    public Long getSpecialFees() {
        return specialfees;
    }
    public void setSpecialFees(Long specialfees) {
        this.specialfees = specialfees;
    }


    public Long getGroupInsurance() {
        return groupinsurance;
    }
    public void setGroupInsurance(Long groupinsurance) {
        this.groupinsurance = groupinsurance;
    }

    public Long getOthers() {
        return others;
    }
    public void setOthers(Long others) {
        this.others = others;
    }

    public Long getTotalFees() {
        return totalfees;
    }
    public void setTotalFees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private Date feessettingdate;

    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @Id
    private String academicyear;

    @NotNull
    private Long admissionfees;

    @NotNull
    private Long tutionfees;

    @NotNull
    private Long textbookfees;

    @NotNull
    private Long miscalleneousfees;

    @NotNull
    private Long specialfees;

    @NotNull
    private Long groupinsurance;

    @NotNull
    private Long others;

    @NotNull
    private Long totalfees;

    @NotNull
    private String loginuser;
}
