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
@Table(name = "librarybookissuereturndetail")

public class LibraryBookIssueReturnDetail {
    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getMemberid(){
        return memberid;
    }
    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getBookid(){
        return bookid;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBookslno(){
        return bookslno;
    }
    public void setBookslno(String bookslno) {
        this.bookslno = bookslno;
    }

    public Date getPossiblereturndate(){
        return possiblereturndate;
    }
    public void setPossiblereturndate(Date possiblereturndate) {
        this.possiblereturndate = possiblereturndate;
    }

    public String getCurrentstatus(){
        return currentstatus;
    }
    public void setCurrentstatus(String currentstatus) {
        this.currentstatus = currentstatus;
    }

    public Long getFineamount(){
        return fineamount;
    }
    public void setFineamount(Long fineamount) {
        this.fineamount = fineamount;
    }




    @NotNull
    private Date currentdate;

    @Id
    private String memberid;

    @NotNull
    private String bookid;

    @NotNull
    private String bookslno;

    @NotNull
    private Date possiblereturndate;

    @NotNull
    private String currentstatus;

    @NotNull
    private Long fineamount;





}
