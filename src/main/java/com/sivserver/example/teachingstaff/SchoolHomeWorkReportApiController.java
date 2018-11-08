package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 20-Oct-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/homeworklist")

public class SchoolHomeWorkReportApiController extends WebMvcConfigurerAdapter {
//    @Autowired
//    StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository;
//    @RequestMapping(method = RequestMethod.POST)
//    public Iterable<StudentHomeWorkPlaySchool> studentHomeWorkDetail(
//
//            @RequestParam (value="entrydate", required=false) Date entrydate,
//            @RequestParam(value="program", required=false) String program,
//            @RequestParam (value="section", required=false) String section,
//            @RequestParam (value="instituteid", required=false) Integer instituteid
//
//    ) {
//        System.out.println("entrydate" + entrydate);
//        System.out.println("program" + program);
//        System.out.println("section" + section);
//        System.out.println("instiuteid" + instituteid);
//
//        Iterable<StudentHomeWorkPlaySchool> studentList = studentHomeWorkPlaySchoolRepository.findAllByEntrydateAndProgramAndSectionAndInstituteid(entrydate,program,section,instituteid);
//        return studentList;
//    }



}
