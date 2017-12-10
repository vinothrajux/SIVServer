package com.sivserver.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 01/11/2017.
 */
public interface PlaySchoolStudentBaseInformationRepository extends JpaRepository<PlaySchoolStudentBaseInformation, String> {
PlaySchoolStudentBaseInformation findByRegisternumber(String registernumber);
PlaySchoolStudentBaseInformationProjection findOneByRegisternumber(String registernumber);
Iterable<PlaySchoolStudentBaseInformation> findAllByStandardstudyingAndSectionAndAcademicyearAndStudentstatus(String standardstudying,String section, String academicyear, String studentstatus);
}
