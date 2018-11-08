package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 05-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
    @RequestMapping("/api/v1/playschoolstudentnamelist")
    public class PlaySchoolStudentNameListApiController extends WebMvcConfigurerAdapter {
        @Autowired
        PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;
        @RequestMapping(method = RequestMethod.POST)
    public Iterable<PlaySchoolStudentBaseInformation> studentAttendanceDetail(
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="instituteid", required=false) Integer instituteid

    ) {
        Iterable<PlaySchoolStudentBaseInformation> studentList = playSchoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndInstituteid(program, section, academicyear, instituteid);
        return studentList;
    }
}
