package com.sivserver.example.placement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 14/07/2017.
 */
@Entity
@Table(name = "campusscheduler")

public class CampusScheduler {

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Date getScheduledate() {
        return scheduledate;
    }

    public void setScheduledate(Date scheduledate) {
        this.scheduledate = scheduledate;
    }

    public String getScheduleday() {
        return scheduleday;
    }

    public void setScheduleday(String scheduleday) {
        this.scheduleday = scheduleday;
    }

    public String getTypeofevent() {
        return typeofevent;
    }

    public void setTypeofevent(String typeofevent) {
        this.typeofevent = typeofevent;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }



    @Id
    private String scheduleid;

    @NotNull
    private Date scheduledate;

    @NotNull
    private String scheduleday;

    @NotNull
    private String typeofevent;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;


}
