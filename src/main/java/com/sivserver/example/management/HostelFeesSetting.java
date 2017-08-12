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

    public Date getFeesSettingdate(){
        return feessettingdate;
    }
    public void setFeesSettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Long getIndividualroomfees() {
        return individualroomfees;
    }
    public void setIndividualroomfees(Long individualroomfees) {this.individualroomfees = individualroomfees;}

    public Long getGrouproomfees() {
        return grouproomfees;
    }
    public void setGrouproomfees(Long grouproomfees) {
        this.grouproomfees = grouproomfees;
    }

    public Long getSinglecotfees() {return singlecotfees; }
    public void setSinglecotfees(Long singlecotfees) {this.singlecotfees = singlecotfees;}

    public Long getMulticotfees() {
        return multicotfees;
    }
    public void setMulticotfees(Long multicotfees) {
        this.multicotfees = multicotfees;
    }

    public Long getFoodfees() {
        return foodfees;
    }
    public void setFoodFees(Long foodfees) {
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


    @NotNull
    private Date feessettingdate;

    @Id
    private String academicyear;

    @NotNull
    private Long individualroomfees;

    @NotNull
    private Long grouproomfees;

    @NotNull
    private Long singlecotfees;

    @NotNull
    private Long multicotfees;

    @NotNull
    private Long foodfees;

    @NotNull
    private Long others;

    @NotNull
    private Long totalfees;

    @NotNull
    private String loginuser;
}
