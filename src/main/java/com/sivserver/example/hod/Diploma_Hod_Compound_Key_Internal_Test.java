package com.sivserver.example.hod;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 12/09/2017.
 */
@Embeddable
public class Diploma_Hod_Compound_Key_Internal_Test implements Serializable {
    private String branchcode;
    private String batch;
    private String semester;
    private String academicyear;
    private String testtype;

    public Diploma_Hod_Compound_Key_Internal_Test(String branchcode, String batch, String semester, String academicyear, String testtype) {
        this.branchcode = branchcode;
        this.batch = batch;
        this.semester = semester;
        this.academicyear = academicyear;
        this.testtype = testtype;
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

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
    }
}
