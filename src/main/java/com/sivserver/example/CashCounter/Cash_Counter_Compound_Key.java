package com.sivserver.example.CashCounter;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 12/09/2017.
 */

@Embeddable

public class Cash_Counter_Compound_Key implements Serializable {
    private String regno;
    private String academicyear;

    public Cash_Counter_Compound_Key(String regno, String academicyear) {
        this.regno = regno;
        this.academicyear = academicyear;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }
}
