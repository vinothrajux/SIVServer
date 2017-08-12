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

    public Date getFeesSettingdate(){
        return feessettingdate;
    }
    public void setFeesSettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }
    public String getBranchname() {
        return branchname;
    }
    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }
    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Long getAdmissionfees() {
        return admissionfees;
    }
    public void setAdmissionfees(Long admissionfees) {this.admissionfees = admissionfees;}

    public Long getTutionfees() {
        return tutionfees;
    }
    public void setTutionfees(Long tutionfees) {
        this.tutionfees = tutionfees;
    }

    public Long getTextBookfees() {return textbookfees; }
    public void setTextBookfees(Long textbookfees) {this.textbookfees = textbookfees;}

    public Long getMiscalleneousfees() {
        return miscalleneousfees;
    }
    public void setMiscalleneousfees(Long miscalleneousfees) {
        this.miscalleneousfees = miscalleneousfees;
    }

    public Long getSpecialfees() {
        return specialfees;
    }
    public void setSpecialfees(Long specialfees) {
        this.specialfees = specialfees;
    }


    public Long getGroupinsurance() {
        return groupinsurance;
    }
    public void setGroupinsurance(Long groupinsurance) {
        this.groupinsurance = groupinsurance;
    }

    public Long getOthers() {
        return others;
    }
    public void setOthers(Long others) {
        this.others = others;
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
