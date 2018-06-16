package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.student.SchoolStudentBaseInformation;
import com.sivserver.example.student.SchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 07-May-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schoolstudentnamelist")

public class SchoolStudentNameListApiController extends WebMvcConfigurerAdapter {

    @Autowired
    SchoolStudentBaseInformationRepository schoolStudentBaseInformationRepository;
    @RequestMapping(method = RequestMethod.POST)
    public Iterable<SchoolStudentBaseInformation> studentAttendanceDetail(
            @RequestParam(value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="instituteid", required=false) Integer instituteid

    ) {
        Iterable<SchoolStudentBaseInformation> studentList = schoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndInstituteid(program, section, academicyear, instituteid);
        return studentList;
    }

}
