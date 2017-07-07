package com.sivserver.example.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "bformheader")
public class BformHeader {
    public Integer getSlNo(){
        return slno;
    }
    public void setSlNo(Integer slno) {
        this.slno = slno;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getAllotedQuota(){
        return allotedquota;
    }
    public void setAllotedQuota (String allotedquota) {
        this.allotedquota = allotedquota;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateofBirth() {
        return dob;
    }
    public void setDateofBirth(Date dob) {
        this.dob = dob;
    }

    public String getCommunity() {
        return community;
    }
    public void setCommunity(String community) {
        this.community = community;
    }


    public String getReligion() {
        return religion;
    }
    public void setReleigion(String religion) {
        this.religion = religion;
    }


    public String getQualifiedExam() {
        return qualifiedexam;
    }
    public void setQualifiedExam(String qualifiedexam) {
        this.qualifiedexam = qualifiedexam;
    }

    public String getYearofPass() {
        return yearofpass;
    }
    public void setYearofPass(String yearofpass) {
        this.yearofpass = yearofpass;
    }

    public String getPhotoId() {
        return photoid;
    }
    public void setPhotoId(String photoid) {
        this.photoid = photoid;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getBcode() {
        return bcode;
    }
    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getAcadYear() {
        return acadyear;
    }
    public void setAcadYear(String acadyear) {
        this.acadyear = acadyear;
    }

    public String getApplicationNo() {
        return applicationno;
    }
    public void setApplicationNo(String applicationno) {
        this.applicationno = applicationno;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }







    @NotNull
    private Integer slno;

    @NotNull
    private String category;

    @NotNull
    private String allotedquota;

    @NotNull
    private String name;

    @NotNull
    private String gender;

    @NotNull
    private Date dob;

    @NotNull
    private String community;

    @NotNull
    private String religion;

    @NotNull
    private String qualifiedexam;

    @NotNull
    private String yearofpass;

    @Id
    private String photoid;

    @NotNull
    private String remarks;

    @NotNull
    private String bcode;

    @NotNull
    private String state;

    @NotNull
    private String acadyear;

    @NotNull
    private String applicationno;

    @NotNull
    private Integer semester;

    @NotNull
    private String loginuser;


}

