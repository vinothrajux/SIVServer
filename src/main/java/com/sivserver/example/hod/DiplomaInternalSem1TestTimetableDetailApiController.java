package com.sivserver.example.hod;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 04/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/diplomainternalsem1testtimetabledetail")

public class DiplomaInternalSem1TestTimetableDetailApiController extends WebMvcConfigurerAdapter {
   // @Autowired
    private DiplomaInternalSem1TestTimetableDetailRepository diplomaInternalSem1TestTimetableDetailRepository;

    @GetMapping(value="/all")
    public List<DiplomaInternalSem1TestTimetableDetail> getDiplomaInternalSem1TestTimetableDetail() {return diplomaInternalSem1TestTimetableDetailRepository.findAll();}

    public DiplomaInternalSem1TestTimetableDetailApiController(DiplomaInternalSem1TestTimetableDetailRepository diplomaInternalSem1TestTimetableDetailRepository)
    {
        this.diplomaInternalSem1TestTimetableDetailRepository = diplomaInternalSem1TestTimetableDetailRepository;
    }
    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestTtDetail(
            @RequestParam(value = "testid", required = false) Integer testid,
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
            @RequestParam(value = "OverallResult", required = false) String OverallResult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaInternalSem1TestTimetableDetail dipIntSem1TestTimeTabDet = new DiplomaInternalSem1TestTimetableDetail();
        StudentBaseInformation diplomaInternalBranchTestTimetableDetail_regno = new StudentBaseInformation(regno);
        Diploma_Hod_Compound_Key_Internal_Test key = new Diploma_Hod_Compound_Key_Internal_Test(branchcode, batch, semester, academicyear, testtype);
        dipIntSem1TestTimeTabDet.setTestid(testid);
        dipIntSem1TestTimeTabDet.setRegno(regno);
        dipIntSem1TestTimeTabDet.setAdmissionno(admissionno);
        dipIntSem1TestTimeTabDet.setFetch_details(key);
        dipIntSem1TestTimeTabDet.setSubject1Mark(subject1Mark);
        dipIntSem1TestTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipIntSem1TestTimeTabDet.setSubject1Result(subject1Result);
        dipIntSem1TestTimeTabDet.setSubject2Mark(subject2Mark);
        dipIntSem1TestTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipIntSem1TestTimeTabDet.setSubject2Result(subject2Result);
        dipIntSem1TestTimeTabDet.setSubject3Mark(subject3Mark);
        dipIntSem1TestTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipIntSem1TestTimeTabDet.setSubject3Result(subject3Result);
        dipIntSem1TestTimeTabDet.setSubject4Mark(subject4Mark);
        dipIntSem1TestTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipIntSem1TestTimeTabDet.setSubject4Result(subject4Result);
        dipIntSem1TestTimeTabDet.setSubject5Mark(subject5Mark);
        dipIntSem1TestTimeTabDet.setSubject5Attendance(subject5Attendance);
        dipIntSem1TestTimeTabDet.setSubject5Result(subject5Result);
        dipIntSem1TestTimeTabDet.setOverallResult(OverallResult);
        dipIntSem1TestTimeTabDet.setRank(rank);

        diplomaInternalSem1TestTimetableDetailRepository.save(dipIntSem1TestTimeTabDet);
    }

}
