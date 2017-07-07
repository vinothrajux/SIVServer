package com.sivserver.example.teachingstaff;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
public interface StudentAttendanceHeaderRepository extends CrudRepository<StudentAttendanceHeader, Date> {
    StudentAttendanceHeader findByentrydate(Date entrydate);
}
