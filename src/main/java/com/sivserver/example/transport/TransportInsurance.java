package com.sivserver.example.transport;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 21-Jul-17.
 */

@Entity
@Table(name = "transportinsurance")

public class TransportInsurance {

    public Date getCurrentdate(){
        return currentdate;
    }
    public void setCurrentdate(Date currentdate) {
        this.currentdate = currentdate;
    }

    public String getVehicleid() {
        return vehicleid;
    }
    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getVehicletype() {
        return vehicletype;
    }
    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public String getInsurancecompany() {return insurancecompany;}
    public void setInsurancecompany(String insurancecompany) {
        this.insurancecompany = insurancecompany;
    }


    public Long getMobileno() {
        return mobileno;
    }
    public void setMobileno(Long mobileno) {
        this.mobileno = mobileno;
    }

    public Long getInsuranceamount() {
        return insuramount;
    }
    public void setInsuranceamount(Long insuramount) {
        this.insuramount = insuramount;
    }

    public Date getDateofexpiry() {
        return dateofexpiry;
    }
    public void setDateofexpiry(Date dateofexpiry) {
        this.dateofexpiry = dateofexpiry;
    }


    public String getValueofvehicle() {
        return valofvehic;
    }
    public void setValueofvehicle(String valofvehic) {
        this.valofvehic = valofvehic;
    }

    public String getLoginuser() {
        return loginuser;
    }
    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }


    @Id
    private Date currentdate;


    @NotNull
    private String vehicleid;

    @NotNull
    private String vehicletype;

    @NotNull
    private String insurancecompany;

    @NotNull
    private Long mobileno;

    @NotNull
    private Long insuramount;

    @NotNull
    private Date dateofexpiry;

    @NotNull
    private String valofvehic;

    @NotNull
    private String loginuser;


}

