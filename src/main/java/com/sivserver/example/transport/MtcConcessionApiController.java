package com.sivserver.example.transport;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;


/**
 * Created by Seetha on 17-Jul-17.
 */
@RestController
@RequestMapping("/api/v1/mtcconcession")

public class MtcConcessionApiController  {

    //@Autowired
    private MtcConcessionRepository mtcconcessionRepository;

    @GetMapping(value="/all")

    public List<MtcConcession> getMtcConcessionDetail() {return mtcconcessionRepository.findAll();}

    public MtcConcessionApiController(MtcConcessionRepository mtcconcessionRepository)
    {
        this.mtcconcessionRepository = mtcconcessionRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void mtcconcession(
            @RequestParam(value = "mtcconcessionid", required = false) String mtcconcessionid,
            @RequestParam(value = "regno", required = false) String regno,
            @RequestParam(value = "admissionno", required = false) String admissionno,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "semester", required = false) Integer semester,
            @RequestParam(value = "branchname", required = false) String branchname,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "academicyear", required = false) String academicyear,
            @RequestParam(value = "presentaddress1", required = false) String presentaddress1,
            @RequestParam(value = "presentaddress2", required = false) String presentaddress2,
            @RequestParam(value = "presentmobileno", required = false) String presentmobileno,
            @RequestParam(value = "emailid", required = false) String emailid,
            @RequestParam(value = "route1", required = false) String route1,
            @RequestParam(value = "route2", required = false) String route2,
            @RequestParam(value = "route3", required = false) String route3,
            @RequestParam(value = "loginuser", required = false) String loginuser

            )
    {
        MtcConcession mtcconc = new MtcConcession();
        StudentBaseInformation studentBaseInformation = new StudentBaseInformation(regno);
        mtcconc.setMtcconcessionid(mtcconcessionid);
        mtcconc.setRegno(regno);
        mtcconc.setAdmissionno(admissionno);
        mtcconc.setSemester(semester);
        mtcconc.setBranchname(branchname);
        mtcconc.setBranchcode(branchcode);
        mtcconc.setAcademicyear(academicyear);
        mtcconc.setPresentaddress1(presentaddress1);
        mtcconc.setPresentaddress2(presentaddress2);
        mtcconc.setPresentmobileno(presentmobileno);
        mtcconc.setEmailid(emailid);
        mtcconc.setRoute1(route1);
        mtcconc.setRoute2(route2);
        mtcconc.setRoute3(route3);
        mtcconc.setLoginuser(loginuser);

        mtcconcessionRepository.save(mtcconc);


    }
}


