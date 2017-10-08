package com.sivserver.example.Superintendent;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 30/09/2017.
 */
public interface StaffEligibilityInformationRepository extends JpaRepository<StaffEligibilityInformation, String> {

    StaffEligibilityInformation findByStaffid(String staffid);
}
