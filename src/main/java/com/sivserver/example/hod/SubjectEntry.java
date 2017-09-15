package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */

@Entity
@Table(name = "subjectentry")

public class SubjectEntry {
    @Id
    Hod_Subject_Entry_Compound_Key hod_subject_entry_compound_key;

    private String subjectname;

    private String scheme;

    private String hours;

    private String reqhours;

    private String inshort;

    private String allottedhours;

    private String subjecttype;

    private String columnname;

    private String loginuser;

    public SubjectEntry() {
    }

    public Hod_Subject_Entry_Compound_Key getHod_subject_entry_compound_key() {
        return hod_subject_entry_compound_key;
    }

    public void setHod_subject_entry_compound_key(Hod_Subject_Entry_Compound_Key hod_subject_entry_compound_key) {
        this.hod_subject_entry_compound_key = hod_subject_entry_compound_key;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getReqhours() {
        return reqhours;
    }

    public void setReqhours(String reqhours) {
        this.reqhours = reqhours;
    }

    public String getInshort() {
        return inshort;
    }

    public void setInshort(String inshort) {
        this.inshort = inshort;
    }

    public String getAllottedhours() {
        return allottedhours;
    }

    public void setAllottedhours(String allottedhours) {
        this.allottedhours = allottedhours;
    }

    public String getSubjecttype() {
        return subjecttype;
    }

    public void setSubjecttype(String subjecttype) {
        this.subjecttype = subjecttype;
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
