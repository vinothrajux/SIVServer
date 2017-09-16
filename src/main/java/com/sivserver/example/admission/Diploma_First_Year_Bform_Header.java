package com.sivserver.example.admission;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "diploma_first_year_bform_header")
public class Diploma_First_Year_Bform_Header {
    public Diploma_First_Year_Bform_Header() {
    }

    public String getApplno() {
        return applno;
    }

    public Diploma_First_Year_Bform_Header setApplno(String applno) {
        this.applno = applno;
        return this;
    }

    public Integer getSlno() {
        return slno;
    }

    public Diploma_First_Year_Bform_Header setSlno(Integer slno) {
        this.slno = slno;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Diploma_First_Year_Bform_Header setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getAllotedquota() {
        return allotedquota;
    }

    public Diploma_First_Year_Bform_Header setAllotedquota(String allotedquota) {
        this.allotedquota = allotedquota;
        return this;
    }

    public String getName() {
        return name;
    }

    public Diploma_First_Year_Bform_Header setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Diploma_First_Year_Bform_Header setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Date getDob() {
        return dob;
    }

    public Diploma_First_Year_Bform_Header setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getCommunity() {
        return community;
    }

    public Diploma_First_Year_Bform_Header setCommunity(String community) {
        this.community = community;
        return this;
    }

    public String getReligion() {
        return religion;
    }

    public Diploma_First_Year_Bform_Header setReligion(String religion) {
        this.religion = religion;
        return this;
    }

    public String getQualifiedexam() {
        return qualifiedexam;
    }

    public Diploma_First_Year_Bform_Header setQualifiedexam(String qualifiedexam) {
        this.qualifiedexam = qualifiedexam;
        return this;
    }

    public String getYearofpass() {
        return yearofpass;
    }

    public Diploma_First_Year_Bform_Header setYearofpass(String yearofpass) {
        this.yearofpass = yearofpass;
        return this;
    }

    public String getPhotoid() {
        return photoid;
    }

    public Diploma_First_Year_Bform_Header setPhotoid(String photoid) {
        this.photoid = photoid;
        return this;
    }

    public String getRemarks() {
        return remarks;
    }

    public Diploma_First_Year_Bform_Header setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    public String getBcode() {
        return bcode;
    }

    public Diploma_First_Year_Bform_Header setBcode(String bcode) {
        this.bcode = bcode;
        return this;
    }

    public String getState() {
        return state;
    }

    public Diploma_First_Year_Bform_Header setState(String state) {
        this.state = state;
        return this;
    }

    public String getAcadyear() {
        return acadyear;
    }

    public Diploma_First_Year_Bform_Header setAcadyear(String acadyear) {
        this.acadyear = acadyear;
        return this;
    }

    public String getRegno() {
        return regno;
    }

    public Diploma_First_Year_Bform_Header setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public Integer getSemester() {
        return semester;
    }

    public Diploma_First_Year_Bform_Header setSemester(Integer semester) {
        this.semester = semester;
        return this;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public Diploma_First_Year_Bform_Header setLoginuser(String loginuser) {
        this.loginuser = loginuser;
        return this;
    }

    public AdmissionCounselling getAdm_couns_applno() {
        return adm_couns_applno;
    }

    public Diploma_First_Year_Bform_Header setAdm_couns_applno(AdmissionCounselling adm_couns_applno) {
        this.adm_couns_applno = adm_couns_applno;
        return this;
    }

    @Id
    private String applno;


    private Integer slno;


    private String category;


    private String allotedquota;


    private String name;


    private String gender;


    private Date dob;


    private String community;


    private String religion;


    private String qualifiedexam;


    private String yearofpass;


    private String photoid;


    private String remarks;


    private String bcode;


    private String state;


    private String acadyear;


    private String regno;


    private Integer semester;


    private String loginuser;

    @OneToOne
    @JoinColumn(name="Bform_head_applno",nullable = false,referencedColumnName = "applno" )
    private AdmissionCounselling adm_couns_applno;



}

