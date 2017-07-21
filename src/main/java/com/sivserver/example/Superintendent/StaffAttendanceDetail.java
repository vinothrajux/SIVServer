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
@Table(name = "staffattendancedetail")

public class StaffAttendanceDetail {
    public Date getAttendanceDate(){
        return attdate;
    }
    public void setAttendanceDate(Date attdate) {
        this.attdate = attdate;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getStaffId() {
        return staffid;
    }
    public void setStaffId(String staffid) {
        this.staffid = staffid;
    }

    public String getAttendanceStatus() {return attendancestatus;}
    public void setAttendanceStatus(String attendancestatus) {
        this.attendancestatus = attendancestatus;
    }

    public Boolean getInformed() {
        return informed;
    }
    public void setInformed(Boolean informed) {
        this.informed = informed;
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
    private String branchcode;

    @NotNull
    private String staffid;

    @NotNull
    private String attendancestatus;


    @NotNull
    private Boolean informed;

    @NotNull
    private String loginuser;

}
