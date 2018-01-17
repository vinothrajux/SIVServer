package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 25/10/2017.
 */
@Entity
@Table(name="applicationsaleplayschool")
public class ApplicationSalePlaySchool {
    @Id
    private String applno;

    private String category;

    private Date saledate;

    private String appfor;

    private String candfirstname;

    private String candmiddlename;

    private String candlastname;

    private Date dateofbirth;

    private float age;

    private String gender;

    private String candfathername;

    private String candmothername;

    private String presentaddress1;

    private String presentaddress2;

    private String presentarea;

    private String presentpincode;

    private String presentstate;

    private String fathersmobileno;

    private String fathersaltmobno;

    private String mothersmobileno;

    private String mothersaltmobno;

    private String fathersemail;

    private String mothersemail;

    private String reference;

    private String willingtojoin;

    private Date followupdate;

    private Long applicationprice;

    private String applicationpaidmode;

    private String remarks;

    private String academicyear;

    private String loginuser;

    private Integer instituteid;

    public ApplicationSalePlaySchool() {
    }

    public ApplicationSalePlaySchool(String applno) {
        this.applno = applno;
    }

    public String getApplno() {
        return applno;
    }

    public void setApplno(String applno) {
        this.applno = applno;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public void setCandmiddlename(String candmiddlename) {
        this.candmiddlename = candmiddlename;
    }

    public String getCandlastname() {
        return candlastname;
    }

    public void setCandlastname(String candlastname) {
        this.candlastname = candlastname;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
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

    public String getFathersmobileno() {
        return fathersmobileno;
    }

    public void setFathersmobileno(String fathersmobileno) {
        this.fathersmobileno = fathersmobileno;
    }

    public String getFathersaltmobno() {
        return fathersaltmobno;
    }

    public void setFathersaltmobno(String fathersaltmobno) {
        this.fathersaltmobno = fathersaltmobno;
    }

    public String getMothersmobileno() {
        return mothersmobileno;
    }

    public void setMothersmobileno(String mothersmobileno) {
        this.mothersmobileno = mothersmobileno;
    }

    public String getMothersaltmobno() {
        return mothersaltmobno;
    }

    public void setMothersaltmobno(String mothersaltmobno) {
        this.mothersaltmobno = mothersaltmobno;
    }

    public String getFathersemail() {
        return fathersemail;
    }

    public void setFathersemail(String fathersemail) {
        this.fathersemail = fathersemail;
    }

    public String getMothersemail() {
        return mothersemail;
    }

    public void setMothersemail(String mothersemail) {
        this.mothersemail = mothersemail;
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

    public Long getApplicationprice() {
        return applicationprice;
    }

    public void setApplicationprice(Long applicationprice) {
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

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }
}
