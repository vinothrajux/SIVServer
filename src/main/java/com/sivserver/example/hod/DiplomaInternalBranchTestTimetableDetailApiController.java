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
            @RequestParam(value = "subject1Mark", required = false) Integer subject1Mark,
            @RequestParam(value = "subject1Attendance", required = false) Character subject1Attendance,
            @RequestParam(value = "subject1Result", required = false) String subject1Result,
            @RequestParam(value = "subject2Mark", required = false) Integer subject2Mark,
            @RequestParam(value = "subject2Attendance", required = false) Character subject2Attendance,
            @RequestParam(value = "subject2Result", required = false) String subject2Result,
            @RequestParam(value = "subject3Mark", required = false) Integer subject3Mark,
            @RequestParam(value = "subject3Attendance", required = false) Character subject3Attendance,
            @RequestParam(value = "subject3Result", required = false) String subject3Result,
            @RequestParam(value = "subject4Mark", required = false) Integer subject4Mark,
            @RequestParam(value = "subject4Attendance", required = false) Character subject4Attendance,
            @RequestParam(value = "subject4Result", required = false) String subject4Result,
            @RequestParam(value = "OverallResult", required = false) String OverallResult,
            @RequestParam(value = "rank", required = false) Integer rank

                ) {
        DiplomaInternalBranchTestTimetableDetail dipIntBranTestTimeTabDet = new DiplomaInternalBranchTestTimetableDetail();
        dipIntBranTestTimeTabDet.setTestId(testid);
        dipIntBranTestTimeTabDet.setRegno(regno);
        dipIntBranTestTimeTabDet.setAdmissionNo(admissionno);
        dipIntBranTestTimeTabDet.setgetSubject1Mark(subject1Mark);
        dipIntBranTestTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipIntBranTestTimeTabDet.setSubject1Result(subject1Result);
        dipIntBranTestTimeTabDet.setgetSubject2Mark(subject2Mark);
        dipIntBranTestTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipIntBranTestTimeTabDet.setSubject2Result(subject2Result);
        dipIntBranTestTimeTabDet.setgetSubject3Mark(subject3Mark);
        dipIntBranTestTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipIntBranTestTimeTabDet.setSubject3Result(subject3Result);
        dipIntBranTestTimeTabDet.setgetSubject4Mark(subject4Mark);
        dipIntBranTestTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipIntBranTestTimeTabDet.setSubject4Result(subject4Result);
        dipIntBranTestTimeTabDet.setOverallResult(OverallResult);
        dipIntBranTestTimeTabDet.setRank(rank);

        diplomaInternalBranchTestTimetableDetailRepository.save(dipIntBranTestTimeTabDet);
    }

}
