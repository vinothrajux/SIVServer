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
@Table(name = "librarycdentryheader")

public class LibraryCdEntryHeader {
    public String getCdid(){
        return cdid;
    }
    public void setCdid(String cdid) {
        this.cdid = cdid;
    }

    public String getCdtype(){
        return cdtype;
    }
    public void setCdtype(String cdtype) {
        this.cdtype = cdtype;
    }

    public String getCdslno(){
        return cdslno;
    }
    public void setCdslno(String cdslno) {
        this.cdslno = cdslno;
    }

    public String getCubboardno(){
        return cubboardno;
    }
    public void setCubboardno(String cubboardno) {
        this.cubboardno = cubboardno;
    }

    public String getCdname() {
        return cdname;
    }
    public void setCdname(String cdname) {
        this.cdname = cdname;
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

    public String getCdstatus() {
        return cdstatus;
    }
    public void setCdstatus(String cdstatus) {
        this.cdstatus = cdstatus;
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
    private String cdid;

    @NotNull
    private String cdtype;

    @Id
    private String cdslno;

    @NotNull
    private String cubboardno;

    @NotNull
    private String cdname;

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
    private String cdstatus;

    @NotNull
    private String academicyear;

    @NotNull
    private String loginuser;

}
