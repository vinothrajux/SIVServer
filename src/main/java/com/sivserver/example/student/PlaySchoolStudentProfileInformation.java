package com.sivserver.example.student;

/**
 * Created by GBCorp on 27/11/2017.
 */
public class PlaySchoolStudentProfileInformation {

    private PlaySchoolStudentBaseInformationProjection studentbaseinfo;
    private PlaySchoolStudentPersonalInformationProjection studentpersonalinfo;

    public PlaySchoolStudentBaseInformationProjection getStudentbaseinfo() {
        return studentbaseinfo;
    }

    public void setStudentbaseinfo(PlaySchoolStudentBaseInformationProjection studentbaseinfo) {
        this.studentbaseinfo = studentbaseinfo;
    }

    public PlaySchoolStudentPersonalInformationProjection getStudentpersonalinfo() {
        return studentpersonalinfo;
    }

    public void setStudentpersonalinfo(PlaySchoolStudentPersonalInformationProjection studentpersonalinfo) {
        this.studentpersonalinfo = studentpersonalinfo;
    }
}
