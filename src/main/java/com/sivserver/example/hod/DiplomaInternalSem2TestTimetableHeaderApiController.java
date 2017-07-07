package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 04/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomainternalsem2testtimetableheader")

public class DiplomaInternalSem2TestTimetableHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaInternalSem2TestTimetableHeaderRepository diplomaInternalSem2TestTimetableHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestSem2TtHeader(
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
            @RequestParam(value = "subject5Colno", required = false) Integer subject5Colno,
            @RequestParam(value = "subject5Codeno", required = false) String subject5Codeno,
            @RequestParam(value = "subject5TestDate", required = false) Date subject5TestDate,
            @RequestParam(value = "subject5TestDay", required = false) String subject5TestDay,
            @RequestParam(value = "subject6Colno", required = false) Integer subject6Colno,
            @RequestParam(value = "subject6Codeno", required = false) String subject6Codeno,
            @RequestParam(value = "subject6TestDate", required = false) Date subject6TestDate,
            @RequestParam(value = "subject6TestDay", required = false) String subject6TestDay,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaInternalSem2TestTimetableHeader dipIntSem2TestTimeTabHead = new DiplomaInternalSem2TestTimetableHeader();
        dipIntSem2TestTimeTabHead.setTestId(testid);
        dipIntSem2TestTimeTabHead.setEntryDate(entrydate);
        dipIntSem2TestTimeTabHead.setBranchCode(branchcode);
        dipIntSem2TestTimeTabHead.setBatch(batch);
        dipIntSem2TestTimeTabHead.setSemester(semester);
        dipIntSem2TestTimeTabHead.setAcademicYear(academicyear);
        dipIntSem2TestTimeTabHead.setTestType(testtype);
        dipIntSem2TestTimeTabHead.setMaximumMarks(maxmarks);
        dipIntSem2TestTimeTabHead.setSubject1ColumnNo(subject1Colno);
        dipIntSem2TestTimeTabHead.setSubject1CodeNo(subject1Codeno);
        dipIntSem2TestTimeTabHead.setSubject1Date(subject1TestDate);
        dipIntSem2TestTimeTabHead.setSubject1Day(subject1TestDay);
        dipIntSem2TestTimeTabHead.setSubject2ColumnNo(subject2Colno);
        dipIntSem2TestTimeTabHead.setSubject2CodeNo(subject2Codeno);
        dipIntSem2TestTimeTabHead.setSubject2Date(subject2TestDate);
        dipIntSem2TestTimeTabHead.setSubject2Day(subject2TestDay);
        dipIntSem2TestTimeTabHead.setSubject3ColumnNo(subject3Colno);
        dipIntSem2TestTimeTabHead.setSubject3CodeNo(subject3Codeno);
        dipIntSem2TestTimeTabHead.setSubject3Date(subject3TestDate);
        dipIntSem2TestTimeTabHead.setSubject3Day(subject3TestDay);
        dipIntSem2TestTimeTabHead.setSubject4ColumnNo(subject4Colno);
        dipIntSem2TestTimeTabHead.setSubject4CodeNo(subject4Codeno);
        dipIntSem2TestTimeTabHead.setSubject4Date(subject4TestDate);
        dipIntSem2TestTimeTabHead.setSubject4Day(subject4TestDay);
        dipIntSem2TestTimeTabHead.setSubject5ColumnNo(subject5Colno);
        dipIntSem2TestTimeTabHead.setSubject5CodeNo(subject5Codeno);
        dipIntSem2TestTimeTabHead.setSubject5Date(subject5TestDate);
        dipIntSem2TestTimeTabHead.setSubject5Day(subject5TestDay);
        dipIntSem2TestTimeTabHead.setSubject6ColumnNo(subject6Colno);
        dipIntSem2TestTimeTabHead.setSubject6CodeNo(subject6Codeno);
        dipIntSem2TestTimeTabHead.setSubject6Date(subject6TestDate);
        dipIntSem2TestTimeTabHead.setSubject6Day(subject6TestDay);
        dipIntSem2TestTimeTabHead.setLoginUser(loginuser);

        diplomaInternalSem2TestTimetableHeaderRepository.save(dipIntSem2TestTimeTabHead);

    }

}
