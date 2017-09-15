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

    @Id
    Management_College_Fees_Compound_Key management_college_fees_compound_key;

    private Date feessettingdate;

    private Long admissionfees;

    private Long tutionfees;

    private Long textbookfees;

    private Long miscalleneousfees;

    private Long specialfees;

    private Long groupinsurance;

    private Long others;

    private Long totalfees;

    private String loginuser;

    public CollegeFeesSetting() {
    }

    public Management_College_Fees_Compound_Key getManagement_college_fees_compound_key() {
        return management_college_fees_compound_key;
    }

    public void setManagement_college_fees_compound_key(Management_College_Fees_Compound_Key management_college_fees_compound_key) {
        this.management_college_fees_compound_key = management_college_fees_compound_key;
    }

    public Date getFeessettingdate() {
        return feessettingdate;
    }

    public void setFeessettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public Long getAdmissionfees() {
        return admissionfees;
    }

    public void setAdmissionfees(Long admissionfees) {
        this.admissionfees = admissionfees;
    }

    public Long getTutionfees() {
        return tutionfees;
    }

    public void setTutionfees(Long tutionfees) {
        this.tutionfees = tutionfees;
    }

    public Long getTextbookfees() {
        return textbookfees;
    }

    public void setTextbookfees(Long textbookfees) {
        this.textbookfees = textbookfees;
    }

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
}
