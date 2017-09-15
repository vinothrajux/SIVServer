package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 15/07/2017.
 */
@Entity
@Table(name = "sportskitsstock")

public class SportsKitsStock {

    @Id
    private String itemcode;

    private String itemname;

    private Integer quantityinhand;

    private String itemstatus;

    private String loginuser;

    public SportsKitsStock() {
    }

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getQuantityinhand() {
        return quantityinhand;
    }

    public void setQuantityinhand(Integer quantityinhand) {
        this.quantityinhand = quantityinhand;
    }

    public String getItemstatus() {
        return itemstatus;
    }

    public void setItemstatus(String itemstatus) {
        this.itemstatus = itemstatus;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}

