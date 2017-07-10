package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@Entity
@Table(name = "staffattendanceheader")

public class StaffAttendanceHeader {
    public Date getAttendanceDate(){
        return attdate;
    }
    public void setAttendanceDate(Date attdate) {
        this.attdate = attdate;
    }

    public String getAttendnaceDay() {
        return attendanceDay;
    }
    public void setAttendanceDay(String attendanceDay) {
        this.attendanceDay = attendanceDay;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getTotalPresent() {
        return totalpresent;
    }
    public void setTotalPresent(Integer totalpresent) {
        this.totalpresent = totalpresent;
    }

    public Integer getTotalAbsent() {return totalabsent;}
    public void setTotalAbsent(Integer totalabsent) {
        this.totalabsent = totalabsent;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private Date attdate;

    @NotNull
    private String attendanceDay;

    @NotNull
    private String branchcode;

    @NotNull
    private Integer totalpresent;

    @NotNull
    private Integer totalabsent;

    @NotNull
    private String loginuser;

}

