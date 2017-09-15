package com.sivserver.example.Superintendent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@RequestMapping("/api/v1/ex2header")

public class Ex2HeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private Ex2HeaderRepository ex2HeaderRepository;


    @RequestMapping(method = RequestMethod.POST)
    public void ex2Head(
            @RequestParam(value ="examdate", required=false) Date examdate,
            @RequestParam (value="examday", required=false) String examday,
            @RequestParam (value="examsession", required=false) String examsession,
            @RequestParam (value="monthandyearofexam", required=false) String monthandyearofexam,
            @RequestParam (value="questioncode", required=false) String questioncode,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="semester", required=false) String academicyear,
            @RequestParam (value="semester", required=false) String subjectcode,
            @RequestParam (value="semester", required=false) Integer columnno,
            @RequestParam (value="semester", required=false) Integer totalpresent,
            @RequestParam (value="semester", required=false) Integer totalabsent,
            @RequestParam (value="semester", required=false) Integer totalmalpractice,
            @RequestParam (value="semester", required=false) String loginuser
    ) {
        Ex2Header ex2Head = new Ex2Header();
        ex2Head.setExamdate(examdate);
        ex2Head.setExamday(examday);
        ex2Head.setExamsession(examsession);
        ex2Head.setMonthandyearofexam(monthandyearofexam);
        ex2Head.setQuestioncode(questioncode);
        ex2Head.setBranchcode(branchcode);
        ex2Head.setSemester(semester);
        ex2Head.setAcademicyear(academicyear);
        ex2Head.setSubjectcode(subjectcode);
        ex2Head.setColumnno(columnno);
        ex2Head.setTotalpresent(totalpresent);
        ex2Head.setTotalabsent(totalabsent);
        ex2Head.setTotalmalpractice(totalmalpractice);
        ex2Head.setLoginuser(loginuser);

        ex2HeaderRepository.save(ex2Head);



    }


}
