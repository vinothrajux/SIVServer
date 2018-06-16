package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 24-Apr-18.
 */
@Entity
@Table(name="schooltestexamtimetable")
public class SchoolTestExamTimeTable {

    @Id
    SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey;

//    @Id
//    private Integer id;
//    // SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey;
//
//    private Integer instituteid;
//
//    private String testtype;
//
//    private String standard;
//
//    private String academicyear;


    private String subjectdetails;

    private String loginuser;

    public SchoolTestExamTimeTable() {
    }

    public SchoolTestExamTimeTableCompoundKey getSchoolTestExamTimeTableCompoundKey() {
        return schoolTestExamTimeTableCompoundKey;
    }

    public void setSchoolTestExamTimeTableCompoundKey(SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey) {
        this.schoolTestExamTimeTableCompoundKey = schoolTestExamTimeTableCompoundKey;
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

