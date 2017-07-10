package com.sivserver.example.Superintendent;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
public interface StaffAttendanceDetailRepository extends CrudRepository<StaffAttendanceDetail, Date> {
    StaffAttendanceDetail findByattdate(Date attdate);

}
