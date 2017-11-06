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
            @RequestParam(value = "class_studying", required = false) String class_studying,
            @RequestParam(value = "section", required = false) String section,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "student_status", required = false) String student_status,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        PlaySchoolStudentBaseInformation playschoolstudentbaseinfo = new PlaySchoolStudentBaseInformation();
        PlaySchoolStudentPersonalInformation playschoolstudentpersonalinfo = new PlaySchoolStudentPersonalInformation(registernumber);
        playschoolstudentbaseinfo.setRegisternumber(registernumber)
                                    .setCandidatename(candidatename)
                                    .setClass_studying(class_studying)
                                    .setSection(section)
                                    .setAcademicyear(academicyear)
                                    .setStudent_status(student_status)
                                    .setLoginuser(loginuser)
                                    .setPlay_school_student_personal_regno(playschoolstudentpersonalinfo);


        playSchoolStudentBaseInformationRepository.save(playschoolstudentbaseinfo);
    }

    }
