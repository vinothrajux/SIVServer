package com.sivserver.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 30-Mar-18.
 */
public interface SchoolStudentPersonalInformationRepository extends JpaRepository<SchoolStudentPersonalInformation, String > {
SchoolStudentPersonalInformation findByRegisternumber(String registernumber);
}
