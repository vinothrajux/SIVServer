package com.sivserver.example.hod;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 12/09/2017.
 */

@Embeddable
public class Hod_Compound_Key implements Serializable {

    private String branchcode;
    private String batch;
    private String semester;
    private String academicyear;

    public Hod_Compound_Key(String branchcode, String batch, String semester, String academicyear) {
        this.branchcode = branchcode;
        this.batch = batch;
        this.semester = semester;
        this.academicyear = academicyear;
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

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
}

