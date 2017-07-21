package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 14/07/2017.
 */
@Entity
@Table(name = "atheleteheader")

public class AtheleteHeader {
    public String getAtheleteid() {
        return atheleteid;
    }

    public void setAtheleteid(String atheleteid) {
        this.atheleteid = atheleteid;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
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


    @Id
    private String atheleteid;

    @NotNull
    private String regno;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private Integer semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String typeofsports;

    @NotNull
    private String sportscode;

    @NotNull
    private String performancelevel;

    @NotNull
    private String house;

    @NotNull
    private String loginuser;

}
