package com.sivserver.example.institute;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Entity
@Table(name="institutetestdetails")
public class InstituteTestDetails {

    @Column(name="instituteid")
    private Integer instituteid;

    @Id
    private String testname;

    public InstituteTestDetails() {
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname;
    }
}
