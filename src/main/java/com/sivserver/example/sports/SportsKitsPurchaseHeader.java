package com.sivserver.example.sports;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 15/07/2017.
 */
@Entity
@Table(name = "sportskitspurchaseheader")

public class SportsKitsPurchaseHeader {

    private Date purchasedate;

    @Id
    @Column(name="billno")
    private String billno;

    private String vendorid;

    private Long totalamount;

    private Long paidamount;

    private Long balanceamount;

    private Date duedate;

    private String paymentmode;

    private Date chequedate;

    private String chequeno;

    private String bankname;

    private String academicyear;

    private String loginuser;

    @OneToMany
    @JoinColumn(name="billno",referencedColumnName = "billno")
    private List<SportsKitsPurchaseDetail> sportsKitsPurchaseDetail_regno;


    public SportsKitsPurchaseHeader() {
    }

    public SportsKitsPurchaseHeader(String billno) {
        this.billno = billno;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getVendorid() {
        return vendorid;
    }

    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public Long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Long totalamount) {
        this.totalamount = totalamount;
    }

    public Long getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(Long paidamount) {
        this.paidamount = paidamount;
    }

    public Long getBalanceamount() {
        return balanceamount;
    }

    public void setBalanceamount(Long balanceamount) {
        this.balanceamount = balanceamount;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public String getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public Date getChequedate() {
        return chequedate;
    }

    public void setChequedate(Date chequedate) {
        this.chequedate = chequedate;
    }

    public String getChequeno() {
        return chequeno;
    }

    public void setChequeno(String chequeno) {
        this.chequeno = chequeno;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<SportsKitsPurchaseDetail> getSportsKitsPurchaseDetail_regno() {
        return sportsKitsPurchaseDetail_regno;
    }

    public void setSportsKitsPurchaseDetail_regno(List<SportsKitsPurchaseDetail> sportsKitsPurchaseDetail_regno) {
        this.sportsKitsPurchaseDetail_regno = sportsKitsPurchaseDetail_regno;
    }
}
