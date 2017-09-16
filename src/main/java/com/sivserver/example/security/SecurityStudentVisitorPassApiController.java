package com.sivserver.example.security;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 02-Aug-17.
 */
@RestController
@RequestMapping("/api/v1/securityvisitorpass")

public class SecurityStudentVisitorPassApiController {
    //@Autowired
    private SecurityStudentVisitorPassRepository securityStudentVisitorPassRepository;

    @GetMapping(value="/all")

    public List<SecurityStudentVisitorPass> getSecurityStudentVisitorPassDetail() {return securityStudentVisitorPassRepository.findAll();}

    public SecurityStudentVisitorPassApiController(SecurityStudentVisitorPassRepository securityStudentVisitorPassRepository)
    {
        this.securityStudentVisitorPassRepository = securityStudentVisitorPassRepository;
    }



    @RequestMapping(method = RequestMethod.POST)
    public void securityVisPass(
            @RequestParam(value ="visitorid", required=false) String visitorid,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="visitorname", required=false) String visitorname,
            @RequestParam(value ="noofpersons", required=false) Integer noofpersons,
            @RequestParam (value="visitortransportmode", required=false) String visitortransportmode,
            @RequestParam (value="persontomeet", required=false) String persontomeet,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="reason", required=false) String reason,
            @RequestParam (value="timein", required=false) String timein,
            @RequestParam (value="timeout", required=false) String timeout,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        SecurityStudentVisitorPass secVisPass = new SecurityStudentVisitorPass();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        secVisPass.setVisitorid(visitorid);
        secVisPass.setCurrentdate(currentdate);
        secVisPass.setVisitorname(visitorname);
        secVisPass.setNoofpersons(noofpersons);
        secVisPass.setVisitortransportmode(visitortransportmode);
        secVisPass.setPersontomeet(persontomeet);
        secVisPass.setRegno(regno);
        secVisPass.setBranchcode(branchcode);
        secVisPass.setBatch(batch);
        secVisPass.setSemester(semester);
        secVisPass.setAcademicyear(academicyear);
        secVisPass.setReason(reason);
        secVisPass.setTimein(timein);
        secVisPass.setTimeout(timeout);
        secVisPass.setLoginuser(loginuser);

        securityStudentVisitorPassRepository.save(secVisPass);



    }

}
