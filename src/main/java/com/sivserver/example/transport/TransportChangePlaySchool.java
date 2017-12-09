package com.sivserver.example.transport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 06/11/2017.
 */
@Entity
@Table(name="transportchangeplayschool")
public class TransportChangePlaySchool {

    @Id
    private String transportchangeid;

    private Date entrydate;

    @Column(name = "registernumber")
    private String registernumber;

    private String name;

    private String program;

    private String section;

    private String transportrequired;

    private String stage;

    private Long transportinitfees;

    private Long transportterm1fees;

    private Long transportterm2fees;

    private Long transporttotalfees;

    private String academicyear;

    private String remarks;

    private String loginuser;

    public TransportChangePlaySchool() {
    }

    public String getTransportchangeid() {
        return transportchangeid;
    }

    public void setTransportchangeid(String transportchangeid) {
        this.transportchangeid = transportchangeid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
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

    public String getTransportrequired() {
        return transportrequired;
    }

    public void setTransportrequired(String transportrequired) {
        this.transportrequired = transportrequired;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Long getTransportinitfees() {
        return transportinitfees;
    }

    public void setTransportinitfees(Long transportinitfees) {
        this.transportinitfees = transportinitfees;
    }

    public Long getTransportterm1fees() {
        return transportterm1fees;
    }

    public void setTransportterm1fees(Long transportterm1fees) {
        this.transportterm1fees = transportterm1fees;
    }

    public Long getTransportterm2fees() {
        return transportterm2fees;
    }

    public void setTransportterm2fees(Long transportterm2fees) {
        this.transportterm2fees = transportterm2fees;
    }

    public Long getTransporttotalfees() {
        return transporttotalfees;
    }

    public void setTransporttotalfees(Long transporttotalfees) {
        this.transporttotalfees = transporttotalfees;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
