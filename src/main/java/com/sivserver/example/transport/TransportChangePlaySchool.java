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

    private String transport_required;

    private String stage;

    private Long transport_init_fees;

    private Long transport_term1_fees;

    private Long transport_term2_fees;

    private Long transport_total_fees;

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

    public String getTransport_required() {
        return transport_required;
    }

    public void setTransport_required(String transport_required) {
        this.transport_required = transport_required;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public Long getTransport_init_fees() {
        return transport_init_fees;
    }

    public void setTransport_init_fees(Long transport_init_fees) {
        this.transport_init_fees = transport_init_fees;
    }

    public Long getTransport_term1_fees() {
        return transport_term1_fees;
    }

    public void setTransport_term1_fees(Long transport_term1_fees) {
        this.transport_term1_fees = transport_term1_fees;
    }

    public Long getTransport_term2_fees() {
        return transport_term2_fees;
    }

    public void setTransport_term2_fees(Long transport_term2_fees) {
        this.transport_term2_fees = transport_term2_fees;
    }

    public Long getTransport_total_fees() {
        return transport_total_fees;
    }

    public void setTransport_total_fees(Long transport_total_fees) {
        this.transport_total_fees = transport_total_fees;
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
