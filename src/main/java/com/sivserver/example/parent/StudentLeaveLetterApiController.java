package com.sivserver.example.parent;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 29/06/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentleaveletter")

public class StudentLeaveLetterApiController  {
    //@Autowired
    private StudentLeaveLetterRepository studentLeaveLetterRepository;

    @GetMapping(value="/all")

    public List<StudentLeaveLetter> getStudentLeaveLetterDetail() {return studentLeaveLetterRepository.findAll();}

    public StudentLeaveLetterApiController(StudentLeaveLetterRepository studentLeaveLetterRepository)
    {
        this.studentLeaveLetterRepository = studentLeaveLetterRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentLeave(
            @RequestParam(value ="entrydate", required=false) Date entrydate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="fromdate", required=false) Date fromdate,
            @RequestParam (value="todate", required=false) Date todate,
            @RequestParam (value="noofdays", required=false) Integer noofdays,
            @RequestParam (value="leavereason", required=false) String leavereason,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentLeaveLetter studleave = new StudentLeaveLetter();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        studleave.setEntrydate(entrydate);
        studleave.setRegno(regno);
        studleave.setBranchcode(branchcode);
        studleave.setSemester(semester);
        studleave.setAcademicYear(academicYear);
        studleave.setFromdate(fromdate);
        studleave.setTodate(todate);
        studleave.setNoofdays(noofdays);
        studleave.setLeavereason(leavereason);
        studleave.setLoginuser(loginuser);

        studentLeaveLetterRepository.save(studleave);



    }


}



