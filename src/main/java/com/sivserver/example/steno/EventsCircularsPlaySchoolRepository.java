package com.sivserver.example.steno;

import com.sivserver.example.teachingstaff.StudentHomeWorkPlaySchoolProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface EventsCircularsPlaySchoolRepository extends JpaRepository<EventsCircularsPlaySchool,String> {
    EventsCircularsPlaySchool findByEventid(String eventid);
    EventsCircularsPlaySchoolProjection findOneByEventid(String eventid);

    Iterable<EventsCircularsPlaySchoolProjection> findAllByAcademicyearAndProgramOrProgramAndSectionOrSectionAndEntrydateAfter(String academicyear, String program, String alternativeProgram,  String section, String alternativeSection, Date Entrydate);

}
