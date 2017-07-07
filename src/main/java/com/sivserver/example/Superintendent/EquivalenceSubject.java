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

    public String getAcademicYear(){
        return academicYear;
    }
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getOldBranch(){return oldbranch;}
    public void setOldBranch(String oldbranch) {
        this.oldbranch = oldbranch;
    }

    public String getOldBranchCode(){return oldbranchcode;}
    public void setOldBranchCode(String oldbranchcode) {
        this.oldbranchcode = oldbranchcode;
    }

    public String getOldSemester(){
        return oldsemester;
    }
    public void setOldSemester(String oldsemester) {
        this.oldsemester = oldsemester;
    }

    public String getOldColumnNo(){
        return oldcolumnno;
    }
    public void setOldColumnNo(String oldcolumnno) {
        this.oldcolumnno = oldcolumnno;
    }

    public String getOldScheme(){
        return oldscheme;
    }
    public void setOldScheme(String oldscheme) {
        this.oldscheme = oldscheme;
    }

    public String getOldSubjectName(){
        return oldsubjectname;
    }
    public void setOldSubjectName(String oldsubjectname) {
        this.oldsubjectname = oldsubjectname;
    }

    public String getOldSubjectCode(){
        return oldsubjectcode;
    }
    public void setOldSubjectCode(String oldsubjectcode) {
        this.oldsubjectcode = oldsubjectcode;
    }

    public String getNewBranch(){
        return newbranch;
    }
    public void setNewBranch(String newbranch) {
        this.newbranch = newbranch;
    }

    public String getNewBranchCode(){
        return newbranchcode;
    }
    public void setNewBranchCode(String newbranchcode) {
        this.newbranchcode = newbranchcode;
    }

    public String getNewSemester(){
        return newsemester;
    }
    public void setNewSemester(String newsemester) {
        this.newsemester = newsemester;
    }

    public String getNewScheme(){
        return newscheme;
    }
    public void setNewScheme(String newscheme) {
        this.newscheme = newscheme;
    }

    public String getNewColumnNo(){
        return newcolumnno;
    }
    public void setNewColumnNo(String newcolumnno) {
        this.newcolumnno = newcolumnno;
    }

    public String getNewSubjectName(){
        return newsubjectname;
    }
    public void setNewSubjectName(String newsubjectname) {
        this.newsubjectname = newsubjectname;
    }

    public String getNewSubjectCode(){
        return newsubjectcode;
    }
    public void setNewSubjectCode(String newsubjectcode) {
        this.newsubjectcode = newsubjectcode;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private String academicYear;


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
