package com.sivserver.example.teachingstaff;

import javax.persistence.*;

/**
 * Created by Seetha on 24-Apr-18.
 */
@Entity
@Table(name="schooltestexammarkdetails")
public class SchoolTestExamMarkDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
   // SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey;

    private Integer instituteid;

    private String testtype;

    private String standard;

    private String academicyear;

    private String section;

    private Integer maxmarks;

    private Integer minmarks;

    private String subjectmarkdetails;

    private String loginuser;

    public SchoolTestExamMarkDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getMaxmarks() {
        return maxmarks;
    }

    public void setMaxmarks(Integer maxmarks) {
        this.maxmarks = maxmarks;
    }

    public Integer getMinmarks() {
        return minmarks;
    }

    public void setMinmarks(Integer minmarks) {
        this.minmarks = minmarks;
    }

    public String getSubjectmarkdetails() {
        return subjectmarkdetails;
    }

    public void setSubjectmarkdetails(String subjectmarkdetails) {
        this.subjectmarkdetails = subjectmarkdetails;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
