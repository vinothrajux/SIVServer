package com.sivserver.example.hod;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 02/07/2017.
 */
@Entity
@Table(name = "studentremarksaction")

public class StudentRemarksAction {

    @Id
    private String followupid;

    @Column(name="remarkid")
    private String remarkid;

    private String regno;


    private Date remarkactiondate;


    private String remarkactionday;


    private String remarkactiondetails;


    private String statusofaction;


    private String loginuser;


    public StudentRemarksAction() {
    }

    public String getFollowupid() {
        return followupid;
    }

    public void setFollowupid(String followupid) {
        this.followupid = followupid;
    }

    public String getRemarkid() {
        return remarkid;
    }

    public void setRemarkid(String remarkid) {
        this.remarkid = remarkid;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public Date getRemarkactiondate() {
        return remarkactiondate;
    }

    public void setRemarkactiondate(Date remarkactiondate) {
        this.remarkactiondate = remarkactiondate;
    }

    public String getRemarkactionday() {
        return remarkactionday;
    }

    public void setRemarkactionday(String remarkactionday) {
        this.remarkactionday = remarkactionday;
    }

    public String getRemarkactiondetails() {
        return remarkactiondetails;
    }

    public void setRemarkactiondetails(String remarkactiondetails) {
        this.remarkactiondetails = remarkactiondetails;
    }

    public String getStatusofaction() {
        return statusofaction;
    }

    public void setStatusofaction(String statusofaction) {
        this.statusofaction = statusofaction;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
