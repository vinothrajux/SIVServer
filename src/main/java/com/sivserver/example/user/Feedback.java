package com.sivserver.example.user;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 05-Feb-18.
 */
@Entity
@Table(name = "feedback")
public class Feedback {
    public Feedback(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    String registernumber;
    String candidatename;
    Integer instituteid;
    String schoolfeedback;
    Integer schoolrating;
    String appfeedback;
    Integer apprating;
    Date entrydate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getSchoolfeedback() {
        return schoolfeedback;
    }

    public void setSchoolfeedback(String schoolfeedback) {
        this.schoolfeedback = schoolfeedback;
    }

    public Integer getSchoolrating() {
        return schoolrating;
    }

    public void setSchoolrating(Integer schoolrating) {
        this.schoolrating = schoolrating;
    }

    public String getAppfeedback() {
        return appfeedback;
    }

    public void setAppfeedback(String appfeedback) {
        this.appfeedback = appfeedback;
    }

    public Integer getApprating() {
        return apprating;
    }

    public void setApprating(Integer apprating) {
        this.apprating = apprating;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename;
    }
}
