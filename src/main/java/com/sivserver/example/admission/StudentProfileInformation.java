package com.sivserver.example.admission;

import com.sivserver.example.student.StudentBaseInformationProjection;

/**
 * Created by GBCorp on 02/10/2017.
 */
public class StudentProfileInformation {
//    public StudentPersonalInformationProjection getStudentPersonalInformation(){
//        return studentPersonalInformationDetail;
//    }


    private StudentPersonalInformationProjection studentpersonalinfo;
    private StudentBaseInformationProjection studentbaseinfo;

    public StudentPersonalInformationProjection getStudentpersonalinfo() {
        return studentpersonalinfo;
    }

    public void setStudentpersonalinfo(StudentPersonalInformationProjection studentpersonalinfo) {
        this.studentpersonalinfo = studentpersonalinfo;
    }

    public StudentBaseInformationProjection getStudentbaseinfo() {
        return studentbaseinfo;
    }

    public void setStudentbaseinfo(StudentBaseInformationProjection studentbaseinfo) {
        this.studentbaseinfo = studentbaseinfo;
    }
}
