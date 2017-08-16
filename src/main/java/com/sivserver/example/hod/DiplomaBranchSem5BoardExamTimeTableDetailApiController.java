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
@RequestMapping("/api/v1/diplomabranchsem5boardexamtimetabledetail")

public class DiplomaBranchSem5BoardExamTimeTableDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaBranchSem5BoardExamTimeTableDetailRepository diplomaBranchSem5BoardExamTimeTableDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaBranchSem5BoardExamTtDetail(
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
            @RequestParam(value = "OverallResult", required = false) String OverallResult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaBranchSem5BoardExamTimeTableDetail dipBranSem5BoardExamTimeTabDet = new DiplomaBranchSem5BoardExamTimeTableDetail();
        dipBranSem5BoardExamTimeTabDet.setExamid(examid);
        dipBranSem5BoardExamTimeTabDet.setRegno(regno);
        dipBranSem5BoardExamTimeTabDet.setAdmissionno(admissionno);
        dipBranSem5BoardExamTimeTabDet.setSubject1intmark(subject1IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject1extmark(subject1ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject1totmark(subject1TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject1attendance(subject1Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject1result(subject1Result);
        dipBranSem5BoardExamTimeTabDet.setSubject2intmark(subject2IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject2extmark(subject2ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject2totmark(subject2TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject2attendance(subject2Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject2result(subject2Result);
        dipBranSem5BoardExamTimeTabDet.setSubject3intmark(subject3IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject3extmark(subject3ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject3totmark(subject3TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject3attendance(subject3Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject3result(subject3Result);
        dipBranSem5BoardExamTimeTabDet.setSubject4intmark(subject4IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject4extmark(subject4ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject4totmark(subject4TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject4attendance(subject4Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject4result(subject4Result);
        dipBranSem5BoardExamTimeTabDet.setSubject5intmark(subject5IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject5extmark(subject5ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject5totmark(subject5TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject5attendance(subject5Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject5result(subject5Result);
        dipBranSem5BoardExamTimeTabDet.setSubject6intmark(subject6IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject6extmark(subject6ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject6totmark(subject6TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject6attendance(subject6Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject6result(subject6Result);
        dipBranSem5BoardExamTimeTabDet.setSubject7intmark(subject7IntMark);
        dipBranSem5BoardExamTimeTabDet.setSubject7extmark(subject7ExtMark);
        dipBranSem5BoardExamTimeTabDet.setSubject7totmark(subject7TotMark);
        dipBranSem5BoardExamTimeTabDet.setSubject7attendance(subject7Attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject7result(subject7Result);
        dipBranSem5BoardExamTimeTabDet.setOverallresult(OverallResult);
        dipBranSem5BoardExamTimeTabDet.setRank(rank);

        diplomaBranchSem5BoardExamTimeTableDetailRepository.save(dipBranSem5BoardExamTimeTabDet);
    }

}
