package com.sivserver.example.CashCounter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 26-Jun-17.
 */
@Entity
@Table(name = "feespayment")
public class AllFeesPayment {
    @Id
    Cash_Counter_Compound_Key fees_Payment_Compound_Key;

    private Date date;

    private String billno;

    private String admissionno;

    private String name;

    private String branchcode;

    private String branchname;

    private String semester;

    private String paymentmethod;

    private Long admnfeestot;

    private Long admnfeespaid;

    private Long admnfeesbal;

    private Long tutionfeestot;

    private Long tutionfeespaid;

    private Long tutionfeesbal;

    private Long transfeestot;

    private Long transfeespaid;

    private Long transfeesbal;

    private Long hostfeestot;

    private Long hostfeespaid;

    private Long hostfeesbal;

    private Long foodfeestot;

    private Long foodfeespaid;

    private Long foodfeesbal;

    private Long txtbookfeestot;

    private Long txtbookfeespaid;

    private Long txtbookfeesbal;

    private Long miscfeestot;

    private Long miscfeespaid;

    private Long miscfeesbal;

    private Long splfeestot;

    private Long splfeespaid;

    private Long splfeesbal;

    private Long penaltyfeestot;

    private Long penaltyfeespaid;

    private Long penaltyfeesbal;

    private Long oldbalancetot;

    private Long oldbalancepaid;

    private Long oldbalancebal;

    private Long groupinsurancetot;

    private Long groupinsurancepaid;

    private Long groupinsurancebal;

    private Long othersfeestot;

    private Long othersfeespaid;

    private Long othersfeesbal;

    private Long totfeestot;

    private Long totfeespaid;

    private Long totfeesbal;

    private Date duedate;

    private Long chequeno;

    private Date chequedate;

    private String bankname;

    private Long noofprint;

    private String loginuser;

    public AllFeesPayment() {
    }

    public Cash_Counter_Compound_Key getFees_Payment_Compound_Key() {
        return fees_Payment_Compound_Key;
    }

