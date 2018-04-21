package com.sivserver.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 02-Apr-18.
 */
public interface SchoolStudentBaseInformationRepository extends JpaRepository<SchoolStudentBaseInformation, String> {

    SchoolStudentBaseInformation findByRegisternumber(String registernumber);
    SchoolStudentBaseInformationProjection findOneByRegisternumber(String registernumber);
    SchoolStudentBaseInformationProjection findOneByRegisternumberAndInstituteid(String registernumber, Integer instituteid);
    Iterable<SchoolStudentBaseInformation> findAllByStandardstudyingAndSectionAndAcademicyearAndStudentstatusAndInstituteid(String standardstudying,String section, String academicyear, String studentstatus, Integer instituteid);
    Iterable<SchoolStudentBaseInformation> findAllByStandardstudyingAndSectionAndAcademicyearAndInstituteid(String standardstudying,String section, String academicyear, Integer instituteid);

}
