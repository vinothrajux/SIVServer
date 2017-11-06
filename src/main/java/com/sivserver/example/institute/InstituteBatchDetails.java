package com.sivserver.example.institute;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Entity
@Table(name="institutebatchdetails")
public class InstituteBatchDetails {

    @Column(name="instituteid")
    private String instituteid;

    @Id
    private String batch;

    public InstituteBatchDetails() {
    }

    public String getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(String instituteid) {
        this.instituteid = instituteid;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }
}
