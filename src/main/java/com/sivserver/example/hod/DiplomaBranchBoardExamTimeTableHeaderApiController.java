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
@RequestMapping("/api/v1/diplomabranchboardexamtimetableheader")

public class DiplomaBranchBoardExamTimeTableHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaBranchBoardExamTimeTableHeaderRepository diplomaBranchBoardExamTimeTableHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaBranchBoardExamTtHeader(
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
            @RequestParam(value = "monthandyearofexam", required = false) String monthandyearofexam,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        DiplomaBranchBoardExamTimeTableHeader dipBranBoardExamTimeTabHead = new DiplomaBranchBoardExamTimeTableHeader();
        Hod_Compound_Key key = new Hod_Compound_Key(branchcode,batch,semester,academicyear);
        dipBranBoardExamTimeTabHead.setDiploma_Board_Exam_Time_Table_Compound_Key(key);
        dipBranBoardExamTimeTabHead.setEntrydate(entrydate);
        dipBranBoardExamTimeTabHead.setMaxmarks(maxmarks);
        dipBranBoardExamTimeTabHead.setSubject1Colno(subject1Colno);
        dipBranBoardExamTimeTabHead.setSubject1Codeno(subject1Codeno);
        dipBranBoardExamTimeTabHead.setSubject1TestDate(subject1TestDate);
        dipBranBoardExamTimeTabHead.setSubject1TestDay(subject1TestDay);
        dipBranBoardExamTimeTabHead.setSubject2Colno(subject2Colno);
        dipBranBoardExamTimeTabHead.setSubject2Codeno(subject2Codeno);
        dipBranBoardExamTimeTabHead.setSubject2TestDate(subject2TestDate);
        dipBranBoardExamTimeTabHead.setSubject2TestDay(subject2TestDay);
        dipBranBoardExamTimeTabHead.setSubject3Colno(subject3Colno);
        dipBranBoardExamTimeTabHead.setSubject3Codeno(subject3Codeno);
        dipBranBoardExamTimeTabHead.setSubject3TestDate(subject3TestDate);
        dipBranBoardExamTimeTabHead.setSubject3TestDay(subject3TestDay);
        dipBranBoardExamTimeTabHead.setSubject4Colno(subject4Colno);
        dipBranBoardExamTimeTabHead.setSubject4Codeno(subject4Codeno);
        dipBranBoardExamTimeTabHead.setSubject4TestDate(subject4TestDate);
        dipBranBoardExamTimeTabHead.setSubject4TestDay(subject4TestDay);
        dipBranBoardExamTimeTabHead.setSubject5Colno(subject5Colno);
        dipBranBoardExamTimeTabHead.setSubject5Codeno(subject5Codeno);
        dipBranBoardExamTimeTabHead.setSubject5TestDate(subject5TestDate);
        dipBranBoardExamTimeTabHead.setSubject5TestDay(subject5TestDay);
        dipBranBoardExamTimeTabHead.setSubject6Colno(subject6Colno);
        dipBranBoardExamTimeTabHead.setSubject6Codeno(subject6Codeno);
        dipBranBoardExamTimeTabHead.setSubject6TestDate(subject6TestDate);
        dipBranBoardExamTimeTabHead.setSubject6TestDay(subject6TestDay);
        dipBranBoardExamTimeTabHead.setSubject7Colno(subject7Colno);
        dipBranBoardExamTimeTabHead.setSubject7Codeno(subject7Codeno);
        dipBranBoardExamTimeTabHead.setSubject7TestDate(subject7TestDate);
        dipBranBoardExamTimeTabHead.setSubject7TestDay(subject7TestDay);
        dipBranBoardExamTimeTabHead.setMonthandyearofexam(monthandyearofexam);
        dipBranBoardExamTimeTabHead.setLoginuser(loginuser);

        diplomaBranchBoardExamTimeTableHeaderRepository.save(dipBranBoardExamTimeTabHead);

    }

}
