package com.sivserver.example.management;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "busdetail")
public class BusDetail {

    public String getBusno(){
        return busno;
    }
    public void setBusno(String busno) {
        this.busno = busno;
    }

    public String getDrivername() {
        return drivername;
    }
    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getSeatno() {
        return seatno;
    }
    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }




    @EmbeddedId
    private busEmbed regid;

    @NotNull
    private String busno;

    @NotNull
    private String drivername;

    @NotNull
    private String seatno;

    }
