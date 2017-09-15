package com.sivserver.example.library;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "librarycdentryheader")

public class LibraryCdEntryHeader {

    @Id
    @Column(name="cdid")
    private String cdid;

    private String cdtype;

    @NaturalId
    private String cdslno;

    private String cubboardno;

    private String cdname;

    private String authorname;

    private String publishername;

    private String purchasedfrom;

    private Date purchaseddate;

    private Long unitprice;

    private Integer noofcopies;

    private Long totalprice;

    private String cdstatus;

    private String academicyear;

    private String loginuser;

    @OneToMany
    @JoinColumn(name="cdid",referencedColumnName = "cdid")
    private List<LibraryCdEntryDetail> libraryCdEntryDetail_regno;

    public LibraryCdEntryHeader() {
    }

    public LibraryCdEntryHeader(String cdid) {
        this.cdid = cdid;
    }

    public String getCdid() {
        return cdid;
    }

    public void setCdid(String cdid) {
        this.cdid = cdid;
    }

    public String getCdtype() {
        return cdtype;
    }

    public void setCdtype(String cdtype) {
        this.cdtype = cdtype;
    }

    public String getCdslno() {
        return cdslno;
    }

    public void setCdslno(String cdslno) {
        this.cdslno = cdslno;
    }

    public String getCubboardno() {
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

    public List<LibraryCdEntryDetail> getLibraryCdEntryDetail_regno() {
        return libraryCdEntryDetail_regno;
    }

    public void setLibraryCdEntryDetail_regno(List<LibraryCdEntryDetail> libraryCdEntryDetail_regno) {
        this.libraryCdEntryDetail_regno = libraryCdEntryDetail_regno;
    }
}
