package com.sivserver.example.teachingstaff;

import com.sivserver.example.admission.AdmissionPlaySchoolProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationProjection;
import com.sivserver.example.student.PlaySchoolStudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/11/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studenthomeworkplayschool")
public class StudentHomeWorkPlaySchoolApiController {

    private StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository;

    @Autowired
    private PlaySchoolStudentBaseInformationRepository playSchoolStudentBaseInformationRepository;

    @Autowired
    private PlaySchoolHomeWorkIdGenerateRepository playSchoolHomeWorkIdGenerateRepository;

    @GetMapping(value="/all")

    public List<StudentHomeWorkPlaySchool> getStudentHomeWorkPlaySchoolDetails() {return studentHomeWorkPlaySchoolRepository.findAll();}

    public StudentHomeWorkPlaySchoolApiController(StudentHomeWorkPlaySchoolRepository studentHomeWorkPlaySchoolRepository)
    {
        this.studentHomeWorkPlaySchoolRepository = studentHomeWorkPlaySchoolRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void studentHomeWorkPlaySchool(
            @RequestParam(value ="homeworkid", required=false) String homeworkid,
            @RequestParam (value="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam (value="entryday", required=false) String entryday,
            @RequestParam (value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="subjectcategory", required=false) String subjectcategory,
            @RequestParam (value="homeworkcontent", required=false) String homeworkcontent,
            @RequestParam (value="loginuser", required=false) String loginuser,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="idno", required=false) Integer idno,
            @RequestParam (value="hwid", required=false) Integer hwid

    ) {
        StudentHomeWorkPlaySchool ps_student_home_work = new StudentHomeWorkPlaySchool();
        PlaySchoolHomeWorkIdGenerate pshomeworidgenerate = new PlaySchoolHomeWorkIdGenerate();

        ps_student_home_work.setHomeworkid(homeworkid);
        ps_student_home_work.setEntrydate(entrydate);
        ps_student_home_work.setEntryday(entryday);
        ps_student_home_work.setProgram(program);
        ps_student_home_work.setSection(section);
        ps_student_home_work.setAcademicyear(academicyear);
        ps_student_home_work.setSubjectcategory(subjectcategory);
        ps_student_home_work.setHomeworkcontent(homeworkcontent);
        ps_student_home_work.setLoginuser(loginuser);
        ps_student_home_work.setInstituteid(instituteid);

        studentHomeWorkPlaySchoolRepository.save(ps_student_home_work);

        pshomeworidgenerate.setIdno(idno);
        pshomeworidgenerate.setHwid(hwid);

        playSchoolHomeWorkIdGenerateRepository.save(pshomeworidgenerate);
    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentHomeWorkPlaySchoolDetail")
    public StudentHomeWorkPlaySchoolProjection getStudentHomeWorkPlaySchoolDetail(@RequestParam (value ="homeworkid") String homeworkid) {
        StudentHomeWorkPlaySchoolProjection playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findOneByHomeworkid(homeworkid);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        return playschoolstudentHomeWorkDetail;
    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentHomeWorkListPlaySchool")
    public Iterable<StudentHomeWorkPlaySchoolProjection> getStudentHomeWorkListPlaySchool(@RequestParam (value ="registernumber") String registernumber, @RequestParam (value ="hwdate", required = false) @DateTimeFormat(pattern="dd/MM/yyyy") Date hwdate, @RequestParam (value ="currentdatestatus") Boolean currentdatestatus, @RequestParam (value = "instituteid") Integer instituteid) {


        PlaySchoolStudentBaseInformationProjection playSchoolStudentBaseInformationProjection = playSchoolStudentBaseInformationRepository.findOneByRegisternumberAndInstituteid(registernumber, instituteid);
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
        Iterable<StudentHomeWorkPlaySchoolProjection> playschoolstudentHomeWorkDetail = null;
        try {
            date1=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(curDate);


        java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;
        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        System.out.println(academicyear);
        System.out.println(program);
        System.out.println(section);
        System.out.println(ts);
        if(currentdatestatus){
            playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydateAndInstituteid(academicyear,program,section,ts, instituteid);
        }else{
            playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydateAndInstituteid(academicyear,program,section,hwdate, instituteid);
        }
//        playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydate(academicyear,program,section,ts);

            System.out.println(playschoolstudentHomeWorkDetail);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        return playschoolstudentHomeWorkDetail;
    }

    @RequestMapping(method = RequestMethod.POST, value="/homeworKlist")
    public Iterable<StudentHomeWorkPlaySchool> studentHomeWorkDetail(

            @RequestParam (value="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam(value="program", required=false) String program,
            @RequestParam (value="section", required=false) String section,
            @RequestParam (value="instituteid", required=false) Integer instituteid,
            @RequestParam (value="currentdatestatus", required=false) Boolean currentdatestatus

    ) {
        System.out.println("entrydate" + entrydate);
        System.out.println("program" + program);
        System.out.println("section" + section);
        System.out.println("instiuteid" + instituteid);

        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();
        String curDate= year + "-"+month+"-"+day+ " 00:00:00";
        Date date1;

        Iterable<StudentHomeWorkPlaySchool> playschoolstudentHomeWorkDetail = null;
        try {
            date1=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(curDate);


            java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;
            System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
            //System.out.println(academicyear);
            System.out.println(program);
            System.out.println(section);
            System.out.println(ts);
            if(currentdatestatus){
                playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByEntrydateAndProgramAndSectionAndInstituteid(ts,program,section,instituteid);
            }else{
                playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByEntrydateAndProgramAndSectionAndInstituteid(entrydate,program,section,instituteid);
            }
//        playschoolstudentHomeWorkDetail = studentHomeWorkPlaySchoolRepository.findAllByAcademicyearAndProgramAndSectionAndEntrydate(academicyear,program,section,ts);

            System.out.println(playschoolstudentHomeWorkDetail);
        } catch (ParseException e) {
            e.printStackTrace();
        }
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//        System.out.println("Inside getStudentHomeWorkPlaySchoolDetail");
        return playschoolstudentHomeWorkDetail;
    }



//        java.sql.Timestamp ts = java.sql.Timestamp.valueOf( curDate ) ;
//
//        Iterable<StudentHomeWorkPlaySchool> studentList = studentHomeWorkPlaySchoolRepository.findAllByEntrydateAndProgramAndSectionAndInstituteid(ts,program,section,instituteid);
//        return studentList;
//    }

}

