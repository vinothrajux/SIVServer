package com.sivserver.example.admission;

import com.sivserver.example.transport.StudentTransport;
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
@RequestMapping("/api/v1/studenthostel")

public class StudentHostelApiController  extends WebMvcConfigurerAdapter {

    @Autowired
    private StudentHostelRepository studentHostelRepository;

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
    public void studentHostel(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchCode", required=false) String branchCode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="optdFacility", required=false) String optdFacility,
            @RequestParam (value="foodtype", required=false) String foodtype,
            @RequestParam (value="amount", required=false) Long amount,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StudentHostel studhostel = new StudentHostel();
        studhostel.setRegno(regno);
        studhostel.setBranch(branch);
        studhostel.setBranchCode(branchCode);
        studhostel.setSemester(semester);
        studhostel.setAcadYear(academicYear);
        studhostel.setOptedFacility(optdFacility) ;
        studhostel.setFoodType(foodtype) ;
        studhostel.setAmount(amount);
        studhostel.setLoginUser(loginuser);

        studentHostelRepository.save(studhostel);

    }


}
