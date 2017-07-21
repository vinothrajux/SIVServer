package com.sivserver.example.transport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 21-Jul-17.
 */

@Entity
@Table(name = "transportfc")

public class TransportFC {

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getVehicleid() {
        return vehicleid;
    }
    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getVehicletype() {
        return vehicletype;
    }
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Date getDateoffc() {return dateoffc;}
    public void setDateoffc(Date dateoffc) {
        this.dateoffc = dateoffc;
    }


    public Date getExpirydate() {
        return expirydate;
    }
    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
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
    private Date currentdate;


    @NotNull
    private String vehicleid;

    @NotNull
    private String vehicletype;

    @NotNull
    private Date dateoffc;

    @NotNull
    private Date expirydate;

    @NotNull
    private Long amount;

    @NotNull
    private String remarks;

    @NotNull
    private String loginuser;


}



