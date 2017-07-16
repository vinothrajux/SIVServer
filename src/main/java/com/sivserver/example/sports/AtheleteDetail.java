package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 14/07/2017.
 */
@Entity
@Table(name = "atheletedetail")

public class AtheleteDetail {
    public String getAtheleteid() {
        return atheleteid;
    }

    public void setAtheleteid(String atheleteid) {
        this.atheleteid = atheleteid;
    }

    public String getTypeofsports() {
        return typeofsports;
    }

    public void setTypeofsports(String typeofsports) {
        this.typeofsports = typeofsports;
    }

    public String getSportscode() {
        return sportscode;
    }

    public void setSportscode(String sportscode) {
        this.sportscode = sportscode;
    }

    public String getAreainsports() {
        return areainsports;
    }

    public void setAreainsports(String areainsports) {
        this.areainsports = areainsports;
    }


    public String getPerformancelevel() {
        return performancelevel;
    }

    public void setPerformancelevel(String performancelevel) {
        this.performancelevel = performancelevel;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }



    @Id
    private String atheleteid;

    @NotNull
    private String typeofsports;

    @NotNull
    private String sportscode;

    @NotNull
    private String areainsports;

    @NotNull
    private String performancelevel;

    @NotNull
    private String house;

    @NotNull
    private String loginuser;

}
