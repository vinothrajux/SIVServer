package com.sivserver.example.admission;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentacademicinfo")

public class StudentAcademicInfoApiController  {

   // @Autowired
    private StudentAcademicInfoRepository studentacademicinfoRepository;

    @GetMapping(value="/all")
    public List<StudentAcademicInfo> getStudentAcademicInformation() {return studentacademicinfoRepository.findAll();}

    public StudentAcademicInfoApiController(StudentAcademicInfoRepository studentacademicinfoRepository)
    {
        this.studentacademicinfoRepository = studentacademicinfoRepository;
    }


    @RequestMapping(method = RequestMethod.POST)

    public void studentAcademicInfo(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="religion", required=false) String religion,
            @RequestParam (value="caste", required=false) String caste,
            @RequestParam (value="national", required=false) String national,
            @RequestParam (value="bloodgroup", required=false) String bloodgroup,
            @RequestParam (value="durationfrom", required=false) String durationfrom,
            @RequestParam (value="durationto", required=false) String durationto,
            @RequestParam (value="admitteddate", required=false) Date admitteddate,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StudentAcademicInfo studentacademicinfo = new StudentAcademicInfo();
        StudentPersonalInformation student_personal_regno = new StudentPersonalInformation(regno);
        studentacademicinfo.setRegno(regno)
                            .setCommunity(community)
                            .setReligion(religion)
                            .setCaste(caste)
                            .setNational(national)
                            .setBloodgroup(bloodgroup)
                            .setDurationfrom(durationfrom)
                            .setDurationto(durationto)
                            .setAdmitteddate(admitteddate)
                            .setAcademicyear(academicyear)
                            .setLoginuser(loginuser)
                            .setStudent_personal_regno(student_personal_regno);

        studentacademicinfoRepository.save(studentacademicinfo);
    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentAcademicInformationDetail")
    public StudentAcademicInfoProjection getStudentAcademicInformationDetail(@RequestParam (value ="regno") String registerNumber) {
        StudentAcademicInfoProjection studentAcademicInformationDetail = studentacademicinfoRepository.findOneByRegno(registerNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentAcademicInformationDetail");
        return studentAcademicInformationDetail;
    }

}
