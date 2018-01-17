package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 30-Jun-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/firstaidentry")

public class FirstAidEntryApiController {

    //@Autowired
    private FirstAidEntryRepository firstaidRepository;

    @GetMapping(value="/all")
    public List<FirstAidEntry> getStudentFirstAidDetails() {return firstaidRepository.findAll();}

    public FirstAidEntryApiController(FirstAidEntryRepository firstaidRepository)
    {
        this.firstaidRepository = firstaidRepository;
    }


    @RequestMapping(method = RequestMethod.POST)

    public void firstAid(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="firstaidid", required=false) String firstaidid,
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
        StudentPersonalInformation studentpersonalregno = new StudentPersonalInformation(regno);
        FirstAidEntry firstaid = new FirstAidEntry();
        firstaid.setCurrentdate(currentdate);
        firstaid.setFirstaidid(firstaidid);
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

    @RequestMapping(method = RequestMethod.POST, value="/getFirstAidEntryDetail")
    public Iterable<FirstAidEntry> getFirstAidEntryDetail(@RequestParam (value ="regno") String RegisterNumber) {
        Iterable<FirstAidEntry> getfirstaidEntries = firstaidRepository.findAllByregno(RegisterNumber);
        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
        System.out.println("Inside getApplicationDetail");
        return getfirstaidEntries;
    }

}
