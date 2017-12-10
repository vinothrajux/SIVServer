package com.sivserver.example.teachingstaff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 08/11/2017.
 */
@Entity
@Table(name="studentsmonthlyprogressplayschool")
public class StudentsMonthlyProgressPlaySchool {

    @Id
    private String remarkid;

    private Date entrydate;

    private String entryday;

    private String month;

    @Column(name="registernumber")
    private String registernumber;

    private String name;

    private String program;

    private String section;

    private String academicyear;

    private Integer category1rating;

    private Integer category2rating;

    private Integer category3rating;

    private Integer category4rating;

    private Integer category5rating;

    private Integer category6rating;

    private Integer category7rating;

    private Integer category8rating;

    private Integer category9rating;

    private Integer category10rating;

    private String loginuser;

    public StudentsMonthlyProgressPlaySchool() {
    }

    public String getRemarkid() {
        return remarkid;
    }

    public void setRemarkid(String remarkid) {
        this.remarkid = remarkid;
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getCategory1rating() {
        return category1rating;
    }

    public void setCategory1rating(Integer category1rating) {
        this.category1rating = category1rating;
    }

    public Integer getCategory2rating() {
        return category2rating;
    }

    public void setCategory2rating(Integer category2rating) {
        this.category2rating = category2rating;
    }

    public Integer getCategory3rating() {
        return category3rating;
    }

    public void setCategory3rating(Integer category3rating) {
        this.category3rating = category3rating;
    }

    public Integer getCategory4rating() {
        return category4rating;
    }

    public void setCategory4rating(Integer category4rating) {
        this.category4rating = category4rating;
    }

    public Integer getCategory5rating() {
        return category5rating;
    }

    public void setCategory5rating(Integer category5rating) {
        this.category5rating = category5rating;
    }

    public Integer getCategory6rating() {
        return category6rating;
    }

    public void setCategory6rating(Integer category6rating) {
        this.category6rating = category6rating;
    }

    public Integer getCategory7rating() {
        return category7rating;
    }

    public void setCategory7rating(Integer category7rating) {
        this.category7rating = category7rating;
    }

    public Integer getCategory8rating() {
        return category8rating;
    }

    public void setCategory8rating(Integer category8rating) {
        this.category8rating = category8rating;
    }

    public Integer getCategory9rating() {
        return category9rating;
    }

    public void setCategory9rating(Integer category9rating) {
        this.category9rating = category9rating;
    }

    public Integer getCategory10rating() {
        return category10rating;
    }

    public void setCategory10rating(Integer category10rating) {
        this.category10rating = category10rating;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
