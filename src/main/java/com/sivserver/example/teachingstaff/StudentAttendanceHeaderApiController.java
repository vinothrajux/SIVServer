package com.sivserver.example.teachingstaff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/studentattendanceheader")

public class StudentAttendanceHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentAttendanceHeaderRepository studentAttendanceHeaderRepository;

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
    public void studentAttendanceHeader(
            @RequestParam(value ="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam (value="dayname", required=false) String dayname,
            @RequestParam (value="hour", required=false) Integer hour,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="academiyear", required=false) String academiyear,
            @RequestParam (value="totalPresent", required=false) Integer totalPresent,
            @RequestParam (value="totalAbsent", required=false) Integer totalAbsent,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        StudentAttendanceHeader studAttHead = new StudentAttendanceHeader();
        studAttHead.setAttendanceEntryDate(entrydate);
        studAttHead.setDay(dayname);
        studAttHead.setHour(hour);
        studAttHead.setBranchCode(branchcode);
        studAttHead.setBatch(batch);
        studAttHead.setSemester(semester);
        studAttHead.setAcademicYear(academiyear);
        studAttHead.setTotalPresent(totalPresent);
        studAttHead.setTotalAbsent(totalAbsent);
        studAttHead.setLoginUser(loginuser);



        //studentAttendanceHeaderRepository.save(studAttHead);



    }

}
