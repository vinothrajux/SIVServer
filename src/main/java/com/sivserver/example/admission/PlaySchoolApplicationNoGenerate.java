package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 14-Dec-17.
 */
@Entity
@Table(name = "playschoolapplicationnogenerate")

public class PlaySchoolApplicationNoGenerate {

    @Id
    private Integer idno;

    private Integer enquiryno;


    public PlaySchoolApplicationNoGenerate() {
    }

    public Integer getIdno() {
        return idno;
    }

    public void setIdno(Integer idno) {
        this.idno = idno;
    }

    public Integer getEnquiryno() {
        return enquiryno;
    }

    public void setEnquiryno(Integer enquiryno) {
        this.enquiryno = enquiryno;
    }
}
