package com.sivserver.example.student;



import com.sivserver.example.admission.StudentPersonalInformation;
import com.sivserver.example.admission.StudentPersonalInformationProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;


/**
 * Created by Seetha on 28-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/studentbaseinformation")

public class StudentBaseInformationApiContrtoller {

    //@Autowired
    private StudentBaseInformationRepository studentbaseinformationRepository;

    @GetMapping(value="/all")
    public List<StudentBaseInformation> getStudentBaseInformation() {return studentbaseinformationRepository.findAll();}

    public StudentBaseInformationApiContrtoller(StudentBaseInformationRepository studentbaseinformationRepository)
    {
        this.studentbaseinformationRepository=studentbaseinformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void studentbaseinformation(
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "studentname", required = false) String studentname,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "branch", required = false) String branch,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "batch", required = false) String batch,
            @RequestParam(value = "scheme", required = false) String scheme,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "studenttype", required = false) String studenttype,
            @RequestParam(value = "poto", required = false) String poto,
            @RequestParam(value = "loginuser", required = false) String loginuser

    ) {
        StudentBaseInformation studbaseinfo = new StudentBaseInformation();
        StudentPersonalInformation student_personal_regno = new StudentPersonalInformation(regno);
        studbaseinfo.setRegno(regno)
                    .setAdmissionno(admissionno)
                    .setStudentname(studentname)
                    .setSemester(semester)
                    .setBranch(branch)
                    .setBranchcode(branchcode)
                    .setBatch(batch)
                    .setScheme(scheme)
                    .setAcademicyear(academicyear)
                    .setStudenttype(studenttype)
                    .setPoto(poto)
                    .setLoginuser(loginuser)
                    .setStudent_personal_regno(student_personal_regno);

        studentbaseinformationRepository.save(studbaseinfo);


    }

    @RequestMapping(method = RequestMethod.POST, value="/getStudentBaseInformationDetail")
    public StudentBaseInformationProjection getStudentBaseInformationDetail(@RequestParam (value ="regno") String registerNumber) {
        StudentBaseInformationProjection getStudentBaseInformationDetail = studentbaseinformationRepository.findOneByRegno(registerNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getStudentBaseInformationDetail");
        return getStudentBaseInformationDetail;
    }

}

