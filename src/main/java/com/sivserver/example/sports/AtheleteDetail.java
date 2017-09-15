package com.sivserver.example.sports;

import javax.persistence.Column;
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
    @Id
    private Integer id;

    @Column(name="athleteid")
    private String atheleteid;

    private String typeofsports;

    private String sportscode;

    private String areainsports;

    private String performancelevel;

    private String house;

    private String loginuser;

    public AtheleteDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
