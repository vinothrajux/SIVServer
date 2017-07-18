package com.sivserver.example.library;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "librarybookentryheader")

public class LibraryBookEntryHeader {
    public String getBookid(){
        return bookid;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBooktype(){
        return booktype;
    }
    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getBookslno(){
        return bookslno;
    }
    public void setBookslno(String bookslno) {
        this.bookslno = bookslno;
    }

    public String getCubboardno(){
        return cubboardno;
    }
    public void setCubboardno(String cubboardno) {
        this.cubboardno = cubboardno;
    }

    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
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

    public String getBookstatus() {
        return bookstatus;
    }
    public void setBookstatus(String bookstatus) {
        this.bookstatus = bookstatus;
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
    private String bookid;

    @NotNull
    private String booktype;

    @Id
    private String bookslno;

    @NotNull
    private String cubboardno;

    @NotNull
    private String bookname;

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
    private String bookstatus;

    @NotNull
    private String academicyear;


    @NotNull
    private String loginuser;

}
