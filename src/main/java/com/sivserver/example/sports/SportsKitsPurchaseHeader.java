package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 15/07/2017.
 */
@Entity
@Table(name = "sportskitspurchaseheader")

public class SportsKitsPurchaseHeader {
    public Date getPurchasedate(){
        return purchasedate;
    }
    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getBillno() {return billno;}
    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getVendorid() {
        return vendorid;
    }
    public void setVendorid(String vendorid) {this.vendorid = vendorid;}

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

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
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



    @Id
    private Date purchasedate;

    @NotNull
    private String billno;

    @NotNull
    private String vendorid;

    @NotNull
    private Long totalamount;

    @NotNull
    private Long paidamount;

    @NotNull
    private Long balanceamount;

    @NotNull
    private Date duedate;

    @NotNull
    private String paymentmode;

    @NotNull
    private Date chequedate;

    @NotNull
    private String chequeno;

    @NotNull
    private String bankname;

    @NotNull
    private String academicyear;

    @NotNull
    private String loginuser;

}
