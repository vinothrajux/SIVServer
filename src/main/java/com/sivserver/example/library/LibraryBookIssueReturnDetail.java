package com.sivserver.example.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "librarybookissuereturndetail")

public class LibraryBookIssueReturnDetail {


    @Id
    private Integer slno;

    private Date currentdate;

    @Column(name="regno")
    private String regno;

    private String memberid;

    private String bookid;

    private String bookslno;

    private Date possiblereturndate;

    private String currentstatus;

    private Long fineamount;



    public LibraryBookIssueReturnDetail() {
    }

    public LibraryBookIssueReturnDetail(String regno) {
        this.regno = regno;
    }

    public Integer getSlno() {
        return slno;
    }

    public void setSlno(Integer slno) {
        this.slno = slno;
    }

    public Date getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookslno() {
        return bookslno;
    }

    public void setBookslno(String bookslno) {
        this.bookslno = bookslno;
    }

    public Date getPossiblereturndate() {
        return possiblereturndate;
    }

    public void setPossiblereturndate(Date possiblereturndate) {
        this.possiblereturndate = possiblereturndate;
    }

    public String getCurrentstatus() {
        return currentstatus;
    }

    public void setCurrentstatus(String currentstatus) {
        this.currentstatus = currentstatus;
    }

    public Long getFineamount() {
        return fineamount;
    }

    public void setFineamount(Long fineamount) {
        this.fineamount = fineamount;
    }
}
