package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by Seetha on 30-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/bonafide")

public class BonafideApiController  {

    //@Autowired
    private BonafideRepository bonafideRepository;

    @RequestMapping(value="/all")
    public List<Bonafide> getStudentBonafideDetail() {return bonafideRepository.findAll();}

    public BonafideApiController(BonafideRepository bonafideRepository)
    {
        this.bonafideRepository=bonafideRepository;
    }

    @Autowired
    private BonafideRepository bonafideRepositoryFetch;

    @RequestMapping(method = RequestMethod.POST)

    public void bonafide(
            @RequestParam(value ="bonafideid", required=false) String bonafideid,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="branchname", required=false) String branchname,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="fathername", required=false) String fathername,
            @RequestParam (value="issueddate", required=false) Date issueddate,
            @RequestParam (value="certificatefor", required=false) String certificatefor,
            @RequestParam (value="noofyears", required=false) Integer noofyears,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        Bonafide bonafid = new Bonafide();
        StudentPersonalInformation student_personal_regno = new StudentPersonalInformation(regno);
        bonafid.setBonafideid(bonafideid);
        bonafid.setRegno(regno);
        bonafid.setAdmissionno(admissionno);
        bonafid.setName(name);
        bonafid.setSemester(semester);
        bonafid.setBranchname(branchname);
        bonafid.setBranchcode(branchcode);
        bonafid.setAcademicyear(academicyear);
        bonafid.setFathername(fathername);
        bonafid.setIssueddate(issueddate);
        bonafid.setCertificatefor(certificatefor);
        bonafid.setNoofyears(noofyears);
        bonafid.setLoginuser(loginuser);

        bonafideRepository.save(bonafid);



    }

    @RequestMapping(method = RequestMethod.POST, value="/getBonafideDetail")
    //@RequestMapping(method = RequestMethod.POST)
    public BonafideProjection getBonafideDetail(@RequestParam (value ="bonafideid") String bonaId) {
        BonafideProjection bonafideDetail = bonafideRepository.findOneByBonafideid(bonaId);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getBonafideDetail");
        return bonafideDetail;

    }


}
