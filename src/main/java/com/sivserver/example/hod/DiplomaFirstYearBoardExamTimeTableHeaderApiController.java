package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomafirstyearboardexamtimetableheader")

public class DiplomaFirstYearBoardExamTimeTableHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaFirstYearBoardExamTimeTableHeaderRepository diplomaFirstYearBoardExamTimeTableHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaFirstYearBoardExamTtHeader(
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
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
            @RequestParam(value = "subject7Colno", required = false) Integer subject7Colno,
            @RequestParam(value = "subject7Codeno", required = false) String subject7Codeno,
            @RequestParam(value = "subject7TestDate", required = false) Date subject7TestDate,
            @RequestParam(value = "subject7TestDay", required = false) String subject7TestDay,
            @RequestParam(value = "subject8Colno", required = false) Integer subject8Colno,
            @RequestParam(value = "subject8Codeno", required = false) String subject8Codeno,
            @RequestParam(value = "subject8TestDate", required = false) Date subject8TestDate,
            @RequestParam(value = "subject8TestDay", required = false) String subject8TestDay,
            @RequestParam(value = "monthandyearofexam", required = false) String monthandyearofexam,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaFirstYearBoardExamTimeTableHeader dipFirstYearBoardExamTimeTabHead = new DiplomaFirstYearBoardExamTimeTableHeader();
        Hod_Compound_Key key = new Hod_Compound_Key(branchcode,batch,semester,academicyear);
        dipFirstYearBoardExamTimeTabHead.setEntrydate(entrydate);
        dipFirstYearBoardExamTimeTabHead.setMaxmarks(maxmarks);
        dipFirstYearBoardExamTimeTabHead.setSubject1Colno(subject1Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject1Codeno(subject1Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject1TestDate(subject1TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject1TestDay(subject1TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject2Colno(subject2Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject2Codeno(subject2Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject2TestDate(subject2TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject2TestDay(subject2TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject3Colno(subject3Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject3Codeno(subject3Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject3TestDate(subject3TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject3TestDay(subject3TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject4Colno(subject4Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject4Codeno(subject4Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject4TestDate(subject4TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject4TestDay(subject4TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject5Colno(subject5Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject5Codeno(subject5Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject5TestDate(subject5TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject5TestDay(subject5TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject6Colno(subject6Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject6Codeno(subject6Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject6TestDate(subject6TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject6TestDay(subject6TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject7Colno(subject7Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject7Codeno(subject7Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject7TestDate(subject7TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject7TestDay(subject7TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject8Colno(subject8Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject8Codeno(subject8Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject8TestDate(subject8TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject8TestDay(subject8TestDay);
        dipFirstYearBoardExamTimeTabHead.setLoginuser(loginuser);

        diplomaFirstYearBoardExamTimeTableHeaderRepository.save(dipFirstYearBoardExamTimeTabHead);

    }

}
