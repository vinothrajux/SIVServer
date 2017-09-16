package com.sivserver.example.management;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "hostelfeessetting")
public class HostelFeesSetting {

    @Id
    private String academicyear;

    private Date feessettingdate;

    private Long individualroomfees;

    private Long grouproomfees;

    private Long singlecotfees;

    private Long multicotfees;

    private Long foodfees;

    private Long others;

    private Long totalfees;

    private String loginuser;

    public HostelFeesSetting() {
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Date getFeessettingdate() {
        return feessettingdate;
    }

    public void setFeessettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public Long getIndividualroomfees() {
        return individualroomfees;
    }

    public void setIndividualroomfees(Long individualroomfees) {
        this.individualroomfees = individualroomfees;
    }

    public Long getGrouproomfees() {
        return grouproomfees;
    }

    public void setGrouproomfees(Long grouproomfees) {
        this.grouproomfees = grouproomfees;
    }

    public Long getSinglecotfees() {
        return singlecotfees;
    }

    public void setSinglecotfees(Long singlecotfees) {
        this.singlecotfees = singlecotfees;
    }

    public Long getMulticotfees() {
        return multicotfees;
    }

    public void setMulticotfees(Long multicotfees) {
        this.multicotfees = multicotfees;
    }

    public Long getFoodfees() {
        return foodfees;
    }

    public void setFoodfees(Long foodfees) {
        this.foodfees = foodfees;
    }

    public Long getOthers() {
        return others;
    }

    public void setOthers(Long others) {
        this.others = others;
    }

    public Long getTotalfees() {
        return totalfees;
    }

    public void setTotalfees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
