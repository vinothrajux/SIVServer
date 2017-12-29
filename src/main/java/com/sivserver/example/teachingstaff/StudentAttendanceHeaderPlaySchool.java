package com.sivserver.example.teachingstaff;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by GBCorp on 03/11/2017.
 */
@Entity
@Table(name="studentattendanceheaderplayschool")
public class StudentAttendanceHeaderPlaySchool {


    @Id
    Student_Attendance_Play_School_Compound_Key studentattendanceplayschoolcompoundkey;

    private String entryday;

    private Integer noofpresent;

    private Integer noofabsent;

    private String loginuser;

    public StudentAttendanceHeaderPlaySchool() {
    }

    public String getEntryday() {
        return entryday;
    }

    public void setEntryday(String entryday) {
        this.entryday = entryday;
    }

    public Student_Attendance_Play_School_Compound_Key getStudentattendanceplayschoolcompoundkey() {
        return studentattendanceplayschoolcompoundkey;
    }

    public void setStudentattendanceplayschoolcompoundkey(Student_Attendance_Play_School_Compound_Key studentattendanceplayschoolcompoundkey) {
        this.studentattendanceplayschoolcompoundkey = studentattendanceplayschoolcompoundkey;
    }

    public Integer getNoofpresent() {
        return noofpresent;
    }

    public void setNoofpresent(Integer noofpresent) {
        this.noofpresent = noofpresent;
    }

    public Integer getNoofabsent() {
        return noofabsent;
    }

    public void setNoofabsent(Integer noofabsent) {
        this.noofabsent = noofabsent;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}


