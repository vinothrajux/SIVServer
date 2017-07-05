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
            @RequestParam(value = "subject1Colno", required = false) Integer subject1Colno,
            @RequestParam(value = "subject1Codeno", required = false) String subject1Codeno,
            @RequestParam(value = "subject1TestDate", required = false) Date subject1TestDate,
            @RequestParam(value = "subject1TestDay", required = false) String subject1TestDay,
            @RequestParam(value = "subject2Colno", required = false) Integer subject2Colno,
            @RequestParam(value = "subject2Codeno", required = false) String subject2Codeno,
            @RequestParam(value = "subject2TestDate", required = false) Date subject2TestDate,
            @RequestParam(value = "subject2TestDay", required = false) String subject2TestDay,
            @RequestParam(value = "subject3Colno", required = false) Integer subject3Colno,
            @RequestParam(value = "subject3Codeno", required = false) String subject3Codeno,
            @RequestParam(value = "subject3TestDate", required = false) Date subject3TestDate,
            @RequestParam(value = "subject3TestDay", required = false) String subject3TestDay,
            @RequestParam(value = "subject4Colno", required = false) Integer subject4Colno,
            @RequestParam(value = "subject4Codeno", required = false) String subject4Codeno,
            @RequestParam(value = "subject4TestDate", required = false) Date subject4TestDate,
            @RequestParam(value = "subject4TestDay", required = false) String subject4TestDay,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaInternalBranchTestTimetableHeader dipIntBranTestTimeTabHead = new DiplomaInternalBranchTestTimetableHeader();
        dipIntBranTestTimeTabHead.setTestId(testid);
        dipIntBranTestTimeTabHead.setEntryDate(entrydate);
        dipIntBranTestTimeTabHead.setBranchCode(branchcode);
        dipIntBranTestTimeTabHead.setBatch(batch);
        dipIntBranTestTimeTabHead.setSemester(semester);
        dipIntBranTestTimeTabHead.setAcademicYear(academicyear);
        dipIntBranTestTimeTabHead.setTestType(testtype);
        dipIntBranTestTimeTabHead.setMaximumMarks(maxmarks);
        dipIntBranTestTimeTabHead.setSubject1ColumnNo(subject1Colno);
        dipIntBranTestTimeTabHead.setSubject1CodeNo(subject1Codeno);
        dipIntBranTestTimeTabHead.setSubject1Date(subject1TestDate);
        dipIntBranTestTimeTabHead.setSubject1Day(subject1TestDay);
        dipIntBranTestTimeTabHead.setSubject2ColumnNo(subject2Colno);
        dipIntBranTestTimeTabHead.setSubject2CodeNo(subject2Codeno);
        dipIntBranTestTimeTabHead.setSubject2Date(subject2TestDate);
        dipIntBranTestTimeTabHead.setSubject2Day(subject2TestDay);
        dipIntBranTestTimeTabHead.setSubject3ColumnNo(subject3Colno);
        dipIntBranTestTimeTabHead.setSubject3CodeNo(subject3Codeno);
        dipIntBranTestTimeTabHead.setSubject3Date(subject3TestDate);
        dipIntBranTestTimeTabHead.setSubject3Day(subject3TestDay);
        dipIntBranTestTimeTabHead.setSubject4ColumnNo(subject4Colno);
        dipIntBranTestTimeTabHead.setSubject4CodeNo(subject4Codeno);
        dipIntBranTestTimeTabHead.setSubject4Date(subject4TestDate);
        dipIntBranTestTimeTabHead.setSubject4Day(subject4TestDay);
        dipIntBranTestTimeTabHead.setLoginUser(loginuser);

        diplomaInternalBranchTestTimetableHeaderRepository.save(dipIntBranTestTimeTabHead);
    }


}
