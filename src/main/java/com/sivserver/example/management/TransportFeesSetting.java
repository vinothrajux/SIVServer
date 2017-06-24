package com.sivserver.example.management;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "transportfeessetting")
public class TransportFeesSetting {

    public Date getFeesSettingDate(){
        return feessettingdate;
    }
    public void setFeesSettingDate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public String getAcademicyear() {
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getRoute() {
        return route;
    }
    public void setRoute(String route) {
        this.route = route;
    }

    public String getStage() {
        return stage;
    }
    public void setStage(String stage) {
        this.stage = stage;
    }

    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {this.amount = amount;}

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private Date feessettingdate;

    @NotNull
    private String academicyear;

    @Id
    private String route;

    @NotNull
    private String stage;

    @NotNull
    private Long amount;


    @NotNull
    private String loginuser;


}
