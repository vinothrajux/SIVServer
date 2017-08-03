package com.sivserver.example.security;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 02-Aug-17.
 */
@Entity
@Table(name = "securityvehiclesinout")

public class SecurityVehiclesInOut {

    public String getVehiclesinoutid(){
        return vehiclesinoutid;
    }
    public void setVehiclesinoutid(String vehiclesinoutid) {
        this.vehiclesinoutid = vehiclesinoutid;
    }

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getVehicleno(){
        return vehicleno;
    }
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getVehicletype(){
        return vehicletype;
    }
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getStaffid(){
        return staffid;
    }
    public void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAcadyear() {
        return academicyear;
    }
    public void setAcadyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTimein() {
        return timein;
    }
    public void setTimein(String timein) {
        this.timein = timein;
    }

    public String gettimeout() {
        return timeout;
    }
    public void settimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }

    @Id
    private String vehiclesinoutid;

    @NotNull
    private Date currentdate;

    @NotNull
    private String vehicleno;

    @NotNull
    private String vehicletype;

    @NotNull
    private String staffid;

    @NotNull
    private String name;

    @NotNull
    private String academicyear;

    @NotNull
    private String reason;

    @NotNull
    private String timein;

    @NotNull
    private String timeout;


    @NotNull
    private String loginuser;

}
