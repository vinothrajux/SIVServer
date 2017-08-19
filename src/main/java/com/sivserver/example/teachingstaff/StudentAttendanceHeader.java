package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@Entity
@Table(name = "studentattendanceheader")

public class StudentAttendanceHeader {
    public Date getAttendanceEntryDate(){
        return entrydate;
    }
    public void setAttendanceEntryDate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getDay() {
        return dayname;
    }
    public void setDay(String dayname) {
        this.dayname = dayname;
    }

    public Integer getHour() {
        return hour;
    }
    public void setHour(Integer hour) {
        this.hour = hour;
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

    public String getAcademiYear() {
        return academiyear;
    }
    public void setAcademicYear(String academiyear) {
        this.academiyear = academiyear;
    }

    public Integer getTotalPresent() {
        return totalPresent;
    }
    public void setTotalPresent(Integer totalPresent) {
        this.totalPresent = totalPresent;
    }

    public Integer getTotalAbsent() {
        return totalAbsent;
    }
    public void setTotalAbsent(Integer totalAbsent) {
        this.totalAbsent = totalAbsent;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private Date entrydate;

    @NotNull
    private String dayname;

    @NotNull
    private Integer hour;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academiyear;


    @NotNull
    private Integer totalPresent;

    @NotNull
    private Integer totalAbsent;

    @NotNull
    private String loginuser;

}
