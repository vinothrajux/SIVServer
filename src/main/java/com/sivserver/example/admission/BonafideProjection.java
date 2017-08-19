package com.sivserver.example.admission;

import java.util.Date;

/**
 * Created by GBCorp on 17/08/2017.
 */
public interface BonafideProjection {
    //String getBonafideid();
    String getRegno();
    String getAdmissionno();
    String getName();
    String getSemester();
    String getBranchname();
    String getBranchcode();
    String getAcademicyear();
    String getFathername();
    Date getIssueddate();
    String getCertificatefor();
    Integer getNoofyears();


}
