package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 14/07/2017.
 */
@Entity
@Table(name = "tournamentdata")

public class TournamentData {

    @Id
    private String tournamentid;

    private Date tournamentdate;

    private String tournamentday;

    private String sportstype;

    private String sportscode;

    private String tournamentname;

    private String tournamentlevel;

    private String tournamentlocation;

    private String locationaddress1;

    private String locationaddress2;

    private String locationarea;

    private String locationpincode;

    private String locationstate;

    private String physicaldirectormobileno;

    private String physicaldirectoraltmobileno;

    private String physicaldirectoremail;

    private String physicaldirectoraltemail;

    private Date tournamentstartdate;

    private Date tournamentenddate;

    private Integer tournamentnoofdays;

    private String loginuser;

    public TournamentData() {
    }

    public String getTournamentid() {
        return tournamentid;
    }

    public void setTournamentid(String tournamentid) {
        this.tournamentid = tournamentid;
    }

    public Date getTournamentdate() {
        return tournamentdate;
    }

    public void setTournamentdate(Date tournamentdate) {
        this.tournamentdate = tournamentdate;
    }

    public String getTournamentday() {
        return tournamentday;
    }

    public void setTournamentday(String tournamentday) {
        this.tournamentday = tournamentday;
    }

    public String getSportstype() {
        return sportstype;
    }

    public void setSportstype(String sportstype) {
        this.sportstype = sportstype;
    }

    public String getSportscode() {
        return sportscode;
    }

    public void setSportscode(String sportscode) {
        this.sportscode = sportscode;
    }

    public String getTournamentname() {
        return tournamentname;
    }

    public void setTournamentname(String tournamentname) {
        this.tournamentname = tournamentname;
    }

    public String getTournamentlevel() {
        return tournamentlevel;
    }

    public void setTournamentlevel(String tournamentlevel) {
        this.tournamentlevel = tournamentlevel;
    }

    public String getTournamentlocation() {
        return tournamentlocation;
    }

    public void setTournamentlocation(String tournamentlocation) {
        this.tournamentlocation = tournamentlocation;
    }

    public String getLocationaddress1() {
        return locationaddress1;
    }

    public void setLocationaddress1(String locationaddress1) {
        this.locationaddress1 = locationaddress1;
    }

    public String getLocationaddress2() {
        return locationaddress2;
    }

    public void setLocationaddress2(String locationaddress2) {
        this.locationaddress2 = locationaddress2;
    }

    public String getLocationarea() {
        return locationarea;
    }

    public void setLocationarea(String locationarea) {
        this.locationarea = locationarea;
    }

    public String getLocationpincode() {
        return locationpincode;
    }

    public void setLocationpincode(String locationpincode) {
        this.locationpincode = locationpincode;
    }

    public String getLocationstate() {
        return locationstate;
    }

    public void setLocationstate(String locationstate) {
        this.locationstate = locationstate;
    }

    public String getPhysicaldirectormobileno() {
        return physicaldirectormobileno;
    }

    public void setPhysicaldirectormobileno(String physicaldirectormobileno) {
        this.physicaldirectormobileno = physicaldirectormobileno;
    }

    public String getPhysicaldirectoraltmobileno() {
        return physicaldirectoraltmobileno;
    }

    public void setPhysicaldirectoraltmobileno(String physicaldirectoraltmobileno) {
        this.physicaldirectoraltmobileno = physicaldirectoraltmobileno;
    }

    public String getPhysicaldirectoremail() {
        return physicaldirectoremail;
    }

    public void setPhysicaldirectoremail(String physicaldirectoremail) {
        this.physicaldirectoremail = physicaldirectoremail;
    }

    public String getPhysicaldirectoraltemail() {
        return physicaldirectoraltemail;
    }

    public void setPhysicaldirectoraltemail(String physicaldirectoraltemail) {
        this.physicaldirectoraltemail = physicaldirectoraltemail;
    }

    public Date getTournamentstartdate() {
        return tournamentstartdate;
    }

    public void setTournamentstartdate(Date tournamentstartdate) {
        this.tournamentstartdate = tournamentstartdate;
    }

    public Date getTournamentenddate() {
        return tournamentenddate;
    }

    public void setTournamentenddate(Date tournamentenddate) {
        this.tournamentenddate = tournamentenddate;
    }

    public Integer getTournamentnoofdays() {
        return tournamentnoofdays;
    }

    public void setTournamentnoofdays(Integer tournamentnoofdays) {
        this.tournamentnoofdays = tournamentnoofdays;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
