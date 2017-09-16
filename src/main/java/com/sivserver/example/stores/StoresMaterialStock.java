package com.sivserver.example.stores;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storesmaterialstock")

public class StoresMaterialStock {


    @Id
    private String itemHsnCode;

    private String itemName;

    private Long itemStockInHand;

    private Long itemMinimumLevel;

    public StoresMaterialStock() {
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

    public Long getItemStockInHand() {
        return itemStockInHand;
    }

    public void setItemStockInHand(Long itemStockInHand) {
        this.itemStockInHand = itemStockInHand;
    }

    public Long getItemMinimumLevel() {
        return itemMinimumLevel;
    }

    public void setItemMinimumLevel(Long itemMinimumLevel) {
        this.itemMinimumLevel = itemMinimumLevel;
    }
}

