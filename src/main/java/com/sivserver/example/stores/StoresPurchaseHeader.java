package com.sivserver.example.stores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storespurchaseheader")

public class StoresPurchaseHeader {

    private Date purchaseDate;

    @Id
    @Column(name="billno")
    private String billno;

    @Column(name="vendorid")
    private String vendorId;


    private Long totalAmount;


    private Long paidAmount;


    private Long balanceAmount;


    private Date dueDate;


    private String paymentMode;


    private Date chequeDate;


    private String chequeNo;


    private String bankName;


    private String academicYear;


    private String loginuser;

    @OneToMany
    @JoinColumn(name="billno",referencedColumnName = "billno")
    private List<StoresPurchaseDetail> StoresPurchaseDetail_billno;


    public StoresPurchaseHeader() {
    }

    public StoresPurchaseHeader(String billno) {
        this.billno = billno;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Long paidAmount) {
        this.paidAmount = paidAmount;
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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<StoresPurchaseDetail> getStoresPurchaseDetail_billno() {
        return StoresPurchaseDetail_billno;
    }

    public void setStoresPurchaseDetail_billno(List<StoresPurchaseDetail> storesPurchaseDetail_billno) {
        StoresPurchaseDetail_billno = storesPurchaseDetail_billno;
    }
}
