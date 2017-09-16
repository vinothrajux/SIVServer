package com.sivserver.example.stores;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storessalesdetail")

public class StoresSalesDetail {


    @Id
    private Integer id;

    @Column(name ="billno")
    private String billno;

    private String itemHsnCode;

    private String itemName;

    private Integer itemQuantity;

    private Long itemUnitPrice;

    private Long itemTotalPrice;

    public StoresSalesDetail() {
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

    public String getItemHsnCode() {
        return itemHsnCode;
    }

    public void setItemHsnCode(String itemHsnCode) {
        this.itemHsnCode = itemHsnCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Integer itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Long getItemUnitPrice() {
        return itemUnitPrice;
    }

    public void setItemUnitPrice(Long itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
    }

    public Long getItemTotalPrice() {
        return itemTotalPrice;
    }

    public void setItemTotalPrice(Long itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }
}

