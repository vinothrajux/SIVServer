package com.sivserver.example.teachingstaff;

/**
 * Created by Seetha on 24-Apr-18.
 */
public interface SchoolTestExamMarkDetailsProjection {

    SchoolTestExamTimeTableCompoundKey getSchoolTestExamTimeTableCompoundKey();
    Integer getMaxmarks();
    Integer getMinmarks();
    String getSubjectmarkdetails();
    String getLoginuser();
}
