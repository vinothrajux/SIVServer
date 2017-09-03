package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 04/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomainternalsem1testtimetabledetail")

public class DiplomaInternalSem1TestTimetableDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaInternalSem1TestTimetableDetailRepository diplomaInternalSem1TestTimetableDetailRepository;


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
            @RequestParam(value = "subject5Mark", required = false) Integer subject5mark,
            @RequestParam(value = "subject5Attendance", required = false) Character subject5attendance,
            @RequestParam(value = "subject5Result", required = false) String subject5result,
            @RequestParam(value = "OverallResult", required = false) String Overallresult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaInternalSem1TestTimetableDetail dipIntSem1TestTimeTabDet = new DiplomaInternalSem1TestTimetableDetail();
        dipIntSem1TestTimeTabDet.setTestid(testid);
        dipIntSem1TestTimeTabDet.setRegno(regno);
        dipIntSem1TestTimeTabDet.setAdmissionno(admissionno);
        dipIntSem1TestTimeTabDet.setgetSubject1mark(subject1mark);
        dipIntSem1TestTimeTabDet.setSubject1attendance(subject1attendance);
        dipIntSem1TestTimeTabDet.setSubject1result(subject1result);
        dipIntSem1TestTimeTabDet.setgetSubject2mark(subject2mark);
        dipIntSem1TestTimeTabDet.setSubject2attendance(subject2attendance);
        dipIntSem1TestTimeTabDet.setSubject2result(subject2result);
        dipIntSem1TestTimeTabDet.setgetSubject3mark(subject3mark);
        dipIntSem1TestTimeTabDet.setSubject3attendance(subject3attendance);
        dipIntSem1TestTimeTabDet.setSubject3result(subject3result);
        dipIntSem1TestTimeTabDet.setgetSubject4mark(subject4mark);
        dipIntSem1TestTimeTabDet.setSubject4attendance(subject4attendance);
        dipIntSem1TestTimeTabDet.setSubject4result(subject4result);
        dipIntSem1TestTimeTabDet.setgetSubject5mark(subject5mark);
        dipIntSem1TestTimeTabDet.setSubject5attendance(subject5attendance);
        dipIntSem1TestTimeTabDet.setSubject5result(subject5result);
        dipIntSem1TestTimeTabDet.setOverallresult(Overallresult);
        dipIntSem1TestTimeTabDet.setRank(rank);

        diplomaInternalSem1TestTimetableDetailRepository.save(dipIntSem1TestTimeTabDet);
    }

}
