package com.sivserver.example.Superintendent;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by GBCorp on 30/09/2017.
 */
@RestController
@RequestMapping("/api/v1/staffwillingsubjects")

public class StaffWillingSubjectsApiController {

    private StaffWillingSubjectsRepository staffWillingSubjectsRepository;

    @GetMapping(value="/all")

    public List<StaffWillingSubjects> getStaffWillingSubjectsDetail() {return staffWillingSubjectsRepository.findAll();}

    public StaffWillingSubjectsApiController(StaffWillingSubjectsRepository staffWillingSubjectsRepository)
    {
        this.staffWillingSubjectsRepository = staffWillingSubjectsRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffwillingsubjects(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam (value="totalteachingexperience", required=false) Integer totalteachingexperience,
            @RequestParam (value="theorysubject1code", required=false) String theorysubject1code,
            @RequestParam (value="theorysubject2code", required=false) String theorysubject2code,
            @RequestParam (value="theorysubject3code", required=false) String theorysubject3code,
            @RequestParam (value="theorysubject4code", required=false) String theorysubject4code,
            @RequestParam (value="theorysubject5code", required=false) String theorysubject5code,
            @RequestParam (value="practicalsubject1code", required=false) String practicalsubject1code,
            @RequestParam (value="practicalsubject2code", required=false) String practicalsubject2code,
            @RequestParam (value="practicalsubject3code", required=false) String practicalsubject3code,
            @RequestParam (value="practicalsubject4code", required=false) String practicalsubject4code,
            @RequestParam (value="practicalsubject5code", required=false) String practicalsubject5code,
            @RequestParam (value="loginuser", required=false) String loginuser
    )
    {
        StaffWillingSubjects staffWillingSubjects = new StaffWillingSubjects();
        StaffPersonalInformation staff_personal_staffid = new StaffPersonalInformation(staffid);

        staffWillingSubjects.setStaffid(staffid)
                            .setBranchcode(branchcode)
                            .setTotalteachingexperience(totalteachingexperience)
                            .setTheorysubject1code(theorysubject1code)
                            .setTheorysubject2code(theorysubject2code)
                            .setTheorysubject3code(theorysubject3code)
                            .setTheorysubject4code(theorysubject4code)
                            .setTheorysubject5code(theorysubject5code)
                            .setPracticalsubject1code(practicalsubject1code)
                            .setPracticalsubject2code(practicalsubject2code)
                            .setPracticalsubject3code(practicalsubject3code)
                            .setPracticalsubject4code(practicalsubject4code)
                            .setPracticalsubject5code(practicalsubject5code)
                            .setLoginuser(loginuser)
                            .setStaff_personal_staffid(staff_personal_staffid);

        staffWillingSubjectsRepository.save(staffWillingSubjects);



    }

}
