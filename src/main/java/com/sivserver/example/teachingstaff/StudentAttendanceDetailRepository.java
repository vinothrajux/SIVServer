package com.sivserver.example.teachingstaff;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface StudentAttendanceDetailRepository extends CrudRepository<StudentAttendanceDetail, String> {
    StudentAttendanceDetail findByregno(String regno);

}
