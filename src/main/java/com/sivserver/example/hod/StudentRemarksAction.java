package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 02/07/2017.
 */
@Entity
@Table(name = "studentremarksaction")

public class StudentRemarksAction {
    public String getRegno(){
        return regno;
    }
    public void setRegno(String regno) {
        this.regno = regno;
    }


    public Date getRemarksActionDate() {
        return remarkactiondate;
    }
    public void setRemarksActionDate(Date remarkactiondate) {
        this.remarkactiondate = remarkactiondate;
    }

    public String getRemarksActionDay() {
        return remarkactionday;
    }
    public void setRemarksActionDay(String remarkactionday) {
        this.remarkactionday = remarkactionday;
    }

    public String getRemarksActionDetails() {
        return remarkactiondetails;
    }
    public void setRemarksActionDetails(String remarkactiondetails) {
        this.remarkactiondetails = remarkactiondetails;
    }

    public String getStatusofAction() {
        return statusofaction;
    }
    public void setStatusofAction(String statusofaction) {
        this.statusofaction = statusofaction;
    }

    public String getLoginUser() {return loginuser;}
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String regno;

    @NotNull
    private Date remarkactiondate;

    @NotNull
    private String remarkactionday;

    @NotNull
    private String remarkactiondetails;

    @NotNull
    private String statusofaction;

    @NotNull
    private String loginuser;


}
