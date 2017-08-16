package com.sivserver.example.admission;

import org.hibernate.annotations.NaturalId;

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

    public ApplicationSale()
    {

    }

    public ApplicationSale(String applno)
    {
        this.applno=applno;

    }

    public ApplicationSale(String category,String applno,Date saledate,
                           String appfor,String candfirstname,String candmiddlename,
                           String candlastname,String gender,String candfathername,
                           String candmothername,String presentaddress1,String presentaddress2,
                           String presentarea,String presentpincode,String presentstate,
                           String presentmobileno,String presentaltmobno,String presentemail,
                           String presentaltemail,String permanentaddress1,String permanentaddress2,
                           String permanentarea,String permanentpincode,String permanentstate,
                           String permanentmobileno,String permanentaltmobno,String permanentemail,
                           String permanentaltemail,String qualified,String prefferedcour1,
                           String prefferedcour2,String prefferedcour3,String reference,
                           String willingtojoin,Date followupdate,Integer applicationprice,
                           String applicationpaidmode,String remarks,String loginuser)
                {
                    this.category=category;
                    this.applno=applno;
                    this.saledate=saledate;
                    this.appfor=appfor;
                    this.candfirstname=candfirstname;
                    this.candmiddlename=candmiddlename;
                    this.candlastname=candlastname;
                    this.gender=gender;
                    this.candfathername=candfathername;
                    this.candmothername=candmothername;
                    this.presentaddress1=presentaddress1;
                    this.presentaddress2=presentaddress2;
                    this.presentarea=presentarea;
                    this.presentpincode=presentpincode;
                    this.presentstate=presentstate;
                    this.presentmobileno=presentmobileno;
                    this.presentaltmobno=presentaltmobno;
                    this.presentemail=presentemail;
                    this.presentaltemail=presentaltemail;
                    this.permanentaddress1=permanentaddress1;
                    this.permanentaddress2=permanentaddress2;
                    this.permanentarea=permanentarea;
                    this.permanentpincode=permanentpincode;
                    this.permanentstate=permanentstate;
                    this.permanentmobileno=permanentmobileno;
                    this.permanentaltmobno=permanentaltmobno;
                    this.permanentemail=permanentemail;
                    this.permanentaltemail=permanentaltemail;
                    this.qualified=qualified;
                    this.prefferedcour1=prefferedcour1;
                    this.prefferedcour2=prefferedcour2;
                    this.prefferedcour3=prefferedcour3;
                    this.reference=reference;
                    this.willingtojoin=willingtojoin;
                    this.followupdate=followupdate;
                    this.applicationprice=applicationprice;
                    this.applicationpaidmode=applicationpaidmode;
                    this.remarks=remarks;
                    this.loginuser=loginuser;

    }

    public long getId() {

        return id;
    }

        public void setId(long id) {
          this.id = id;
     }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public AdmissionCounselling getCounsellingid() {return counsellingid;}
    public void setCounsellingid(AdmissionCounselling counsellingid) {this.counsellingid=counsellingid;}

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

    //public long getId() {

    //return id;
     //     }

    //    public void setId(long id) {
  //      this.id = id;
  // }

   @Id
   @Column(name="APPLICATION_ID")
   @GeneratedValue(strategy= GenerationType.AUTO)
   private long id;

    @NotNull
    private String category;

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "COUNSELLING_ID")
     private AdmissionCounselling counsellingid;

    //@Id
    //@Column(name = "application_no")
   // @GeneratedValue(strategy = G )
    @NaturalId(mutable = false)

    @Column(name = "applno", unique = true,nullable = false, length = 100)
    private String applno;

    //@NaturalId
    //private String applno;

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
    private String permanentpincode;

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
    private String reference;

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

   //http://www.codejava.net/frameworks/hibernate/hibernate-one-to-one-mapping-with-foreign-key-annotations-example

    //@ManyToOne This will insert more than one row with same value in child table
    //@OneToOne
    //@JoinColumn(name="application_no")
    //private AdmissionCounselling applicationno;

}
