package com.sivserver.example.student;

import java.util.Date;

/**
 * Created by Seetha on 30-Mar-18.
 */
public interface SchoolStudentPersonalInformationProjection {

    String getRegisternumber();
    String getEmisno();
    String getCandidatename();
    Date getDateofbirth();
    float getAge();
    String getGender();
    String getBloodgroup();
    String getReligion();
    String getCommunity();
    String getCaste();
    String getCandfathername();
    String getCandmothername();
    String getPresentaddress1();
    String getPresentaddress2();
    String getPresentarea();
    String getPresentpincode();
    String getPresentstate();
    String getFathersmobileno();
    String getFathersaltmobno();
    String getMothersmobileno();
    String getMothersaltmobno();
    String getFathersemail();
    String getMothersemail();
    String getReference();
    String getFathersoccupation();
    String getFathersofficename();
    String getFathersofficeaddress1();
    String getFathersofficeaddress2();
    String getFathersofficearea();
    String getFathersofficepincode();
    String getFathersofficestate();
    String getFathersofficephoneno();
    String getFathersofficealtphoneno();
    String getFathersofficeextensionno();
    Double getFathermonthlyincome();
    String getMothersoccupation();
    String getMothersofficename();
    String getMothersofficeaddress1();
    String getMothersofficeaddress2();
    String getMothersofficearea();
    String getMothersofficepincode();
    String getMothersofficestate();
    String getMothersofficephoneno();
    String getMothersofficealtphoneno();
    String getMothersofficeextensionno();
    Double getMothersmonthlyincome();
    String getLastschoolname();
    String getLastschoolclass();
    String getLastschoolclassqualified();
    String getLastschooltcattached();
    String getLastschoolmedium();
    String getLastschoolyearofstudy();
    String getClassintoadmission();
    String getMothertoungue();
    String getAadharno();
    String getExtracurricular();
    String getAchievements();
    String getIdentificationmarks();

    String getSiblings();
    String getSiblingname();
    Date getSiblingdob();
    float getSiblingage();
    String getSiblingclass();
    String getSiblingsection();
    String getMedicaldetails();
    String getAllergies();
    Date getFathersdob();
    Date getMothersdob();
    Date getParentsweddingdate();

    String getTransport();
    String getTransportstage();
    String getAcademicyear();
    Integer getInstituteid();

}
