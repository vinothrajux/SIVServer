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
@RequestMapping("/api/v1/diplomasecondsemboardexamtimetabledetail")

public class DiplomaSecondSemBoardExamTimeTableDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaSecondSemBoardExamTimeTableDetailRepository diplomaSecondSemBoardExamTimeTableDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaSecondSemBoardExamTtDetail(
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
        DiplomaSecondSemBoardExamTimeTableDetail dipSecondSemBoardExamTimeTabDet = new DiplomaSecondSemBoardExamTimeTableDetail();
        dipSecondSemBoardExamTimeTabDet.setExamId(examid);
        dipSecondSemBoardExamTimeTabDet.setRegno(regno);
        dipSecondSemBoardExamTimeTabDet.setAdmissionNo(admissionno);
        dipSecondSemBoardExamTimeTabDet.setSubject1IntMark(subject1IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject1ExtMark(subject1ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject1TotMark(subject1TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject1Result(subject1Result);
        dipSecondSemBoardExamTimeTabDet.setSubject2IntMark(subject2IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject2ExtMark(subject2ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject2TotMark(subject2TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject2Result(subject2Result);
        dipSecondSemBoardExamTimeTabDet.setSubject3IntMark(subject3IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject3ExtMark(subject3ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject3TotMark(subject3TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject3Result(subject3Result);
        dipSecondSemBoardExamTimeTabDet.setSubject4IntMark(subject4IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject4ExtMark(subject4ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject4TotMark(subject4TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject4Result(subject4Result);
        dipSecondSemBoardExamTimeTabDet.setSubject5IntMark(subject5IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject5ExtMark(subject5ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject5TotMark(subject5TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject5Attendance(subject5Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject5Result(subject5Result);
        dipSecondSemBoardExamTimeTabDet.setSubject6IntMark(subject6IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject6ExtMark(subject6ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject6TotMark(subject6TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject6Attendance(subject6Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject6Result(subject6Result);
        dipSecondSemBoardExamTimeTabDet.setSubject7IntMark(subject7IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject7ExtMark(subject7ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject7TotMark(subject7TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject7Attendance(subject7Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject7Result(subject7Result);
        dipSecondSemBoardExamTimeTabDet.setSubject8IntMark(subject8IntMark);
        dipSecondSemBoardExamTimeTabDet.setSubject8ExtMark(subject8ExtMark);
        dipSecondSemBoardExamTimeTabDet.setSubject8TotMark(subject8TotMark);
        dipSecondSemBoardExamTimeTabDet.setSubject8Attendance(subject8Attendance);
        dipSecondSemBoardExamTimeTabDet.setSubject8Result(subject8Result);
        dipSecondSemBoardExamTimeTabDet.setOverallResult(OverallResult);
        dipSecondSemBoardExamTimeTabDet.setRank(rank);

        diplomaSecondSemBoardExamTimeTableDetailRepository.save(dipSecondSemBoardExamTimeTabDet);
    }

}
