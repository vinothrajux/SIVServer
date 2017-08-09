package com.sivserver.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 03/08/2017.
 */
@RestController
@RequestMapping("/api/v1/securityoutpass")

public class SecurityOutPassApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SecurityOutPassRepository securityOutPassRepository;

//    @Autowired
//    private ApplicationSaleRepository applicationSaleRepository;
//
//
//    @RequestMapping(method = RequestMethod.GET, value="/getApplcationDetail")
//    public ApplicationSaleDetailProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
//        ApplicationSaleDetailProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//
//        return applicationDetail;
//
//    }


    @RequestMapping(method = RequestMethod.POST)
    public void securityOutPass(
            @RequestParam(value ="outpassid", required=false) String outpassid,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="typeofperson", required=false) String typeofperson,
            @RequestParam(value ="registerno", required=false) String registerno,
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
        SecurityOutPass secOutPass = new SecurityOutPass();
        secOutPass.setOutpassid(outpassid);
        secOutPass.setCurrentdate(currentdate);
        secOutPass.setTypeofperson(typeofperson);
        secOutPass.setRegno(registerno);
        secOutPass.setBranchCode(branchcode);
        secOutPass.setBatch(batch);
        secOutPass.setSemester(semester);
        secOutPass.setAcadyear(academicyear);
        secOutPass.setNooftimesmonth(nooftimesmonth);
        secOutPass.setNooftimesoverall(nooftimesoverall);
        secOutPass.setReason(reason);
        secOutPass.settimeout(timeout);
        secOutPass.setLoginUser(loginuser);

        securityOutPassRepository.save(secOutPass);



    }

}
