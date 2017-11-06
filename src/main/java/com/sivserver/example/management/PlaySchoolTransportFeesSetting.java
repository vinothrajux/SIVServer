package com.sivserver.example.management;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 02/11/2017.
 */
@Entity
@Table(name="playschooltransportsetting")
public class PlaySchoolTransportFeesSetting {

    private Date fees_setting_date;

    @Id
    Management_Transport_Fees_Compound_Key management_Transport_Fees_Compound_Key;

    private Long transport_initial_fees;

    private Long transport_term1_fees;

    private Long transport_term2_fees;

    private String loginuser;

    public PlaySchoolTransportFeesSetting() {
    }

    public Date getFees_setting_date() {
        return fees_setting_date;
    }

    public void setFees_setting_date(Date fees_setting_date) {
        this.fees_setting_date = fees_setting_date;
    }

    public Management_Transport_Fees_Compound_Key getManagement_Transport_Fees_Compound_Key() {
        return management_Transport_Fees_Compound_Key;
    }

    public void setManagement_Transport_Fees_Compound_Key(Management_Transport_Fees_Compound_Key management_Transport_Fees_Compound_Key) {
        this.management_Transport_Fees_Compound_Key = management_Transport_Fees_Compound_Key;
    }

    public Long getTransport_initial_fees() {
        return transport_initial_fees;
    }

    public void setTransport_initial_fees(Long transport_initial_fees) {
        this.transport_initial_fees = transport_initial_fees;
    }

    public Long getTransport_term1_fees() {
        return transport_term1_fees;
    }

    public void setTransport_term1_fees(Long transport_term1_fees) {
        this.transport_term1_fees = transport_term1_fees;
    }

    public Long getTransport_term2_fees() {
        return transport_term2_fees;
    }

    public void setTransport_term2_fees(Long transport_term2_fees) {
        this.transport_term2_fees = transport_term2_fees;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}
