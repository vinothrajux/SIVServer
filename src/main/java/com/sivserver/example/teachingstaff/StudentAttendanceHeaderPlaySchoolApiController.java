package com.sivserver.example.teachingstaff;

import com.sivserver.example.admission.ApplicationSalePlaySchoolProjection;
import com.sivserver.example.management.Management_Playschool_Fees_Compound_Key;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 03/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentattendanceheaderplayschool")
public class StudentAttendanceHeaderPlaySchoolApiController {

    private StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository;

//    @Autowired
//    private StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository;

    @GetMapping(value="/all")

    public List<StudentAttendanceHeaderPlaySchool> getStudentAttendanceHeaderPlaySchoolDetail() {return studentAttendanceHeaderPlaySchoolRepository.findAll();}

    public StudentAttendanceHeaderPlaySchoolApiController(StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository)
    {
        this.studentAttendanceHeaderPlaySchoolRepository = studentAttendanceHeaderPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentAttendanceHeaderplayschool(
            @RequestParam(value ="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam (value="entryday", required=false) String entryday,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="noofpresent", required=false) Integer noofpresent,
            @RequestParam (value="noofabsent", required=false) Integer noofabsent,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        StudentAttendanceHeaderPlaySchool ps_student_att_head = new StudentAttendanceHeaderPlaySchool();
        Student_Attendance_Play_School_Compound_Key key = new Student_Attendance_Play_School_Compound_Key(entrydate,program,section,academicyear,instituteid);

        ps_student_att_head.setEntryday(entryday);
        ps_student_att_head.setStudentattendanceplayschoolcompoundkey(key);
        ps_student_att_head.setNoofpresent(noofpresent);
        ps_student_att_head.setNoofabsent(noofabsent);
        ps_student_att_head.setLoginuser(loginuser);

        studentAttendanceHeaderPlaySchoolRepository.save(ps_student_att_head);
    }
    //THIS API USED TO CHECK WHETHER THE ATTENDANCE ALREADY ENTERED FOR THAT DAY

    @RequestMapping(method = RequestMethod.POST, value="/getStudentAttendanceHeaderEntryCheckPlaySchoolDetail")
    public StudentAttendanceHeaderEntryCheckPlaySchoolProjection getStudentAttendanceHeaderEntryCheckPlaySchoolDetail(@RequestParam (value ="entrydate") @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
                                                                                                                      @RequestParam (value ="program") String program,
                                                                                                                      @RequestParam (value ="section") String section,
                                                                                                                      @RequestParam (value ="acdemicyear") String acdemicyear,
                                                                                                                      @RequestParam (value ="instituteid") Integer instituteid ) {

        Student_Attendance_Play_School_Compound_Key studattpscompkey = new Student_Attendance_Play_School_Compound_Key(entrydate,program,section,acdemicyear,instituteid);
        StudentAttendanceHeaderEntryCheckPlaySchoolProjection playschoolstudentattendanceentrycheckDetail = studentAttendanceHeaderPlaySchoolRepository.findOneByStudentattendanceplayschoolcompoundkey(studattpscompkey);

        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentAttendanceHeaderEntryCheckPlaySchoolDetail");
        return playschoolstudentattendanceentrycheckDetail;
    }

}
