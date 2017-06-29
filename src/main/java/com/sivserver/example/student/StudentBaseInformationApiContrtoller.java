package com.sivserver.example.student;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



/**
 * Created by Seetha on 28-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/studentbaseinformation")

public class StudentBaseInformationApiContrtoller extends WebMvcConfigurerAdapter {

    @Autowired
    private StudentBaseInformationRepository studentbaseinformationRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void studentbaseinformation(
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "semester", required = false) String semester,
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
        studbaseinfo.setRegNo(regno);
        studbaseinfo.setAdmissionNo(admissionno);
        studbaseinfo.setStudentName(name);
        studbaseinfo.setSemester(semester);
        studbaseinfo.setBranch(branch);
        studbaseinfo.setBranchcode(branchcode);
        studbaseinfo.setBatch(batch);
        studbaseinfo.setScheme(scheme);
        studbaseinfo.setAcademicYear(academicyear);
        studbaseinfo.setStudentType(studenttype);
        studbaseinfo.setPoto(poto);
        studbaseinfo.setLoginUser(loginuser);

        studentbaseinformationRepository.save(studbaseinfo);


    }
}

