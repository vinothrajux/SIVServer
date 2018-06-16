package com.sivserver.example.institute;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 24-Apr-18.
 */
@Entity
@Table(name="instituteschoolsubjectdetails")
public class InstituteSchoolSubjectDetails {

    @Id
    private Integer instituteid;

    private String subjectdetails;

    private String loginuser;

    public InstituteSchoolSubjectDetails() {
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getSubjectdetails() {
        return subjectdetails;
    }

    public void setSubjectdetails(String subjectdetails) {
        this.subjectdetails = subjectdetails;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
