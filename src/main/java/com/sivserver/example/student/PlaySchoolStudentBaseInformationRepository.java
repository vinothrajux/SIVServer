package com.sivserver.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by GBCorp on 01/11/2017.
 */
public interface PlaySchoolStudentBaseInformationRepository extends JpaRepository<PlaySchoolStudentBaseInformation, String> {
PlaySchoolStudentBaseInformation findByRegisternumber(String registernumber);
PlaySchoolStudentBaseInformationProjection findOneByRegisternumber(String registernumber);
PlaySchoolStudentBaseInformationProjection findOneByRegisternumberAndInstituteid(String registernumber, Integer instituteid);
Iterable<PlaySchoolStudentBaseInformation> findAllByStandardstudyingAndSectionAndAcademicyearAndStudentstatusAndInstituteid(String standardstudying,String section, String academicyear, String studentstatus, Integer instituteid);
Iterable<PlaySchoolStudentBaseInformation> findAllByStandardstudyingAndSectionAndAcademicyearAndInstituteid(String standardstudying,String section, String academicyear, Integer instituteid);
Iterable<PlaySchoolStudentBaseInformation> findAllByInstituteid(Integer instituteid);
//Iterable<PlaySchoolStudentBaseInformationProjection> findAllByProgramAndSectionAndAcademicyearAndInstituteidOrderByRegisternumber(String program,String section,String academicyear,Integer instituteid );

}
