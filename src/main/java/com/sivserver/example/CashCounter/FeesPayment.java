package com.sivserver.example.CashCounter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 26-Jun-17.
 */
@Entity
@Table(name = "feespayment")
public class FeesPayment {

    public Date getDate(){
        return date;
    }
    public void setDate(Date date) {this.date = date;}

    public String getBillNo() {
        return billno;
    }
    public void setBillNo(String billno) {
        this.billno = billno;
    }

    public String getRegNo() {
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo() {
        return admissionno;
    }
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBranchName() {
        return branchname;
    }
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getPaymentMethod() {
        return paymentmethod;
    }
    public void setPaymentMethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Long getAdmissionFeesTotal() {
        return admnfeestot;
    }
    public void setAdmissionFeesTotal(Long admnfeestot) {
        this.admnfeestot = admnfeestot;
    }

    public Long getAdmissionFeesPaid() {
        return admnfeespaid;
    }
    public void setAdmissionFeesPaid(Long admnfeespaid) {
        this.admnfeespaid = admnfeespaid;
    }

    public Long getAdmissionFeesBalance() {
        return admnfeesbal;
    }
    public void setAdmissionFeesBalance(Long admnfeesbal) {
        this.admnfeesbal = admnfeesbal;
    }

    public Long getTutionFeesTotal() {
        return tutionfeestot;
    }
    public void setTutionFeesTotal(Long tutionfeestot) {
        this.tutionfeestot = tutionfeestot;
    }

    public Long getTutionFeesPaid() {
        return tutionfeespaid;
    }
    public void setTutionFeesPaid(Long tutionfeespaid) {
        this.tutionfeespaid = tutionfeespaid;
    }

    public Long getTutionFeesBalance() {
        return tutionfeesbal;
    }
    public void setTutionFeesBalance(Long tutionfeesbal) {
        this.tutionfeesbal = tutionfeesbal;
    }

    public Long getTransportFeesTotal() {
        return transfeestot;
    }
    public void setTransportFeesTotal(Long transfeestot) {
        this.transfeestot = transfeestot;
    }

    public Long getTransportFeesPaid() {
        return transfeespaid;
    }
    public void setTransportFeesPaid(Long transfeespaid) {
        this.transfeespaid = transfeespaid;
    }

    public Long getTransportFeesBalance() {
        return transfeesbal;
    }
    public void setTransportFeesBalance(Long transfeesbal) {
        this.transfeesbal = transfeesbal;
    }

    public Long getHostelFeesTotal() {
        return hostfeestot;
    }
    public void setHostelFeesTotal(Long hostfeestot) {
        this.hostfeestot = hostfeestot;
    }

    public Long getHostelFeesPaid() {
        return hostfeespaid;
    }
    public void setHostelFeesPaid(Long hostfeespaid) {
        this.hostfeespaid = hostfeespaid;
    }

    public Long getHostelFeesBalance() {
        return hostfeesbal;
    }
    public void setHostelFeesBalance(Long hostfeesbal) {
        this.hostfeesbal = hostfeesbal;
    }

    public Long getFoodFeesTotal() {
        return foodfeestot;
    }
    public void setFoodFeesTotal(Long foodfeestot) {
        this.foodfeestot = foodfeestot;
    }

    public Long getFoodFeesPaid() {
        return foodfeespaid;
    }
    public void setFoodFeesPaid(Long foodfeespaid) {
        this.foodfeespaid = foodfeespaid;
    }

    public Long getFoodFeesBalance() {
        return foodfeesbal;
    }
    public void setFoodFeesBalance(Long foodfeesbal) {
        this.foodfeesbal = foodfeesbal;
    }


    public Long getTextBookFeesTotal() {
        return txtbookfeestot;
    }
    public void setTextBookFeesTotal(Long txtbookfeestot) {
        this.txtbookfeestot = txtbookfeestot;
    }

    public Long getTextBookFeesPaid() {
        return txtbookfeespaid;
    }
    public void setTextBookFeesPaid(Long txtbookfeespaid) {
        this.txtbookfeespaid = txtbookfeespaid;
    }

    public Long getTextBookFeesBalance() {
        return txtbookfeesbal;
    }
    public void setTextBookFeesBalance(Long txtbookfeesbal) {
        this.txtbookfeesbal = txtbookfeesbal;
    }

    public Long getMiscalleneousFeesTotal() {
        return miscfeestot;
    }
    public void setMiscalleneousFeesTotal(Long miscfeestot) {
        this.miscfeestot = miscfeestot;
    }

    public Long getMiscalleneousFeesPaid() {
        return miscfeespaid;
    }
    public void setMiscalleneousFeesPaid(Long miscfeespaid) {
        this.miscfeespaid = miscfeespaid;
    }

    public Long getMiscalleneousFeesBalance() {
        return miscfeesbal;
    }
    public void setMiscalleneousFeesBalance(Long miscfeesbal) {
        this.miscfeesbal = miscfeesbal;
    }

    public Long getSpecialFeesTotal() {
        return splfeestot;
    }
    public void setSpecialFeesTotal(Long splfeestot) {
        this.splfeestot = splfeestot;
    }

    public Long getSpecialFeesPaid() {
        return splfeespaid;
    }
    public void setSpecialFeesPaid(Long splfeespaid) {
        this.splfeespaid = splfeespaid;
    }


    public Long getSpecialFeesBalance() {
        return splfeesbal;
    }
    public void setSpecialFeesBalance(Long splfeesbal) {
        this.splfeesbal = splfeesbal;
    }

    public Long getPenaltyFeesTotal() {
        return penaltyfeestot;
    }
    public void setPenaltyFeesTotal(Long penaltyfeestot) {
        this.penaltyfeestot = penaltyfeestot;
    }

    public Long getPenaltyFeesPaid() {
        return penaltyfeespaid;
    }
    public void setPenaltyFeesPaid(Long penaltyfeespaid) {
        this.penaltyfeespaid = penaltyfeespaid;
    }

    public Long getPenaltyFeesBalance() {
        return penaltyfeesbal;
    }
    public void setPenaltyFeesBalance(Long penaltyfeesbal) {
        this.penaltyfeesbal = penaltyfeesbal;
    }

    public Long getOldBalanceTotal() {
        return oldbalancetot;
    }
    public void setOldBalanceTotal(Long oldbalancetot) {
        this.oldbalancetot = oldbalancetot;
    }

    public Long getOldBalancePaid() {
        return oldbalancepaid;
    }
    public void setOldBalancePaid(Long oldbalancepaid) {
        this.oldbalancepaid = oldbalancepaid;
    }

    public Long getOldBalanceBalance() {
        return oldbalancebal;
    }
    public void setOldBalanceBalance(Long oldbalancebal) {
        this.oldbalancebal = oldbalancebal;
    }

    public Long getGroupInsuranceTotal() {
        return groupinsurancetot;
    }
    public void setGroupInsuranceTotal(Long groupinsurancetot) {
        this.groupinsurancetot = groupinsurancetot;
    }

    public Long getGroupInsurancePaid() {
        return groupinsurancepaid;
    }
    public void setGroupInsurancePaid(Long groupinsurancepaid) {
        this.groupinsurancepaid = groupinsurancepaid;
    }

    public Long getGroupInsuranceBalance() {
        return groupinsurancebal;
    }
    public void setGroupInsuranceBalance(Long groupinsurancebal) {
        this.groupinsurancebal = groupinsurancebal;
    }

    public Long getOthersFeesTotal() {
        return othersfeestot;
    }
    public void setOthersFeesTotal(Long othersfeestot) {
        this.othersfeestot = othersfeestot;
    }

    public Long getOthersFeesPaid() {
        return othersfeespaid;
    }
    public void setOthersFeesPaid(Long othersfeespaid) {this.othersfeespaid = othersfeespaid; }

    public Long getOthersFeesBalance() {
        return othersfeesbal;
    }
    public void setOthersFeesBalance(Long othersfeesbal) {this.othersfeesbal = othersfeesbal; }

    public Long getTotalFeesTotal() {
        return totfeestot;
    }
    public void setTotalFeesTotal(Long totfeestot) {this.totfeestot = totfeestot; }

    public Long getTotalFeesPaid() {
        return totfeespaid;
    }
    public void setTotalFeesPaid(Long totfeespaid) {this.totfeespaid = totfeespaid; }

    public Long getTotalFeesBalance() {
        return totfeesbal;
    }
    public void setTotalFeesBalance(Long totfeesbal) {this.totfeesbal = totfeesbal; }

    public Date getDueDate() {
        return duedate;
    }
    public void setDueDate(Date duedate) {this.duedate = duedate; }

    public Long getChequeNo() {
        return chequeno;
    }
    public void setChequeNo(Long chequeno) {this.chequeno = chequeno; }

    public Date getChecqueDate() {
        return chequedate;
    }
    public void setChequeDate(Date chequedate) {this.chequedate = chequedate; }

    public String getBankName() {return bankname; }
    public void setBankName(String bankname) {this.bankname = bankname; }

    public Long getNoofprint() {return noofprint; }
    public void setNoofprint(Long noofprint) {this.noofprint = noofprint; }

    public String getLoginUser() {return loginuser; }
    public void setLoginUser(String loginuser) {this.loginuser = loginuser; }
    //   public long getId() {

//    return id;
//          }

    ///       public void setId(long id) {
    //       this.id = id;
//   }

    //   @Id
    //   @GeneratedValue(strategy= GenerationType.AUTO)
//    long id;

    @NotNull
    private Date date;


    @Id
    private String billno;

    @NotNull
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String name;

    @NotNull
    private String branchcode;

    @NotNull
    private String branchname;

    @NotNull
    private String semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String paymentmethod;

    @NotNull
    private Long admnfeestot;

    @NotNull
    private Long admnfeespaid;

    @NotNull
    private Long admnfeesbal;

    @NotNull
    private Long tutionfeestot;

    @NotNull
    private Long tutionfeespaid;

    @NotNull
    private Long tutionfeesbal;

    @NotNull
    private Long transfeestot;

    @NotNull
    private Long transfeespaid;

    @NotNull
    private Long transfeesbal;

    @NotNull
    private Long hostfeestot;

    @NotNull
    private Long hostfeespaid;

    @NotNull
    private Long hostfeesbal;

    @NotNull
    private Long foodfeestot;

    @NotNull
    private Long foodfeespaid;

    @NotNull
    private Long foodfeesbal;

    @NotNull
    private Long txtbookfeestot;

    @NotNull
    private Long txtbookfeespaid;

    @NotNull
    private Long txtbookfeesbal;

    @NotNull
    private Long miscfeestot;

    @NotNull
    private Long miscfeespaid;

    @NotNull
    private Long miscfeesbal;

    @NotNull
    private Long splfeestot;

    @NotNull
    private Long splfeespaid;

    @NotNull
    private Long splfeesbal;

    @NotNull
    private Long penaltyfeestot;

    @NotNull
    private Long penaltyfeespaid;

    @NotNull
    private Long penaltyfeesbal;

    @NotNull
    private Long oldbalancetot;

    @NotNull
    private Long oldbalancepaid;

    @NotNull
    private Long oldbalancebal;

    @NotNull
    private Long groupinsurancetot;

    @NotNull
    private Long groupinsurancepaid;

    @NotNull
    private Long groupinsurancebal;

    @NotNull
    private Long othersfeestot;

    @NotNull
    private Long othersfeespaid;

    @NotNull
    private Long othersfeesbal;

    @NotNull
    private Long totfeestot;

    @NotNull
    private Long totfeespaid;

    @NotNull
    private Long totfeesbal;

    @NotNull
    private Date duedate;

    @NotNull
    private Long chequeno;

    @NotNull
    private Date chequedate;

    @NotNull
    private String bankname;

    @NotNull
    private Long noofprint;

    @NotNull
    private String loginuser;

    }
