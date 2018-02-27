package com.sivserver.example.teachingstaff;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Seetha on 20-Feb-18.
 */
@Embeddable
public class Student_Assessment_Play_School_Compound_Key implements Serializable {

    private String registernumber;

    private String assessmentfor;

    private Integer instituteid;

    public Student_Assessment_Play_School_Compound_Key() {
    }

    public Student_Assessment_Play_School_Compound_Key(String registernumber, String assessmentfor, Integer instituteid) {
        this.registernumber = registernumber;
        this.assessmentfor = assessmentfor;
        this.instituteid = instituteid;
    }

    public String getRegisternumber() {
        return registernumber;
    }

    public void setRegisternumber(String registernumber) {
        this.registernumber = registernumber;
    }

    public String getAssessmentfor() {
        return assessmentfor;
    }

    public void setAssessmentfor(String assessmentfor) {
        this.assessmentfor = assessmentfor;
    }

    public Integer getInstituteid() {
        return instituteid;
    }

    public void setInstituteid(Integer instituteid) {
        this.instituteid = instituteid;
    }
}
