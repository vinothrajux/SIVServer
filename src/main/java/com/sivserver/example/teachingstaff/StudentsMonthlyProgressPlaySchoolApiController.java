package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 08/11/2017.
 */
@RestController
@RequestMapping("/api/v1/studentsmonthlyprogressplayschool")
public class StudentsMonthlyProgressPlaySchoolApiController {

    private StudentsMonthlyProgressPlaySchoolRepository studentsMonthlyProgressPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StudentsMonthlyProgressPlaySchool> getStudentsMonthlyProgressDetails() {return studentsMonthlyProgressPlaySchoolRepository.findAll();}

    public StudentsMonthlyProgressPlaySchoolApiController(StudentsMonthlyProgressPlaySchoolRepository studentsMonthlyProgressPlaySchoolRepository)
    {
        this.studentsMonthlyProgressPlaySchoolRepository = studentsMonthlyProgressPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentMonthlyProgressPlaySchool(
            @RequestParam(value ="remarkid", required=false) String remarkid,
            @RequestParam (value="entrydate", required=false) Date entrydate,
            @RequestParam (value="entryday", required=false) String entryday,
            @RequestParam (value="month", required=false) String month,
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="category1_rating", required=false) Integer category1_rating,
            @RequestParam (value="category2_rating", required=false) Integer category2_rating,
            @RequestParam (value="category3_rating", required=false) Integer category3_rating,
            @RequestParam (value="category4_rating", required=false) Integer category4_rating,
            @RequestParam (value="category5_rating", required=false) Integer category5_rating,
            @RequestParam (value="category6_rating", required=false) Integer category6_rating,
            @RequestParam (value="category7_rating", required=false) Integer category7_rating,
            @RequestParam (value="category8_rating", required=false) Integer category8_rating,
            @RequestParam (value="category9_rating", required=false) Integer category9_rating,
            @RequestParam (value="category10_rating", required=false) Integer category10_rating,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentsMonthlyProgressPlaySchool ps_Students_Monthly_progress = new StudentsMonthlyProgressPlaySchool();
        PlaySchoolStudentBaseInformation ps_student_base_info = new PlaySchoolStudentBaseInformation();

        ps_Students_Monthly_progress.setRemarkid(remarkid);
        ps_Students_Monthly_progress.setEntrydate(entrydate);
        ps_Students_Monthly_progress.setEntryday(entryday);
        ps_Students_Monthly_progress.setMonth(month);
        ps_Students_Monthly_progress.setRegisternumber(registernumber);
        ps_Students_Monthly_progress.setName(name);
        ps_Students_Monthly_progress.setProgram(program);
        ps_Students_Monthly_progress.setSection(section);
        ps_Students_Monthly_progress.setAcademicyear(academicyear);
        ps_Students_Monthly_progress.setCategory1_rating(category1_rating);
        ps_Students_Monthly_progress.setCategory2_rating(category2_rating);
        ps_Students_Monthly_progress.setCategory3_rating(category3_rating);
        ps_Students_Monthly_progress.setCategory4_rating(category4_rating);
        ps_Students_Monthly_progress.setCategory5_rating(category5_rating);
        ps_Students_Monthly_progress.setCategory6_rating(category6_rating);
        ps_Students_Monthly_progress.setCategory7_rating(category7_rating);
        ps_Students_Monthly_progress.setCategory8_rating(category8_rating);
        ps_Students_Monthly_progress.setCategory9_rating(category9_rating);
        ps_Students_Monthly_progress.setCategory10_rating(category10_rating);
        ps_Students_Monthly_progress.setLoginuser(loginuser);

        studentsMonthlyProgressPlaySchoolRepository.save(ps_Students_Monthly_progress);

    }

    }
