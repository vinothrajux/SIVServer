package com.sivserver.example.Superintendent;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface StaffPersonalInformationPlaySchoolRepository extends JpaRepository<StaffPersonalInformationPlaySchool, String> {
StaffPersonalInformationPlaySchool findByStaffid(String staffid);
}
