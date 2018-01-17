package com.sivserver.example.security;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 03/08/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/securitylatecomers")

public class SecurityStudentLateComersApiController  {
    //@Autowired
    private SecurityStudentLateComersRepository securityStudentLateComersRepository;

    @GetMapping(value="/all")

    public List<SecurityStudentLateComers> getSecurityStudentLateComers() {return securityStudentLateComersRepository.findAll();}

    public SecurityStudentLateComersApiController(SecurityStudentLateComersRepository securityStudentLateComersRepository)
    {
        this.securityStudentLateComersRepository = securityStudentLateComersRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void securityLatePass(
            @RequestParam(value ="latecomeid", required=false) String latecomeid,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="typeofperson", required=false) String typeofperson,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="nooftimesmonth", required=false) Integer nooftimesmonth,
            @RequestParam (value="nooftimesoverall", required=false) Integer nooftimesoverall,
            @RequestParam (value="reason", required=false) String reason,
            @RequestParam (value="timein", required=false) String timein,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        SecurityStudentLateComers secLatePass = new SecurityStudentLateComers();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        secLatePass.setLatecomeid(latecomeid);
        secLatePass.setCurrentdate(currentdate);
        secLatePass.setTypeofperson(typeofperson);
        secLatePass.setRegno(regno);
        secLatePass.setBranchcode(branchcode);
        secLatePass.setBatch(batch);
        secLatePass.setSemester(semester);
        secLatePass.setAcademicyear(academicyear);
        secLatePass.setNooftimesmonth(nooftimesmonth);
        secLatePass.setNooftimesoverall(nooftimesoverall);
        secLatePass.setReason(reason);
        secLatePass.setTimein(timein);
        secLatePass.setLoginuser(loginuser);

        securityStudentLateComersRepository.save(secLatePass);



    }


}
