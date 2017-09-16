package com.sivserver.example.hod;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 04/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomainternalsem2testtimetabledetail")

public class DiplomaInternalSem2TestTimetableDetailApiController  {
    //@Autowired
    private DiplomaInternalSem2TestTimetableDetailRepository diplomaInternalSem2TestTimetableDetailRepository;

    @GetMapping(value="/all")
    public List<DiplomaInternalSem2TestTimetableDetail> getDiplomaInternalSem2TestTimetableDetail() {return diplomaInternalSem2TestTimetableDetailRepository.findAll();}

    public DiplomaInternalSem2TestTimetableDetailApiController(DiplomaInternalSem2TestTimetableDetailRepository diplomaInternalSem2TestTimetableDetailRepository)
    {
        this.diplomaInternalSem2TestTimetableDetailRepository = diplomaInternalSem2TestTimetableDetailRepository;
    }
    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestSem2TtDetail(
            @RequestParam(value = "testid", required = false) String testid,
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
            @RequestParam(value = "subject5Mark", required = false) Integer subject5Mark,
            @RequestParam(value = "subject5Attendance", required = false) Character subject5Attendance,
            @RequestParam(value = "subject5Result", required = false) String subject5Result,
            @RequestParam(value = "subject6Mark", required = false) Integer subject6Mark,
            @RequestParam(value = "subject6Attendance", required = false) Character subject6Attendance,
            @RequestParam(value = "subject6Result", required = false) String subject6Result,
            @RequestParam(value = "OverallResult", required = false) String OverallResult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaInternalSem2TestTimetableDetail dipIntSem2TestTimeTabDet = new DiplomaInternalSem2TestTimetableDetail();
        StudentBaseInformation diplomaInternalBranchTestTimetableDetail_regno = new StudentBaseInformation(regno);
        Diploma_Hod_Compound_Key_Internal_Test key = new Diploma_Hod_Compound_Key_Internal_Test(branchcode, batch, semester, academicyear, testtype);

        dipIntSem2TestTimeTabDet.setTestid(testid);
        dipIntSem2TestTimeTabDet.setRegno(regno);
        dipIntSem2TestTimeTabDet.setFetch_details(key);
        dipIntSem2TestTimeTabDet.setAdmissionno(admissionno);
        dipIntSem2TestTimeTabDet.setSubject1Mark(subject1Mark);
        dipIntSem2TestTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipIntSem2TestTimeTabDet.setSubject1Result(subject1Result);
        dipIntSem2TestTimeTabDet.setSubject2Mark(subject2Mark);
        dipIntSem2TestTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipIntSem2TestTimeTabDet.setSubject2Result(subject2Result);
        dipIntSem2TestTimeTabDet.setSubject3Mark(subject3Mark);
        dipIntSem2TestTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipIntSem2TestTimeTabDet.setSubject3Result(subject3Result);
        dipIntSem2TestTimeTabDet.setSubject4Mark(subject4Mark);
        dipIntSem2TestTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipIntSem2TestTimeTabDet.setSubject4Result(subject4Result);
        dipIntSem2TestTimeTabDet.setSubject5Mark(subject5Mark);
        dipIntSem2TestTimeTabDet.setSubject5Attendance(subject5Attendance);
        dipIntSem2TestTimeTabDet.setSubject5Result(subject5Result);
        dipIntSem2TestTimeTabDet.setSubject6Mark(subject6Mark);
        dipIntSem2TestTimeTabDet.setSubject6Attendance(subject6Attendance);
        dipIntSem2TestTimeTabDet.setSubject6Result(subject6Result);
        dipIntSem2TestTimeTabDet.setOverallResult(OverallResult);
        dipIntSem2TestTimeTabDet.setRank(rank);

        diplomaInternalSem2TestTimetableDetailRepository.save(dipIntSem2TestTimeTabDet);
    }

}
