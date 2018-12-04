package com.sivserver.example.admission;

import com.sivserver.example.transport.StudentTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 19-Jun-17.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studenthostel")

public class StudentHostelApiController   {

    // @Autowired
    private StudentHostelRepository studentHostelRepository;

    @RequestMapping(value = "/all")
    public List<StudentHostel> getStudentHostelDetail() {
        return studentHostelRepository.findAll();
    }

    public StudentHostelApiController(StudentHostelRepository studentHostelRepository) {
        this.studentHostelRepository = studentHostelRepository;
    }


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
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "branch", required = false) String branch,
            @RequestParam(value = "branchCode", required = false) String branchCode,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicYear", required = false) String academicYear,
            @RequestParam(value = "optdFacility", required = false) String optdFacility,
            @RequestParam(value = "foodtype", required = false) String foodtype,
            @RequestParam(value = "amount", required = false) Long amount,
            @RequestParam(value = "loginuser", required = false) String loginuser
    ) {
        StudentHostel studhostel = new StudentHostel();
        StudentPersonalInformation student_personal_regno = new StudentPersonalInformation(regno);
        studhostel.setRegno(regno)
                .setBranch(branch)
                .setBranchCode(branchCode)
                .setSemester(semester)
                .setAcademicYear(academicYear)
                .setOptdFacility(optdFacility)
                .setFoodtype(foodtype)
                .setAmount(amount)
                .setLoginuser(loginuser);

        studentHostelRepository.save(studhostel);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/getStudentHostelDetail")
    public StudentHostel getStudentHostelDetail(@RequestParam(value = "regno") String registerNumber) {
        StudentHostel studentHostelDetail = studentHostelRepository.findOneByRegno(registerNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentCertificateSubmissionDetail");
        return studentHostelDetail;


    }
}