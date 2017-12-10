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
            @RequestParam (value="category1rating", required=false) Integer category1rating,
            @RequestParam (value="category2rating", required=false) Integer category2rating,
            @RequestParam (value="category3rating", required=false) Integer category3rating,
            @RequestParam (value="category4rating", required=false) Integer category4rating,
            @RequestParam (value="category5rating", required=false) Integer category5rating,
            @RequestParam (value="category6rating", required=false) Integer category6rating,
            @RequestParam (value="category7rating", required=false) Integer category7rating,
            @RequestParam (value="category8rating", required=false) Integer category8rating,
            @RequestParam (value="category9rating", required=false) Integer category9rating,
            @RequestParam (value="category10rating", required=false) Integer category10rating,
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
        ps_Students_Monthly_progress.setCategory1rating(category1rating);
        ps_Students_Monthly_progress.setCategory2rating(category2rating);
        ps_Students_Monthly_progress.setCategory3rating(category3rating);
        ps_Students_Monthly_progress.setCategory4rating(category4rating);
        ps_Students_Monthly_progress.setCategory5rating(category5rating);
        ps_Students_Monthly_progress.setCategory6rating(category6rating);
        ps_Students_Monthly_progress.setCategory7rating(category7rating);
        ps_Students_Monthly_progress.setCategory8rating(category8rating);
        ps_Students_Monthly_progress.setCategory9rating(category9rating);
        ps_Students_Monthly_progress.setCategory10rating(category10rating);
        ps_Students_Monthly_progress.setLoginuser(loginuser);

        studentsMonthlyProgressPlaySchoolRepository.save(ps_Students_Monthly_progress);

    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentMonthlyProgressPlaySchoolDetail")
    public StudentsMonthlyProgressPlaySchoolProjection getStudentMonthlyProgressPlaySchoolDetail(@RequestParam (value ="remarkid") String remarkid) {
        StudentsMonthlyProgressPlaySchoolProjection playschoolstudentMonthlyProgressDetail = studentsMonthlyProgressPlaySchoolRepository.findOneByRemarkid(remarkid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentMonthlyProgressPlaySchoolDetail");
        return playschoolstudentMonthlyProgressDetail;
    }

}
