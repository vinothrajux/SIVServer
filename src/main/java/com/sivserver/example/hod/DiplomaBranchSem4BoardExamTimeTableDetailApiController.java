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
@RequestMapping("/api/v1/diplomabranchsem4boardexamtimetabledetail")
public class DiplomaBranchSem4BoardExamTimeTableDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private DiplomaBranchSem4BoardExamTimeTableDetailRepository diplomaBranchSem4BoardExamTimeTableDetailRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void diplomaBranchSem4BoardExamTtDetail(
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
        DiplomaBranchSem4BoardExamTimeTableDetail dipBranSem4BoardExamTimeTabDet = new DiplomaBranchSem4BoardExamTimeTableDetail();
        dipBranSem4BoardExamTimeTabDet.setExamId(examid);
        dipBranSem4BoardExamTimeTabDet.setRegno(regno);
        dipBranSem4BoardExamTimeTabDet.setAdmissionNo(admissionno);
        dipBranSem4BoardExamTimeTabDet.setSubject1IntMark(subject1IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject1ExtMark(subject1ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject1TotMark(subject1TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject1Attendance(subject1Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject1Result(subject1Result);
        dipBranSem4BoardExamTimeTabDet.setSubject2IntMark(subject2IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject2ExtMark(subject2ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject2TotMark(subject2TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject2Attendance(subject2Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject2Result(subject2Result);
        dipBranSem4BoardExamTimeTabDet.setSubject3IntMark(subject3IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject3ExtMark(subject3ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject3TotMark(subject3TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject3Attendance(subject3Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject3Result(subject3Result);
        dipBranSem4BoardExamTimeTabDet.setSubject4IntMark(subject4IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject4ExtMark(subject4ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject4TotMark(subject4TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject4Attendance(subject4Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject4Result(subject4Result);
        dipBranSem4BoardExamTimeTabDet.setSubject5IntMark(subject5IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject5ExtMark(subject5ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject5TotMark(subject5TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject5Attendance(subject5Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject5Result(subject5Result);
        dipBranSem4BoardExamTimeTabDet.setSubject6IntMark(subject6IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject6ExtMark(subject6ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject6TotMark(subject6TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject6Attendance(subject6Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject6Result(subject6Result);
        dipBranSem4BoardExamTimeTabDet.setSubject7IntMark(subject7IntMark);
        dipBranSem4BoardExamTimeTabDet.setSubject7ExtMark(subject7ExtMark);
        dipBranSem4BoardExamTimeTabDet.setSubject7TotMark(subject7TotMark);
        dipBranSem4BoardExamTimeTabDet.setSubject7Attendance(subject7Attendance);
        dipBranSem4BoardExamTimeTabDet.setSubject7Result(subject7Result);
        dipBranSem4BoardExamTimeTabDet.setOverallResult(OverallResult);
        dipBranSem4BoardExamTimeTabDet.setRank(rank);

        diplomaBranchSem4BoardExamTimeTableDetailRepository.save(dipBranSem4BoardExamTimeTabDet);
    }

}
