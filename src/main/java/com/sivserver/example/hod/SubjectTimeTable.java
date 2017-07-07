package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 29/06/2017.
 */
@Entity
@Table(name = "subjecttimetable")

public class SubjectTimeTable {


    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getSemester() {
        return semester;
    }
    public void setSemester(Integer semester) {
        this.semester = semester;
    }


    public String getAcadYear() {
        return academicYear;
    }
    public void setAcadYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getHour1() {
        return hour1;
    }
    public void setHour1(String hour1) {
        this.hour1 = hour1;
    }

    public String getHour2() {
        return hour2;
    }
    public void setHour2(String hour2) {
        this.hour2 = hour2;
    }

    public String getHour3() {
        return hour3;
    }
    public void setHour3(String hour3) {
        this.hour3 = hour3;
    }

    public String getHour4() {
        return hour4;
    }
    public void setHour4(String hour4) {
        this.hour4 = hour4;
    }

    public String getHour5() {
        return hour5;
    }
    public void setHour5(String hour5) {
        this.hour5 = hour5;
    }

    public String getHour6() {
        return hour6;
    }
    public void setHour6(String hour6) {
        this.hour6 = hour6;
    }

    public String getHour7() {
        return hour7;
    }
    public void setHour7(String hour7) {
        this.hour7 = hour7;
    }

    public String getHour8() {
        return hour8;
    }
    public void setHour8(String hour8) {
        this.hour8 = hour8;
    }

    public String getTtDay() {
        return ttday;
    }
    public void setTtDay(String ttday) {
        this.ttday = ttday;
    }

    public Integer getTtDayNo() {
        return dayno;
    }
    public void setTtDayNo(Integer dayno) {
        this.dayno = dayno;
    }
    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicYear;

    @NotNull
    private String hour1;

    @NotNull
    private String hour2;

    @NotNull
    private String hour3;

    @NotNull
    private String hour4;

    @NotNull
    private String hour5;

    @NotNull
    private String hour6;

    @NotNull
    private String hour7;

    @NotNull
    private String hour8;

    @NotNull
    private String ttday;

    @NotNull
    private Integer dayno;

    @NotNull
    private String loginuser;

}

