package com.sivserver.example.Superintendent;

import javax.persistence.*;

/**
 * Created by GBCorp on 30/09/2017.
 */
@Entity
@Table(name="staffeligibilityinformation")
public class StaffEligibilityInformation {

    @Id
    @Column(name="staffid")
    private String staffid;

    private Boolean staffidcard;

    private Boolean stafflibrarycard;

    private Boolean stafflogbook;

    private String bankaccountno;

    private String bankname;

    private String bankbranch;

    private String bankifsccode;

    private String eligibleforcl;

    private Integer noofcl;

    private Integer noofpl;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="staff_eligibility_staffid",nullable=false,referencedColumnName = "staffid")
    private StaffPersonalInformation staff_personal_staffid;

    public StaffEligibilityInformation() {
    }

    public StaffEligibilityInformation(String staffid) {
        this.staffid = staffid;
    }

    public String getStaffid() {
        return staffid;
    }

    public StaffEligibilityInformation setStaffid(String staffid) {
        this.staffid = staffid;
        return this;
    }

    public Boolean getStaffidcard() {
        return staffidcard;
    }

    public StaffEligibilityInformation setStaffidcard(Boolean staffidcard) {
        this.staffidcard = staffidcard;
        return this;
    }

    public Boolean getStafflibrarycard() {
        return stafflibrarycard;
    }

    public StaffEligibilityInformation setStafflibrarycard(Boolean stafflibrarycard) {
        this.stafflibrarycard = stafflibrarycard;
        return this;
    }

    public Boolean getStafflogbook() {
        return stafflogbook;
    }

    public StaffEligibilityInformation setStafflogbook(Boolean stafflogbook) {
        this.stafflogbook = stafflogbook;
        return this;
    }

    public String getBankaccountno() {
        return bankaccountno;
    }

    public StaffEligibilityInformation setBankaccountno(String bankaccountno) {
        this.bankaccountno = bankaccountno;
        return this;
    }

    public String getBankname() {
        return bankname;
    }

    public StaffEligibilityInformation setBankname(String bankname) {
        this.bankname = bankname;
        return this;
    }

    public String getBankbranch() {
        return bankbranch;
    }

    public StaffEligibilityInformation setBankbranch(String bankbranch) {
        this.bankbranch = bankbranch;
        return this;
    }

    public String getBankifsccode() {
        return bankifsccode;
    }

    public StaffEligibilityInformation setBankifsccode(String bankifsccode) {
        this.bankifsccode = bankifsccode;
        return this;
    }

    public String getEligibleforcl() {
        return eligibleforcl;
    }

    public StaffEligibilityInformation setEligibleforcl(String eligibleforcl) {
        this.eligibleforcl = eligibleforcl;
        return this;
    }

    public Integer getNoofcl() {
        return noofcl;
    }

    public StaffEligibilityInformation setNoofcl(Integer noofcl) {
        this.noofcl = noofcl;
        return this;
    }

    public Integer getNoofpl() {
        return noofpl;
    }

    public StaffEligibilityInformation setNoofpl(Integer noofpl) {
        this.noofpl = noofpl;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StaffEligibilityInformation setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StaffPersonalInformation getStaff_personal_staffid() {
        return staff_personal_staffid;
    }

    public StaffEligibilityInformation setStaff_personal_staffid(StaffPersonalInformation staff_personal_staffid) {
        this.staff_personal_staffid = staff_personal_staffid;
        return this;
    }
}
