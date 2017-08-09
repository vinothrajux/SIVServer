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
    public Integer getSlno(){
        return slno;
    }
    public void setSlno(Integer slno) {
        this.slno = slno;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getAllotedquota(){
        return allotedquota;
    }
    public void setAllotedquota (String allotedquota) {
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

    public Date getDateofbirth() {
        return dob;
    }
    public void setDateofbirth(Date dob) {
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


    public String getQualifiedexam() {
        return qualifiedexam;
    }
    public void setQualifiedexam(String qualifiedexam) {
        this.qualifiedexam = qualifiedexam;
    }

    public String getYearofpass() {
        return yearofpass;
    }
    public void setYearofpass(String yearofpass) {
        this.yearofpass = yearofpass;
    }

    public String getPhotoid() {
        return photoid;
    }
    public void setPhotoid(String photoid) {
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

    public String getAcadyear() {
        return acadyear;
    }
    public void setAcadyear(String acadyear) {
        this.acadyear = acadyear;
    }

    public String getApplicationno() {
        return applicationno;
    }
    public void setApplicationno(String applicationno) {
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

