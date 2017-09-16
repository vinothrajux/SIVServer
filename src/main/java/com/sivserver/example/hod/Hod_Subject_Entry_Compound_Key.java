package com.sivserver.example.hod;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 13/09/2017.
 */
@Embeddable
public class Hod_Subject_Entry_Compound_Key implements Serializable {

    private String academicyear;
    private String branchcode;
    private String semester;
    private String subjectcode;

    public Hod_Subject_Entry_Compound_Key(String academicyear, String branchcode, String semester, String subjectcode) {
        this.academicyear = academicyear;
        this.branchcode = branchcode;
        this.semester = semester;
        this.subjectcode = subjectcode;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }
}
