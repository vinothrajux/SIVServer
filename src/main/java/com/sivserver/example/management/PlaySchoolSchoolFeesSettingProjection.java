package com.sivserver.example.management;

import java.util.Date;

/**
 * Created by Seetha on 19-Dec-17.
 */
public interface PlaySchoolSchoolFeesSettingProjection {

    Date getFeessettingdate();
    Management_Playschool_Fees_Compound_Key getManagementplayschoolfeescompoundkey();
//    Management_Playschool_Fees_Compound_Key getProgram();
//    Management_Playschool_Fees_Compound_Key getAcademicyear();
    Double getRegistrationfees();
    Double getMaterialkitfees();
    Double getActivityfees();
    Double getTuitionfees();
    Double getTotalfees();
    Double getInstallment1fees();
    Double getInstallment2fees();
    Date getInstallment1duedate();
    Date getInstallment2duedate();

}
