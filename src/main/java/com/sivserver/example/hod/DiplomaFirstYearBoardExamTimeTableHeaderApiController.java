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
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaFirstYearBoardExamTimeTableHeader dipFirstYearBoardExamTimeTabHead = new DiplomaFirstYearBoardExamTimeTableHeader();
        dipFirstYearBoardExamTimeTabHead.setExamId(examid);
        dipFirstYearBoardExamTimeTabHead.setEntryDate(entrydate);
        dipFirstYearBoardExamTimeTabHead.setBranchCode(branchcode);
        dipFirstYearBoardExamTimeTabHead.setBatch(batch);
        dipFirstYearBoardExamTimeTabHead.setSemester(semester);
        dipFirstYearBoardExamTimeTabHead.setAcademicYear(academicyear);
        dipFirstYearBoardExamTimeTabHead.setMonthofExam(monthofexam);
        dipFirstYearBoardExamTimeTabHead.setYearofExam(yearofexam);
        dipFirstYearBoardExamTimeTabHead.setMaximumMarks(maxmarks);
        dipFirstYearBoardExamTimeTabHead.setSubject1ColumnNo(subject1Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject1CodeNo(subject1Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject1Date(subject1TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject1Day(subject1TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject2ColumnNo(subject2Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject2CodeNo(subject2Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject2Date(subject2TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject2Day(subject2TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject3ColumnNo(subject3Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject3CodeNo(subject3Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject3Date(subject3TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject3Day(subject3TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject4ColumnNo(subject4Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject4CodeNo(subject4Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject4Date(subject4TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject4Day(subject4TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject5ColumnNo(subject5Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject5CodeNo(subject5Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject5Date(subject5TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject5Day(subject5TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject6ColumnNo(subject6Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject6CodeNo(subject6Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject6Date(subject6TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject6Day(subject6TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject7ColumnNo(subject7Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject7CodeNo(subject7Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject7Date(subject7TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject7Day(subject7TestDay);
        dipFirstYearBoardExamTimeTabHead.setSubject8ColumnNo(subject8Colno);
        dipFirstYearBoardExamTimeTabHead.setSubject8CodeNo(subject8Codeno);
        dipFirstYearBoardExamTimeTabHead.setSubject8Date(subject8TestDate);
        dipFirstYearBoardExamTimeTabHead.setSubject8Day(subject8TestDay);
        dipFirstYearBoardExamTimeTabHead.setLoginUser(loginuser);

        diplomaFirstYearBoardExamTimeTableHeaderRepository.save(dipFirstYearBoardExamTimeTabHead);

    }

}
