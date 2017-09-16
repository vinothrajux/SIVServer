package com.sivserver.example.library;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "librarymagazineentry")

public class LibraryMagazineEntry {

    @Id
    private String magazineid;

    private String magazinetype;

    private String magazineslno;

    private String cubboardno;

    private String magazinename;

    private String authorname;

    private String publishername;

    private String purchasedfrom;

    private Date purchaseddate;

    private Long unitprice;

    private Integer noofcopies;

    private Long totalprice;

    private String magazinestatus;

    private String academicyear;

    private String loginuser;

    public LibraryMagazineEntry() {
    }

    public String getMagazineid() {
        return magazineid;
    }

    public void setMagazineid(String magazineid) {
        this.magazineid = magazineid;
    }

    public String getMagazinetype() {
        return magazinetype;
    }

    public void setMagazinetype(String magazinetype) {
        this.magazinetype = magazinetype;
    }

    public String getMagazineslno() {
        return magazineslno;
    }

    public void setMagazineslno(String magazineslno) {
        this.magazineslno = magazineslno;
    }

    public String getCubboardno() {
        return cubboardno;
    }

    public void setCubboardno(String cubboardno) {
        this.cubboardno = cubboardno;
    }

    public String getMagazinename() {
        return magazinename;
    }

    public void setMagazinename(String magazinename) {
        this.magazinename = magazinename;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public String getPurchasedfrom() {
        return purchasedfrom;
    }

    public void setPurchasedfrom(String purchasedfrom) {
        this.purchasedfrom = purchasedfrom;
    }

    public Date getPurchaseddate() {
        return purchaseddate;
    }

    public void setPurchaseddate(Date purchaseddate) {
        this.purchaseddate = purchaseddate;
    }

    public Long getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Long unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getNoofcopies() {
        return noofcopies;
    }

    public void setNoofcopies(Integer noofcopies) {
        this.noofcopies = noofcopies;
    }

    public Long getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Long totalprice) {
        this.totalprice = totalprice;
    }

    public String getMagazinestatus() {
        return magazinestatus;
    }

    public void setMagazinestatus(String magazinestatus) {
        this.magazinestatus = magazinestatus;
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
}
