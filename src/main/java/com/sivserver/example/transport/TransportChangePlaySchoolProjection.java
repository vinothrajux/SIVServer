package com.sivserver.example.transport;

import java.util.Date;

/**
 * Created by Seetha on 09-Dec-17.
 */
public interface TransportChangePlaySchoolProjection {

    String getTransportchangeid();
    Date getEntrydate();
    String getRegisternumber();
    String getName();
    String getProgram();
    String getSection();
    String getTransportrequired();
    String getStage();
    Long getTransportinitfees();
    Long getTransportterm1fees();
    Long getTransportterm2fees();
    Long getTransporttotalfees();
    String getAcademicyear();
    String getRemarks();

}

