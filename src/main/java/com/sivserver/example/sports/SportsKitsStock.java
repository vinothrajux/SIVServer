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

    public Integer getQuanitityinhand() {
        return quantityinhand;
    }

    public void setQuanitityinhand(Integer quantityinhand) {
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


    @Id
    private String itemcode;

    @NotNull
    private String itemname;

    @NotNull
    private Integer quantityinhand;

    @NotNull
    private String itemstatus;

    @NotNull
    private String loginuser;

}

