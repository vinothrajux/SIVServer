package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
@Entity
@Table(name="studenthomeworkplayschool")
public class StudentHomeWorkPlaySchool {
    @Id
    private String homeworkid;

    private Date entrydate;

    private String entryday;

    private String program;

    private String section;

    private String academicyear;

    private String subjectcategory;

    private String homeworkcontent;

    private String loginuser;

    private Integer instituteid;

    public StudentHomeWorkPlaySchool() {
    }

    public String getHomeworkid() {
        return homeworkid;
    }

    public void setHomeworkid(String homeworkid) {
        this.homeworkid = homeworkid;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntryday() {
        return entryday;
    }

    public void setEntryday(String entryday) {
        this.entryday = entryday;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getSubjectcategory() {
        return subjectcategory;
    }

    public void setSubjectcategory(String subjectcategory) {
        this.subjectcategory = subjectcategory;
    }

    public String getHomeworkcontent() {
        return homeworkcontent;
    }

    public void setHomeworkcontent(String homeworkcontent) {
        this.homeworkcontent = homeworkcontent;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }
}
