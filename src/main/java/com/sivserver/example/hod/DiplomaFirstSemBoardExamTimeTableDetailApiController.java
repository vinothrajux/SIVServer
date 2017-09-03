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
            @RequestParam(value = "subject1IntMark", required = false) Integer subject1intmark,
            @RequestParam(value = "subject1ExtMark", required = false) Integer subject1extmark,
            @RequestParam(value = "subject1TotMark", required = false) Integer subject1totmark,
            @RequestParam(value = "subject1Attendance", required = false) Character subject1attendance,
            @RequestParam(value = "subject1Result", required = false) String subject1result,
            @RequestParam(value = "subject2IntMark", required = false) Integer subject2intmark,
            @RequestParam(value = "subject2ExtMark", required = false) Integer subject2extmark,
            @RequestParam(value = "subject2TotMark", required = false) Integer subject2totmark,
            @RequestParam(value = "subject2Attendance", required = false) Character subject2attendance,
            @RequestParam(value = "subject2Result", required = false) String subject2result,
            @RequestParam(value = "subject3IntMark", required = false) Integer subject3intmark,
            @RequestParam(value = "subject3ExtMark", required = false) Integer subject3extmark,
            @RequestParam(value = "subject3TotMark", required = false) Integer subject3totmark,
            @RequestParam(value = "subject3Attendance", required = false) Character subject3attendance,
            @RequestParam(value = "subject3Result", required = false) String subject3result,
            @RequestParam(value = "subject4IntMark", required = false) Integer subject4intmark,
            @RequestParam(value = "subject4ExtMark", required = false) Integer subject4extmark,
            @RequestParam(value = "subject4TotMark", required = false) Integer subject4totmark,
            @RequestParam(value = "subject4Attendance", required = false) Character subject4attendance,
            @RequestParam(value = "subject4Result", required = false) String subject4result,
            @RequestParam(value = "subject5IntMark", required = false) Integer subject5intmark,
            @RequestParam(value = "subject5ExtMark", required = false) Integer subject5extmark,
            @RequestParam(value = "subject5TotMark", required = false) Integer subject5totmark,
            @RequestParam(value = "subject5Attendance", required = false) Character subject5attendance,
            @RequestParam(value = "subject5Result", required = false) String subject5result,
            @RequestParam(value = "subject6IntMark", required = false) Integer subject6intmark,
            @RequestParam(value = "subject6ExtMark", required = false) Integer subject6extmark,
            @RequestParam(value = "subject6TotMark", required = false) Integer subject6totmark,
            @RequestParam(value = "subject6Attendance", required = false) Character subject6attendance,
            @RequestParam(value = "subject6Result", required = false) String subject6result,
            @RequestParam(value = "subject7IntMark", required = false) Integer subject7intmark,
            @RequestParam(value = "subject7ExtMark", required = false) Integer subject7extmark,
            @RequestParam(value = "subject7TotMark", required = false) Integer subject7totmark,
            @RequestParam(value = "subject7Attendance", required = false) Character subject7attendance,
            @RequestParam(value = "subject7Result", required = false) String subject7result,
            @RequestParam(value = "subject8IntMark", required = false) Integer subject8intmark,
            @RequestParam(value = "subject8ExtMark", required = false) Integer subject8extmark,
            @RequestParam(value = "subject8TotMark", required = false) Integer subject8totmark,
            @RequestParam(value = "subject8Attendance", required = false) Character subject8attendance,
            @RequestParam(value = "subject8Result", required = false) String subject8result,
            @RequestParam(value = "OverallResult", required = false) String Overallresult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaFirstSemBoardExamTimeTableDetail dipFirstSemBoardExamTimeTabDet = new DiplomaFirstSemBoardExamTimeTableDetail();
        dipFirstSemBoardExamTimeTabDet.setExamid(examid);
        dipFirstSemBoardExamTimeTabDet.setRegno(regno);
        dipFirstSemBoardExamTimeTabDet.setAdmissionno(admissionno);
        dipFirstSemBoardExamTimeTabDet.setSubject1intmark(subject1intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject1extmark(subject1extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject1totmark(subject1totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject1attendance(subject1attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject1result(subject1result);
        dipFirstSemBoardExamTimeTabDet.setSubject2intmark(subject2intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject2extmark(subject2extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject2totmark(subject2totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject2attendance(subject2attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject2result(subject2result);
        dipFirstSemBoardExamTimeTabDet.setSubject3intmark(subject3intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject3extmark(subject3extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject3totmark(subject3totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject3attendance(subject3attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject3result(subject3result);
        dipFirstSemBoardExamTimeTabDet.setSubject4intmark(subject4intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject4extmark(subject4extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject4totmark(subject4totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject4attendance(subject4attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject4result(subject4result);
        dipFirstSemBoardExamTimeTabDet.setSubject5intmark(subject5intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject5extmark(subject5extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject5totmark(subject5totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject5attendance(subject5attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject5result(subject5result);
        dipFirstSemBoardExamTimeTabDet.setSubject6IntMark(subject6intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject6extmark(subject6extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject6totmark(subject6totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject6attendance(subject6attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject6result(subject6result);
        dipFirstSemBoardExamTimeTabDet.setSubject7intmark(subject7intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject7extmark(subject7extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject7totmark(subject7totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject7attendance(subject7attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject7result(subject7result);
        dipFirstSemBoardExamTimeTabDet.setSubject8intmark(subject8intmark);
        dipFirstSemBoardExamTimeTabDet.setSubject8extmark(subject8extmark);
        dipFirstSemBoardExamTimeTabDet.setSubject8totmark(subject8totmark);
        dipFirstSemBoardExamTimeTabDet.setSubject8attendance(subject8attendance);
        dipFirstSemBoardExamTimeTabDet.setSubject8result(subject8result);
        dipFirstSemBoardExamTimeTabDet.setOverallresult(Overallresult);
        dipFirstSemBoardExamTimeTabDet.setRank(rank);

        diplomaFirstSemBoardExamTimeTableDetailRepository.save(dipFirstSemBoardExamTimeTabDet);
    }

}
