package com.sivserver.example.admission;

import java.util.Date;

/**
 * Created by GBCorp on 31/08/2017.
 */
public interface StudentAcademicInfoProjection {
    String getRegno();
    String getCommunity();
    String getReligion();
    String getCaste();
    String getNational();
    String getBloodgroup();
    String getDurationfrom();
    String getDurationto();
    Date getAdmitteddate();
    String getAcademicyear();

}
