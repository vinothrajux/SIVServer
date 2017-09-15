package com.sivserver.example.library;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 18/07/2017.
 */
@Entity
@Table(name = "librarycdentrydetail")

public class LibraryCdEntryDetail {

    @Id
    private Integer slno;

    @Column(name="cdid")
    private String cdid;

    private String branchcode;

    public LibraryCdEntryDetail() {
    }

    public Integer getSlno() {
        return slno;
    }

    public void setSlno(Integer slno) {
        this.slno = slno;
    }

    public String getCdid() {
        return cdid;
    }

    public void setCdid(String cdid) {
        this.cdid = cdid;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }
}
