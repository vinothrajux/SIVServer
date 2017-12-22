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
    Long getMaterialkitfees();
    Long getMaterialkitfeespaid();
    Long getActivityfees();
    Long getActivityfeespaid();
    Long getTuitionfees();
    Long getTuitionfeespaid();
    Long getTotalfees();
    Long getTotalfeespaid();
    Long getBalancefees();
    Date getDuedate();
    String getPaymentmethod();
    String getChequeno();
    Date getChequedate();
    String getBankname();

}
