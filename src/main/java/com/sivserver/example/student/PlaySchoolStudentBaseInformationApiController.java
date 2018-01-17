package com.sivserver.example.student;

import com.sivserver.example.Superintendent.StaffPersonalInformationPlaySchoolProjection;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/playschoolstudentbaseinformation")
public class PlaySchoolStudentBaseInformationApiController {

    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @GetMapping(value="/all")

    public List<PlaySchoolStudentBaseInformation> getPlaySchoolStudentBaseInformationDetails() {return playSchoolStudentBaseInformationRepository.findAll();}

    public PlaySchoolStudentBaseInformationApiController(PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository)
    {
        this.playSchoolStudentBaseInformationRepository=playSchoolStudentBaseInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void playschoolstudentbaseinformation(
            @RequestParam(value = "registernumber", required = false) String registernumber,
            @RequestParam(value = "candidatename", required = false) String candidatename,
            @RequestParam(value = "standardstudying", required = false) String standardstudying,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "studentstatus", required = false) String studentstatus,
            @RequestParam(value = "loginuser", required = false) String loginuser,
            @RequestParam(value = "instituteid", required = false) Integer instituteid

    ) {
        PlaySchoolStudentBaseInformation playschoolstudentbaseinfo = new PlaySchoolStudentBaseInformation();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);
        playschoolstudentbaseinfo.setRegisternumber(registernumber)
                                    .setCandidatename(candidatename)
                                    .setStandardstudying(standardstudying)
                                    .setSection(section)
                                    .setAcademicyear(academicyear)
                                    .setStudentstatus(studentstatus)
                                    .setLoginuser(loginuser)
                                    .setInstituteid(instituteid)
                                    .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);


        playSchoolStudentBaseInformationRepository.save(playschoolstudentbaseinfo);
    }

//    @RequestMapping(method = RequestMethod.POST, value="/getStudentNameListPlaySchool")
//    public List<PlaySchoolStudentBaseInformationProjection> getStudentNameListPlaySchoolDetail(@RequestParam (value ="program") String program,@RequestParam (value ="section") String section,@RequestParam (value ="academicyear") String academicyear,@RequestParam (value ="instituteid") Integer instituteid) {
//        Iterable<PlaySchoolStudentBaseInformationProjection>  studentNameListPlaySchoolDetail = playSchoolStudentBaseInformationRepository.findAllByProgramAndSectionAndAcademicyearAndInstituteidOrderByRegisternumber(program,section,academicyear,instituteid);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentNameListPlaySchool");
//      //  return studentNameListPlaySchoolDetail;
//    }


}
