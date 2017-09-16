package com.sivserver.example.library;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "librarybookentryheader")

public class LibraryBookEntryHeader {

    @Id
    @Column(name="regno")
    private String bookid;

    private String booktype;

    @NaturalId
    private String bookslno;

    private String cubboardno;

    private String bookname;

    private String authorname;

    private String publishername;

    private String purchasedfrom;

    private Date purchaseddate;

    private Long unitprice;

    private Integer noofcopies;

    private Long totalprice;

    private String bookstatus;

    private String academicyear;

    private String loginuser;

    @OneToMany
    @JoinColumn(name="regno",referencedColumnName = "regno")
    private List<LibraryBookEntryDetail> libraryBookEntryDetail_regno;

    public LibraryBookEntryHeader() {
    }

    public LibraryBookEntryHeader(String bookid) {
        this.bookid = bookid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    public String getBookslno() {
        return bookslno;
    }

    public void setBookslno(String bookslno) {
        this.bookslno = bookslno;
    }

    public String getCubboardno() {
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

    public List<LibraryBookEntryDetail> getLibraryBookEntryDetail_regno() {
        return libraryBookEntryDetail_regno;
    }

    public void setLibraryBookEntryDetail_regno(List<LibraryBookEntryDetail> libraryBookEntryDetail_regno) {
        this.libraryBookEntryDetail_regno = libraryBookEntryDetail_regno;
    }
}
