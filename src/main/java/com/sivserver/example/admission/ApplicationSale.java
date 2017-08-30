package com.sivserver.example.admission;


import java.util.Date;
import javax.persistence.*;


/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "applicationsale")
public class ApplicationSale {

    public ApplicationSale()
    {

    }

    public ApplicationSale(String applno)
    {
        this.applno=applno;

    }

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

    public Date getSaledate() {
        return saledate;
    }
    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public String getAppfor() {
        return appfor;
    }
    public void setAppfor(String appfor) {
        this.appfor = appfor;
    }

    public String getCandfirstname() {
        return candfirstname;
    }
    public void setCandfirstname(String candfirstname) {
        this.candfirstname = candfirstname;
    }

    public String getCandmiddlename() {
        return candmiddlename;
    }
    public void setCandmidlename(String candmiddlename) {
        this.candmiddlename = candmiddlename;
    }

    public String getCandlastname() {
        return candlastname;
    }
    public void setCandlastname(String candlastname) {
        this.candlastname = candlastname;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCandfathername() {
        return candfathername;
    }
    public void setCandfathername(String candfathername) {
        this.candfathername = candfathername;
    }

    public String getCandmothername() {
        return candmothername;
    }
    public void setCandmothername(String candmothername) {
        this.candmothername = candmothername;
    }

    public String getPresentaddress1() {
        return presentaddress1;
    }
    public void setPresentaddress1(String presentaddress1) {
        this.presentaddress1 = presentaddress1;
    }

    public String getPresentaddress2() {
        return presentaddress2;
    }
    public void setPresentaddress2(String presentaddress2) {
        this.presentaddress2 = presentaddress2;
    }

    public String getPresentarea() {
        return presentarea;
    }
    public void setPresentarea(String presentarea) {
        this.presentarea = presentarea;
    }

    public String getPresentpincode() {
        return presentpincode;
    }
    public void setPresentpincode(String presentpincode) {
        this.presentpincode = presentpincode;
    }

    public String getPresentstate() {
        return presentstate;
    }
    public void setPresentstate(String presentstate) {
        this.presentstate = presentstate;
    }

    public String getPresentmobileno() {
        return presentmobileno;
    }
    public void setPresentmobileno(String presentmobileno) {
        this.presentmobileno = presentmobileno;
    }

    public String getPresentaltmobno() {
        return presentaltmobno;
    }
    public void setPresentaltmobno(String presentaltmobno) {
        this.presentaltmobno = presentaltmobno;}

    public String getPresentemail() {
        return presentemail;
    }
    public void setPresentemail(String presentemail) {
        this.presentemail = presentemail;
    }

    public String getPresentaltemail() {
        return presentaltemail;
    }
    public void setPresentaltemail(String presentaltemail) {
        this.presentaltemail = presentaltemail;
    }

    public String getPermanentaddress1() {
        return permanentaddress1;
    }
    public void setPermanentaddress1(String permanentaddress1) {
        this.permanentaddress1 = permanentaddress1;
    }

    public String getPermanentaddress2() {
        return permanentaddress2;
    }
    public void setPermanentaddress2(String permanentaddress2) {
        this.permanentaddress2 = permanentaddress2;
    }

    public String getPermanentarea() {
        return permanentarea;
    }
    public void setPermanentarea(String permanentarea) {
        this.permanentarea = permanentarea;
    }

    public String getPermanentpincode() {
        return permanentpincode;
    }
    public void setPermanentpincode(String permanentpincode) {
        this.permanentpincode = permanentpincode;
    }

    public String getPermanentstate() {
        return permanentstate;
    }
    public void setPermanentstate(String permanentstate) {
        this.permanentstate = permanentstate;
    }

    public String getPermanentmobileno() {
        return permanentmobileno;
    }
    public void setPermanentmobileno(String permanentmobileno) {
        this.permanentmobileno = permanentmobileno;
    }

    public String getPermanentaltmobno() {
        return permanentaltmobno;
    }
    public void setPermanentaltmobno(String permanentaltmobno) {
        this.permanentaltmobno = permanentaltmobno;}

    public String getPermanentemail() {
        return permanentemail;
    }
    public void setPermanentemail(String permanentemail) {
        this.permanentemail = permanentemail;
    }

    public String getPermanentaltemail() {
        return permanentaltemail;
    }
    public void setPermanentaltemail(String permanentaltemail) {
        this.permanentaltemail = permanentaltemail;
    }

    public String getQualified() {
        return qualified;
    }
    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getPrefferedcour1() {
        return prefferedcour1;
    }
    public void setPrefferedcour1(String prefferedcour1) {
        this.prefferedcour1 = prefferedcour1;
    }

    public String getPrefferedcour2() {
        return prefferedcour2;
    }
    public void setPrefferedcour2(String prefferedcour2) {
        this.prefferedcour2 = prefferedcour2;
    }

    public String getPrefferedcour3() {
        return prefferedcour3;
    }
    public void setPrefferedcour3(String prefferedcour3) {
        this.prefferedcour3 = prefferedcour3;
    }

    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getWillingtojoin() {
        return willingtojoin;
    }
    public void setWillingtojoin(String willingtojoin) {
        this.willingtojoin = willingtojoin;
    }

    public Date getFollowupdate() {
        return followupdate;
    }
    public void setFollowupdate(Date followupdate) {
        this.followupdate = followupdate;
    }

    public Integer getApplicationprice() {
        return applicationprice;
    }
    public void setApplicationprice(Integer applicationprice) {
        this.applicationprice = applicationprice;
    }

    public String getApplicationpaidmode() {
        return applicationpaidmode;
    }
    public void setApplicationpaidmode(String applicationpaidmode) {
        this.applicationpaidmode = applicationpaidmode;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    @Column(name="applno",nullable = false)
    private String applno;


    private String category;


    private Date saledate;


    private String appfor;


    private String candfirstname;


    private String candmiddlename;


    private String candlastname;


    private String gender;


    private String candfathername;


    private String candmothername;


    private String presentaddress1;


    private String presentaddress2;


    private String presentarea;


    private String presentpincode;


    private String presentstate;


    private String presentmobileno;


    private String presentaltmobno;


    private String presentemail;


    private String presentaltemail;


    private String permanentaddress1;


    private String permanentaddress2;


    private String permanentarea;


    private String permanentpincode;


    private String permanentstate;


    private String permanentmobileno;


    private String permanentaltmobno;


    private String permanentemail;


    private String permanentaltemail;


    private String qualified;


    private String prefferedcour1;


    private String prefferedcour2;


    private String prefferedcour3;


    private String reference;


    private String willingtojoin;


    private Date followupdate;


    private Integer applicationprice;


    private String applicationpaidmode;


    private String remarks;


    private String loginuser;


}
