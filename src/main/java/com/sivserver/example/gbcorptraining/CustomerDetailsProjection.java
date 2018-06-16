package com.sivserver.example.gbcorptraining;

import java.util.Date;

/**
 * Created by Seetha on 13-Jun-18.
 */
public interface CustomerDetailsProjection {
    Integer getInstituteid();
    String getInstitutetype();
    String getInstitutename();
    Integer getNoofstudents();
    Float getPriceperstudent();
    Float getTotalamount();
    String getPaymentmethod();
    Float getAmountpaid();
    Float getBalance();
    Date getDuedate();
    String getUsername();
}
