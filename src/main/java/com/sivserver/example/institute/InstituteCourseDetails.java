package com.sivserver.example.institute;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by GBCorp on 10/10/2017.
 */
@Entity
@Table(name="institutecoursedetails")
public class InstituteCourseDetails {

    @Column(name="instituteid")
    private Integer instituteid;

    @Id
    private String coursecode;

    private String coursename;

    public InstituteCourseDetails() {
    }

    public InstituteCourseDetails(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getCoursecode() {
        return coursecode;
    }

    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
