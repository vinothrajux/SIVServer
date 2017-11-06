package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 03/11/2017.
 */
@RestController
@RequestMapping("/api/v1/studentattendancedetailplayschool")
public class StudentAttendanceDetaiPlaySchoolApiController {

    private StudentAttendanceDetailPlaySchoolRepository studentAttendanceDetailPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StudentAttendanceDetailPlaySchool> getStudentAttendanceDetailPlaySchoolDetails() {return studentAttendanceDetailPlaySchoolRepository.findAll();}

    public StudentAttendanceDetaiPlaySchoolApiController(StudentAttendanceDetailPlaySchoolRepository studentAttendanceDetailPlaySchoolRepository)
    {
        this.studentAttendanceDetailPlaySchoolRepository = studentAttendanceDetailPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentAttendanceDetailplayschool(
            @RequestParam(value ="id", required=false) Integer id,
            @RequestParam (value="entrydate", required=false) Date entrydate,
            @RequestParam (value="registernumber", required=false) String registernumber,
            @RequestParam (value="status", required=false) String status


    ) {
        StudentAttendanceDetailPlaySchool ps_student_att_detail = new StudentAttendanceDetailPlaySchool();
        PlaySchoolStudentPersonalInformation ps_student_per_info = new PlaySchoolStudentPersonalInformation(registernumber);

        ps_student_att_detail.setId(id);
        ps_student_att_detail.setEntrydate(entrydate);
        ps_student_att_detail.setRegisternumber(registernumber);
        ps_student_att_detail.setStatus(status);

        studentAttendanceDetailPlaySchoolRepository.save(ps_student_att_detail);

    }

    }
