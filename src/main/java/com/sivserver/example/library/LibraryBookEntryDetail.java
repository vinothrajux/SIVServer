package com.sivserver.example.library;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "librarybookentrydetail")

public class LibraryBookEntryDetail {
    public String getBookid(){
        return bookid;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBranchcode(){
        return branchcode;
    }
    public void setBranchcode(String booktype) {
        this.branchcode = branchcode;
    }

     @Id
    private String bookid;

    @NotNull
    private String branchcode;


}
