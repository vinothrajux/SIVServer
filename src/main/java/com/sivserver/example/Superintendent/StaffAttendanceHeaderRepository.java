package com.sivserver.example.Superintendent;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface StaffAttendanceHeaderRepository extends CrudRepository<StaffAttendanceHeader, Date> {
    StaffAttendanceHeader findByattdate(Date attdate);
}
