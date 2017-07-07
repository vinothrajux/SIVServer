package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/studentremarksentry")

public class StudentRemarksEntryApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentRemarksEntryRepository studentRemarksEntryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void subjectAllocation(
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "remarks", required = false) String remarks,
            @RequestParam(value = "primaryaction", required = false) String primaryaction,
            @RequestParam(value = "remarkdate", required = false) Date remarkdate,
            @RequestParam(value = "remarkday", required = false) String remarkday,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StudentRemarksEntry studRemarks = new StudentRemarksEntry();

        studRemarks.setRegno(regno);
        studRemarks.setBranchCode(branchcode);
        studRemarks.setBatch(batch);
        studRemarks.setSemester(semester);
        studRemarks.setAcademicYear(academicyear);
        studRemarks.setRemarks(remarks);
        studRemarks.setPrimaryAction(primaryaction);
        studRemarks.setRemarkDate(remarkdate);
        studRemarks.setRemarkDay(remarkday);
        studRemarks.setLoginUser(loginuser);

        studentRemarksEntryRepository.save(studRemarks);
    }


}
