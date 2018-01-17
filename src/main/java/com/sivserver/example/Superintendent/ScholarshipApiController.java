package com.sivserver.example.Superintendent;

import com.sivserver.example.CashCounter.FeesFollowup;
import com.sivserver.example.CashCounter.FeesFollowupRepository;
import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 01-Jul-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/scholarship")

public class ScholarshipApiController {

    //@Autowired
    private ScholarshipRepository scholarshipRepository;

    @GetMapping(value="/all")

    public List<Scholarship> getScholarship() {return scholarshipRepository.findAll();}

    public ScholarshipApiController(ScholarshipRepository scholarshipRepository)
    {
        this.scholarshipRepository = scholarshipRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void scholarship(
            @RequestParam(value ="scholarshipid", required=false) String scholarshipid,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="branchname", required=false) String branchname,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="fathername", required=false) String fathername,
            @RequestParam (value="mobileno", required=false) Long mobileno,
            @RequestParam (value="community", required=false) String community,
            @RequestParam (value="scholarshipamount", required=false) Long scholarshipamount,
            @RequestParam (value="applieddate", required=false) Date applieddate,
            @RequestParam (value="status", required=false) String status,
            @RequestParam (value="scholarshiptype", required=false) String scholarshiptype,
            @RequestParam (value="sactioneddate", required=false) Date sactioneddate,
            @RequestParam (value="bankaccountno", required=false) String bankaccountno,
            @RequestParam (value="bankaccountname", required=false) String bankaccountname,
            @RequestParam (value="ifsccode", required=false) String ifsccode,
            @RequestParam (value="bankbranch", required=false) String bankbranch,
            @RequestParam (value="loginuser", required=false) String loginuser


    )
    {
        Scholarship scho = new Scholarship();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        scho.setCurrentdate(currentdate);
        scho.setRegno(regno);
        scho.setAdmissionno(admissionno);
        scho.setBranchname(branchname);
        scho.setBranchcode(branchcode);
        scho.setBatch(batch);
        scho.setSemester(semester);
        scho.setAcademicyear(academicyear);
        scho.setName(name);
        scho.setFathername(fathername);
        scho.setMobileno(mobileno);
        scho.setCommunity(community);
        scho.setScholarshipamount(scholarshipamount);
        scho.setApplieddate(applieddate);
        scho.setStatus(status);
        scho.setScholarshiptype(scholarshiptype);
        scho.setSactioneddate(sactioneddate);
        scho.setBankaccountno(bankaccountno);
        scho.setBankaccountname(bankaccountname);
        scho.setIfsccode(ifsccode);
        scho.setBankbranch(bankbranch);
        scho.setLoginuser(loginuser);


        scholarshipRepository.save(scho);



    }
}
