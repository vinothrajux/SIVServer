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
@RequestMapping("/api/v1/diplomainternalbranchtesttimetabledetail")

public class DiplomaInternalBranchTestTimetableDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaInternalBranchTestTimetableDetailRepository diplomaInternalBranchTestTimetableDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestTtDetail(
            @RequestParam(value = "testid", required = false) String testid,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "subject1Mark", required = false) Integer subject1mark,
            @RequestParam(value = "subject1Attendance", required = false) Character subject1attendance,
            @RequestParam(value = "subject1Result", required = false) String subject1result,
            @RequestParam(value = "subject2Mark", required = false) Integer subject2mark,
            @RequestParam(value = "subject2Attendance", required = false) Character subject2attendance,
            @RequestParam(value = "subject2Result", required = false) String subject2result,
            @RequestParam(value = "subject3Mark", required = false) Integer subject3mark,
            @RequestParam(value = "subject3Attendance", required = false) Character subject3attendance,
            @RequestParam(value = "subject3Result", required = false) String subject3result,
            @RequestParam(value = "subject4Mark", required = false) Integer subject4mark,
            @RequestParam(value = "subject4Attendance", required = false) Character subject4attendance,
            @RequestParam(value = "subject4Result", required = false) String subject4result,
            @RequestParam(value = "OverallResult", required = false) String Overallresult,
            @RequestParam(value = "rank", required = false) Integer rank

                ) {
        DiplomaInternalBranchTestTimetableDetail dipIntBranTestTimeTabDet = new DiplomaInternalBranchTestTimetableDetail();
        dipIntBranTestTimeTabDet.setTestid(testid);
        dipIntBranTestTimeTabDet.setRegno(regno);
        dipIntBranTestTimeTabDet.setAdmissionno(admissionno);
        dipIntBranTestTimeTabDet.setgetSubject1mark(subject1mark);
        dipIntBranTestTimeTabDet.setSubject1attendance(subject1attendance);
        dipIntBranTestTimeTabDet.setSubject1result(subject1result);
        dipIntBranTestTimeTabDet.setgetSubject2mark(subject2mark);
        dipIntBranTestTimeTabDet.setSubject2attendance(subject2attendance);
        dipIntBranTestTimeTabDet.setSubject2result(subject2result);
        dipIntBranTestTimeTabDet.setgetSubject3mark(subject3mark);
        dipIntBranTestTimeTabDet.setSubject3attendance(subject3attendance);
        dipIntBranTestTimeTabDet.setSubject3result(subject3result);
        dipIntBranTestTimeTabDet.setgetSubject4mark(subject4mark);
        dipIntBranTestTimeTabDet.setSubject4attendance(subject4attendance);
        dipIntBranTestTimeTabDet.setSubject4result(subject4result);
        dipIntBranTestTimeTabDet.setOverallresult(Overallresult);
        dipIntBranTestTimeTabDet.setRank(rank);

        diplomaInternalBranchTestTimetableDetailRepository.save(dipIntBranTestTimeTabDet);
    }

}
