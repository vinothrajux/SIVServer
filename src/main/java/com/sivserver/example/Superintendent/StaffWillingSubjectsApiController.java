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
            @RequestParam (value="nooftimestheorysubject1handled", required=false) Integer nooftimestheorysubject1handled,
            @RequestParam (value="theorysubject2code", required=false) String theorysubject2code,
            @RequestParam (value="nooftimestheorysubject2handled", required=false) Integer nooftimestheorysubject2handled,
            @RequestParam (value="theorysubject3code", required=false) String theorysubject3code,
            @RequestParam (value="nooftimestheorysubject3handled", required=false) Integer nooftimestheorysubject3handled,
            @RequestParam (value="theorysubject4code", required=false) String theorysubject4code,
            @RequestParam (value="nooftimestheorysubject4handled", required=false) Integer nooftimestheorysubject4handled,
            @RequestParam (value="theorysubject5code", required=false) String theorysubject5code,
            @RequestParam (value="nooftimestheorysubject5handled", required=false) Integer nooftimestheorysubject5handled,
            @RequestParam (value="practicalsubject1code", required=false) String practicalsubject1code,
            @RequestParam (value="nooftimespracticalsubject1handled", required=false) Integer nooftimespracticalsubject1handled,
            @RequestParam (value="practicalsubject2code", required=false) String practicalsubject2code,
            @RequestParam (value="nooftimespracticalsubject2handled", required=false) Integer nooftimespracticalsubject2handled,
            @RequestParam (value="practicalsubject3code", required=false) String practicalsubject3code,
            @RequestParam (value="nooftimespracticalsubject3handled", required=false) Integer nooftimespracticalsubject3handled,
            @RequestParam (value="practicalsubject4code", required=false) String practicalsubject4code,
            @RequestParam (value="nooftimespracticalsubject4handled", required=false) Integer nooftimespracticalsubject4handled,
            @RequestParam (value="practicalsubject5code", required=false) String practicalsubject5code,
            @RequestParam (value="nooftimespracticalsubject5handled", required=false) Integer nooftimespracticalsubject5handled,
            @RequestParam (value="loginuser", required=false) String loginuser
    )
    {
        StaffWillingSubjects staffWillingSubjects = new StaffWillingSubjects();
        StaffPersonalInformation staff_personal_staffid = new StaffPersonalInformation(staffid);

        staffWillingSubjects.setStaffid(staffid)
                            .setBranchcode(branchcode)
                            .setTotalteachingexperience(totalteachingexperience)
                            .setTheorysubject1code(theorysubject1code)
                            .setNooftimestheorysubject1handled(nooftimestheorysubject1handled)
                            .setTheorysubject2code(theorysubject2code)
                            .setNooftimestheorysubject2handled(nooftimestheorysubject2handled)
                            .setTheorysubject3code(theorysubject3code)
                            .setNooftimestheorysubject3handled(nooftimestheorysubject3handled)
                            .setTheorysubject4code(theorysubject4code)
                            .setNooftimestheorysubject4handled(nooftimestheorysubject4handled)
                            .setTheorysubject5code(theorysubject5code)
                            .setNooftimestheorysubject5handled(nooftimestheorysubject5handled)
                            .setPracticalsubject1code(practicalsubject1code)
                            .setNooftimespracticalsubject1handled(nooftimespracticalsubject1handled)
                            .setPracticalsubject2code(practicalsubject2code)
                            .setNooftimespracticalsubject2handled(nooftimespracticalsubject2handled)
                            .setPracticalsubject3code(practicalsubject3code)
                            .setNooftimespracticalsubject3handled(nooftimespracticalsubject3handled)
                            .setPracticalsubject4code(practicalsubject4code)
                            .setNooftimespracticalsubject4handled(nooftimespracticalsubject4handled)
                            .setPracticalsubject5code(practicalsubject5code)
                            .setNooftimespracticalsubject5handled(nooftimespracticalsubject5handled)
                            .setLoginuser(loginuser)
                            .setStaff_personal_staffid(staff_personal_staffid);

        staffWillingSubjectsRepository.save(staffWillingSubjects);



    }

}
