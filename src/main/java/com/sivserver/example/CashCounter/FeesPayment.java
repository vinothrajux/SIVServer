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

    public Date getdate(){
        return date;
    }
    public void setdate(Date date) {this.date = date;}

    public String getBillno() {return billno;}
    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getRegno() {
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
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

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }
    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public Long getAdmissionfeestotal() {
        return admnfeestot;
    }
    public void setAdmissionfeestotal(Long admnfeestot) {
        this.admnfeestot = admnfeestot;
    }

    public Long getAdmissionfeespaid() {
        return admnfeespaid;
    }
    public void setAdmissionfeespaid(Long admnfeespaid) {
        this.admnfeespaid = admnfeespaid;
    }

    public Long getAdmissionfeesbalance() {
        return admnfeesbal;
    }
    public void setAdmissionFeesBalance(Long admnfeesbal) {
        this.admnfeesbal = admnfeesbal;
    }

    public Long getTutionfeestotal() {
        return tutionfeestot;
    }
    public void setTutionfeestotal(Long tutionfeestot) {
        this.tutionfeestot = tutionfeestot;
    }

    public Long getTutionfeespaid() {
        return tutionfeespaid;
    }
    public void setTutionfeespaid(Long tutionfeespaid) {
        this.tutionfeespaid = tutionfeespaid;
    }

    public Long getTutionfeesbalance() {
        return tutionfeesbal;
    }
    public void setTutionfeesbalance(Long tutionfeesbal) {
        this.tutionfeesbal = tutionfeesbal;
    }

    public Long getTransportfeestotal() {
        return transfeestot;
    }
    public void setTransportfeestotal(Long transfeestot) {
        this.transfeestot = transfeestot;
    }

    public Long getTransportfeespaid() {
        return transfeespaid;
    }
    public void setTransportfeespaid(Long transfeespaid) {
        this.transfeespaid = transfeespaid;
    }

    public Long getTransportfeesbalance() {
        return transfeesbal;
    }
    public void setTransportfeesbalance(Long transfeesbal) {
        this.transfeesbal = transfeesbal;
    }

    public Long getHostelfeestotal() {
        return hostfeestot;
    }
    public void setHostelfeestotal(Long hostfeestot) {
        this.hostfeestot = hostfeestot;
    }

    public Long getHostelfeespaid() {
        return hostfeespaid;
    }
    public void setHostelfeespaid(Long hostfeespaid) {
        this.hostfeespaid = hostfeespaid;
    }

    public Long getHostelfeesbalance() {
        return hostfeesbal;
    }
    public void setHostelfeesbalance(Long hostfeesbal) {
        this.hostfeesbal = hostfeesbal;
    }

    public Long getFoodfeestotal() {
        return foodfeestot;
    }
    public void setFoodfeestotal(Long foodfeestot) {
        this.foodfeestot = foodfeestot;
    }

    public Long getFoodfeespaid() {
        return foodfeespaid;
    }
    public void setFoodfeespaid(Long foodfeespaid) {
        this.foodfeespaid = foodfeespaid;
    }

    public Long getFoodfeesbalance() {
        return foodfeesbal;
    }
    public void setFoodfeesbalance(Long foodfeesbal) {
        this.foodfeesbal = foodfeesbal;
    }


    public Long getTextbookfeestotal() {
        return txtbookfeestot;
    }
    public void setTextbookfeestotal(Long txtbookfeestot) {
        this.txtbookfeestot = txtbookfeestot;
    }

    public Long getTextbookfeespaid() {
        return txtbookfeespaid;
    }
    public void setTextbookfeespaid(Long txtbookfeespaid) {
        this.txtbookfeespaid = txtbookfeespaid;
    }

    public Long getTextbookfeesbalance() {
        return txtbookfeesbal;
    }
    public void setTextbookfeesbalance(Long txtbookfeesbal) {
        this.txtbookfeesbal = txtbookfeesbal;
    }

    public Long getMiscalleneousfeestotal() {
        return miscfeestot;
    }
    public void setMiscalleneousfeestotal(Long miscfeestot) {
        this.miscfeestot = miscfeestot;
    }

    public Long getMiscalleneousfeespaid() {
        return miscfeespaid;
    }
    public void setMiscalleneousfeespaid(Long miscfeespaid) {
        this.miscfeespaid = miscfeespaid;
    }

    public Long getMiscalleneousfeesbalance() {
        return miscfeesbal;
    }
    public void setMiscalleneousfeesbalance(Long miscfeesbal) {
        this.miscfeesbal = miscfeesbal;
    }

    public Long getSpecialfeestotal() {
        return splfeestot;
    }
    public void setSpecialfeestotal(Long splfeestot) {
        this.splfeestot = splfeestot;
    }

    public Long getSpecialfeespaid() {
        return splfeespaid;
    }
    public void setSpecialfeespaid(Long splfeespaid) {
        this.splfeespaid = splfeespaid;
    }


    public Long getSpecialfeesbalance() {
        return splfeesbal;
    }
    public void setSpecialfeesbalance(Long splfeesbal) {
        this.splfeesbal = splfeesbal;
    }

    public Long getPenaltyfeestotal() {
        return penaltyfeestot;
    }
    public void setPenaltyfeestotal(Long penaltyfeestot) {
        this.penaltyfeestot = penaltyfeestot;
    }

    public Long getPenaltyfeespaid() {
        return penaltyfeespaid;
    }
    public void setPenaltyfeespaid(Long penaltyfeespaid) {
        this.penaltyfeespaid = penaltyfeespaid;
    }

    public Long getPenaltyfeesbalance() {
        return penaltyfeesbal;
    }
    public void setPenaltyfeesbalance(Long penaltyfeesbal) {
        this.penaltyfeesbal = penaltyfeesbal;
    }

    public Long getOldbalancetotal() {
        return oldbalancetot;
    }
    public void setOldbalancetotal(Long oldbalancetot) {
        this.oldbalancetot = oldbalancetot;
    }

    public Long getOldbalancepaid() {
        return oldbalancepaid;
    }
    public void setOldbalancepaid(Long oldbalancepaid) {
        this.oldbalancepaid = oldbalancepaid;
    }

    public Long getOldbalancebalance() {
        return oldbalancebal;
    }
    public void setOldbalancebalance(Long oldbalancebal) {
        this.oldbalancebal = oldbalancebal;
    }

    public Long getGroupinsurancetotal() {
        return groupinsurancetot;
    }
    public void setGroupinsurancetotal(Long groupinsurancetot) {
        this.groupinsurancetot = groupinsurancetot;
    }

    public Long getGroupinsurancepaid() {
        return groupinsurancepaid;
    }
    public void setGroupinsurancepaid(Long groupinsurancepaid) {
        this.groupinsurancepaid = groupinsurancepaid;
    }

    public Long getGroupinsurancebalance() {
        return groupinsurancebal;
    }
    public void setGroupinsurancebalance(Long groupinsurancebal) {
        this.groupinsurancebal = groupinsurancebal;
    }

    public Long getOthersfeestotal() {
        return othersfeestot;
    }
    public void setOthersfeestotal(Long othersfeestot) {
        this.othersfeestot = othersfeestot;
    }

    public Long getOthersfeespaid() {
        return othersfeespaid;
    }
    public void setOthersfeespaid(Long othersfeespaid) {this.othersfeespaid = othersfeespaid; }

    public Long getOthersfeesbalance() {
        return othersfeesbal;
    }
    public void setOthersfeesbalance(Long othersfeesbal) {this.othersfeesbal = othersfeesbal; }

    public Long getTotalfeestotal() {
        return totfeestot;
    }
    public void setTotalfeestotal(Long totfeestot) {this.totfeestot = totfeestot; }

    public Long getTotalfeespaid() {
        return totfeespaid;
    }
    public void setTotalfeespaid(Long totfeespaid) {this.totfeespaid = totfeespaid; }

    public Long getTotalfeesbalance() {
        return totfeesbal;
    }
    public void setTotalfeesbalance(Long totfeesbal) {this.totfeesbal = totfeesbal; }

    public Date getDuedate() {
        return duedate;
    }
    public void setDuedate(Date duedate) {this.duedate = duedate; }

    public Long getChequeno() {
        return chequeno;
    }
    public void setChequeno(Long chequeno) {this.chequeno = chequeno; }

    public Date getChecquedate() {
        return chequedate;
    }
    public void setChequedate(Date chequedate) {this.chequedate = chequedate; }

    public String getBankname() {return bankname; }
    public void setBankname(String bankname) {this.bankname = bankname; }

    public Long getNoofprint() {return noofprint; }
    public void setNoofprint(Long noofprint) {this.noofprint = noofprint; }

    public String getLoginuser() {return loginuser; }
    public void setLoginuser(String loginuser) {this.loginuser = loginuser; }
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
