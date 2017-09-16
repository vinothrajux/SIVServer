package com.sivserver.example.admission;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "diploma_first_year_bform_detail")

public class Diploma_First_Year_Bform_Detail {

    public Diploma_First_Year_Bform_Detail() {
    }

    public String getApplno() {
        return applno;
    }

    public Diploma_First_Year_Bform_Detail setApplno(String applno) {
        this.applno = applno;
        return this;
    }

    public String getRegno() {
        return regno;
    }

    public Diploma_First_Year_Bform_Detail setRegno(String regno) {
        this.regno = regno;
        return this;
    }

    public String getPhotoid() {
        return photoid;
    }

    public Diploma_First_Year_Bform_Detail setPhotoid(String photoid) {
        this.photoid = photoid;
        return this;
    }

    public Integer getSubject1() {
        return subject1;
    }

    public Diploma_First_Year_Bform_Detail setSubject1(Integer subject1) {
        this.subject1 = subject1;
        return this;
    }

    public Integer getSubject2() {
        return subject2;
    }

    public Diploma_First_Year_Bform_Detail setSubject2(Integer subject2) {
        this.subject2 = subject2;
        return this;
    }

    public Integer getSubject3() {
        return subject3;
    }

    public Diploma_First_Year_Bform_Detail setSubject3(Integer subject3) {
        this.subject3 = subject3;
        return this;
    }

    public Integer getTotal() {
        return total;
    }

    public Diploma_First_Year_Bform_Detail setTotal(Integer total) {
        this.total = total;
        return this;
    }

    public Long getPercentage() {
        return percentage;
    }

    public Diploma_First_Year_Bform_Detail setPercentage(Long percentage) {
        this.percentage = percentage;
        return this;
    }

    public AdmissionCounselling getAdm_couns_applno() {
        return adm_couns_applno;
    }

    public Diploma_First_Year_Bform_Detail setAdm_couns_applno(AdmissionCounselling adm_couns_applno) {
        this.adm_couns_applno = adm_couns_applno;
        return this;
    }

    @Id
    @Column(name="applno")
    private String applno;


    private String regno;

    @NaturalId
    private String photoid;


    private Integer subject1;


    private Integer subject2;


    private Integer subject3;


    private Integer total;


    private Long percentage;

    @OneToOne
    @JoinColumn(name="Bform_det_applno",nullable = false,referencedColumnName = "applno" )
    private AdmissionCounselling adm_couns_applno;


}
