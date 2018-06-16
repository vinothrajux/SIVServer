package com.sivserver.example.gbcorptraining;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Seetha on 06-Jun-18.
 *
 */
@Entity
@Table(name= "customerdetails")
public class CustomerDetails {

    @Id
    @Column(name= "instituteid")

    private Integer instituteid;

    private String institutetype;

    private String institutename;

    private Integer noofstudents;

    private Float priceperstudent;

    private Float totalamount;

    private String paymentmethod;

    private Float amountpaid;

    private Float balance;

    private Date duedate;

    private String username;

    public CustomerDetails() {
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public CustomerDetails setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
        return this;
    }

    public String getInstitutetype() {
        return institutetype;
    }

    public CustomerDetails setInstitutetype(String institutetype) {
        this.institutetype = institutetype;
        return this;
    }

    public String getInstitutename() {
        return institutename;
    }

    public CustomerDetails setInstitutename(String institutename) {
        this.institutename = institutename;
        return this;
    }

    public Integer getNoofstudents() {
        return noofstudents;
    }

    public CustomerDetails setNoofstudents(Integer noofstudents) {
        this.noofstudents = noofstudents;
        return this;
    }

    public Float getPriceperstudent() {
        return priceperstudent;
    }

    public CustomerDetails setPriceperstudent(Float priceperstudent) {
        this.priceperstudent = priceperstudent;
        return this;
    }

    public Float getTotalamount() {
        return totalamount;
    }

    public CustomerDetails setTotalamount(Float totalamount) {
        this.totalamount = totalamount;
        return this;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public CustomerDetails setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
        return this;
    }

    public Float getAmountpaid() {
        return amountpaid;
    }

    public CustomerDetails setAmountpaid(Float amountpaid) {
        this.amountpaid = amountpaid;
        return this;
    }

    public Float getBalance() {
        return balance;
    }

    public CustomerDetails setBalance(Float balance) {
        this.balance = balance;
        return this;
    }

    public Date getDuedate() {
        return duedate;
    }

    public CustomerDetails setDuedate(Date duedate) {
        this.duedate = duedate;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CustomerDetails setUsername(String username) {
        this.username = username;
        return this;
    }
}

