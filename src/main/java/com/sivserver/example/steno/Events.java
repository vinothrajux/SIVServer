package com.sivserver.example.steno;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 05-Jul-17.
 */

@Entity
@Table(name = "stenoevents")

public class Events {


    public Date getCurrentdate(){return currentdate;}
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getEventtype(){
        return eventtype;
    }
    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public Date getEventdate() {
        return eventdate;
    }
    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventparticular() {return eventparticular;}
    public void setEventparticular(String eventparticular) {
        this.eventparticular = eventparticular;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchcode() {
        return branchcode;
    }
    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }


    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private Date currentdate;

    @NotNull
    private String eventtype;

    @NotNull
    private Date eventdate;

    @NotNull
    private String eventparticular;

    @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private String semester;

    @NotNull
    private String academicyear;


    @NotNull
    private String loginuser;
}
