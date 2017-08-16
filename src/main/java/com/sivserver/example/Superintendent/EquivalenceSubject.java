package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by Seetha on 01-Jul-17.
 */

@Entity
@Table(name = "equivalencesubject")

public class EquivalenceSubject {

    public String getAcademicyear(){
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getOldbranch(){return oldbranch;}
    public void setOldbranch(String oldbranch) {
        this.oldbranch = oldbranch;
    }

    public String getOldbranchcode(){return oldbranchcode;}
    public void setOldbranchcode(String oldbranchcode) {
        this.oldbranchcode = oldbranchcode;
    }

    public String getOldsemester(){
        return oldsemester;
    }
    public void setOldsemester(String oldsemester) {
        this.oldsemester = oldsemester;
    }

    public String getOldcolumnno(){
        return oldcolumnno;
    }
    public void setOldcolumnno(String oldcolumnno) {
        this.oldcolumnno = oldcolumnno;
    }

    public String getOldscheme(){
        return oldscheme;
    }
    public void setOldscheme(String oldscheme) {
        this.oldscheme = oldscheme;
    }

    public String getOldsubjectname(){
        return oldsubjectname;
    }
    public void setOldsubjectname(String oldsubjectname) {
        this.oldsubjectname = oldsubjectname;
    }

    public String getOldsubjectcode(){
        return oldsubjectcode;
    }
    public void setOldsubjectcode(String oldsubjectcode) {
        this.oldsubjectcode = oldsubjectcode;
    }

    public String getNewbranch(){
        return newbranch;
    }
    public void setNewbranch(String newbranch) {
        this.newbranch = newbranch;
    }

    public String getNewbranchcode(){
        return newbranchcode;
    }
    public void setNewbranchcode(String newbranchcode) {
        this.newbranchcode = newbranchcode;
    }

    public String getNewsemester(){
        return newsemester;
    }
    public void setNewsemester(String newsemester) {
        this.newsemester = newsemester;
    }

    public String getNewscheme(){
        return newscheme;
    }
    public void setNewscheme(String newscheme) {
        this.newscheme = newscheme;
    }

    public String getNewcolumnno(){
        return newcolumnno;
    }
    public void setNewcolumnno(String newcolumnno) {
        this.newcolumnno = newcolumnno;
    }

    public String getNewsubjectname(){
        return newsubjectname;
    }
    public void setNewsubjectname(String newsubjectname) {
        this.newsubjectname = newsubjectname;
    }

    public String getNewsubjectcode(){
        return newsubjectcode;
    }
    public void setNewsubjectcode(String newsubjectcode) {
        this.newsubjectcode = newsubjectcode;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String academicyear;


    @NotNull
    private String oldbranch;

    @NotNull
    private String oldbranchcode;


    @NotNull
    private String oldsemester;

    @NotNull
    private String oldcolumnno;

    @NotNull
    private String oldsubjectname;

    @NotNull
    private String oldsubjectcode;

    @NotNull
    private String oldscheme;


    @NotNull
    private String newbranch;

    @NotNull
    private String newbranchcode;

    @NotNull
    private String newsemester;

    @NotNull
    private String newscheme;

    @NotNull
    private String newcolumnno;

    @NotNull
    private String newsubjectname;

    @NotNull
    private String newsubjectcode;

    @NotNull
    private String loginuser;

}
