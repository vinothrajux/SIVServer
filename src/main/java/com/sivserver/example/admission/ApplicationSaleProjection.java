package com.sivserver.example.admission;

import java.util.Date;

/**
 * Created by GBCorp on 24/06/2017.
 */
public interface ApplicationSaleProjection {
    String getAppfor();
    String getCandfirstname();
    String getCandmiddlename();
    String getCandlastname();
    String getCandfathername();
    String getCandmothername();
    String getPresentaddress1();
    String getPresentaddress2();
    String getPresentarea();
    String getPresentpincode();
    String getPresentstate();
    String getPresentmobileno();
    String getPresentaltmobno();
    String getPresentemail();
    String getPresentaltemail();
    String getPermanentaddress1();
    String getPermanentaddress2();
    String getPermanentarea();
    String getPermanentpincode();
    String getPermanentstate();
    String getPermanentmobileno();
    String getPermanentaltmobno();
    String getPermanentemail();
    String getPermanentaltemail();
    String getQualified();
    String getPrefferedcour1();
    String getPrefferedcour2();
    String getPrefferedcour3();
    String getWillingtojoin();
    Date getFollowupdate();
    Integer getApplicationprice();
    String getApplicationpaidmode();
    String getRemarks();
}
