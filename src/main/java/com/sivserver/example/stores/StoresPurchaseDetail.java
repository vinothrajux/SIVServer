package com.sivserver.example.stores;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storespurchasedetail")

public class StoresPurchaseDetail {
    public String getVendorId(){
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getBillNo() {return billno;}
    public void setBillNo(String billno) {
        this.billno = billno;
    }

    public String getItemHSNCode() {
        return itemHsnCode;
    }
    public void setItemHSNCode(String itemHsnCode) {this.itemHsnCode = itemHsnCode;}

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

    @Id
    private String vendorId;

    @NotNull
    private String billno;

    @NotNull
    private String itemHsnCode;

    @NotNull
    private String itemName;

    @NotNull
    private Integer itemQuantity;

    @NotNull
    private Long itemUnitPrice;

    @NotNull
    private Long itemTotalPrice;

}
