package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Seetha on 24-Apr-18.
 */
public interface SchoolTestExamMarkDetailsRepository extends JpaRepository<SchoolTestExamMarkDetails, Integer> {
//    SchoolTestExamMarkDetails findBySchoolTestExamTimeTableCompoundKey(SchoolTestExamTimeTableCompoundKey schoolTestExamTimeTableCompoundKey);
    Iterable<SchoolTestExamMarkDetails> findByInstituteidAndAcademicyearAndStandardAndSection(Integer instituteid, String academicyear, String standard, String section);
    long countByInstituteidAndAcademicyearAndStandardAndSectionAndTesttype(Integer instituteid, String academicyear, String standard, String section, String testtype);
}
