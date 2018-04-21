package com.sivserver.example.admission;

import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface AdmissionSchoolProjection {

    String getApplno();
    Date getAdmissiondate();
    String getAppfor();
    String getAdmissionstatus();
    String getAdmittedinto();
    String getRegisternumber();
    String getSection();
    String getTransport();
    String getTransportstage();
    String getAcademicyear();
    Integer getInstituteid();

}
