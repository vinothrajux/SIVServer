package com.sivserver.example.placement;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by GBCorp on 14/07/2017.
 */
@Entity
@Table(name = "campusrequestdetail")

public class CampusRequestDetail {

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getStudentcategory() {
        return studentcategory;
    }

    public void setStudentcategory(String studentcategory) {
        this.studentcategory = studentcategory;
    }

    public String getTypeofstudent() {
        return typeofstudent;
    }

    public void setTypeofstudent(String typeofstudent) {
        this.typeofstudent = typeofstudent;
    }

    public Integer getNumberofstudents() {
        return numberofstudents;
    }

    public void setNumberofstudents(Integer numberofstudents) {
        this.numberofstudents = numberofstudents;
    }



    @Id
    private String requestid;

    @NotNull
    private String branchcode;

    @NotNull
    private Integer semester;

    @NotNull
    private String studentcategory;

    @NotNull
    private String typeofstudent;

    @NotNull
    private Integer numberofstudents;



}

