package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 30-Jun-17.
 */

@RestController
@RequestMapping("/api/v1/firstaidentry")

public class FirstAidEntryApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private FirstAidEntryRepository firstaidRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void firstAid(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="admissionno", required=false) String admissionno,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="branchname", required=false) String branchname,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) String semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="reasonforfirstaid", required=false) String reasonforfirstaid,
            @RequestParam (value="firstaiddetails", required=false) String firstaiddetails,
            @RequestParam (value="hospitalname", required=false) String hospitalname,
            @RequestParam (value="hospitalfees", required=false) Long hospitalfees,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        FirstAidEntry firstaid = new FirstAidEntry();
        firstaid.setCurrentdate(currentdate);
        firstaid.setRegNo(regno);
        firstaid.setAdmissionno(admissionno);
        firstaid.setName(name);
        firstaid.setBranchname(branchname);
        firstaid.setBranchcode(branchcode);
        firstaid.setBatch(batch);
        firstaid.setSemester(semester);
        firstaid.setAcademicyear(academicyear);
        firstaid.setReasonforfirstaid(reasonforfirstaid);
        firstaid.setFirstaiddetails(firstaiddetails);
        firstaid.setHospitalname(hospitalname);
        firstaid.setHospitalfees(hospitalfees);
        firstaid.setRemarks(remarks);
        firstaid.setLoginuser(loginuser);

        firstaidRepository.save(firstaid);



    }

}
