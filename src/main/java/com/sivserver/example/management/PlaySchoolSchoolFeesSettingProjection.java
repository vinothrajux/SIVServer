package com.sivserver.example.management;

import java.util.Date;

/**
 * Created by Seetha on 19-Dec-17.
 */
public interface PlaySchoolSchoolFeesSettingProjection {

    Date getFeessettingdate();
    Management_Playschool_Fees_Compound_Key getManagementplayschoolfeescompoundkey();
    Long getAdmissionfees();
    Date getAdmissionfeesduedate();
    Long getMaterialkitfees();
    Long getActivityfees();
    Long getTuitionfees();
    Long getTotalfees();
    Long getInstallment1fees();
    Long getInstallment2fees();
    Date getInstallment1duedate();
    Date getInstallment2duedate();

}
