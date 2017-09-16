package com.sivserver.example.hod;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@RequestMapping("/api/v1/studentremarksentry")

public class StudentRemarksEntryApiController extends WebMvcConfigurerAdapter {
    //@Autowired
    private StudentRemarksEntryRepository studentRemarksEntryRepository;

    @GetMapping(value="/all")

    public List<StudentRemarksEntry> getStudentRemarksEntryDetail() {return studentRemarksEntryRepository.findAll(); }

    public StudentRemarksEntryApiController(StudentRemarksEntryRepository studentRemarksEntryRepository)
    {
        this.studentRemarksEntryRepository = studentRemarksEntryRepository;
    }


    @RequestMapping(method = RequestMethod.POST)

    public void subjectAllocation(
            @RequestParam(value = "remarkid", required = false) String remarkid,
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
        StudentBaseInformation diplomaInternalBranchTestTimetableDetail_regno = new StudentBaseInformation(regno);

        studRemarks.setRemarkid(remarkid);
        studRemarks.setRegno(regno);
        studRemarks.setBranchcode(branchcode);
        studRemarks.setBatch(batch);
        studRemarks.setSemester(semester);
        studRemarks.setAcademicyear(academicyear);
        studRemarks.setRemarks(remarks);
        studRemarks.setPrimaryaction(primaryaction);
        studRemarks.setRemarkdate(remarkdate);
        studRemarks.setRemarkday(remarkday);
        studRemarks.setLoginuser(loginuser);

        studentRemarksEntryRepository.save(studRemarks);
    }


}
