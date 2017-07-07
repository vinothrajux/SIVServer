package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * Created by Seetha on 01-Jul-17.
 */

@Entity
@Table(name = "egovspellentry")

public class EgovSpellEntry {

    public String getSpellNo(){
        return spellno;
    }
    public void setSpellNo(String spellno) {
        this.spellno = spellno;
    }

    public Date getFromDate(){return fromdate;}
    public void setFromDate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getToDate(){return todate;}
    public void setToDate(Date todate) {
        this.todate = todate;
    }

    public String getSemester(){
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAacademicYear(){
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginUser(){return loginuser;}
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }



    @Id
    private String spellno;


    @NotNull
    private Date fromdate;

    @NotNull
    private Date todate;


    @NotNull
    private String semester;

    @NotNull
    private String academicyear;

    @NotNull
    private String loginuser;


}
