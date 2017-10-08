package com.sivserver.example.Superintendent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

/**
 * Created by GBCorp on 30/09/2017.
 */
public interface StaffWillingSubjectsRepository extends JpaRepository<StaffWillingSubjects, String> {
    StaffWillingSubjects findByStaffid(String staffid);

}
