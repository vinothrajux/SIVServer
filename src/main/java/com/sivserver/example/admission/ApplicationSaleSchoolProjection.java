package com.sivserver.example.admission;

import java.util.Date;

/**
 * Created by Seetha on 31-Mar-18.
 */
public interface ApplicationSaleSchoolProjection {
    String getApplno();
    //    String getCategory();
    Date getSaledate();
    String getAppfor();
    String getCandfirstname();
    String getCandmiddlename();
    String getCandlastname();
    Date getDateofbirth();
    float getAge();
    String getGender();
    String getCandfathername();
    String getCandmothername();
    String getPresentaddress1();
    String getPresentaddress2();
    String getPresentarea();
    String getPresentpincode();
    String getPresentstate();
    String getFathersmobileno();
    String getFathersaltmobno();
    String getMothersmobileno();
    String getMothersaltmobno();
    String getFathersemail();
    String getMothersemail();
    String getReference();
    String getWillingtojoin();
    Date getFollowupdate();
    Long getApplicationprice();
    String getApplicationpaidmode();
    String getRemarks();
    String getAcademicyear();
    Integer getInstituteid();

}
