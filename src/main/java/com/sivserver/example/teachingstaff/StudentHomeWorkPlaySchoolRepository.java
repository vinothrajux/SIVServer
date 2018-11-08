package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface StudentHomeWorkPlaySchoolRepository extends JpaRepository<StudentHomeWorkPlaySchool, String> {
StudentHomeWorkPlaySchool findByHomeworkid(String homeworkid);
StudentHomeWorkPlaySchoolProjection findOneByHomeworkid(String homeworkid);

Iterable<StudentHomeWorkPlaySchool> findAllByEntrydateAndProgramAndSectionAndInstituteid(Date entrydate, String program, String section, Integer instituteid);

Iterable<StudentHomeWorkPlaySchoolProjection> findAllByAcademicyearAndProgramAndSectionAndEntrydateAndInstituteid(String academicyear, String program, String section, Date Entrydate, Integer instituteid);
}
