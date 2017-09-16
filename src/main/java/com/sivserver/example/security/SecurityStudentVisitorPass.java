package com.sivserver.example.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 02-Aug-17.
 */
@Entity
@Table(name = "securitystudentvisitorpass")

public class SecurityStudentVisitorPass {

    @Id
    private String visitorid;

    private Date currentdate;

    private String visitorname;

    private Integer noofpersons;

    private String visitortransportmode;

    private String persontomeet;

    @Column(name="regno")
    private String regno;

    private String branchcode;

    private String batch;

    private Integer semester;

    private String academicyear;

    private String reason;

    private String timein;

    private String timeout;

    private String loginuser;

    public SecurityStudentVisitorPass() {
    }

    public String getVisitorid() {
        return visitorid;
    }

    public void setVisitorid(String visitorid) {
        this.visitorid = visitorid;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getVisitorname() {
        return visitorname;
    }

    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public Integer getNoofpersons() {
        return noofpersons;
    }

    public void setNoofpersons(Integer noofpersons) {
        this.noofpersons = noofpersons;
    }

    public String getVisitortransportmode() {
        return visitortransportmode;
    }

    public void setVisitortransportmode(String visitortransportmode) {
        this.visitortransportmode = visitortransportmode;
    }

    public String getPersontomeet() {
        return persontomeet;
    }

    public void setPersontomeet(String persontomeet) {
        this.persontomeet = persontomeet;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
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

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTimein() {
        return timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
