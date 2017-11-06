package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 03/11/2017.
 */
public interface StudentAttendanceDetailPlaySchoolRepository extends JpaRepository<StudentAttendanceDetailPlaySchool, Integer> {
StudentAttendanceDetailPlaySchool findById(Integer id);
}
