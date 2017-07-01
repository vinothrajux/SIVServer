package com.sivserver.example.parent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 29/06/2017.
 */
@RestController
@RequestMapping("/api/v1/studentleaveletter")

public class StudentLeaveLetterApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentLeaveLetterRepository studentLeaveLetterRepository;

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
    public void studentFood(
            @RequestParam(value ="entrydate", required=false) Date entrydate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="fromdate", required=false) Date fromdate,
            @RequestParam (value="todate", required=false) Date todate,
            @RequestParam (value="noofdays", required=false) Integer noofdays,
            @RequestParam (value="leavereason", required=false) String leavereason,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentLeaveLetter studleave = new StudentLeaveLetter();
        studleave.setLeaveEntryDate(entrydate);
        studleave.setRegno(regno);
        studleave.setBranch(branch);
        studleave.setBranchCode(branchcode);
        studleave.setSemester(semester);
        studleave.setAcadYear(academicYear);
        studleave.setFromDate(fromdate);
        studleave.setToDate(todate);
        studleave.setNoofDays(noofdays);
        studleave.setLeaveReason(leavereason);
        studleave.setLoginUser(loginuser);

        studentLeaveLetterRepository.save(studleave);



    }


}



