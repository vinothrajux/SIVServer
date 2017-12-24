package com.sivserver.example.CashCounter;

import java.util.Date;

/**
 * Created by Seetha on 19-Dec-17.
 */
public interface PlaySchoolFeesEntryBaseProjection {

    String getRegisternumber();
    Double getRegistrationfees();
    Double getMaterialkitfees();
    Double getActivityfees();
    Double getTuitionfees();
    Double getTotalfees();
    Double getInstallment1fees();
    Double getInstallment2fees();
    Date getInstallment1duedate();
    Date getInstallment2duedate();
    String getAcademicyear();

}
