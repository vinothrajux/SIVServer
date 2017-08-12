package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
@RestController
@RequestMapping("/api/v1/studentcollegeid")

/**
 * Created by GBCorp on 30/06/2017.
 */
public class StudentCollegeIdApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private StudentCollegeIdRepository studentCollegeIdRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void studemtCollegeId(
            @RequestParam(value="regno", required=false) String regno,
            @RequestParam(value ="admissionno", required=false) String admissionno,
            @RequestParam (value="candidatename", required=false) String candidatename,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="Batch", required=false) String Batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="idissueddate", required=false) Date idissueddate,
            @RequestParam (value="idcardno", required=false) String idcardno,
            @RequestParam (value="idtype", required=false) String idtype,
            @RequestParam (value="idstatus", required=false) String idstatus,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StudentCollegeId studemtCollegeId = new StudentCollegeId();
        studemtCollegeId.setRegno(regno);
        studemtCollegeId.setAdmissionno(admissionno);
        studemtCollegeId.setCandidatename(candidatename);
        studemtCollegeId.setBranch(branch);
        studemtCollegeId.setBranchcode(branchcode);
        studemtCollegeId.setBatch(Batch);
        studemtCollegeId.setSemester(semester);
        studemtCollegeId.setAcademicyear(academicYear);
        studemtCollegeId.setIdissuedate(idissueddate);
        studemtCollegeId.setidcardno(idcardno);
        studemtCollegeId.setIdtype(idtype);
        studemtCollegeId.setIdstatus(idstatus);
        studemtCollegeId.setLoginuser(loginuser);

        studentCollegeIdRepository.save(studemtCollegeId);



    }
}