    public void setFees_Payment_Compound_Key(Cash_Counter_Compound_Key fees_Payment_Compound_Key) {
        this.fees_Payment_Compound_Key = fees_Payment_Compound_Key;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getAdmissionno() {
        return admissionno;
    }

    public void setAdmissionno(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Long getAdmnfeestot() {
        return admnfeestot;
    }

    public void setAdmnfeestot(Long admnfeestot) {
        this.admnfeestot = admnfeestot;
    }

    public Long getAdmnfeespaid() {
        return admnfeespaid;
    }

    public void setAdmnfeespaid(Long admnfeespaid) {
        this.admnfeespaid = admnfeespaid;
    }

    public Long getAdmnfeesbal() {
        return admnfeesbal;
    }

    public void setAdmnfeesbal(Long admnfeesbal) {
        this.admnfeesbal = admnfeesbal;
    }

    public Long getTutionfeestot() {
        return tutionfeestot;
    }

    public void setTutionfeestot(Long tutionfeestot) {
        this.tutionfeestot = tutionfeestot;
    }

    public Long getTutionfeespaid() {
        return tutionfeespaid;
    }

    public void setTutionfeespaid(Long tutionfeespaid) {
        this.tutionfeespaid = tutionfeespaid;
    }

    public Long getTutionfeesbal() {
        return tutionfeesbal;
    }

    public void setTutionfeesbal(Long tutionfeesbal) {
        this.tutionfeesbal = tutionfeesbal;
    }

    public Long getTransfeestot() {
        return transfeestot;
    }

    public void setTransfeestot(Long transfeestot) {
        this.transfeestot = transfeestot;
    }

    public Long getTransfeespaid() {
        return transfeespaid;
    }

    public void setTransfeespaid(Long transfeespaid) {
        this.transfeespaid = transfeespaid;
    }

    public Long getTransfeesbal() {
        return transfeesbal;
    }

    public void setTransfeesbal(Long transfeesbal) {
        this.transfeesbal = transfeesbal;
    }

    public Long getHostfeestot() {
        return hostfeestot;
    }

    public void setHostfeestot(Long hostfeestot) {
        this.hostfeestot = hostfeestot;
    }

    public Long getHostfeespaid() {
        return hostfeespaid;
    }

    public void setHostfeespaid(Long hostfeespaid) {
        this.hostfeespaid = hostfeespaid;
    }

    public Long getHostfeesbal() {
        return hostfeesbal;
    }

    public void setHostfeesbal(Long hostfeesbal) {
        this.hostfeesbal = hostfeesbal;
    }

    public Long getFoodfeestot() {
        return foodfeestot;
    }

    public void setFoodfeestot(Long foodfeestot) {
        this.foodfeestot = foodfeestot;
    }

    public Long getFoodfeespaid() {
        return foodfeespaid;
    }

    public void setFoodfeespaid(Long foodfeespaid) {
        this.foodfeespaid = foodfeespaid;
    }

    public Long getFoodfeesbal() {
        return foodfeesbal;
    }

    public void setFoodfeesbal(Long foodfeesbal) {
        this.foodfeesbal = foodfeesbal;
    }

    public Long getTxtbookfeestot() {
        return txtbookfeestot;
    }

    public void setTxtbookfeestot(Long txtbookfeestot) {
        this.txtbookfeestot = txtbookfeestot;
    }

    public Long getTxtbookfeespaid() {
        return txtbookfeespaid;
    }

    public void setTxtbookfeespaid(Long txtbookfeespaid) {
        this.txtbookfeespaid = txtbookfeespaid;
    }

    public Long getTxtbookfeesbal() {
        return txtbookfeesbal;
    }

    public void setTxtbookfeesbal(Long txtbookfeesbal) {
        this.txtbookfeesbal = txtbookfeesbal;
    }

    public Long getMiscfeestot() {
        return miscfeestot;
    }

    public void setMiscfeestot(Long miscfeestot) {
        this.miscfeestot = miscfeestot;
    }

    public Long getMiscfeespaid() {
        return miscfeespaid;
    }

    public void setMiscfeespaid(Long miscfeespaid) {
        this.miscfeespaid = miscfeespaid;
    }

    public Long getMiscfeesbal() {
        return miscfeesbal;
    }

    public void setMiscfeesbal(Long miscfeesbal) {
        this.miscfeesbal = miscfeesbal;
    }

    public Long getSplfeestot() {
        return splfeestot;
    }

    public void setSplfeestot(Long splfeestot) {
        this.splfeestot = splfeestot;
    }

    public Long getSplfeespaid() {
        return splfeespaid;
    }

    public void setSplfeespaid(Long splfeespaid) {
        this.splfeespaid = splfeespaid;
    }

    public Long getSplfeesbal() {
        return splfeesbal;
    }

    public void setSplfeesbal(Long splfeesbal) {
        this.splfeesbal = splfeesbal;
    }

    public Long getPenaltyfeestot() {
        return penaltyfeestot;
    }

    public void setPenaltyfeestot(Long penaltyfeestot) {
        this.penaltyfeestot = penaltyfeestot;
    }

    public Long getPenaltyfeespaid() {
        return penaltyfeespaid;
    }

    public void setPenaltyfeespaid(Long penaltyfeespaid) {
        this.penaltyfeespaid = penaltyfeespaid;
    }

    public Long getPenaltyfeesbal() {
        return penaltyfeesbal;
    }

    public void setPenaltyfeesbal(Long penaltyfeesbal) {
        this.penaltyfeesbal = penaltyfeesbal;
    }

    public Long getOldbalancetot() {
        return oldbalancetot;
    }

    public void setOldbalancetot(Long oldbalancetot) {
        this.oldbalancetot = oldbalancetot;
    }

    public Long getOldbalancepaid() {
        return oldbalancepaid;
    }

    public void setOldbalancepaid(Long oldbalancepaid) {
        this.oldbalancepaid = oldbalancepaid;
    }

    public Long getOldbalancebal() {
        return oldbalancebal;
    }

    public void setOldbalancebal(Long oldbalancebal) {
        this.oldbalancebal = oldbalancebal;
    }

    public Long getGroupinsurancetot() {
        return groupinsurancetot;
    }

    public void setGroupinsurancetot(Long groupinsurancetot) {
        this.groupinsurancetot = groupinsurancetot;
    }

    public Long getGroupinsurancepaid() {
        return groupinsurancepaid;
    }

    public void setGroupinsurancepaid(Long groupinsurancepaid) {
        this.groupinsurancepaid = groupinsurancepaid;
    }

    public Long getGroupinsurancebal() {
        return groupinsurancebal;
    }

    public void setGroupinsurancebal(Long groupinsurancebal) {
        this.groupinsurancebal = groupinsurancebal;
    }

    public Long getOthersfeestot() {
        return othersfeestot;
    }

    public void setOthersfeestot(Long othersfeestot) {
        this.othersfeestot = othersfeestot;
    }

    public Long getOthersfeespaid() {
        return othersfeespaid;
    }

    public void setOthersfeespaid(Long othersfeespaid) {
        this.othersfeespaid = othersfeespaid;
    }

    public Long getOthersfeesbal() {
        return othersfeesbal;
    }

    public void setOthersfeesbal(Long othersfeesbal) {
        this.othersfeesbal = othersfeesbal;
    }

    public Long getTotfeestot() {
        return totfeestot;
    }

    public void setTotfeestot(Long totfeestot) {
        this.totfeestot = totfeestot;
    }

    public Long getTotfeespaid() {
        return totfeespaid;
    }

    public void setTotfeespaid(Long totfeespaid) {
        this.totfeespaid = totfeespaid;
    }

    public Long getTotfeesbal() {
        return totfeesbal;
    }

    public void setTotfeesbal(Long totfeesbal) {
        this.totfeesbal = totfeesbal;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Long getChequeno() {
        return chequeno;
    }

    public void setChequeno(Long chequeno) {
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

    public Long getNoofprint() {
        return noofprint;
    }

    public void setNoofprint(Long noofprint) {
        this.noofprint = noofprint;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
