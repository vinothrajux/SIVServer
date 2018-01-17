package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 04/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/diplomainternalsem1testtimetableheader")

public class DiplomaInternalSem1TestTimetableHeaderApiController {
    @Autowired
    private DiplomaInternalSem1TestTimetableHeaderRepository diplomaInternalSem1TestTimetableHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaInternalTestSem1TtHeader(
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) String semester,
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
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaInternalSem1TestTimetableHeader dipIntSem1TestTimeTabHead = new DiplomaInternalSem1TestTimetableHeader();
        Diploma_Hod_Compound_Key_Internal_Test key = new Diploma_Hod_Compound_Key_Internal_Test(branchcode,batch,semester,academicyear,testtype);
        dipIntSem1TestTimeTabHead.setDiploma_hod_compound_key_internal_test(key);
        dipIntSem1TestTimeTabHead.setEntrydate(entrydate);
        dipIntSem1TestTimeTabHead.setMaxmarks(maxmarks);
        dipIntSem1TestTimeTabHead.setSubject1Colno(subject1Colno);
        dipIntSem1TestTimeTabHead.setSubject1Codeno(subject1Codeno);
        dipIntSem1TestTimeTabHead.setSubject1TestDate(subject1TestDate);
        dipIntSem1TestTimeTabHead.setSubject1TestDay(subject1TestDay);
        dipIntSem1TestTimeTabHead.setSubject2Colno(subject2Colno);
        dipIntSem1TestTimeTabHead.setSubject2Codeno(subject2Codeno);
        dipIntSem1TestTimeTabHead.setSubject2TestDate(subject2TestDate);
        dipIntSem1TestTimeTabHead.setSubject2TestDay(subject2TestDay);
        dipIntSem1TestTimeTabHead.setSubject3Colno(subject3Colno);
        dipIntSem1TestTimeTabHead.setSubject3Codeno(subject3Codeno);
        dipIntSem1TestTimeTabHead.setSubject3TestDate(subject3TestDate);
        dipIntSem1TestTimeTabHead.setSubject3TestDay(subject3TestDay);
        dipIntSem1TestTimeTabHead.setSubject4Colno(subject4Colno);
        dipIntSem1TestTimeTabHead.setSubject4Codeno(subject4Codeno);
        dipIntSem1TestTimeTabHead.setSubject4TestDate(subject4TestDate);
        dipIntSem1TestTimeTabHead.setSubject4TestDay(subject4TestDay);
        dipIntSem1TestTimeTabHead.setSubject5Colno(subject5Colno);
        dipIntSem1TestTimeTabHead.setSubject5Codeno(subject5Codeno);
        dipIntSem1TestTimeTabHead.setSubject5TestDate(subject5TestDate);
        dipIntSem1TestTimeTabHead.setSubject5TestDay(subject5TestDay);
        dipIntSem1TestTimeTabHead.setLoginuser(loginuser);

        diplomaInternalSem1TestTimetableHeaderRepository.save(dipIntSem1TestTimeTabHead);

    }
}