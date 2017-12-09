package com.sivserver.example.CashCounter;

import java.util.Date;

/**
 * Created by Seetha on 09-Dec-17.
 */
public interface FeesPaymentPlaySchoolProjection {
    Date getBilldate();
    String getBillno();
    String getRegisternumber();
    String getSchoolfeestitle();
    Long getSchoolfees();
    Long getSchoolfeespaid();
    String getTransportfeestitle();
    Long getTransportfees();
    Long getTransportfeespaid();
    Long getTotalfees();
    Long getTotalfeespaid();
    Long getBalance();
    Date getDuedate();
    String getPaymentmethod();
    String getChequeno();
    Date getChequedate();
    String getBankname();

}
