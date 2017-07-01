package com.sivserver.example.hod;

import com.sivserver.example.parent.StudentLeaveLetter;
import com.sivserver.example.parent.StudentLeaveLetterRepository;
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
@RequestMapping("/api/v1/subjecttimetable")

public class SubjectTimeTableApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SubjectTimeTableRepository subjectTimeTableRepository;

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
    public void subjectTimeTable(
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="hour1", required=false) String hour1,
            @RequestParam (value="hour2", required=false) String hour2,
            @RequestParam (value="hour3", required=false) String hour3,
            @RequestParam (value="hour4", required=false) String hour4,
            @RequestParam (value="hour5", required=false) String hour5,
            @RequestParam (value="hour6", required=false) String hour6,
            @RequestParam (value="hour7", required=false) String hour7,
            @RequestParam (value="hour8", required=false) String hour8,
            @RequestParam (value="ttday", required=false) String ttday,
            @RequestParam (value="dayno", required=false) Integer dayno,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        SubjectTimeTable subtimtab = new SubjectTimeTable();
        subtimtab.setBranch(branch);
        subtimtab.setBranchCode(branchcode);
        subtimtab.setBatch(batch);
        subtimtab.setSemester(semester);
        subtimtab.setAcadYear(academicYear);
        subtimtab.setHour1(hour1);
        subtimtab.setHour2(hour2);
        subtimtab.setHour3(hour3);
        subtimtab.setHour4(hour4);
        subtimtab.setHour5(hour5);
        subtimtab.setHour6(hour6);
        subtimtab.setHour7(hour7);
        subtimtab.setHour8(hour8);
        subtimtab.setTtDay(ttday);
        subtimtab.setTtDayNo(dayno);
        subtimtab.setLoginUser(loginuser);

        subjectTimeTableRepository.save(subtimtab);



    }


}
