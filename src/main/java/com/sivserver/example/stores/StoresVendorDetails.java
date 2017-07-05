package com.sivserver.example.stores;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by GBCorp on 05/07/2017.
 */
@Entity
@Table(name = "storesvendordetails")

public class StoresVendorDetails {

    public String getVendorId(){
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {return vendorName;}
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }
    public void setContactPersonName(String contactPersonName) {this.contactPersonName = contactPersonName;}

    public String getContactPersonMobileNo() {
        return contactPersonMobNo;
    }
    public void setContactPersonMobileNo(String contactPersonMobNo) {
        this.contactPersonMobNo = contactPersonMobNo;
    }

    public String getContactPersonAlternteMobileNo() {
        return contactPersonAlternateMobNo;
    }
    public void setContactPersonAlternteMobileNo(String contactPersonAlternateMobNo) {
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
    public String getVendorPANNo() {
        return vendorPanNo;
    }
    public void setVendorPANNo(String vendorPanNo) {
        this.vendorPanNo = vendorPanNo;
    }

    public String getVendorGSTNo() {
        return vendorGSTNo;
    }
    public void setVendorGSTNo(String vendorGSTNo) {
        this.vendorGSTNo = vendorGSTNo;
    }

    public Boolean getVendorStatus() {
        return vendorDeleted;
    }
    public void setVendorStatus(Boolean vendorDeleted) {
        this.vendorDeleted = vendorDeleted;
    }

    public String getLoginUser() {
        return loginuser;
    }
    public void setLoginUser(String loginuser) {
        this.loginuser = loginuser;
    }



    @Id
    private String vendorId;

    @NotNull
    private String vendorName;

    @NotNull
    private String contactPersonName;

    @NotNull
    private String contactPersonMobNo;

    @NotNull
    private String contactPersonAlternateMobNo;

    @NotNull
    private String vendorAddress1;

    @NotNull
    private String vendorAddress2;

    @NotNull
    private String vendorArea;

    @NotNull
    private String vendorPin;

    @NotNull
    private String vendorEmail;

    @NotNull
    private String vendorAlternateEmail;

    @NotNull
    private String vendorPanNo;

    @NotNull
    private String vendorGSTNo;

    @NotNull
    private Boolean vendorDeleted;

    @NotNull
    private String loginuser;


}
