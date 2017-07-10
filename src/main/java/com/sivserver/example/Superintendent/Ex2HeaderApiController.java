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
        ex2Head.setExamDate(examdate);
        ex2Head.setExamDay(examday);
        ex2Head.setExamSession(examsession);
        ex2Head.setQuestionCode(questioncode);
        ex2Head.setBranchCode(branchcode);
        ex2Head.setSemester(semester);
        ex2Head.setAcademicYear(academicyear);
        ex2Head.setSubjectCode(subjectcode);
        ex2Head.setSubjectColumnNo(columnno);
        ex2Head.setTotalPresent(totalpresent);
        ex2Head.setTotalAbsent(totalabsent);
        ex2Head.setTotalMalPractice(totalmalpractice);
        ex2Head.setLoginUser(loginuser);

        ex2HeaderRepository.save(ex2Head);



    }


}
