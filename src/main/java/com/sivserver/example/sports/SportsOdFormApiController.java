package com.sivserver.example.sports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
@RestController
@RequestMapping("/api/v1/sportsod")

public class SportsOdFormApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SportsOdFormRepository sportsOdFormRepository;

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
    public void sportsodform(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="reasonforod", required=false) String reasonforod,
            @RequestParam (value="fromdate", required=false) Date fromdate,
            @RequestParam (value="todate", required=false) Date todate,
            @RequestParam (value="semester", required=false) String loginuser

    ) {
        SportsOdForm sportodfrm = new SportsOdForm();
        sportodfrm.setCurrentdate(currentdate);
        sportodfrm.setRegno(regno);
        sportodfrm.setBranchcode(branchcode);
        sportodfrm.setBatch(batch);
        sportodfrm.setSemester(semester);
        sportodfrm.setAcademicyear(academicyear);
        sportodfrm.setReasonforod(reasonforod);
        sportodfrm.setFromdate(fromdate);
        sportodfrm.setTodate(todate);
        sportodfrm.setLoginuser(loginuser);

        sportsOdFormRepository.save(sportodfrm);



    }



}
