package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 28/06/2017.
 */
@RestController
@RequestMapping("/api/v1/studentfood")

public class StudentFoodApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentFoodRepository studentFoodRepository;

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
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="foodtype", required=false) String foodtype,
            @RequestParam (value="foodfees", required=false) Long foodfees,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StudentFood studfood = new StudentFood();
        studfood.setRegno(regno);
        studfood.setBranch(branch);
        studfood.setBranchCode(branchcode);
        studfood.setSemester(semester);
        studfood.setAcadYear(academicYear);
        studfood.setFoodType(foodtype);
        studfood.setFoodFees(foodfees);
        studfood.setLoginUser(loginuser);

        studentFoodRepository.save(studfood);



    }


}


