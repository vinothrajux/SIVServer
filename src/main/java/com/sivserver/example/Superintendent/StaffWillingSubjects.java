package com.sivserver.example.Superintendent;

import javax.persistence.*;

/**
 * Created by GBCorp on 30/09/2017.
 */
@Entity
@Table(name="staffwillingsubjects")
public class StaffWillingSubjects {

    @Id
    @Column(name="staffid")
    private String staffid;

    private String branchcode;

    private Integer totalteachingexperience;

    private String theorysubject1code;

    private Integer nooftimestheorysubject1handled;

    private String theorysubject2code;

    private Integer nooftimestheorysubject2handled;

    private String theorysubject3code;

    private Integer nooftimestheorysubject3handled;

    private String theorysubject4code;

    private Integer nooftimestheorysubject4handled;

    private String theorysubject5code;

    private Integer nooftimestheorysubject5handled;

    private String practicalsubject1code;

    private Integer nooftimespracticalsubject1handled;

    private String practicalsubject2code;

    private Integer nooftimespracticalsubject2handled;

    private String practicalsubject3code;

    private Integer nooftimespracticalsubject3handled;

    private String practicalsubject4code;

    private Integer nooftimespracticalsubject4handled;

    private String practicalsubject5code;

    private Integer nooftimespracticalsubject5handled;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="staff_willingsubjects_staffid",nullable=false,referencedColumnName = "staffid")
    private StaffPersonalInformation staff_personal_staffid;

    public StaffWillingSubjects() {
    }

    public String getStaffid() {
        return staffid;
    }

    public StaffWillingSubjects setStaffid(String staffid) {
        this.staffid = staffid;
        return this;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public StaffWillingSubjects setBranchcode(String branchcode) {
        this.branchcode = branchcode;
        return this;
    }

    public Integer getTotalteachingexperience() {
        return totalteachingexperience;
    }

    public StaffWillingSubjects setTotalteachingexperience(Integer totalteachingexperience) {
        this.totalteachingexperience = totalteachingexperience;
        return this;
    }

    public String getTheorysubject1code() {
        return theorysubject1code;
    }

    public StaffWillingSubjects setTheorysubject1code(String theorysubject1code) {
        this.theorysubject1code = theorysubject1code;
        return this;
    }

    public Integer getNooftimestheorysubject1handled() {
        return nooftimestheorysubject1handled;
    }

    public StaffWillingSubjects setNooftimestheorysubject1handled(Integer nooftimestheorysubject1handled) {
        this.nooftimestheorysubject1handled = nooftimestheorysubject1handled;
        return this;
    }

    public String getTheorysubject2code() {
        return theorysubject2code;
    }

    public StaffWillingSubjects setTheorysubject2code(String theorysubject2code) {
        this.theorysubject2code = theorysubject2code;
        return this;
    }

    public Integer getNooftimestheorysubject2handled() {
        return nooftimestheorysubject2handled;
    }

    public StaffWillingSubjects setNooftimestheorysubject2handled(Integer nooftimestheorysubject2handled) {
        this.nooftimestheorysubject2handled = nooftimestheorysubject2handled;
        return this;
    }

    public String getTheorysubject3code() {
        return theorysubject3code;
    }

    public StaffWillingSubjects setTheorysubject3code(String theorysubject3code) {
        this.theorysubject3code = theorysubject3code;
        return this;
    }

    public Integer getNooftimestheorysubject3handled() {
        return nooftimestheorysubject3handled;
    }

    public StaffWillingSubjects setNooftimestheorysubject3handled(Integer nooftimestheorysubject3handled) {
        this.nooftimestheorysubject3handled = nooftimestheorysubject3handled;
        return this;
    }

    public String getTheorysubject4code() {
        return theorysubject4code;
    }

    public StaffWillingSubjects setTheorysubject4code(String theorysubject4code) {
        this.theorysubject4code = theorysubject4code;
        return this;
    }

    public Integer getNooftimestheorysubject4handled() {
        return nooftimestheorysubject4handled;
    }

    public StaffWillingSubjects setNooftimestheorysubject4handled(Integer nooftimestheorysubject4handled) {
        this.nooftimestheorysubject4handled = nooftimestheorysubject4handled;
        return this;
    }

    public String getTheorysubject5code() {
        return theorysubject5code;
    }

    public StaffWillingSubjects setTheorysubject5code(String theorysubject5code) {
        this.theorysubject5code = theorysubject5code;
        return this;
    }

    public Integer getNooftimestheorysubject5handled() {
        return nooftimestheorysubject5handled;
    }

    public StaffWillingSubjects setNooftimestheorysubject5handled(Integer nooftimestheorysubject5handled) {
        this.nooftimestheorysubject5handled = nooftimestheorysubject5handled;
        return this;
    }

    public String getPracticalsubject1code() {
        return practicalsubject1code;
    }

    public StaffWillingSubjects setPracticalsubject1code(String practicalsubject1code) {
        this.practicalsubject1code = practicalsubject1code;
        return this;
    }

    public Integer getNooftimespracticalsubject1handled() {
        return nooftimespracticalsubject1handled;
    }

    public StaffWillingSubjects setNooftimespracticalsubject1handled(Integer nooftimespracticalsubject1handled) {
        this.nooftimespracticalsubject1handled = nooftimespracticalsubject1handled;
        return this;
    }

    public String getPracticalsubject2code() {
        return practicalsubject2code;
    }

    public StaffWillingSubjects setPracticalsubject2code(String practicalsubject2code) {
        this.practicalsubject2code = practicalsubject2code;
        return this;
    }

    public Integer getNooftimespracticalsubject2handled() {
        return nooftimespracticalsubject2handled;
    }

    public StaffWillingSubjects setNooftimespracticalsubject2handled(Integer nooftimespracticalsubject2handled) {
        this.nooftimespracticalsubject2handled = nooftimespracticalsubject2handled;
        return this;
    }

    public String getPracticalsubject3code() {
        return practicalsubject3code;
    }

    public StaffWillingSubjects setPracticalsubject3code(String practicalsubject3code) {
        this.practicalsubject3code = practicalsubject3code;
        return this;
    }

    public Integer getNooftimespracticalsubject3handled() {
        return nooftimespracticalsubject3handled;
    }

    public StaffWillingSubjects setNooftimespracticalsubject3handled(Integer nooftimespracticalsubject3handled) {
        this.nooftimespracticalsubject3handled = nooftimespracticalsubject3handled;
        return this;
    }

    public String getPracticalsubject4code() {
        return practicalsubject4code;
    }

    public StaffWillingSubjects setPracticalsubject4code(String practicalsubject4code) {
        this.practicalsubject4code = practicalsubject4code;
        return this;
    }

    public Integer getNooftimespracticalsubject4handled() {
        return nooftimespracticalsubject4handled;
    }

    public StaffWillingSubjects setNooftimespracticalsubject4handled(Integer nooftimespracticalsubject4handled) {
        this.nooftimespracticalsubject4handled = nooftimespracticalsubject4handled;
        return this;
    }

    public String getPracticalsubject5code() {
        return practicalsubject5code;
    }

    public StaffWillingSubjects setPracticalsubject5code(String practicalsubject5code) {
        this.practicalsubject5code = practicalsubject5code;
        return this;
    }

    public Integer getNooftimespracticalsubject5handled() {
        return nooftimespracticalsubject5handled;
    }

    public StaffWillingSubjects setNooftimespracticalsubject5handled(Integer nooftimespracticalsubject5handled) {
        this.nooftimespracticalsubject5handled = nooftimespracticalsubject5handled;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public StaffWillingSubjects setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public StaffPersonalInformation getStaff_personal_staffid() {
        return staff_personal_staffid;
    }

    public StaffWillingSubjects setStaff_personal_staffid(StaffPersonalInformation staff_personal_staffid) {
        this.staff_personal_staffid = staff_personal_staffid;
        return this;
    }
}
