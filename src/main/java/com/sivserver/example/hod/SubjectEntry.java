package com.sivserver.example.hod;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */

@Entity
@Table(name = "subjectentry")

public class SubjectEntry {

    public String getBranchName(){
    return branchname;
}
    public void setBranchName(String branchname) {
        this.branchname = branchname;
    }

    public String getBranchCode() {
        return branchcode;
    }
    public void setBranchCode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSubjectName() {
        return subjectname;
    }
    public void setSubjectName(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getSubjectCode() {return subjectcode;}
    public void setSubjectCode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getScheme() {
        return scheme;
    }
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getHours() {
        return hours;
    }
    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRequiredHours() {
        return reqhours;
    }
    public void setRequiredHours(String reqhours) {
        this.reqhours = reqhours;
    }

    public String getInShort() {return inshort;}
    public void setInShort(String inshort) {
        this.inshort = inshort;
    }

    public String getAllottedHours() {
        return allottedhours;
    }
    public void setAllottedHours(String allottedhours) {
        this.allottedhours = allottedhours;
    }

    public String getSubjectType() {
        return subjecttype;
    }
    public void setSubjectType(String subjecttype) {
        this.subjecttype = subjecttype;
    }

    public String getColumnName() {
        return columnname;
    }
    public void setColumnName(String columnname) {
        this.columnname = columnname;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }


    @NotNull
    private String branchname;

    @NotNull
    private String branchcode;

    @NotNull
    private String semester;

    @NotNull
    private String subjectname;

    @Id
    private String subjectcode;

    @NotNull
    private String scheme;

    @NotNull
    private String hours;

    @NotNull
    private String reqhours;

    @NotNull
    private String inshort;

    @NotNull
    private String allottedhours;

    @NotNull
    private String subjecttype;

    @NotNull
    private String columnname;

    @NotNull
    private String loginuser;


}
