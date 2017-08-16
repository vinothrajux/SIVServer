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
@RequestMapping("/api/v1/diplomabranchboardexamtimetableheader")

public class DiplomaBranchBoardExamTimeTableHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaBranchBoardExamTimeTableHeaderRepository diplomaBranchBoardExamTimeTableHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaBranchBoardExamTtHeader(
            @RequestParam(value = "examid", required = false) String examid,
            @RequestParam(value = "entrydate", required = false) Date entrydate,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "monthofexam", required = false) String monthofexam,
            @RequestParam(value = "yearofexam", required = false) String yearofexam,
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
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaBranchBoardExamTimeTableHeader dipBranBoardExamTimeTabHead = new DiplomaBranchBoardExamTimeTableHeader();
        dipBranBoardExamTimeTabHead.setExamid(examid);
        dipBranBoardExamTimeTabHead.setEntrydate(entrydate);
        dipBranBoardExamTimeTabHead.setBranchcode(branchcode);
        dipBranBoardExamTimeTabHead.setBatch(batch);
        dipBranBoardExamTimeTabHead.setSemester(semester);
        dipBranBoardExamTimeTabHead.setAcademicyear(academicyear);
        dipBranBoardExamTimeTabHead.setMonthofexam(monthofexam);
        dipBranBoardExamTimeTabHead.setYearofexam(yearofexam);
        dipBranBoardExamTimeTabHead.setMaximummarks(maxmarks);
        dipBranBoardExamTimeTabHead.setSubject1columnno(subject1Colno);
        dipBranBoardExamTimeTabHead.setSubject1codeno(subject1Codeno);
        dipBranBoardExamTimeTabHead.setSubject1date(subject1TestDate);
        dipBranBoardExamTimeTabHead.setSubject1day(subject1TestDay);
        dipBranBoardExamTimeTabHead.setSubject2columnno(subject2Colno);
        dipBranBoardExamTimeTabHead.setSubject2codeno(subject2Codeno);
        dipBranBoardExamTimeTabHead.setSubject2date(subject2TestDate);
        dipBranBoardExamTimeTabHead.setSubject2day(subject2TestDay);
        dipBranBoardExamTimeTabHead.setSubject3columnno(subject3Colno);
        dipBranBoardExamTimeTabHead.setSubject3codeno(subject3Codeno);
        dipBranBoardExamTimeTabHead.setSubject3date(subject3TestDate);
        dipBranBoardExamTimeTabHead.setSubject3day(subject3TestDay);
        dipBranBoardExamTimeTabHead.setSubject4columnno(subject4Colno);
        dipBranBoardExamTimeTabHead.setSubject4codeno(subject4Codeno);
        dipBranBoardExamTimeTabHead.setSubject4date(subject4TestDate);
        dipBranBoardExamTimeTabHead.setSubject4day(subject4TestDay);
        dipBranBoardExamTimeTabHead.setSubject5columnno(subject5Colno);
        dipBranBoardExamTimeTabHead.setSubject5codeno(subject5Codeno);
        dipBranBoardExamTimeTabHead.setSubject5date(subject5TestDate);
        dipBranBoardExamTimeTabHead.setSubject5day(subject5TestDay);
        dipBranBoardExamTimeTabHead.setSubject6columnno(subject6Colno);
        dipBranBoardExamTimeTabHead.setSubject6codeno(subject6Codeno);
        dipBranBoardExamTimeTabHead.setSubject6date(subject6TestDate);
        dipBranBoardExamTimeTabHead.setSubject6day(subject6TestDay);
        dipBranBoardExamTimeTabHead.setSubject7columnno(subject7Colno);
        dipBranBoardExamTimeTabHead.setSubject7codeno(subject7Codeno);
        dipBranBoardExamTimeTabHead.setSubject7date(subject7TestDate);
        dipBranBoardExamTimeTabHead.setSubject7day(subject7TestDay);
        dipBranBoardExamTimeTabHead.setLoginuser(loginuser);

        diplomaBranchBoardExamTimeTableHeaderRepository.save(dipBranBoardExamTimeTabHead);

    }

}
