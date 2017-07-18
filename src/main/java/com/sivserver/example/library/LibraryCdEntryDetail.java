package com.sivserver.example.library;

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
    public String getCdid(){
        return cdid;
    }
    public void setCdid(String cdid) {
        this.cdid = cdid;
    }

    public String getBranchcode(){
        return branchcode;
    }
    public void setBranchcode(String booktype) {
        this.branchcode = branchcode;
    }

    @Id
    private String cdid;

    @NotNull
    private String branchcode;

}
