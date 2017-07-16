package com.sivserver.example.sports;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 15/07/2017.
 */
@Entity
@Table(name = "sportskitspurchasedetail")

public class SportsKitsPurchaseDetail {
    public String getVendorid(){
        return vendorid;
    }
    public void setVendorid(String vendorid) {
        this.vendorid = vendorid;
    }

    public String getBillno() {return billno;}
    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getItemhsncode() {
        return itemHsncode;
    }
    public void setItemhsncode(String itemHsncode) {this.itemHsncode = itemHsncode;}

    public String getItemname() {
        return itemname;
    }
    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getItemquantity() {
        return itemquantity;
    }
    public void setItemquantity(Integer itemquantity) {
        this.itemquantity = itemquantity;
    }

    public Long getItemunitprice() {
        return itemunitprice;
    }
    public void setItemunitprice(Long itemunitprice) {
        this.itemunitprice = itemunitprice;
    }

    public Long getItemtotalprice() {
        return itemtotalprice;
    }
    public void setItemtotalprice(Long itemtotalprice) {
        this.itemtotalprice = itemtotalprice;
    }

    @Id
    private String vendorid;

    @NotNull
    private String billno;

    @NotNull
    private String itemHsncode;

    @NotNull
    private String itemname;

    @NotNull
    private Integer itemquantity;

    @NotNull
    private Long itemunitprice;

    @NotNull
    private Long itemtotalprice;

}
