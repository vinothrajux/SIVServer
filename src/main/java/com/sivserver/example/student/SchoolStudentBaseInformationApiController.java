package com.sivserver.example.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 02-Apr-18.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/schoolstudentbaseinformation")

public class SchoolStudentBaseInformationApiController {

    private SchoolStudentBaseInformationRepository schoolStudentBaseInformationRepository;

    @GetMapping(value="/all")

    public List<SchoolStudentBaseInformation> getSchoolStudentBaseInformationDetails() {return schoolStudentBaseInformationRepository.findAll();}

    public SchoolStudentBaseInformationApiController(SchoolStudentBaseInformationRepository schoolStudentBaseInformationRepository)
    {
        this.schoolStudentBaseInformationRepository=schoolStudentBaseInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void schoolstudentbaseinformation(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "candidatename", required = false) String candidatename,
            @RequestParam(value = "standardstudying", required = false) String standardstudying,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "studentstatus", required = false) String studentstatus,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteregisternumber", required = false) String instituteregisternumber,
            @RequestParam(value = "emisno", required = false) String emisno,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ) {
        SchoolStudentBaseInformation schoolstudentbaseinfo = new SchoolStudentBaseInformation();
        SchoolStudentPersonalInformation schoolstudentpersonalinfo = new SchoolStudentPersonalInformation(registernumber);
        schoolstudentbaseinfo.setRegisternumber(registernumber)
                .setCandidatename(candidatename)
                .setStandardstudying(standardstudying)
                .setSection(section)
                .setAcademicyear(academicyear)
                .setStudentstatus(studentstatus)
                .setLoginuser(loginuser)
                .setInstituteregisternumber(instituteregisternumber)
                .setEmisno(emisno)
                .setInstituteid(instituteid);
//                .setSchool_student_personal_regno(schoolstudentpersonalinfo);


        schoolStudentBaseInformationRepository.save(schoolstudentbaseinfo);
    }

//    @RequestMapping(method = RequestMethod.POST, value="/getStudentNameListPlaySchool")
//    public List<PlaySchoolStudentBaseInformationProjection> getStudentNameListPlaySchoolDetail(@RequestParam (value ="program") String program,@RequestParam (value ="section") String section,@RequestParam (value ="academicyear") String academicyear,@RequestParam (value ="instituteid") Integer instituteid) {
//        Iterable<PlaySchoolStudentBaseInformationProjection>  studentNameListPlaySchoolDetail = playSchoolStudentBaseInformationRepository.findAllByProgramAndSectionAndAcademicyearAndInstituteidOrderByRegisternumber(program,section,academicyear,instituteid);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentNameListPlaySchool");
//      //  return studentNameListPlaySchoolDetail;
//    }


}


