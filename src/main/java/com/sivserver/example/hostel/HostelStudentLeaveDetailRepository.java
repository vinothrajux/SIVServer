package com.sivserver.example.hostel;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 19/07/2017.
 */
public interface HostelStudentLeaveDetailRepository extends CrudRepository<HostelStudentLeaveDetail, String> {
    HostelStudentLeaveDetail findByRegno(String regno);
}
