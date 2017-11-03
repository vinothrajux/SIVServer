package com.sivserver.example.teachingstaff;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by GBCorp on 03/11/2017.
 */
@Embeddable
public class Student_Attendance_Play_School_Compound_Key implements Serializable{
    private Date entrydate;

    private String program;

    private String section;

    private String acdemicyear;


    public Student_Attendance_Play_School_Compound_Key() {
    }

    public Student_Attendance_Play_School_Compound_Key(Date entrydate, String program, String section, String acdemicyear) {
        this.entrydate = entrydate;
        this.program = program;
        this.section = section;
        this.acdemicyear = acdemicyear;
    }

    public Date getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Date entrydate) {
        this.entrydate = entrydate;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAcdemicyear() {
        return acdemicyear;
    }

    public void setAcdemicyear(String acdemicyear) {
        this.acdemicyear = acdemicyear;
    }
}
