package com.sivserver.example.admission;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 28/06/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentfood")

public class StudentFoodApiController  {

    private StudentFoodRepository studentFoodRepository;

    @RequestMapping(value="/all")
    public List<StudentFood> getStudentFoodDetail() {return studentFoodRepository.findAll();}


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
        StudentPersonalInformation student_personal_regno = new StudentPersonalInformation(regno);

        studfood.setRegno(regno)
                .setBranch(branch)
                .setBranchcode(branchcode)
                .setSemester(semester)
                .setAcademicYear(academicYear)
                .setFoodtype(foodtype)
                .setFoodfees(foodfees)
                .setLoginuser(loginuser);

        studentFoodRepository.save(studfood);



    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentFoodDetail")
    public StudentFood getStudentFoodDetail(@RequestParam (value ="regno") String registerNumber) {
        StudentFood studentfoodDetail = studentFoodRepository.findOneByRegno(registerNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentFoodDetails");
        return studentfoodDetail;
    }


}


