package com.sivserver.example.management;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Seetha on 31-Mar-18.
 */
@Embeddable

public class Management_School_Fees_Compound_Key implements Serializable{
    private String program;

    private String Academicyear;

    private Integer instituteid;

    public Management_School_Fees_Compound_Key() {
    }

    public Management_School_Fees_Compound_Key(String program, String academicyear, Integer instituteid) {
        this.program = program;
        Academicyear = academicyear;
        this.instituteid = instituteid;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getAcademicyear() {
        return Academicyear;
    }

    public void setAcademicyear(String academicyear) {
        Academicyear = academicyear;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }
}
