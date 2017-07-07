package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomafirstsemboardexamtimetabledetail")

public class DiplomaFirstSemBoardExamTimeTableDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaFirstSemBoardExamTimeTableDetailRepository diplomaFirstSemBoardExamTimeTableDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaFirstSemBoardExamTtDetail(
            @RequestParam(value = "examid", required = false) String examid,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "subject1IntMark", required = false) Integer subject1IntMark,
            @RequestParam(value = "subject1ExtMark", required = false) Integer subject1ExtMark,
            @RequestParam(value = "subject1TotMark", required = false) Integer subject1TotMark,
            @RequestParam(value = "subject1Attendance", required = false) Character subject1Attendance,
            @RequestParam(value = "subject1Result", required = false) String subject1Result,
            @RequestParam(value = "subject2IntMark", required = false) Integer subject2IntMark,
            @RequestParam(value = "subject2ExtMark", required = false) Integer subject2ExtMark,
            @RequestParam(value = "subject2TotMark", required = false) Integer subject2TotMark,
            @RequestParam(value = "subject2Attendance", required = false) Character subject2Attendance,
            @RequestParam(value = "subject2Result", required = false) String subject2Result,
            @RequestParam(value = "subject3IntMark", required = false) Integer subject3IntMark,
            @RequestParam(value = "subject3ExtMark", required = false) Integer subject3ExtMark,
            @RequestParam(value = "subject3TotMark", required = false) Integer subject3TotMark,
            @RequestParam(value = "subject3Attendance", required = false) Character subject3Attendance,
            @RequestParam(value = "subject3Result", required = false) String subject3Result,
            @RequestParam(value = "subject4IntMark", required = false) Integer subject4IntMark,
            @RequestParam(value = "subject4ExtMark", required = false) Integer subject4ExtMark,
            @RequestParam(value = "subject4TotMark", required = false) Integer subject4TotMark,
            @RequestParam(value = "subject4Attendance", required = false) Character subject4Attendance,
            @RequestParam(value = "subject4Result", required = false) String subject4Result,
            @RequestParam(value = "subject5IntMark", required = false) Integer subject5IntMark,
            @RequestParam(value = "subject5ExtMark", required = false) Integer subject5ExtMark,
            @RequestParam(value = "subject5TotMark", required = false) Integer subject5TotMark,
            @RequestParam(value = "subject5Attendance", required = false) Character subject5Attendance,
            @RequestParam(value = "subject5Result", required = false) String subject5Result,
            @RequestParam(value = "subject6IntMark", required = false) Integer subject6IntMark,
            @RequestParam(value = "subject6ExtMark", required = false) Integer subject6ExtMark,
            @RequestParam(value = "subject6TotMark", required = false) Integer subject6TotMark,
            @RequestParam(value = "subject6Attendance", required = false) Character subject6Attendance,
            @RequestParam(value = "subject6Result", required = false) String subject6Result,
            @RequestParam(value = "subject7IntMark", required = false) Integer subject7IntMark,
            @RequestParam(value = "subject7ExtMark", required = false) Integer subject7ExtMark,
            @RequestParam(value = "subject7TotMark", required = false) Integer subject7TotMark,
            @RequestParam(value = "subject7Attendance", required = false) Character subject7Attendance,
            @RequestParam(value = "subject7Result", required = false) String subject7Result,
            @RequestParam(value = "subject8IntMark", required = false) Integer subject8IntMark,
            @RequestParam(value = "subject8ExtMark", required = false) Integer subject8ExtMark,
            @RequestParam(value = "subject8TotMark", required = false) Integer subject8TotMark,
            @RequestParam(value = "subject8Attendance", required = false) Character subject8Attendance,
            @RequestParam(value = "subject8Result", required = false) String subject8Result,
            @RequestParam(value = "OverallResult", required = false) String OverallResult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaFirstSemBoardExamTimeTableDetail dipFirstSemBoardExamTimeTabDet = new DiplomaFirstSemBoardExamTimeTableDetail();
        dipFirstSemBoardExamTimeTabDet.setExamId(examid);
        dipFirstSemBoardExamTimeTabDet.setRegno(regno);
        dipFirstSemBoardExamTimeTabDet.setAdmissionNo(admissionno);
        dipFirstSemBoardExamTimeTabDet.setSubject1IntMark(subject1IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject1ExtMark(subject1ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject1TotMark(subject1TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject1Result(subject1Result);
        dipFirstSemBoardExamTimeTabDet.setSubject2IntMark(subject2IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject2ExtMark(subject2ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject2TotMark(subject2TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject2Result(subject2Result);
        dipFirstSemBoardExamTimeTabDet.setSubject3IntMark(subject3IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject3ExtMark(subject3ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject3TotMark(subject3TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject3Result(subject3Result);
        dipFirstSemBoardExamTimeTabDet.setSubject4IntMark(subject4IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject4ExtMark(subject4ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject4TotMark(subject4TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject4Result(subject4Result);
        dipFirstSemBoardExamTimeTabDet.setSubject5IntMark(subject5IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject5ExtMark(subject5ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject5TotMark(subject5TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject5Attendance(subject5Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject5Result(subject5Result);
        dipFirstSemBoardExamTimeTabDet.setSubject6IntMark(subject6IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject6ExtMark(subject6ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject6TotMark(subject6TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject6Attendance(subject6Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject6Result(subject6Result);
        dipFirstSemBoardExamTimeTabDet.setSubject7IntMark(subject7IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject7ExtMark(subject7ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject7TotMark(subject7TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject7Attendance(subject7Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject7Result(subject7Result);
        dipFirstSemBoardExamTimeTabDet.setSubject8IntMark(subject8IntMark);
        dipFirstSemBoardExamTimeTabDet.setSubject8ExtMark(subject8ExtMark);
        dipFirstSemBoardExamTimeTabDet.setSubject8TotMark(subject8TotMark);
        dipFirstSemBoardExamTimeTabDet.setSubject8Attendance(subject8Attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject8Result(subject8Result);
        dipFirstSemBoardExamTimeTabDet.setOverallResult(OverallResult);
        dipFirstSemBoardExamTimeTabDet.setRank(rank);

        diplomaFirstSemBoardExamTimeTableDetailRepository.save(dipFirstSemBoardExamTimeTabDet);
    }

}
