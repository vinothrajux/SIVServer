package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 03/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomainternalbranchtesttimetableheader")

public class DiplomaInternalBranchTestTimetableHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaInternalBranchTestTimetableHeaderRepository diplomaInternalBranchTestTimetableHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestTtHeader(
            @RequestParam(value = "testid", required = false) String testid,
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "testtype", required = false) String testtype,
            @RequestParam(value = "maxmarks", required = false) Integer maxmarks,
            @RequestParam(value = "subject1Colno", required = false) Integer subject1colno,
            @RequestParam(value = "subject1Codeno", required = false) String subject1codeno,
            @RequestParam(value = "subject1TestDate", required = false) Date subject1testdate,
            @RequestParam(value = "subject1TestDay", required = false) String subject1testday,
            @RequestParam(value = "subject2Colno", required = false) Integer subject2colno,
            @RequestParam(value = "subject2Codeno", required = false) String subject2codeno,
            @RequestParam(value = "subject2TestDate", required = false) Date subject2testdate,
            @RequestParam(value = "subject2TestDay", required = false) String subject2testday,
            @RequestParam(value = "subject3Colno", required = false) Integer subject3colno,
            @RequestParam(value = "subject3Codeno", required = false) String subject3codeno,
            @RequestParam(value = "subject3TestDate", required = false) Date subject3testdate,
            @RequestParam(value = "subject3TestDay", required = false) String subject3testday,
            @RequestParam(value = "subject4Colno", required = false) Integer subject4colno,
            @RequestParam(value = "subject4Codeno", required = false) String subject4codeno,
            @RequestParam(value = "subject4TestDate", required = false) Date subject4testdate,
            @RequestParam(value = "subject4TestDay", required = false) String subject4testday,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaInternalBranchTestTimetableHeader dipIntBranTestTimeTabHead = new DiplomaInternalBranchTestTimetableHeader();
        dipIntBranTestTimeTabHead.setTestid(testid);
        dipIntBranTestTimeTabHead.setEntrydate(entrydate);
        dipIntBranTestTimeTabHead.setBranchcode(branchcode);
        dipIntBranTestTimeTabHead.setBatch(batch);
        dipIntBranTestTimeTabHead.setSemester(semester);
        dipIntBranTestTimeTabHead.setAcademicyear(academicyear);
        dipIntBranTestTimeTabHead.setTesttype(testtype);
        dipIntBranTestTimeTabHead.setMaximummarks(maxmarks);
        dipIntBranTestTimeTabHead.setSubject1columnno(subject1colno);
        dipIntBranTestTimeTabHead.setSubject1codeno(subject1codeno);
        dipIntBranTestTimeTabHead.setSubject1date(subject1testdate);
        dipIntBranTestTimeTabHead.setSubject1day(subject1testday);
        dipIntBranTestTimeTabHead.setSubject2columnno(subject2colno);
        dipIntBranTestTimeTabHead.setSubject2codeno(subject2codeno);
        dipIntBranTestTimeTabHead.setSubject2date(subject2testdate);
        dipIntBranTestTimeTabHead.setSubject2day(subject2testday);
        dipIntBranTestTimeTabHead.setSubject3columnno(subject3colno);
        dipIntBranTestTimeTabHead.setSubject3codeno(subject3codeno);
        dipIntBranTestTimeTabHead.setSubject3date(subject3testdate);
        dipIntBranTestTimeTabHead.setSubject3day(subject3testday);
        dipIntBranTestTimeTabHead.setSubject4columnno(subject4colno);
        dipIntBranTestTimeTabHead.setSubject4codeno(subject4codeno);
        dipIntBranTestTimeTabHead.setSubject4date(subject4testdate);
        dipIntBranTestTimeTabHead.setSubject4day(subject4testday);
        dipIntBranTestTimeTabHead.setLoginuser(loginuser);

        diplomaInternalBranchTestTimetableHeaderRepository.save(dipIntBranTestTimeTabHead);
    }


}
