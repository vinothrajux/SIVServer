package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by GBCorp on 03/11/2017.
 */
public interface StudentAttendanceDetailPlaySchoolRepository extends JpaRepository<StudentAttendanceDetailPlaySchool, Integer> {
StudentAttendanceDetailPlaySchool findById(Integer id);
StudentAttendanceDetailFetchPlaySchool findByEntrydateAndRegisternumberAndInstituteid(Date entrydate,String registernumber, Integer instituteid);
}
