package com.sivserver.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 01/11/2017.
 */
public interface PlaySchoolStudentPersonalInformationRepository extends JpaRepository<PlaySchoolStudentPersonalInformation,String> {
PlaySchoolStudentPersonalInformation findByRegisternumber(String registernumber);
}
