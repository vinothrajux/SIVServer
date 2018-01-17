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
@RequestMapping("/api/v1/securityoutpass")

public class SecurityStudentOutPassApiController {
    //@Autowired
    private SecurityStudentOutPassRepository securityStudentOutPassRepository;

    @GetMapping(value="/all")

    public List<SecurityStudentOutPass> getSecurityStudentOutPass() {return securityStudentOutPassRepository.findAll();}

    public SecurityStudentOutPassApiController(SecurityStudentOutPassRepository securityStudentOutPassRepository)
    {
        this.securityStudentOutPassRepository = securityStudentOutPassRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void securityOutPass(
            @RequestParam(value ="outpassid", required=false) String outpassid,
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
            @RequestParam (value="timeout", required=false) String timeout,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        SecurityStudentOutPass secOutPass = new SecurityStudentOutPass();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        secOutPass.setOutpassid(outpassid);
        secOutPass.setCurrentdate(currentdate);
        secOutPass.setTypeofperson(typeofperson);
        secOutPass.setRegno(regno);
        secOutPass.setBranchcode(branchcode);
        secOutPass.setBatch(batch);
        secOutPass.setSemester(semester);
        secOutPass.setAcademicyear(academicyear);
        secOutPass.setNooftimesmonth(nooftimesmonth);
        secOutPass.setNooftimesoverall(nooftimesoverall);
        secOutPass.setReason(reason);
        secOutPass.setTimeout(timeout);
        secOutPass.setLoginuser(loginuser);

        securityStudentOutPassRepository.save(secOutPass);



    }

}
