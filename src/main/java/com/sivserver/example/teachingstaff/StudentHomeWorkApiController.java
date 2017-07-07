package com.sivserver.example.teachingstaff;

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
@RequestMapping("/api/v1/studenthomework")

public class StudentHomeWorkApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentHomeWorkRepository studentHomeWorkRepository;

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
    public void studentHomeWork(
            @RequestParam(value ="entrydate", required=false) Date entrydate,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="subjectname", required=false) String subjectname,
            @RequestParam (value="subjectcode", required=false) String subjectcode,
            @RequestParam (value="homeworkcontent", required=false) String homeworkcontent,
            @RequestParam (value="staffID", required=false) String staffID,
            @RequestParam (value="staffName", required=false) String staffName,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentHomeWork studhomework = new StudentHomeWork();
        studhomework.setHomeWorkEntryDate(entrydate);
        studhomework.setBranch(branch);
        studhomework.setBranchCode(branchcode);
        studhomework.setBatch(batch);
        studhomework.setSemester(semester);
        studhomework.setAcadYear(academicYear);
        studhomework.setSubjectName(subjectname);
        studhomework.setSubjectCode(subjectcode);
        studhomework.setHomeWorkContent(homeworkcontent);
        studhomework.setStaffId(staffID);
        studhomework.setStaffName(staffName);
        studhomework.setLoginUser(loginuser);

        studentHomeWorkRepository.save(studhomework);



    }

}
