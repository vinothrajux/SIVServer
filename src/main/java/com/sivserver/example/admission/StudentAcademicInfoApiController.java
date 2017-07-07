package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@RequestMapping("/api/v1/studentacademicinfo")

public class StudentAcademicInfoApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private StudentAcademicInfoRepository studentacademicinfoRepository;


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
        studentacademicinfo.setRegno(regno);
        studentacademicinfo.setCommunity(community);
        studentacademicinfo.setReligion(religion);
        studentacademicinfo.setCaste(caste);
        studentacademicinfo.setNational(national);
        studentacademicinfo.setBloodGroup(bloodgroup);
        studentacademicinfo.setDurationFrom(durationfrom);
        studentacademicinfo.setDurationTo(durationto);
        studentacademicinfo.setAdmittedDate(admitteddate);
        studentacademicinfo.setAacademicyear(academicyear);
        studentacademicinfo.setLoginUser(loginuser);



        studentacademicinfoRepository.save(studentacademicinfo);
    }


}
