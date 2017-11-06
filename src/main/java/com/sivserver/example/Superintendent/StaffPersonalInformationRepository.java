package com.sivserver.example.Superintendent;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 28/09/2017.
 */
public interface StaffPersonalInformationRepository extends JpaRepository<StaffPersonalInformation, String> {
StaffPersonalInformation findByStaffid(String staffid);
}
