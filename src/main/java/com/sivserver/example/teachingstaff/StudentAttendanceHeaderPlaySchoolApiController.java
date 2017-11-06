package com.sivserver.example.teachingstaff;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 03/11/2017.
 */
@RestController
@RequestMapping("/api/v1/studentattendanceheaderplayschool")
public class StudentAttendanceHeaderPlaySchoolApiController {

    private StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StudentAttendanceHeaderPlaySchool> getStudentAttendanceHeaderPlaySchoolDetail() {return studentAttendanceHeaderPlaySchoolRepository.findAll();}

    public StudentAttendanceHeaderPlaySchoolApiController(StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository)
    {
        this.studentAttendanceHeaderPlaySchoolRepository = studentAttendanceHeaderPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentAttendanceHeaderplayschool(
            @RequestParam(value ="entrydate", required=false) Date entrydate,
            @RequestParam (value="entryday", required=false) String entryday,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="no_of_present", required=false) Integer no_of_present,
            @RequestParam (value="no_of_absent", required=false) Integer no_of_absent,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        StudentAttendanceHeaderPlaySchool ps_student_att_head = new StudentAttendanceHeaderPlaySchool();
        Student_Attendance_Play_School_Compound_Key key = new Student_Attendance_Play_School_Compound_Key(entrydate,program,section,academicyear);

        ps_student_att_head.setEntryday(entryday);
        ps_student_att_head.setStudent_attendance_play_school_compound_key(key);
        ps_student_att_head.setNo_of_present(no_of_present);
        ps_student_att_head.setNo_of_absent(no_of_absent);
        ps_student_att_head.setLoginuser(loginuser);

        studentAttendanceHeaderPlaySchoolRepository.save(ps_student_att_head);
    }

    }
