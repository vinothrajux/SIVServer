package com.sivserver.example.management;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 14/09/2017.
 */
@Embeddable
public class Management_Transport_Fees_Compound_Key implements Serializable {
    private String academicyear;
    private String stage;

    public Management_Transport_Fees_Compound_Key() {
    }

    public Management_Transport_Fees_Compound_Key(String academicyear, String stage) {
        this.academicyear = academicyear;
        this.stage = stage;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }
}
