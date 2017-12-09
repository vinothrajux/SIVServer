package com.sivserver.example.CashCounter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 06/11/2017.
 */
@Entity
@Table(name="feespaymentplayschool")
public class FeesPaymentPlaySchool {

    private Date billdate;

    @Id
    private String billno;

    @Column(name="registernumber")
    private String registernumber;

    private String program;

    private String section;

    private String academicyear;

    private String schoolfeestitle;

    private Long schoolfees;

    private Long schoolfeespaid;

    private String transportfeestitle;

    private Long transportfees;

    private Long transportfeespaid;

    private Long totalfees;

    private Long totalfeespaid;

    private Long balance;

    private Date duedate;

    private String paymentmethod;

    private String chequeno;

    private Date chequedate;

    private String bankname;

    private String loginuser;

    public FeesPaymentPlaySchool() {
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
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

    public String getSchoolfeestitle() {
        return schoolfeestitle;
    }

    public void setSchoolfeestitle(String schoolfeestitle) {
        this.schoolfeestitle = schoolfeestitle;
    }

    public Long getSchoolfees() {
        return schoolfees;
    }

    public void setSchoolfees(Long school_fees) {
        this.schoolfees = schoolfees;
    }

    public Long getSchoolfeespaid() {
        return schoolfeespaid;
    }

    public void setSchoolfeespaid(Long school_fees_paid) {
        this.schoolfeespaid = schoolfeespaid;
    }

    public String getTransportfeestitle() {
        return transportfeestitle;
    }

    public void setTransportfeestitle(String transportfeestitle) {
        this.transportfeestitle = transportfeestitle;
    }

    public Long getTransportfees() {
        return transportfees;
    }

    public void setTransportfees(Long transportfees) {
        this.transportfees = transportfees;
    }

    public Long getTransportfeespaid() {
        return transportfeespaid;
    }

    public void setTransportfeespaid(Long transportfeespaid) {
        this.transportfeespaid = transportfeespaid;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public Long getTotalfeespaid() {
        return totalfeespaid;
    }

    public void setTotalfeespaid(Long totalfeespaid) {
        this.totalfeespaid = totalfeespaid;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getChequeno() {
        return chequeno;
    }

    public void setChequeno(String chequeno) {
        this.chequeno = chequeno;
    }

    public Date getChequedate() {
        return chequedate;
    }

    public void setChequedate(Date chequedate) {
        this.chequedate = chequedate;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
