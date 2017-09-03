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
            @RequestParam(value = "examid", required = false) String examid,
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "monthofexam", required = false) String monthofexam,
            @RequestParam(value = "yearofexam", required = false) String yearofexam,
            @RequestParam(value = "maxmarks", required = false) Integer maxmarks,
            @RequestParam(value = "subject1Colno", required = false) Integer subject1colno,
            @RequestParam(value = "subject1Codeno", required = false) String subject1codeno,
            @RequestParam(value = "subject1TestDate", required = false) Date subject1testdate,
            @RequestParam(value = "subject1TestDay", required = false) String subject1testday,
            @RequestParam(value = "subject2Colno", required = false) Integer subject2colno,
            @RequestParam(value = "subject2Codeno", required = false) String subject2codeno,
            @RequestParam(value = "subject2TestDate", required = false) Date subject2testdate,
            @RequestParam(value = "subject2TestDay", required = false) String subject2testday,
            @RequestParam(value = "subject3Colno", required = false) Integer subject3colno,
            @RequestParam(value = "subject3Codeno", required = false) String subject3codeno,
            @RequestParam(value = "subject3TestDate", required = false) Date subject3testdate,
            @RequestParam(value = "subject3TestDay", required = false) String subject3testday,
            @RequestParam(value = "subject4Colno", required = false) Integer subject4colno,
            @RequestParam(value = "subject4Codeno", required = false) String subject4codeno,
            @RequestParam(value = "subject4TestDate", required = false) Date subject4testdate,
            @RequestParam(value = "subject4TestDay", required = false) String subject4testday,
            @RequestParam(value = "subject5Colno", required = false) Integer subject5colno,
            @RequestParam(value = "subject5Codeno", required = false) String subject5codeno,
            @RequestParam(value = "subject5TestDate", required = false) Date subject5testdate,
            @RequestParam(value = "subject5TestDay", required = false) String subject5testday,
            @RequestParam(value = "subject6Colno", required = false) Integer subject6colno,
            @RequestParam(value = "subject6Codeno", required = false) String subject6codeno,
            @RequestParam(value = "subject6TestDate", required = false) Date subject6testdate,
            @RequestParam(value = "subject6TestDay", required = false) String subject6testday,
            @RequestParam(value = "subject7Colno", required = false) Integer subject7colno,
            @RequestParam(value = "subject7Codeno", required = false) String subject7codeno,
            @RequestParam(value = "subject7TestDate", required = false) Date subject7testdate,
            @RequestParam(value = "subject7TestDay", required = false) String subject7testday,
            @RequestParam(value = "subject8Colno", required = false) Integer subject8colno,
            @RequestParam(value = "subject8Codeno", required = false) String subject8codeno,
            @RequestParam(value = "subject8TestDate", required = false) Date subject8testdate,
            @RequestParam(value = "subject8TestDay", required = false) String subject8testday,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaFirstYearBoardExamTimeTableHeader dipFirstYearBoardExamTimeTabHead = new DiplomaFirstYearBoardExamTimeTableHeader();
        dipFirstYearBoardExamTimeTabHead.setExamid(examid);
        dipFirstYearBoardExamTimeTabHead.setEntrydate(entrydate);
        dipFirstYearBoardExamTimeTabHead.setBranchcode(branchcode);
        dipFirstYearBoardExamTimeTabHead.setBatch(batch);
        dipFirstYearBoardExamTimeTabHead.setSemester(semester);
        dipFirstYearBoardExamTimeTabHead.setAcademicyear(academicyear);
        dipFirstYearBoardExamTimeTabHead.setMonthofexam(monthofexam);
        dipFirstYearBoardExamTimeTabHead.setYearofexam(yearofexam);
        dipFirstYearBoardExamTimeTabHead.setMaximummarks(maxmarks);
        dipFirstYearBoardExamTimeTabHead.setSubject1columnno(subject1colno);
        dipFirstYearBoardExamTimeTabHead.setSubject1codeno(subject1codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject1date(subject1testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject1day(subject1testday);
        dipFirstYearBoardExamTimeTabHead.setSubject2columnno(subject2colno);
        dipFirstYearBoardExamTimeTabHead.setSubject2codeno(subject2codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject2date(subject2testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject2day(subject2testday);
        dipFirstYearBoardExamTimeTabHead.setSubject3columnno(subject3colno);
        dipFirstYearBoardExamTimeTabHead.setSubject3codeno(subject3codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject3date(subject3testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject3day(subject3testday);
        dipFirstYearBoardExamTimeTabHead.setSubject4columnno(subject4colno);
        dipFirstYearBoardExamTimeTabHead.setSubject4codeno(subject4codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject4date(subject4testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject4day(subject4testday);
        dipFirstYearBoardExamTimeTabHead.setSubject5columnno(subject5colno);
        dipFirstYearBoardExamTimeTabHead.setSubject5codeno(subject5codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject5date(subject5testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject5day(subject5testday);
        dipFirstYearBoardExamTimeTabHead.setSubject6columnno(subject6colno);
        dipFirstYearBoardExamTimeTabHead.setSubject6codeno(subject6codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject6date(subject6testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject6day(subject6testday);
        dipFirstYearBoardExamTimeTabHead.setSubject7columnno(subject7colno);
        dipFirstYearBoardExamTimeTabHead.setSubject7codeno(subject7codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject7date(subject7testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject7day(subject7testday);
        dipFirstYearBoardExamTimeTabHead.setSubject8columnno(subject8colno);
        dipFirstYearBoardExamTimeTabHead.setSubject8codeno(subject8codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject8date(subject8testdate);
        dipFirstYearBoardExamTimeTabHead.setSubject8day(subject8testday);
        dipFirstYearBoardExamTimeTabHead.setLoginuser(loginuser);

        diplomaFirstYearBoardExamTimeTableHeaderRepository.save(dipFirstYearBoardExamTimeTabHead);

    }

}
