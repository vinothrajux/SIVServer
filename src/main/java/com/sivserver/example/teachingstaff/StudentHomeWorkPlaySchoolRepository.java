package com.sivserver.example.teachingstaff;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface StudentHomeWorkPlaySchoolRepository extends JpaRepository<StudentHomeWorkPlaySchool, String> {
StudentHomeWorkPlaySchool findByHomeworkid(String homeworkid);
StudentHomeWorkPlaySchoolProjection findOneByHomeworkid(String homeworkid);
Iterable<StudentHomeWorkPlaySchoolProjection> findAllByAcademicyearAndProgramAndSectionAndEntrydate(String academicyear, String program, String section, Date Entrydate);
}
