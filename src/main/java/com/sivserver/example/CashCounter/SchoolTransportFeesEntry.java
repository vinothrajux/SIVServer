package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import com.sivserver.example.student.SchoolStudentPersonalInformation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
@Entity
@Table(name="schooltransportfeesentry")
public class SchoolTransportFeesEntry {

    @Id
    @Column(name="registernumber")
    private String registernumber;

    private String instituteregisternumber;

    private String transport;

    private String stage;

    private String transportfeesmethod;

    private Double transportfees;

    private Date transportduedate;

    private String academicyear;

    private String loginuser;

    private Integer instituteid;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private SchoolStudentPersonalInformation play_school_student_personal_regno;

    public SchoolTransportFeesEntry() {
    }

    public SchoolTransportFeesEntry(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public SchoolTransportFeesEntry setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getInstituteregisternumber() {
        return instituteregisternumber;
    }

    public SchoolTransportFeesEntry setInstituteregisternumber(String instituteregisternumber) {
        this.instituteregisternumber = instituteregisternumber;
        return this;
    }

    public String getTransport() {
        return transport;
    }

    public SchoolTransportFeesEntry setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public String getStage() {
        return stage;
    }

    public SchoolTransportFeesEntry setStage(String stage) {
        this.stage = stage;
        return this;
    }

    public String getTransportfeesmethod() {
        return transportfeesmethod;
    }

    public SchoolTransportFeesEntry setTransportfeesmethod(String transportfeesmethod) {
        this.transportfeesmethod = transportfeesmethod;
        return this;
    }

    public Double getTransportfees() {
        return transportfees;
    }

    public SchoolTransportFeesEntry setTransportfees(Double transportfees) {
        this.transportfees = transportfees;
        return this;
    }

    public Date getTransportduedate() {
        return transportduedate;
    }

    public SchoolTransportFeesEntry setTransportduedate(Date transportduedate) {
        this.transportduedate = transportduedate;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public SchoolTransportFeesEntry setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public SchoolTransportFeesEntry setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public SchoolTransportFeesEntry setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

    public SchoolStudentPersonalInformation getPlay_school_student_personal_regno() {
        return play_school_student_personal_regno;
    }

    public SchoolTransportFeesEntry setPlay_school_student_personal_regno(SchoolStudentPersonalInformation play_school_student_personal_regno) {
        this.play_school_student_personal_regno = play_school_student_personal_regno;
        return this;
    }
}
