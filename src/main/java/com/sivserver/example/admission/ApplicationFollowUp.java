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
    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getEnquiryno() {
        return enquiryNo;
    }
    public void setEnquiryno(String enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    public String getApplicationno() {
        return applicationno;
    }
    public void setApplicationno(String applicationno) {
        this.applicationno = applicationno;
    }

    public String getCandidatename() {
        return candidatename;
    }
    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }


    public String getFathername() {
        return fathername;
    }
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public String getMobileno() {
        return mobileno;
    }
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getAlternativemobileno() {
        return alternativeMobileno;
    }
    public void setAlternativemobileno(String alternativeMobileno) {
        this.alternativeMobileno = alternativeMobileno;
    }

    public String getPreferredcourse() {
        return preferredCourse;
    }
    public void setPreferredcourse(String preferredCourse) {
        this.preferredCourse = preferredCourse;
    }

    public String getWillingness() {
        return willingness;
    }
    public void setWillingness(String willingness) {
        this.willingness = willingness;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
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
