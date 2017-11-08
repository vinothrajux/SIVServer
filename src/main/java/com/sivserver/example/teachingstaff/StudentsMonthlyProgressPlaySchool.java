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
    private String remark_id;

    private Date entrydate;

    private String entryday;

    private String month;

    @Column(name="registernumber")
    private String registernumber;

    private String name;

    private String program;

    private String section;

    private String academicyear;

    private Integer category1_rating;

    private Integer category2_rating;

    private Integer category3_rating;

    private Integer category4_rating;

    private Integer category5_rating;

    private Integer category6_rating;

    private Integer category7_rating;

    private Integer category8_rating;

    private Integer category9_rating;

    private Integer category10_rating;

    private String loginuser;

    public StudentsMonthlyProgressPlaySchool() {
    }

    public String getRemark_id() {
        return remark_id;
    }

    public void setRemark_id(String remark_id) {
        this.remark_id = remark_id;
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

    public Integer getCategory1_rating() {
        return category1_rating;
    }

    public void setCategory1_rating(Integer category1_rating) {
        this.category1_rating = category1_rating;
    }

    public Integer getCategory2_rating() {
        return category2_rating;
    }

    public void setCategory2_rating(Integer category2_rating) {
        this.category2_rating = category2_rating;
    }

    public Integer getCategory3_rating() {
        return category3_rating;
    }

    public void setCategory3_rating(Integer category3_rating) {
        this.category3_rating = category3_rating;
    }

    public Integer getCategory4_rating() {
        return category4_rating;
    }

    public void setCategory4_rating(Integer category4_rating) {
        this.category4_rating = category4_rating;
    }

    public Integer getCategory5_rating() {
        return category5_rating;
    }

    public void setCategory5_rating(Integer category5_rating) {
        this.category5_rating = category5_rating;
    }

    public Integer getCategory6_rating() {
        return category6_rating;
    }

    public void setCategory6_rating(Integer category6_rating) {
        this.category6_rating = category6_rating;
    }

    public Integer getCategory7_rating() {
        return category7_rating;
    }

    public void setCategory7_rating(Integer category7_rating) {
        this.category7_rating = category7_rating;
    }

    public Integer getCategory8_rating() {
        return category8_rating;
    }

    public void setCategory8_rating(Integer category8_rating) {
        this.category8_rating = category8_rating;
    }

    public Integer getCategory9_rating() {
        return category9_rating;
    }

    public void setCategory9_rating(Integer category9_rating) {
        this.category9_rating = category9_rating;
    }

    public Integer getCategory10_rating() {
        return category10_rating;
    }

    public void setCategory10_rating(Integer category10_rating) {
        this.category10_rating = category10_rating;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
