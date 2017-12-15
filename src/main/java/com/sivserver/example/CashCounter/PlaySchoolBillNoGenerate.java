package com.sivserver.example.CashCounter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Seetha on 15-Dec-17.
 */
@Entity
@Table(name="playschoolbillnogenerate")

public class PlaySchoolBillNoGenerate {

    @Id
    private Integer idno;

    private Long lastbillno;

    public PlaySchoolBillNoGenerate() {
    }

    public Integer getIdno() {
        return idno;
    }

    public void setIdno(Integer idno) {
        this.idno = idno;
    }

    public Long getLastBillno() {
        return lastbillno;
    }

    public void setLastBillno(Long lastbillno) {
        this.lastbillno = lastbillno;
    }
}
