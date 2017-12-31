package com.sivserver.example.teachingstaff;

import com.sivserver.example.admission.AdmissionPlaySchoolProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@RequestMapping("/api/v1/studenthomeworkplayschool")
public class StudentHomeWorkPlaySchoolApiController {

    private StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @GetMapping(value="/all")

    public List<StudentHomeWorkPlaySchool> getStudentHomeWorkPlaySchoolDetails() {return studentHomeWorkPlaySchoolRepository.findAll();}

    public StudentHomeWorkPlaySchoolApiController(StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository)
    {
        this.studentHomeWorkPlaySchoolRepository = studentHomeWorkPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentHomeWorkPlaySchool(
            @RequestParam(value ="homeworkid", required=false) String homeworkid,
            @RequestParam (value="entrydate", required=false) Date entrydate,
            @RequestParam (value="entryday", required=false) String entryday,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="subjectcategory", required=false) String subjectcategory,
            @RequestParam (value="homeworkcontent", required=false) String homeworkcontent,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        StudentHomeWorkPlaySchool ps_student_home_work = new StudentHomeWorkPlaySchool();

        ps_student_home_work.setHomeworkid(homeworkid);
        ps_student_home_work.setEntrydate(entrydate);
        ps_student_home_work.setEntryday(entryday);
        ps_student_home_work.setProgram(program);
        ps_student_home_work.setSection(section);
        ps_student_home_work.setAcademicyear(academicyear);
        ps_student_home_work.setSubjectcategory(subjectcategory);
        ps_student_home_work.setHomeworkcontent(homeworkcontent);
        ps_student_home_work.setLoginuser(loginuser);

        studentHomeWorkPlaySchoolRepository.save(ps_student_home_work);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentHomeWorkPlaySchoolDetail")
    public StudentHomeWorkPlaySchoolProjection getStudentHomeWorkPlaySchoolDetail(@RequestParam (value ="homeworkid") String homeworkid) {
        StudentHomeWorkPlaySchoolProjection playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findOneByHomeworkid(homeworkid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        return playschoolstudentHomeWorkDetail;
    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentHomeWorkListPlaySchool")
    public void getStudentHomeWorkListPlaySchool(@RequestParam (value ="registernumber") String registernumber) {

        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumber(registernumber);
        String academicyear=playSchoolStudentBaseInformationProjection.getAcademicyear();
        String program=playSchoolStudentBaseInformationProjection.getStandardstudying();
        String section=playSchoolStudentBaseInformationProjection.getSection();

        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String curDate= year + "-"+month+"-"+day+ " 00:00:00";
        //String curDate= "2017-12-12 00:00:00";
        Date date1;
        try {
            date1=new SimpleDateFormat("MM-dd-yyyy HH:mm:ss").parse(curDate);


        java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;
        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        System.out.println(academicyear);
        System.out.println(program);
        System.out.println(section);
        System.out.println(ts);

        Iterable<StudentHomeWorkPlaySchoolProjection> playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydate(academicyear,program,section,ts);

            System.out.println(playschoolstudentHomeWorkDetail);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
//        return playschoolstudentHomeWorkDetail;
    }
}

