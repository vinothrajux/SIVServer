package com.sivserver.example.Superintendent;

import com.sivserver.example.CashCounter.FeesFollowup;
import com.sivserver.example.CashCounter.FeesFollowupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 01-Jul-17.
 */

@RestController
@RequestMapping("/api/v1/scholarship")

public class ScholarshipApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private ScholarshipRepository scholarshipRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void scholarship(
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
        scho.setCurrentDate(currentdate);
        scho.setRegNo(regno);
        scho.setAdmissionNo(admissionno);
        scho.setBranchName(branchname);
        scho.setBranchCode(branchcode);
        scho.setBatch(batch);
        scho.setSemester(semester);
        scho.setAcademicYear(academicyear);
        scho.setName(name);
        scho.setFatherName(fathername);
        scho.setMobileNo(mobileno);
        scho.setCommunity(community);
        scho.setScholarshipAmount(scholarshipamount);
        scho.setAppliedDate(applieddate);
        scho.setStatus(status);
        scho.setScholarshipType(scholarshiptype);
        scho.setSactionedDate(sactioneddate);
        scho.setAccountNo(bankaccountno);
        scho.setBankAccountName(bankaccountname);
        scho.setIFSCCode(ifsccode);
        scho.setBankBranch(bankbranch);
        scho.setLoginUser(loginuser);


        scholarshipRepository.save(scho);



    }
}
