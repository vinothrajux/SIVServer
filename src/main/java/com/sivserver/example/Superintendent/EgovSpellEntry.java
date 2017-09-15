package com.sivserver.example.Superintendent;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;


/**
 * Created by Seetha on 01-Jul-17.
 */

@Entity
@Table(name = "egovspellentry")

public class EgovSpellEntry {

    @Id
    Egovernance_SpellEntry_Compound_Key egovernance_spellEntry_compound_key;

    private Date fromdate;

    private Date todate;

    private Integer noofhours;

    private String loginuser;

    public EgovSpellEntry() {
    }

    public Egovernance_SpellEntry_Compound_Key getEgovernance_spellEntry_compound_key() {
        return egovernance_spellEntry_compound_key;
    }

    public void setEgovernance_spellEntry_compound_key(Egovernance_SpellEntry_Compound_Key egovernance_spellEntry_compound_key) {
        this.egovernance_spellEntry_compound_key = egovernance_spellEntry_compound_key;
    }

    public Date getFromdate() {
        return fromdate;
    }

    public void setFromdate(Date fromdate) {
        this.fromdate = fromdate;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Integer getNoofhours() {
        return noofhours;
    }

    public void setNoofhours(Integer noofhours) {
        this.noofhours = noofhours;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
