package com.sivserver.example.CashCounter;

import java.util.Date;

/**
 * Created by Seetha on 19-Dec-17.
 */
public interface PlaySchoolFeesEntryBaseProjection {

    String getRegisternumber();
    Long getMaterialkitfees();
    Long getActivityfees();
    Long getTuitionfees();
    Long getTotalfees();
    Long getInstallment1fees();
    Long getInstallment2fees();
    Date getAdmissionfeesduedate();
    String getAcademicyear();

}
