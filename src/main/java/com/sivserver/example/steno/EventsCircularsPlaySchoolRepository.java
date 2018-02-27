package com.sivserver.example.steno;

import com.sivserver.example.teachingstaff.StudentHomeWorkPlaySchoolProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by GBCorp on 07/11/2017.
 */
public interface EventsCircularsPlaySchoolRepository extends JpaRepository<EventsCircularsPlaySchool,String> {
    EventsCircularsPlaySchool findByEventid(String eventid);
    EventsCircularsPlaySchoolProjection findOneByEventid(String eventid);

//    Iterable<EventsCircularsPlaySchoolProjection> findAllByAcademicyearAndProgramOrProgramAndSectionOrSectionAndEventdate(String academicyear, String program, String alternativeProgram,  String section, String alternativeSection, Date Entrydate);
      Iterable<EventsCircularsPlaySchoolProjection> findAllByAcademicyearAndProgramInAndSectionInAndEventdateAfterAndInstituteidOrderByEventdateAsc(String academicyear, List<String> programs, List<String> sections, @DateTimeFormat(pattern="dd/MM/yyyy") Date Entrydate, Integer Instituteid);

}
