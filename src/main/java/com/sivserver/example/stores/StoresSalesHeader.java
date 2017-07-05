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
@Table(name = "storessalesheader")

public class StoresSalesHeader {
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

        public String getBranchCode() {
            return branchcode;
        }

        public void setBranchCode(String branchcode) {
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

        public String getLoginUser() {
            return loginuser;
        }

        public void setLoginUser(String loginuser) {
            this.loginuser = loginuser;
        }

        @Id
        private Date salesDate;

        @NotNull
        private String billno;

        @NotNull
        private String regno;

        @NotNull
        private String branchcode;

        @NotNull
        private String batch;

        @NotNull
        private Integer semester;

        @NotNull
        private String academicYear;

        @NotNull
        private Long totalAmount;

        @NotNull
        private Long paidAmount;

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
        private String loginuser;

    }
