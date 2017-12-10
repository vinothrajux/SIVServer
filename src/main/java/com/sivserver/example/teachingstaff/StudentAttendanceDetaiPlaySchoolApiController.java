package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;


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

    @RequestMapping(method = RequestMethod.POST, value="/getStudentListAttendance")
    public Iterable<PlaySchoolStudentBaseInformation> getStudentLists(
            @RequestParam(value ="standardstudying", required=false) String standardstudying,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="studentstatus", required=false) String studentstatus
    ){
        System.out.println("branch:"+standardstudying);
        System.out.println("batch:"+section);
        System.out.println("academicyear:"+academicyear);
        System.out.println("branchcode:"+studentstatus);
//        Iterable<StudentBaseInformation> studentList = studentbaseinformationRepository.findByAcademicyearAndBranchcode(academicyear, branchcode);
            Iterable<PlaySchoolStudentBaseInformation> studentList = playSchoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndStudentstatus(standardstudying, section, academicyear, studentstatus);

        System.out.println("Inside getApplicationDetail");
        return studentList;
    }


    @RequestMapping(method = RequestMethod.POST, value="/setStudentListAttendance")
    public void getStudentLists(
            @RequestParam(value ="setattendancedetail", required=false) String setattendancedetail
    ){
                String registernumber = "";
                String presentstatus = "";
        Date date = new Date();
        try {
            JSONArray jsonArrayObj = new JSONArray(setattendancedetail);
            for (int i=0; i<jsonArrayObj.length(); i++ ){
                JSONObject objectInArray = jsonArrayObj.getJSONObject(i);
                registernumber = objectInArray.getString("registernumber");
                presentstatus = objectInArray.getString("presentstatus");
                System.out.println("setattendancedetail"+i+":"+objectInArray.getString("presentstatus"));
                StudentAttendanceDetailPlaySchool studentAttendanceDetailPlaySchool = new StudentAttendanceDetailPlaySchool();
                //studentAttendanceDetailPlaySchool.setId(i);
                studentAttendanceDetailPlaySchool.setEntrydate(date);
                studentAttendanceDetailPlaySchool.setRegisternumber(registernumber);
                studentAttendanceDetailPlaySchool.setStatus(presentstatus);

                studentAttendanceDetailPlaySchoolRepository.save(studentAttendanceDetailPlaySchool);
            }
        }
        catch (JSONException e){
            e.printStackTrace();
        }


        System.out.println("Test:"+setattendancedetail);

//        Iterable<StudentBaseInformation> studentList = studentbaseinformationRepository.findByAcademicyearAndBranchcode(academicyear, branchcode);
        //Iterable<PlaySchoolStudentBaseInformation> studentList = playSchoolStudentBaseInformationRepository.findAllByStandardstudyingAndSectionAndAcademicyearAndStudentstatus(standardstudying, section, academicyear, studentstatus);

        System.out.println("Inside getApplicationDetail");
        //return studentList;
    }

    }
