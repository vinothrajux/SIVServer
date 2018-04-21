package com.sivserver.example.CashCounter;

import java.util.Date;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface PlaySchoolTransportFeesEntryProjection {

    String getRegisternumber();
    String getTransport();
    String getStage();
    String getTransportpaymentmethod();
    Double getTransportfees();
    Date getTransportduedate();
    String getAcademicyear();
    String getTransportfeesmethod();
    Integer getInstituteid();

}
