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

    public String getSpellno(){
        return spellno;
    }
    public void setSpellno(String spellno) {
        this.spellno = spellno;
    }

    public Date getFromdate(){return fromdate;}
    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate(){return todate;}
    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public String getSemester(){
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAacademicyear(){
        return academicyear;
    }
    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getLoginuser(){return loginuser;}
    public void setLoginuser(String loginuser) {
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
