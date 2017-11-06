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
    Student_Attendance_Play_School_Compound_Key student_attendance_play_school_compound_key;

    private String entryday;

    private Integer no_of_present;

    private Integer no_of_absent;

    private String loginuser;

    public StudentAttendanceHeaderPlaySchool() {
    }

    public String getEntryday() {
        return entryday;
    }

    public void setEntryday(String entryday) {
        this.entryday = entryday;
    }

    public Student_Attendance_Play_School_Compound_Key getStudent_attendance_play_school_compound_key() {
        return student_attendance_play_school_compound_key;
    }

    public void setStudent_attendance_play_school_compound_key(Student_Attendance_Play_School_Compound_Key student_attendance_play_school_compound_key) {
        this.student_attendance_play_school_compound_key = student_attendance_play_school_compound_key;
    }

    public Integer getNo_of_present() {
        return no_of_present;
    }

    public void setNo_of_present(Integer no_of_present) {
        this.no_of_present = no_of_present;
    }

    public Integer getNo_of_absent() {
        return no_of_absent;
    }

    public void setNo_of_absent(Integer no_of_absent) {
        this.no_of_absent = no_of_absent;
    }

    public String getLoginuser() {
        return loginuser;
    }

    public void setLoginuser(String loginuser) {
        this.loginuser = loginuser;
    }
}


