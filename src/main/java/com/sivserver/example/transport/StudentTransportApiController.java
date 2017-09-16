package com.sivserver.example.transport;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 28/06/2017.
 */

@RestController
@RequestMapping("/api/v1/studenttransport")

public class StudentTransportApiController {

    //@Autowired
    private StudentTransportRepository studentTransportRepository;

    @GetMapping(value="/all")

    public List<StudentTransport> getStudentTransportDetail() {return studentTransportRepository.findAll();}

    public StudentTransportApiController(StudentTransportRepository studentTransportRepository)

    {
        this.studentTransportRepository = studentTransportRepository;
    }



    @RequestMapping(method = RequestMethod.POST)
    public void studentTransport(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchCode", required=false) String branchCode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="route", required=false) String route,
            @RequestParam (value="busno", required=false) Integer busno,
            @RequestParam (value="stage", required=false) String stage,
            @RequestParam (value="amount", required=false) Long amount,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StudentTransport studtrans = new StudentTransport();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);

        studtrans.setRegno(regno);
        studtrans.setBranch(branch);
        studtrans.setBranchCode(branchCode);
        studtrans.setSemester(semester);
        studtrans.setAcademicYear(academicYear);
        studtrans.setRoute(route);
        studtrans.setBusno(busno);
        studtrans.setStage(stage);
        studtrans.setAmount(amount);
        studtrans.setLoginuser(loginuser);

        studentTransportRepository.save(studtrans);



    }


}
