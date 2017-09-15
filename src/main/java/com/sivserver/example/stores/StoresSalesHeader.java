package com.sivserver.example.stores;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storessalesheader")

public class StoresSalesHeader {

        private Date salesDate;

        @Id
        @Column(name="billno")
        private String billno;

        private String regno;

        private String branchcode;

        private String batch;

        private Integer semester;

        private String academicYear;

        private Long totalAmount;

        private Long paidAmount;

        private Long balanceAmount;

        private Date dueDate;

        private String paymentMode;

        private Date chequeDate;

        private String chequeNo;

        private String bankName;

        private String loginuser;

    @OneToMany
    @JoinColumn(name="billno",referencedColumnName = "billno")
    private List<StoresSalesDetail> storesSalesDetail_billno;


    public StoresSalesHeader() {
    }

    public StoresSalesHeader(String billno) {
        this.billno = billno;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
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

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<StoresSalesDetail> getStoresSalesDetail_billno() {
        return storesSalesDetail_billno;
    }

    public void setStoresSalesDetail_billno(List<StoresSalesDetail> storesSalesDetail_billno) {
        this.storesSalesDetail_billno = storesSalesDetail_billno;
    }
}
