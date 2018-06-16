package com.sivserver.example.institute;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Seetha on 24-Apr-18.
 */
@Embeddable
public class InstituteSchoolSubjectCompoundKey implements Serializable {

    private Integer instituteid;

    private String subjectcode;

    private String subjectname;

    private String subjecttype;

    private String standard;

    public InstituteSchoolSubjectCompoundKey(Integer instituteid, String subjectcode, String subjectname, String subjecttype, String standard) {
        this.instituteid = instituteid;
        this.subjectcode = subjectcode;
        this.subjectname = subjectname;
        this.subjecttype = subjecttype;
        this.standard = standard;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjecttype() {
        return subjecttype;
    }

    public void setSubjecttype(String subjecttype) {
        this.subjecttype = subjecttype;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
