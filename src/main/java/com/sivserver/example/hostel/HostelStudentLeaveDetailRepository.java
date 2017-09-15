package com.sivserver.example.hostel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by GBCorp on 19/07/2017.
 */
public interface HostelStudentLeaveDetailRepository extends JpaRepository<HostelStudentLeaveDetail, String> {
    HostelStudentLeaveDetail findByRegno(String regno);
}
