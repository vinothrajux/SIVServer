package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 03/11/2017.
 */
public interface StudentAttendanceHeaderPlaySchoolRepository extends JpaRepository<StudentAttendanceHeaderPlaySchool, Student_Attendance_Play_School_Compound_Key> {
    //Integer countALLByStudent_attendance_play_school_compound_key(Student_Attendance_Play_School_Compound_Key student_attendance_play_school_compound_key);
    //Integer c
}
