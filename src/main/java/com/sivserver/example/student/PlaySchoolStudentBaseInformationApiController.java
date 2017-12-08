package com.sivserver.example.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 01/11/2017.
 */
@RestController
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
            @RequestParam(value = "loginuser", required = false) String loginuser

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
                                    .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);


        playSchoolStudentBaseInformationRepository.save(playschoolstudentbaseinfo);
    }

    }
