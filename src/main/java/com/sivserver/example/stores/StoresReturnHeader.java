package com.sivserver.example.stores;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storesreturnheader")

public class StoresReturnHeader {
    public Date getReturnDate(){
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getBillno() {return billno;}
    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {this.vendorId = vendorId;}

    public Long getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getReceivedAmount() {
        return receivedAmount;
    }
    public void setReceivedAmount(Long receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public Long getBalanceAmount() {
        return balanceAmount;
    }
    public void setBalanceAmount(Long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public Date getDueDate() {
        return dueDate;
    }
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Date getChequeDate() {
        return chequeDate;
    }
    public void setChequeDate(Date chequeDate) {
        this.chequeDate = chequeDate;
    }

    public String getChequeNo() {
        return chequeNo;
    }
    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getAcademicYear() {
        return academicYear;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }



    @Id
    private Date returnDate;

    @NotNull
    private String billno;

    @NotNull
    private String vendorId;

    @NotNull
    private Long totalAmount;

    @NotNull
    private Long receivedAmount;

    @NotNull
    private Long balanceAmount;

    @NotNull
    private Date dueDate;

    @NotNull
    private String paymentMode;

    @NotNull
    private Date chequeDate;

    @NotNull
    private String chequeNo;

    @NotNull
    private String bankName;

    @NotNull
    private String academicYear;

    @NotNull
    private String loginuser;


}

