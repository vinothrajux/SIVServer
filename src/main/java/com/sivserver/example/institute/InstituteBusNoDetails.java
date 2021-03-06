package com.sivserver.example.institute;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Entity
@Table(name="institutebusnodetails")

public class InstituteBusNoDetails {

    @Column(name="instituteid")
    private Integer instituteid;

    @Id
    private String busno;

    public InstituteBusNoDetails() {
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getBusno() {
        return busno;
    }

    public void setBusno(String busno) {
        this.busno = busno;
    }
}
