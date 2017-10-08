package com.sivserver.example.Superintendent;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 29/09/2017.
 */
public interface StaffDepositInformationRepository extends JpaRepository<StaffDepositInformation, String> {
    StaffDepositInformation findByStaffid(String staffid);
}
