package com.sivserver.example.CashCounter;

import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface SchoolTransportFeesEntryProjection {

    String getRegisternumber();
    String getInstituteregisternumber();
    String getTransport();
    String getStage();
    String getTransportfeesmethod();
    Double getTransportfees();
    Date getTransportduedate();
    String getAcademicyear();
    Integer getInstituteid();

}
