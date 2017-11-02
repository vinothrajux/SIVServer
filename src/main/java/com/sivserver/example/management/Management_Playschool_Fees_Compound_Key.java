package com.sivserver.example.management;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 02/11/2017.
 */
@Embeddable
public class Management_Playschool_Fees_Compound_Key implements Serializable {

    private String program;

    private String Academicyear;

    public Management_Playschool_Fees_Compound_Key() {
    }

    public Management_Playschool_Fees_Compound_Key(String program, String academicyear) {
        this.program = program;
        Academicyear = academicyear;
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
}
