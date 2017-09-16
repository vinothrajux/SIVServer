package com.sivserver.example.hod;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 05/07/2017.
 */
@RestController
@RequestMapping("/api/v1/diplomabranchsem4boardexamtimetabledetail")
public class DiplomaBranchSem4BoardExamTimeTableDetailApiController  {
   // @Autowired
    private DiplomaBranchSem4BoardExamTimeTableDetailRepository diplomaBranchSem4BoardExamTimeTableDetailRepository;

    @GetMapping(value="/all")

    public List<DiplomaBranchSem4BoardExamTimeTableDetail> getDiplomaBranchSem4BoardExamTimeTableDetail() {return diplomaBranchSem4BoardExamTimeTableDetailRepository.findAll();}

    public DiplomaBranchSem4BoardExamTimeTableDetailApiController(DiplomaBranchSem4BoardExamTimeTableDetailRepository diplomaBranchSem4BoardExamTimeTableDetailRepository)
    {
        this.diplomaBranchSem4BoardExamTimeTableDetailRepository=diplomaBranchSem4BoardExamTimeTableDetailRepository;
    }
    @RequestMapping(method = RequestMethod.POST)

    public void diplomaBranchSem4BoardExamTtDetail(
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) String semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
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
            @RequestParam(value = "rank", required = false) Integer rank,
            @RequestParam(value = "monthandyearofexam", required = false) String monthandyearofexam

    ) {
        DiplomaBranchSem4BoardExamTimeTableDetail dipBranSem4BoardExamTimeTabDet = new DiplomaBranchSem4BoardExamTimeTableDetail();
        StudentBaseInformation student_base_regno = new StudentBaseInformation(regno);
        Hod_Compound_Key key = new Hod_Compound_Key(branchcode,batch,semester,academicyear);


        dipBranSem4BoardExamTimeTabDet.setRegno(regno)
                .setAdmissionno(admissionno)
                .setFetch_details(key)
                .setSubject1IntMark(subject1IntMark)
                .setSubject1ExtMark(subject1ExtMark)
                .setSubject1TotMark(subject1TotMark)
                .setSubject1Attendance(subject1Attendance)
                .setSubject1Result(subject1Result)
                .setSubject2IntMark(subject2IntMark)
                .setSubject2ExtMark(subject2ExtMark)
                .setSubject2TotMark(subject2TotMark)
                .setSubject2Attendance(subject2Attendance)
                .setSubject2Result(subject2Result)
                .setSubject3IntMark(subject3IntMark)
                .setSubject3ExtMark(subject3ExtMark)
                .setSubject3TotMark(subject3TotMark)
                .setSubject3Attendance(subject3Attendance)
                .setSubject3Result(subject3Result)
                .setSubject4IntMark(subject4IntMark)
                .setSubject4ExtMark(subject4ExtMark)
                .setSubject4TotMark(subject4TotMark)
                .setSubject4Attendance(subject4Attendance)
                .setSubject4Result(subject4Result)
                .setSubject5IntMark(subject5IntMark)
                .setSubject5ExtMark(subject5ExtMark)
                .setSubject5TotMark(subject5TotMark)
                .setSubject5Attendance(subject5Attendance)
                .setSubject5Result(subject5Result)
                .setSubject6IntMark(subject6IntMark)
                .setSubject6ExtMark(subject6ExtMark)
                .setSubject6TotMark(subject6TotMark)
                .setSubject6Attendance(subject6Attendance)
                .setSubject6Result(subject6Result)
                .setSubject7IntMark(subject7IntMark)
                .setSubject7ExtMark(subject7ExtMark)
                .setSubject7TotMark(subject7TotMark)
                .setSubject7Attendance(subject7Attendance)
                .setSubject7Result(subject7Result)
                .setOverallResult(OverallResult)
                .setRank(rank)
                .setMonthandyearofexam(monthandyearofexam)
                .setStudent_base_regno(student_base_regno);

        diplomaBranchSem4BoardExamTimeTableDetailRepository.save(dipBranSem4BoardExamTimeTabDet);
    }

}
