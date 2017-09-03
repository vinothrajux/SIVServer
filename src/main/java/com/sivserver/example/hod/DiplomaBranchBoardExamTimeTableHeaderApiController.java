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
            @RequestParam(value = "subject1Colno", required = false) Integer subject1columnno,
            @RequestParam(value = "subject1Codeno", required = false) String subject1codeno,
            @RequestParam(value = "subject1TestDate", required = false) Date subject1date,
            @RequestParam(value = "subject1TestDay", required = false) String subject1day,
            @RequestParam(value = "subject2Colno", required = false) Integer subject2columnno,
            @RequestParam(value = "subject2Codeno", required = false) String subject2codeno,
            @RequestParam(value = "subject2TestDate", required = false) Date subject2date,
            @RequestParam(value = "subject2TestDay", required = false) String subject2day,
            @RequestParam(value = "subject3Colno", required = false) Integer subject3columnno,
            @RequestParam(value = "subject3Codeno", required = false) String subject3codeno,
            @RequestParam(value = "subject3TestDate", required = false) Date subject3date,
            @RequestParam(value = "subject3TestDay", required = false) String subject3day,
            @RequestParam(value = "subject4Colno", required = false) Integer subject4columnno,
            @RequestParam(value = "subject4Codeno", required = false) String subject4codeno,
            @RequestParam(value = "subject4TestDate", required = false) Date subject4date,
            @RequestParam(value = "subject4TestDay", required = false) String subject4day,
            @RequestParam(value = "subject5Colno", required = false) Integer subject5columnno,
            @RequestParam(value = "subject5Codeno", required = false) String subject5codeno,
            @RequestParam(value = "subject5TestDate", required = false) Date subject5date,
            @RequestParam(value = "subject5TestDay", required = false) String subject5day,
            @RequestParam(value = "subject6Colno", required = false) Integer subject6columnno,
            @RequestParam(value = "subject6Codeno", required = false) String subject6codeno,
            @RequestParam(value = "subject6TestDate", required = false) Date subject6date,
            @RequestParam(value = "subject6TestDay", required = false) String subject6day,
            @RequestParam(value = "subject7Colno", required = false) Integer subject7columnno,
            @RequestParam(value = "subject7Codeno", required = false) String subject7codeno,
            @RequestParam(value = "subject7TestDate", required = false) Date subject7date,
            @RequestParam(value = "subject7TestDay", required = false) String subject7day,
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
        dipBranBoardExamTimeTabHead.setSubject1columnno(subject1columnno);
        dipBranBoardExamTimeTabHead.setSubject1codeno(subject1codeno);
        dipBranBoardExamTimeTabHead.setSubject1date(subject1date);
        dipBranBoardExamTimeTabHead.setSubject1day(subject1day);
        dipBranBoardExamTimeTabHead.setSubject2columnno(subject2columnno);
        dipBranBoardExamTimeTabHead.setSubject2codeno(subject2codeno);
        dipBranBoardExamTimeTabHead.setSubject2date(subject2date);
        dipBranBoardExamTimeTabHead.setSubject2day(subject2day);
        dipBranBoardExamTimeTabHead.setSubject3columnno(subject3columnno);
        dipBranBoardExamTimeTabHead.setSubject3codeno(subject3codeno);
        dipBranBoardExamTimeTabHead.setSubject3date(subject3date);
        dipBranBoardExamTimeTabHead.setSubject3day(subject3day);
        dipBranBoardExamTimeTabHead.setSubject4columnno(subject4columnno);
        dipBranBoardExamTimeTabHead.setSubject4codeno(subject4codeno);
        dipBranBoardExamTimeTabHead.setSubject4date(subject4date);
        dipBranBoardExamTimeTabHead.setSubject4day(subject4day);
        dipBranBoardExamTimeTabHead.setSubject5columnno(subject5columnno);
        dipBranBoardExamTimeTabHead.setSubject5codeno(subject5codeno);
        dipBranBoardExamTimeTabHead.setSubject5date(subject5date);
        dipBranBoardExamTimeTabHead.setSubject5day(subject5day);
        dipBranBoardExamTimeTabHead.setSubject6columnno(subject6columnno);
        dipBranBoardExamTimeTabHead.setSubject6codeno(subject6codeno);
        dipBranBoardExamTimeTabHead.setSubject6date(subject6date);
        dipBranBoardExamTimeTabHead.setSubject6day(subject6day);
        dipBranBoardExamTimeTabHead.setSubject7columnno(subject7columnno);
        dipBranBoardExamTimeTabHead.setSubject7codeno(subject7codeno);
        dipBranBoardExamTimeTabHead.setSubject7date(subject7date);
        dipBranBoardExamTimeTabHead.setSubject7day(subject7day);
        dipBranBoardExamTimeTabHead.setLoginuser(loginuser);

        diplomaBranchBoardExamTimeTableHeaderRepository.save(dipBranBoardExamTimeTabHead);

    }

}
