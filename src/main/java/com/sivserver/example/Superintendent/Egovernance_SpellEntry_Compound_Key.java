package com.sivserver.example.Superintendent;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by GBCorp on 15/09/2017.
 */
@Embeddable
public class Egovernance_SpellEntry_Compound_Key implements Serializable {
    private String spellno;
    private String semester;
    private String academicyear;

    public Egovernance_SpellEntry_Compound_Key(String spellno, String semester, String academicyear) {
        this.spellno = spellno;
        this.semester = semester;
        this.academicyear = academicyear;
    }

    public String getSpellno() {
        return spellno;
    }

    public void setSpellno(String spellno) {
        this.spellno = spellno;
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
