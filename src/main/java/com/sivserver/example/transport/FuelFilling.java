package com.sivserver.example.transport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 19-Jul-17.
 */
@Entity
@Table(name = "fuelfilling")

public class FuelFilling {

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getVehicleno() {
        return vehicleno;
    }
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno;
    }

    public String getVehicletype() {
        return vehicletype;
    }
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getFillingstation() {return fillingstation;}
    public void setFillingstation(String fillingstation) {
        this.fillingstation = fillingstation;
    }


    public Long getFillingstationmobno() {
        return fillingstationmobno;
    }
    public void setFillingstationmobno(Long fillingstationmobno) {
        this.fillingstationmobno = fillingstationmobno;
    }

    public String getDriverid() {
        return driverid;
    }
    public void setDriverid(String driverid) {
        this.driverid = driverid;
    }

    public String getDrivername() {
        return drivername;
    }
    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }


    public String getNooflitres() {
        return nooflitres;
    }
    public void setNooflitres(String nooflitres) {
        this.nooflitres = nooflitres;
    }

    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Date getLastfilleddate() {
        return lastfilleddate;
    }
    public void setLastfilleddate(Date lastfilleddate) {this.lastfilleddate = lastfilleddate;}

    public String getLastfilledlitres() {
        return lastfilledlitres;
    }
    public void setLastfilledlitres(String lastfilledlitres) {
        this.lastfilledlitres = lastfilledlitres;
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
    private String vehicleno;

    @NotNull
    private String vehicletype;

    @NotNull
    private String fillingstation;

    @NotNull
    private Long fillingstationmobno;

    @NotNull
    private String driverid;

    @NotNull
    private String drivername;

    @NotNull
    private String nooflitres;

    @NotNull
    private Long amount;

    @NotNull
    private Date lastfilleddate;

    @NotNull
    private String lastfilledlitres;

    @NotNull
    private String loginuser;


}




