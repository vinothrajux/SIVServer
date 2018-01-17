package com.sivserver.example.hod;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 03/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/diplomainternalbranchtesttimetabledetail")

public class DiplomaInternalBranchTestTimetableDetailApiController  {
    //@Autowired
    private DiplomaInternalBranchTestTimetableDetailRepository diplomaInternalBranchTestTimetableDetailRepository;

    @GetMapping(value="/all")

    public List<DiplomaInternalBranchTestTimetableDetail> getDiplomaInternalBranchTestTimetableDetail() {return diplomaInternalBranchTestTimetableDetailRepository.findAll();}

    public DiplomaInternalBranchTestTimetableDetailApiController(DiplomaInternalBranchTestTimetableDetailRepository diplomaInternalBranchTestTimetableDetailRepository)
    {
        this.diplomaInternalBranchTestTimetableDetailRepository = diplomaInternalBranchTestTimetableDetailRepository;

    }
    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestTtDetail(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "testtype", required = false) String testtype,
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
        StudentBaseInformation diplomaInternalBranchTestTimetableDetail_regno = new StudentBaseInformation(regno);
        Diploma_Hod_Compound_Key_Internal_Test key = new Diploma_Hod_Compound_Key_Internal_Test(branchcode, batch, semester, academicyear, testtype);
        dipIntBranTestTimeTabDet.setId(id);
        dipIntBranTestTimeTabDet.setRegno(regno);
        dipIntBranTestTimeTabDet.setAdmissionno(admissionno);
        dipIntBranTestTimeTabDet.setFetch_details(key);
        dipIntBranTestTimeTabDet.setSubject1Mark(subject1Mark);
        dipIntBranTestTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipIntBranTestTimeTabDet.setSubject1Result(subject1Result);
        dipIntBranTestTimeTabDet.setSubject2Mark(subject2Mark);
        dipIntBranTestTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipIntBranTestTimeTabDet.setSubject2Result(subject2Result);
        dipIntBranTestTimeTabDet.setSubject3Mark(subject3Mark);
        dipIntBranTestTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipIntBranTestTimeTabDet.setSubject3Result(subject3Result);
        dipIntBranTestTimeTabDet.setSubject4Mark(subject4Mark);
        dipIntBranTestTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipIntBranTestTimeTabDet.setSubject4Result(subject4Result);
        dipIntBranTestTimeTabDet.setOverallResult(OverallResult);
        dipIntBranTestTimeTabDet.setRank(rank);

        diplomaInternalBranchTestTimetableDetailRepository.save(dipIntBranTestTimeTabDet);
    }

}
