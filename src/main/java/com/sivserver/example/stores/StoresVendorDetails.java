package com.sivserver.example.stores;

import com.sivserver.example.sports.SportsOdForm;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storesvendordetails")

public class StoresVendorDetails {

    @Id
    @Column(name="vendorid")
    private String vendorId;

    private String vendorName;

    private String contactPersonName;

    private String contactPersonMobNo;

    private String contactPersonAlternateMobNo;

    private String vendorAddress1;

    private String vendorAddress2;

    private String vendorArea;

    private String vendorPin;

    private String vendorEmail;

    private String vendorAlternateEmail;

    private String vendorPanNo;

    private String vendorGSTNo;

    private Boolean vendorDeleted;

    private String loginuser;

    @OneToMany
    @JoinColumn(name="vendorid",referencedColumnName = "vendorid")
    private List<StoresPurchaseHeader> StoresPurchaseHeader_vendorid;

    @OneToMany
    @JoinColumn(name="vendorid",referencedColumnName = "vendorid")
    private List<StoresReturnHeader> storesReturnHeader_vendorid;


    public StoresVendorDetails() {
    }

    public StoresVendorDetails(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getContactPersonMobNo() {
        return contactPersonMobNo;
    }

    public void setContactPersonMobNo(String contactPersonMobNo) {
        this.contactPersonMobNo = contactPersonMobNo;
    }

    public String getContactPersonAlternateMobNo() {
        return contactPersonAlternateMobNo;
    }

    public void setContactPersonAlternateMobNo(String contactPersonAlternateMobNo) {
        this.contactPersonAlternateMobNo = contactPersonAlternateMobNo;
    }

    public String getVendorAddress1() {
        return vendorAddress1;
    }

    public void setVendorAddress1(String vendorAddress1) {
        this.vendorAddress1 = vendorAddress1;
    }

    public String getVendorAddress2() {
        return vendorAddress2;
    }

    public void setVendorAddress2(String vendorAddress2) {
        this.vendorAddress2 = vendorAddress2;
    }

    public String getVendorArea() {
        return vendorArea;
    }

    public void setVendorArea(String vendorArea) {
        this.vendorArea = vendorArea;
    }

    public String getVendorPin() {
        return vendorPin;
    }

    public void setVendorPin(String vendorPin) {
        this.vendorPin = vendorPin;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorAlternateEmail() {
        return vendorAlternateEmail;
    }

    public void setVendorAlternateEmail(String vendorAlternateEmail) {
        this.vendorAlternateEmail = vendorAlternateEmail;
    }

    public String getVendorPanNo() {
        return vendorPanNo;
    }

    public void setVendorPanNo(String vendorPanNo) {
        this.vendorPanNo = vendorPanNo;
    }

    public String getVendorGSTNo() {
        return vendorGSTNo;
    }

    public void setVendorGSTNo(String vendorGSTNo) {
        this.vendorGSTNo = vendorGSTNo;
    }

    public Boolean getVendorDeleted() {
        return vendorDeleted;
    }

    public void setVendorDeleted(Boolean vendorDeleted) {
        this.vendorDeleted = vendorDeleted;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }

    public List<StoresPurchaseHeader> getStoresPurchaseHeader_vendorid() {
        return StoresPurchaseHeader_vendorid;
    }

    public void setStoresPurchaseHeader_vendorid(List<StoresPurchaseHeader> storesPurchaseHeader_vendorid) {
        StoresPurchaseHeader_vendorid = storesPurchaseHeader_vendorid;
    }

    public List<StoresReturnHeader> getStoresReturnHeader_vendorid() {
        return storesReturnHeader_vendorid;
    }

    public void setStoresReturnHeader_vendorid(List<StoresReturnHeader> storesReturnHeader_vendorid) {
        this.storesReturnHeader_vendorid = storesReturnHeader_vendorid;
    }
}
