package com.sivserver.example.transport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 17-Jul-17.
 */
public class TrainConcessionApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private TrainConcessionRepository trainconcessionRepository;

    @RequestMapping(method = RequestMethod.POST)
    public void trainconcession(
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
            @RequestParam(value = "gender", required = false) String gender,
            @RequestParam(value = "dob", required = false) String dob,
            @RequestParam(value = "certno", required = false) String certno,
            @RequestParam(value = "certdate", required = false) Date certdate,
            @RequestParam(value = "periodfrom", required = false) String periodfrom,
            @RequestParam(value = "periodto", required = false) String periodto,
            @RequestParam(value = "loginuser", required = false) String loginuser


    )
    {
        TrainConcession mtcconc = new TrainConcession();
        mtcconc.setRegno(regno);
        mtcconc.setAdmissionno(admissionno);
        mtcconc.setName(name);
        mtcconc.setSemester(semester);
        mtcconc.setBranchname(branchname);
        mtcconc.setBranchcode(branchcode);
        mtcconc.setAcademicyear(academicyear);
        mtcconc.setPresentaddress1(presentaddress1);
        mtcconc.setPresentaddress2(presentaddress2);
        mtcconc.setPresentmobileno(presentmobileno);
        mtcconc.setEmailid(emailid);
        mtcconc.setGender(gender);
        mtcconc.setDob(dob);
        mtcconc.setCertno(certno);
        mtcconc.setCertdate(certdate);
        mtcconc.setPeriodFrom(periodfrom);
        mtcconc.setPeriodto(periodto);
        mtcconc.setLoginuser(loginuser);


        trainconcessionRepository.save(mtcconc);


    }
}



