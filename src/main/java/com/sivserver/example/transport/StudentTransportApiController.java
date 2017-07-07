package com.sivserver.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 28/06/2017.
 */

@RestController
@RequestMapping("/api/v1/studenttransport")

public class StudentTransportApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private StudentTransportRepository studentTransportRepository;

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
    public void studentTransport(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchCode", required=false) String branchCode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="route", required=false) String route,
            @RequestParam (value="stage", required=false) String stage,
            @RequestParam (value="amount", required=false) Long amount,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StudentTransport studtrans = new StudentTransport();
        studtrans.setRegno(regno);
        studtrans.setBranch(branch);
        studtrans.setBranchCode(branchCode);
        studtrans.setSemester(semester);
        studtrans.setAcadYear(academicYear);
        studtrans.setRoute(route);
        studtrans.setStage(stage);
        studtrans.setAmount(amount);
        studtrans.setLoginUser(loginuser);

        studentTransportRepository.save(studtrans);



    }


}
