package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 30/06/2017.
 */
@Entity
@Table(name = "applicationfollowup")

public class ApplicationFollowUp {
    public Date getCurrentDate(){
        return currentdate;
    }
    public void setCurrentDate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getEnquiryNo() {
        return enquiryNo;
    }
    public void setEnquiryNo(String enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    public String getApplicationNo() {
        return applicationno;
    }
    public void setApplicationNo(String applicationno) {
        this.applicationno = applicationno;
    }

    public String getCandidateName() {
        return candidatename;
    }
    public void setCandidateName(String candidatename) {
        this.candidatename = candidatename;
    }


    public String getFatherName() {
        return fathername;
    }
    public void setFatherName(String fathername) {
        this.fathername = fathername;
    }

    public String getMobileNo() {
        return mobileno;
    }
    public void setMobileNo(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getAlternativeMobileNo() {
        return alternativeMobileno;
    }
    public void setAlternativeMobileNo(String alternativeMobileno) {
        this.alternativeMobileno = alternativeMobileno;
    }

    public String getPreferredCourse() {
        return preferredCourse;
    }
    public void setPreferredCourse(String preferredCourse) {
        this.preferredCourse = preferredCourse;
    }

    public String getWillingness() {
        return willingness;
    }
    public void setWillingness(String willingness) {
        this.willingness = willingness;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @NotNull
    private Date currentdate;

    @NotNull
    private String enquiryNo;

    @Id
    private String applicationno;

    @NotNull
    private String candidatename;

    @NotNull
    private String fathername;

     @NotNull
    private String mobileno;

    @NotNull
    private String alternativeMobileno;

    @NotNull
    private String preferredCourse;

    @NotNull
    private String willingness;

    @NotNull
    private String loginuser;

}
