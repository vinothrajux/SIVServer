package com.sivserver.example.teachingstaff;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Seetha on 24-Apr-18.
 */
@Embeddable
public class SchoolTestExamTimeTableCompoundKey implements Serializable{

    private Integer instituteid;

    private String testtype;

    private String standard;

    private String academicyear;

    public SchoolTestExamTimeTableCompoundKey(){

    }

    public SchoolTestExamTimeTableCompoundKey(Integer instituteid, String testtype, String standard, String academicyear) {
        this.instituteid = instituteid;
        this.testtype = testtype;
        this.standard = standard;
        this.academicyear = academicyear;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
}
