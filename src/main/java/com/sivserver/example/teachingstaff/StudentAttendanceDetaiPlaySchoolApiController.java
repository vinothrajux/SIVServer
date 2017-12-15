package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.PlaySchoolStudentBaseInformation;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import com.sivserver.example.student.PlaySchoolStudentPersonalInformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.DataFormatException;

/**
 * Created by GBCorp on 03/11/2017.
 */
@RestController
@RequestMapping("/api/v1/studentattendancedetailplayschool")
public class StudentAttendanceDetaiPlaySchoolApiController {

    private StudentAttendanceDetailPlaySchoolRepository studentAttendanceDetailPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private StudentAttendanceHeaderPlaySchoolRepository studentAttendanceHeaderPlaySchoolRepository;

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
            @RequestParam(value ="setattendancedetail", required=false) String setattendancedetail,
            @RequestParam(value ="selectedclassdetail", required=false) String selectedclassdetail
    ){
        System.out.println("entered");
        //System.out.println("selectedclassattendance"+selectedclassdetail.toString());
                String registernumber = "";
                String presentstatus = "";
        Date date = new Date();
        try {

            JSONObject selectedclassdetailObj = new JSONObject(selectedclassdetail);
            String entrydate = selectedclassdetailObj.getString("entrydate");
            String standardstudying = selectedclassdetailObj.getString("standardstudying");
            String section = selectedclassdetailObj.getString("section");
            String academicyear = selectedclassdetailObj.getString("academicyear");
            StudentAttendanceHeaderPlaySchool studentAttendanceHeaderPlaySchool = new StudentAttendanceHeaderPlaySchool();
            Student_Attendance_Play_School_Compound_Key student_attendance_play_school_compound_key = new Student_Attendance_Play_School_Compound_Key();
            //Date entryDate = new Date(entrydate);

//            Integer rowcount = studentAttendanceHeaderPlaySchoolRepository.countALLBySetStudent_attendance_play_school_compound_key(student_attendance_play_school_compound_key);
//            System.out.println("count:"+rowcount);

            JSONArray jsonArrayObj = new JSONArray(setattendancedetail);
            Integer number_of_present=0, number_of_absent=0;
            for (int i=0; i<jsonArrayObj.length(); i++ ){
                JSONObject objectInArray = jsonArrayObj.getJSONObject(i);
                presentstatus = objectInArray.getString("presentstatus");

                if (presentstatus.equals("1")){
                    number_of_present = number_of_present+1;
                } else if (presentstatus.equals("0")){
                    number_of_absent = number_of_absent+1;
                }
            }

            try {
                Date entryDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(entrydate);
                student_attendance_play_school_compound_key.setEntrydate(entryDate);
                student_attendance_play_school_compound_key.setSection(section);
                student_attendance_play_school_compound_key.setProgram(standardstudying);
                student_attendance_play_school_compound_key.setAcdemicyear(academicyear);

                studentAttendanceHeaderPlaySchool.setStudent_attendance_play_school_compound_key(student_attendance_play_school_compound_key);
                studentAttendanceHeaderPlaySchool.setNo_of_absent(number_of_absent);
                studentAttendanceHeaderPlaySchool.setNo_of_present(number_of_present);
                studentAttendanceHeaderPlaySchoolRepository.save(studentAttendanceHeaderPlaySchool);
            }
            catch (ParseException e){
                e.printStackTrace();
            }


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
