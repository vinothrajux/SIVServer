package com.sivserver.example.teachingstaff;

import com.sivserver.example.student.StudentBaseInformation;
import com.sivserver.example.student.StudentBaseInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 01/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/studentattendance")

public class StudentAttendanceDetailApiController  extends WebMvcConfigurerAdapter {
    @Autowired
    private StudentAttendanceDetailRepository studentAttendanceDetailRepository;

    @Autowired
    private StudentBaseInformationRepository studentbaseinformationRepository;

//    @Autowired
//    private ApplicationSaleRepository applicationSaleRepository;
//
//
//    @RequestMapping(method = RequestMethod.GET, value="/getApplcationDetail")
//    public ApplicationSaleDetailProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
//        ApplicationSaleDetailProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//
//        return applicationDetail;
//
//    }


    @RequestMapping(method = RequestMethod.POST)
    public void studentAttendanceDetail(
            @RequestParam(value ="id", required=false ) Integer id,
            @RequestParam(value ="entrydate", required=false) @DateTimeFormat(pattern="dd/MM/yyyy") Date entrydate,
            @RequestParam (value="hour", required=false) Integer hour,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="status", required=false) String status

    ) {
        StudentAttendanceDetail studAttDet = new StudentAttendanceDetail();
        studAttDet.setId(id);
        studAttDet.setEntrydate(entrydate);
        studAttDet.setHour(hour);
        studAttDet.setRegno(regno);
        studAttDet.setStatus(status);

     //   studentAttendanceDetailRepository.save(studAttDet);



    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentListAttendance")
    public Iterable<StudentBaseInformation> getStudentLists(
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="studenttype", required=false) String studenttype

    ){
        System.out.println("Academicyear:"+academicyear);
        System.out.println("batch:"+batch);
        System.out.println("semester:"+semester);
        System.out.println("branchcode:"+branchcode);
        System.out.println("studenttype:"+studenttype);
//        Iterable<StudentBaseInformation> studentList = studentbaseinformationRepository.findByAcademicyearAndBranchcode(academicyear, branchcode);
        Iterable<StudentBaseInformation> studentList = studentbaseinformationRepository.findAllByAcademicyearAndBatchAndSemesterAndBranchcodeAndStudenttype(academicyear, batch, semester, branchcode, studenttype);

        System.out.println("Inside getApplicationDetail");
        return studentList;
    }

}
