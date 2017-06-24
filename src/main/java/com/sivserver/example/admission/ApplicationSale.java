package com.sivserver.example.admission;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "applicationsale")
public class ApplicationSale {


    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getApplno() {
        return applno;
    }
    public void setApplno(String applno) {
        this.applno = applno;
    }

    public Date getSaleDate() {
        return saledate;
    }
    public void setSaleDate(Date saledate) {
        this.saledate = saledate;
    }

    public String getAppFor() {
        return appfor;
    }
    public void setAppFor(String appfor) {
        this.appfor = appfor;
    }

    public String getCandFirstName() {
        return candfirstname;
    }
    public void setCandFirstName(String candfirstname) {
        this.candfirstname = candfirstname;
    }

    public String getCandMidName() {
        return candmiddlename;
    }
    public void setCandMidName(String candmiddlename) {
        this.candmiddlename = candmiddlename;
    }

    public String getCandLastName() {
        return candlastname;
    }
    public void setCandLastName(String candlastname) {
        this.candlastname = candlastname;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFatherName() {
        return candfathername;
    }
    public void setFatherName(String candfathername) {
        this.candfathername = candfathername;
    }

    public String getMotherName() {
        return candmothername;
    }
    public void setMotherName(String candmothername) {
        this.candmothername = candmothername;
    }

    public String getPreAdd1() {
        return presentaddress1;
    }
    public void setPreAdd1(String presentaddress1) {
        this.presentaddress1 = presentaddress1;
    }

    public String getPreAdd2() {
        return presentaddress2;
    }
    public void setPreAdd2(String presentaddress2) {
        this.presentaddress2 = presentaddress2;
    }

    public String getPreArea() {
        return presentarea;
    }
    public void setPreArea(String presentarea) {
        this.presentarea = presentarea;
    }

    public String getPrePin() {
        return presentpincode;
    }
    public void setPrePin(String presentpincode) {
        this.presentpincode = presentpincode;
    }

    public String getPreState() {
        return presentstate;
    }
    public void setPreState(String presentstate) {
        this.presentstate = presentstate;
    }

    public String getPreMobno() {
        return presentmobileno;
    }
    public void setPreMobno(String presentmobileno) {
        this.presentmobileno = presentmobileno;
    }

    public String getPreAltMobno() {
        return presentaltmobno;
    }
    public void setPreAltMobno(String presentaltmobno) {
        this.presentaltmobno = presentaltmobno;}

    public String getPreEmail() {
        return presentemail;
    }
    public void setPreEmail(String presentemail) {
        this.presentemail = presentemail;
    }

    public String getPreAltEmail() {
        return presentaltemail;
    }
    public void setPreAltEmail(String presentaltemail) {
        this.presentaltemail = presentaltemail;
    }

    public String getPerAdd1() {
        return permanentaddress1;
    }
    public void setPerAdd1(String permanentaddress1) {
        this.permanentaddress1 = permanentaddress1;
    }

    public String getPerAdd2() {
        return permanentaddress2;
    }
    public void setPerAdd2(String permanentaddress2) {
        this.permanentaddress2 = permanentaddress2;
    }

    public String getPerArea() {
        return permanentarea;
    }
    public void setPerArea(String permanentarea) {
        this.permanentarea = permanentarea;
    }

    public String getPerPin() {
        return peramanentpincode;
    }
    public void setPerPin(String peramanentpincode) {
        this.peramanentpincode = peramanentpincode;
    }

    public String getPerState() {
        return permanentstate;
    }
    public void setPerState(String permanentstate) {
        this.permanentstate = permanentstate;
    }

    public String getPerMobno() {
        return permanentmobileno;
    }
    public void setPerMobno(String permanentmobileno) {
        this.permanentmobileno = permanentmobileno;
    }

    public String getPerAltMobno() {
        return permanentaltmobno;
    }
    public void setPerAltMobno(String permanentaltmobno) {
        this.permanentaltmobno = permanentaltmobno;}

    public String getPerEmail() {
        return permanentemail;
    }
    public void setPerEmail(String permanentemail) {
        this.permanentemail = permanentemail;
    }

    public String getPerAltEmail() {
        return permanentaltemail;
    }
    public void setPerAltEmail(String permanentaltemail) {
        this.permanentaltemail = permanentaltemail;
    }

    public String getQualified() {
        return qualified;
    }
    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getPreCour1() {
        return prefferedcour1;
    }
    public void setPreCour1(String prefferedcour1) {
        this.prefferedcour1 = prefferedcour1;
    }

    public String getPreCour2() {
        return prefferedcour2;
    }
    public void setPreCour2(String prefferedcour2) {
        this.prefferedcour2 = prefferedcour2;
    }

    public String getPreCour3() {
        return prefferedcour3;
    }
    public void setPreCour3(String prefferedcour3) {
        this.prefferedcour3 = prefferedcour3;
    }

    public String getWillingness() {
        return willingtojoin;
    }
    public void setWillingness(String willingtojoin) {
        this.willingtojoin = willingtojoin;
    }

    public Date getProbDate() {
        return followupdate;
    }
    public void setProbDate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public Integer getAppFee() {
        return applicationprice;
    }
    public void setAppFee(Integer applicationprice) {
        this.applicationprice = applicationprice;
    }

    public String getAppFeeMode() {
        return applicationpaidmode;
    }
    public void setAppFeeMode(String applicationpaidmode) {
        this.applicationpaidmode = applicationpaidmode;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

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
    private String category;


    @Id
    private String applno;

    @NotNull
    private Date saledate;

    @NotNull
    private String appfor;

    @NotNull
    private String candfirstname;

    @NotNull
    private String candmiddlename;

    @NotNull
    private String candlastname;

    @NotNull
    private String gender;

    @NotNull
    private String candfathername;

    @NotNull
    private String candmothername;

    @NotNull
    private String presentaddress1;

    @NotNull
    private String presentaddress2;

    @NotNull
    private String presentarea;

    @NotNull
    private String presentpincode;

    @NotNull
    private String presentstate;

    @NotNull
    private String presentmobileno;

    @NotNull
    private String presentaltmobno;

    @NotNull
    private String presentemail;

    @NotNull
    private String presentaltemail;

    @NotNull
    private String permanentaddress1;

    @NotNull
    private String permanentaddress2;

    @NotNull
    private String permanentarea;

    @NotNull
    private String peramanentpincode;

    @NotNull
    private String permanentstate;

    @NotNull
    private String permanentmobileno;

    @NotNull
    private String permanentaltmobno;

    @NotNull
    private String permanentemail;

    @NotNull
    private String permanentaltemail;

    @NotNull
    private String qualified;

    @NotNull
    private String prefferedcour1;

    @NotNull
    private String prefferedcour2;

    @NotNull
    private String prefferedcour3;

    @NotNull
    private String willingtojoin;

    @NotNull
    private Date followupdate;

    @NotNull
    private Integer applicationprice;

    @NotNull
    private String applicationpaidmode;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;

//    @ManyToOne
//    @JoinColumn(name="application_no")
//    private AdmissionCounselling applicationno;

}
