package com.sivserver.example.admission;

import java.util.Date;

/**
 * Created by Seetha on 09-Dec-17.
 */
public interface AdmissionPlaySchoolProjection {
    String getApplno();
    Date getAdmissiondate();
    String getAdmissionfor();
    String getAdmissionstatus();
    String getRegisternumber();
    String getSection();
    String getTransport();
    String getTransportstage();
    String getAcademicyear();


}
