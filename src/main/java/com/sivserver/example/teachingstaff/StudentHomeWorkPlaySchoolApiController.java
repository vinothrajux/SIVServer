package com.sivserver.example.teachingstaff;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@RequestMapping("/api/v1/studenthomeworkplayschool")
public class StudentHomeWorkPlaySchoolApiController {

    private StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StudentHomeWorkPlaySchool> getStudentHomeWorkPlaySchoolDetails() {return studentHomeWorkPlaySchoolRepository.findAll();}

    public StudentHomeWorkPlaySchoolApiController(StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository)
    {
        this.studentHomeWorkPlaySchoolRepository = studentHomeWorkPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentHomeWorkPlaySchool(
            @RequestParam(value ="home_work_id", required=false) String home_work_id,
            @RequestParam (value="entrydate", required=false) Date entrydate,
            @RequestParam (value="entryday", required=false) String entryday,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="subjectcategory", required=false) String subjectcategory,
            @RequestParam (value="homework_content", required=false) String homework_content,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentHomeWorkPlaySchool ps_student_home_work = new StudentHomeWorkPlaySchool();

        ps_student_home_work.setHome_work_id(home_work_id);
        ps_student_home_work.setEntrydate(entrydate);
        ps_student_home_work.setEntryday(entryday);
        ps_student_home_work.setProgram(program);
        ps_student_home_work.setSection(section);
        ps_student_home_work.setAcademicyear(academicyear);
        ps_student_home_work.setSubjectcategory(subjectcategory);
        ps_student_home_work.setHomework_content(homework_content);
        ps_student_home_work.setLoginuser(loginuser);

        studentHomeWorkPlaySchoolRepository.save(ps_student_home_work);


    }

    }

