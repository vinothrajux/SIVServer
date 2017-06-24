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

    public Date getFeesSettingDate(){
        return feessettingdate;
    }
    public void setFeesSettingDate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Long getIndividualRoomFees() {
        return individualroomfees;
    }
    public void setIndividualRoomFees(Long individualroomfees) {this.individualroomfees = individualroomfees;}

    public Long getGroupRoomFees() {
        return grouproomfees;
    }
    public void setGroupRoomFees(Long grouproomfees) {
        this.grouproomfees = grouproomfees;
    }

    public Long getSingleCotFees() {return singlecotfees; }
    public void setSingleCotFees(Long singlecotfees) {this.singlecotfees = singlecotfees;}

    public Long getMultiCotFees() {
        return multicotfees;
    }
    public void setMultiCotFees(Long multicotfees) {
        this.multicotfees = multicotfees;
    }

    public Long getFoodFees() {
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

    public Long getTotalFees() {
        return totalfees;
    }
    public void setTotalFees(Long totalfees) {
        this.totalfees = totalfees;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
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
