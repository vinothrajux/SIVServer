package com.sivserver.example.teachingstaff;

import java.util.Date;

/**
 * Created by Seetha on 10-Dec-17.
 */
public interface StudentsMonthlyProgressPlaySchoolProjection {


    Student_Assessment_Play_School_Compound_Key getStudent_assessment_play_school_compound_key();
    Date getEntrydate();
    String getName();
    String getProgram();
    String getSection();
    String getAcademicyear();
    Integer getGrossmotorskills();
    Integer getFinemotorskills();
    Integer getConceptknowledge();
    Integer getActivityparticipation();
    Integer getSocialbehavior();
    Integer getDiningetiquettes();
    Integer getLanguageskills();
    Integer getListeningskills();
    Integer getNoofworkingdays();
    Integer getNoofdaysattended();
    Integer getFluency();
    Integer getAccuracy();
    Integer getClarity();
    Integer getLegibility();
    Integer getNeatness();
    Integer getGames();
    Integer getArtsandcrafts();
    Integer getObedience();
    Integer getResponsibility();
    Integer getPunctuality();
    Integer getRegularity();
    Integer getHomework();
    Integer getHandwriting();
    Integer getPersonalhygiene();
    Integer getSharing();
    Integer getUniform();
    Integer getNails();
    Integer getHair();
    Integer getCleanliness();
    float getHeight();
    float getWeight();

}

