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

    private String school_fees_title;

    private Long school_fees;

    private Long school_fees_paid;

    private String transport_fees_title;

    private Long transport_fees;

    private Long transport_fees_paid;

    private Long totalfees;

    private Long total_fees_paid;

    private Long balance;

    private Date duedate;

    private String payment_method;

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

    public String getSchool_fees_title() {
        return school_fees_title;
    }

    public void setSchool_fees_title(String school_fees_title) {
        this.school_fees_title = school_fees_title;
    }

    public Long getSchool_fees() {
        return school_fees;
    }

    public void setSchool_fees(Long school_fees) {
        this.school_fees = school_fees;
    }

    public Long getSchool_fees_paid() {
        return school_fees_paid;
    }

    public void setSchool_fees_paid(Long school_fees_paid) {
        this.school_fees_paid = school_fees_paid;
    }

    public String getTransport_fees_title() {
        return transport_fees_title;
    }

    public void setTransport_fees_title(String transport_fees_title) {
        this.transport_fees_title = transport_fees_title;
    }

    public Long getTransport_fees() {
        return transport_fees;
    }

    public void setTransport_fees(Long transport_fees) {
        this.transport_fees = transport_fees;
    }

    public Long getTransport_fees_paid() {
        return transport_fees_paid;
    }

    public void setTransport_fees_paid(Long transport_fees_paid) {
        this.transport_fees_paid = transport_fees_paid;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public Long getTotal_fees_paid() {
        return total_fees_paid;
    }

    public void setTotal_fees_paid(Long total_fees_paid) {
        this.total_fees_paid = total_fees_paid;
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

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
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
