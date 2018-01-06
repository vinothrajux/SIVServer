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

    private Long materialkitfees;

    private Long materialkitfeespaid;

    private Long activityfees;

    private Long activityfeespaid;

    private Long tuitionfees;

    private Long tuitionfeespaid;

    private Long totalfees;

    private Long totalfeespaid;

    private Long balancefees;

    private Date duedate;

    private String paymentmethod;

    private String chequeno;

    private String chequedate;

    private String bankname;

    private String loginuser;

    private String instituteid;

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

    public Long getMaterialkitfees() {
        return materialkitfees;
    }

    public void setMaterialkitfees(Long materialkitfees) {
        this.materialkitfees = materialkitfees;
    }

    public Long getMaterialkitfeespaid() {
        return materialkitfeespaid;
    }

    public void setMaterialkitfeespaid(Long materialkitfeespaid) {
        this.materialkitfeespaid = materialkitfeespaid;
    }

    public Long getActivityfees() {
        return activityfees;
    }

    public void setActivityfees(Long activityfees) {
        this.activityfees = activityfees;
    }

    public Long getActivityfeespaid() {
        return activityfeespaid;
    }

    public void setActivityfeespaid(Long activityfeespaid) {
        this.activityfeespaid = activityfeespaid;
    }

    public Long getTuitionfees() {
        return tuitionfees;
    }

    public void setTuitionfees(Long tuitionfees) {
        this.tuitionfees = tuitionfees;
    }

    public Long getTuitionfeespaid() {
        return tuitionfeespaid;
    }

    public void setTuitionfeespaid(Long tuitionfeespaid) {
        this.tuitionfeespaid = tuitionfeespaid;
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

    public Long getBalancefees() {
        return balancefees;
    }

    public void setBalancefees(Long balancefees) {
        this.balancefees = balancefees;
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

    public String getChequedate() {
        return chequedate;
    }

    public void setChequedate(String chequedate) {
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

    public String getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }
}
