package com.sivserver.example.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
//import java.util.Date;

/**
 * Created by Seetha on 28-Jun-17.
 */
@Entity
@Table(name = "studentbaseinformation")

public class StudentBaseInformation {

    public String getRegNo(){
        return regno;
    }
    public void setRegNo(String regno) {
        this.regno = regno;
    }

    public String getAdmissionNo() {return admissionno;}
    public void setAdmissionNo(String admissionno) {
        this.admissionno = admissionno;
    }

    public String getStudentName() {
        return name;
    }
    public void setStudentName(String name) {this.name = name;}

    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
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

    public String getScheme() {
        return scheme;
    }
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getAcademicYear() {
        return academicyear;
    }
    public void setAcademicYear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getStudentType() {
        return studenttype;
    }
    public void setStudentType(String studenttype) {
        this.studenttype = studenttype;
    }

    public String getPoto() {
        return poto;
    }
    public void setPoto(String poto) {
        this.poto = poto;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }



    @Id
    private String regno;

    @NotNull
    private String admissionno;

    @NotNull
    private String name;

    @NotNull
    private String semester;

    @NotNull
    private String branch;

    @NotNull
    private String branchcode;

    @NotNull
    private String batch;

    @NotNull
    private String scheme;

    @NotNull
    private String academicyear;

    @NotNull
    private String studenttype;

    @NotNull
    private String poto;

    @NotNull
    private String loginuser;


}
