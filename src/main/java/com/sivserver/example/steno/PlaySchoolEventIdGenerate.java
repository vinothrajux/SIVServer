package com.sivserver.example.steno;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 03-Jan-18.
 */
@Entity
@Table(name="playschooleventidgenerate")
public class PlaySchoolEventIdGenerate {

    @Id
    private Integer id;

    private Integer evecirid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEvecirid() {
        return evecirid;
    }

    public void setEvecirid(Integer evecirid) {
        this.evecirid = evecirid;
    }
}


