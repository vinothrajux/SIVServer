package com.sivserver.example.CashCounter;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Seetha on 18-Dec-17.
 */
@Entity
@Table(name="playschooltransportfeesentry")

public class PlaySchoolTransportFeesEntry {

    @Id
    @Column(name="registernumber")
    private String registernumber;

    private String transport;

    private String stage;

    private String paymentmethod;

    private Long transportfees;

    private Date transportduedate;

    private String academicyear;

    private String loginuser;

    @OneToOne
    @JoinColumn(name="student_base_registernumber",nullable=false,referencedColumnName = "registernumber")
    private PlaySchoolStudentPersonalInformation play_school_student_personal_regno;

    public PlaySchoolTransportFeesEntry() {
    }

    public PlaySchoolTransportFeesEntry(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public PlaySchoolTransportFeesEntry setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
        return this;
    }

    public String getTransport() {
        return transport;
    }

    public PlaySchoolTransportFeesEntry setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    public String getStage() {
        return stage;
    }

    public PlaySchoolTransportFeesEntry setStage(String stage) {
        this.stage = stage;
        return this;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public PlaySchoolTransportFeesEntry setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
        return this;
    }

    public Long getTransportfees() {
        return transportfees;
    }

    public PlaySchoolTransportFeesEntry setTransportfees(Long transportfees) {
        this.transportfees = transportfees;
        return this;
    }

    public Date getTransportduedate() {
        return transportduedate;
    }

    public PlaySchoolTransportFeesEntry setTransportduedate(Date transportduedate) {
        this.transportduedate = transportduedate;
        return this;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public PlaySchoolTransportFeesEntry setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public PlaySchoolTransportFeesEntry setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public PlaySchoolStudentPersonalInformation getPlay_school_student_personal_regno() {
        return play_school_student_personal_regno;
    }

    public PlaySchoolTransportFeesEntry setPlay_school_student_personal_regno(PlaySchoolStudentPersonalInformation play_school_student_personal_regno) {
        this.play_school_student_personal_regno = play_school_student_personal_regno;
        return this;
    }
}
