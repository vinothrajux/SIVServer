package com.sivserver.example.CashCounter;

import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface SchoolFeesEntryBaseProjection {

    String getRegisternumber();
    String getInstituteregisternumber();
    Double getFacilityfees();
    Date getFacilityfeesduedate();
    Double getBooksnotebookfees();
    Date getBooksnotebookfeesduedate();
    Double getOthersfees();
    Date getOthersfeesduedate();
    Double getTuitionfeesmonthly();
    Date getTuitionfeesmonthlyduedate();
    Double getTuitionfeestermly();
    Date getTuitionfeestermlyduedate();
    Double getTotalfees();
    String getTuitionfeesmethod();
    String getAcademicyear();
    Integer getInstituteid();

}
