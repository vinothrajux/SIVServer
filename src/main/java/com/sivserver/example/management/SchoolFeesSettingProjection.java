package com.sivserver.example.management;

import java.util.Date;

/**
 * Created by Seetha on 31-Mar-18.
 */
public interface SchoolFeesSettingProjection {

    Date getFeessettingdate();
    Management_School_Fees_Compound_Key getManagementschoolfeescompoundkey();
    Double getFacilityfees();
    Double getTuitionfeesmonthly();
    Double getTuitionfeestermly();
    Double getBooksnotebookfees();
    Double getOthersfees();
    Double getTotalfees();
    Date getFacilityfeesduedate();
    Date getTuitionfeesmonthlyduedate();
    Date getTuitionfeestermlyduedate();
    Date getBooksnotebookfeesduedate();
    Date getOthersfeesduedate();

}
