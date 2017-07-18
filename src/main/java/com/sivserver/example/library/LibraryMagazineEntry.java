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
    public String getMagazineid(){
        return magazineid;
    }
    public void setMagazineid(String magazineid) {
        this.magazineid = magazineid;
    }

    public String getMagazinetype(){
        return magazinetype;
    }
    public void setMagazinetype(String magazinetype) {
        this.magazinetype = magazinetype;
    }

    public String getMagazineslno(){
        return magazineslno;
    }
    public void setMagazineslno(String magazineslno) {
        this.magazineslno = magazineslno;
    }

    public String getCubboardno(){
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


    @NotNull
    private String magazineid;

    @NotNull
    private String magazinetype;

    @Id
    private String magazineslno;

    @NotNull
    private String cubboardno;

    @NotNull
    private String magazinename;

    @NotNull
    private String authorname;

    @NotNull
    private String publishername;

    @NotNull
    private String purchasedfrom;

    @NotNull
    private Date purchaseddate;

    @NotNull
    private Long unitprice;

    @NotNull
    private Integer noofcopies;

    @NotNull
    private Long totalprice;

    @NotNull
    private String magazinestatus;

    @NotNull
    private String academicyear;


    @NotNull
    private String loginuser;

}
