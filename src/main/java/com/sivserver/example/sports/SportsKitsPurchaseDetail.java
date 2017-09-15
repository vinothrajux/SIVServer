package com.sivserver.example.sports;

import javax.persistence.Column;
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

    @Id
    private Integer id;

    @Column(name="billno")
    private String billno;

    private String itemHsncode;

    private String itemname;

    private Integer itemquantity;

    private Long itemunitprice;

    private Long itemtotalprice;

    public SportsKitsPurchaseDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public String getItemHsncode() {
        return itemHsncode;
    }

    public void setItemHsncode(String itemHsncode) {
        this.itemHsncode = itemHsncode;
    }

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
}
