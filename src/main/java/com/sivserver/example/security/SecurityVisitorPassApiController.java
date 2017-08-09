package com.sivserver.example.security;

import com.sivserver.example.parent.ParentFeedBack;
import com.sivserver.example.parent.ParentFeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 02-Aug-17.
 */
@RestController
@RequestMapping("/api/v1/securityvisitorpass")

public class SecurityVisitorPassApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SecurityVisitorPassRepository securityVisitorPassRepository;

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
    public void securityVisPass(
            @RequestParam(value ="visitorid", required=false) String visitorid,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="visitorname", required=false) String visitorname,
            @RequestParam(value ="noofpersons", required=false) Integer noofpersons,
            @RequestParam (value="visitortransportmode", required=false) String visitortransportmode,
            @RequestParam (value="persontomeet", required=false) String persontomeet,
            @RequestParam (value="staffid", required=false) String staffid,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="reason", required=false) String reason,
            @RequestParam (value="timein", required=false) String timein,
            @RequestParam (value="timeout", required=false) String timeout,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        SecurityVisitorPass secVisPass = new SecurityVisitorPass();
        secVisPass.setvisitorid(visitorid);
        secVisPass.setCurrentdate(currentdate);
        secVisPass.setVisitorname(visitorname);
        secVisPass.setNoofpersons(noofpersons);
        secVisPass.setVisitortransportmode(visitortransportmode);
        secVisPass.setPersontomeet(persontomeet);
        secVisPass.setStaffid(staffid);
        secVisPass.setName(name);
        secVisPass.setBranchCode(branchcode);
        secVisPass.setBatch(batch);
        secVisPass.setSemester(semester);
        secVisPass.setAcadyear(academicyear);
        secVisPass.setReason(reason);
        secVisPass.setTimein(timein);
        secVisPass.settimeout(timeout);
        secVisPass.setLoginUser(loginuser);
        securityVisitorPassRepository.save(secVisPass);



    }

}
