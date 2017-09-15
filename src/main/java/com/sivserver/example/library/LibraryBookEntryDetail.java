package com.sivserver.example.library;

import com.sivserver.example.hostel.HostelStudentVisitorDetail;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by GBCorp on 17/07/2017.
 */
@Entity
@Table(name = "librarybookentrydetail")

public class LibraryBookEntryDetail {

     @Id
     private Integer slno;

     @Column(name="bookid")
     private String bookid;

     private String branchcode;

    public LibraryBookEntryDetail() {
    }

    public Integer getSlno() {
        return slno;
    }

    public void setSlno(Integer slno) {
        this.slno = slno;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

}
