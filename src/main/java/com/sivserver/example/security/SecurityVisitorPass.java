package com.sivserver.example.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 02-Aug-17.
 */
@Entity
@Table(name = "securityvisitorpass")

public class SecurityVisitorPass {
    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getVisitorname(){
        return visitorname;
    }
    public void setVisitorname(String visitorname) {
        this.visitorname = visitorname;
    }

    public Integer getNoofpersons(){
        return noofpersons;
    }
    public void setNoofpersons(Integer noofpersons) {
        this.noofpersons = noofpersons;
    }

    public String getVisitortransportmode(){
        return visitortransportmode;
    }
    public void setVisitortransportmode(String visitortransportmode) {
        this.visitortransportmode = visitortransportmode;
    }

    public String getPersontomeet(){
        return persontomeet;
    }
    public void setPersontomeet(String persontomeet) {
        this.persontomeet = persontomeet;
    }

    public String getStaffid(){
        return staffid;
    }
    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
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


    public String getAcadyear() {
        return academicyear;
    }
    public void setAcadyear(String academicyear) {
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

    public String gettimeout() {
        return timeout;
    }
    public void settimeout(String timeout) {
        this.timeout = timeout;
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
    private String visitorname;

    @NotNull
    private Integer noofpersons;

    @NotNull
    private String visitortransportmode;

    @NotNull
    private String persontomeet;

    @Id
    private String staffid;

    @NotNull
    private String name;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String reason;

    @NotNull
    private String timein;

    @NotNull
    private String timeout;


    @NotNull
    private String loginuser;

}
