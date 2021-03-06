package com.sivserver.example.teachingstaff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
@Entity
@Table(name="emergencymessageplayschool")
public class EmergencyMessagePlaySchool {

    @Id
    private String emergencymessageid;

    private Date entrydate;

    private String day;

    private String time;

    @Column(name="registernumber")
    private String registernumber;

    private String name;

    private String program;

    private String section;

    private String academicyear;

    private String message;

    private String loginuser;

    private Integer instituteid;

    public EmergencyMessagePlaySchool() {
    }

    public String getEmergencymessageid() {
        return emergencymessageid;
    }

    public void setEmergencymessageid(String emergencymessageid) {
        this.emergencymessageid = emergencymessageid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }
}
