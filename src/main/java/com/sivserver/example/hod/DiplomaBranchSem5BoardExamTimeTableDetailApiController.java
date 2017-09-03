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
            @RequestParam(value = "OverallResult", required = false) String Overallresult,
            @RequestParam(value = "rank", required = false) Integer rank

    ) {
        DiplomaBranchSem5BoardExamTimeTableDetail dipBranSem5BoardExamTimeTabDet = new DiplomaBranchSem5BoardExamTimeTableDetail();
        dipBranSem5BoardExamTimeTabDet.setExamid(examid);
        dipBranSem5BoardExamTimeTabDet.setRegno(regno);
        dipBranSem5BoardExamTimeTabDet.setAdmissionno(admissionno);
        dipBranSem5BoardExamTimeTabDet.setSubject1intmark(subject1intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject1extmark(subject1extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject1totmark(subject1totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject1attendance(subject1attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject1result(subject1result);
        dipBranSem5BoardExamTimeTabDet.setSubject2intmark(subject2intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject2extmark(subject2extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject2totmark(subject2totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject2attendance(subject2attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject2result(subject2result);
        dipBranSem5BoardExamTimeTabDet.setSubject3intmark(subject3intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject3extmark(subject3extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject3totmark(subject3totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject3attendance(subject3attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject3result(subject3result);
        dipBranSem5BoardExamTimeTabDet.setSubject4intmark(subject4intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject4extmark(subject4extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject4totmark(subject4totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject4attendance(subject4attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject4result(subject4result);
        dipBranSem5BoardExamTimeTabDet.setSubject5intmark(subject5intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject5extmark(subject5extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject5totmark(subject5totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject5attendance(subject5attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject5result(subject5result);
        dipBranSem5BoardExamTimeTabDet.setSubject6intmark(subject6intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject6extmark(subject6extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject6totmark(subject6totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject6attendance(subject6attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject6result(subject6result);
        dipBranSem5BoardExamTimeTabDet.setSubject7intmark(subject7intmark);
        dipBranSem5BoardExamTimeTabDet.setSubject7extmark(subject7extmark);
        dipBranSem5BoardExamTimeTabDet.setSubject7totmark(subject7totmark);
        dipBranSem5BoardExamTimeTabDet.setSubject7attendance(subject7attendance);
        dipBranSem5BoardExamTimeTabDet.setSubject7result(subject7result);
        dipBranSem5BoardExamTimeTabDet.setOverallresult(Overallresult);
        dipBranSem5BoardExamTimeTabDet.setRank(rank);

        diplomaBranchSem5BoardExamTimeTableDetailRepository.save(dipBranSem5BoardExamTimeTabDet);
    }

}
