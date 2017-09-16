package com.sivserver.example.management;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 14/09/2017.
 */
@Embeddable
public class Management_College_Fees_Compound_Key implements Serializable{
    private String branchcode;
    private String academicyear;

    public Management_College_Fees_Compound_Key(String branchcode, String academicyear) {
        this.branchcode = branchcode;
        this.academicyear = academicyear;
    }

    public String getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(String branchcode) {
        this.branchcode = branchcode;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
}
