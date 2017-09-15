package com.sivserver.example.management;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by Seetha on 09-Jun-17.
 */

@Entity
@Table(name = "transportfeessetting")
public class TransportFeesSetting {

     private Date feessettingdate;

     @Id
     Management_Transport_Fees_Compound_Key management_transport_fees_compound_key;

    private String route;

    private Long amount;

    private String loginuser;

    public TransportFeesSetting() {
    }

    public Date getFeessettingdate() {
        return feessettingdate;
    }

    public void setFeessettingdate(Date feessettingdate) {
        this.feessettingdate = feessettingdate;
    }

    public Management_Transport_Fees_Compound_Key getManagement_transport_fees_compound_key() {
        return management_transport_fees_compound_key;
    }

    public void setManagement_transport_fees_compound_key(Management_Transport_Fees_Compound_Key management_transport_fees_compound_key) {
        this.management_transport_fees_compound_key = management_transport_fees_compound_key;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
