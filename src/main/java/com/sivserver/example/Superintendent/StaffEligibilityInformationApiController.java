package com.sivserver.example.Superintendent;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 30/09/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/staffeligibilityinformation")

public class StaffEligibilityInformationApiController {

    private StaffEligibilityInformationRepository staffEligibilityInformationRepository;

    @GetMapping(value="/all")
    public List<StaffEligibilityInformation> getStaffEligibilityInformationDetail() {return staffEligibilityInformationRepository.findAll();}

    public StaffEligibilityInformationApiController(StaffEligibilityInformationRepository staffEligibilityInformationRepository)
    {
        this.staffEligibilityInformationRepository = staffEligibilityInformationRepository;

    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffeligibilityinformation(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="staffidcard", required=false) Boolean staffidcard,
            @RequestParam (value="stafflibrarycard", required=false) Boolean stafflibrarycard,
            @RequestParam (value="stafflogbook", required=false) Boolean stafflogbook,
            @RequestParam (value="bankaccountno", required=false) String bankaccountno,
            @RequestParam (value="bankname", required=false) String bankname,
            @RequestParam (value="bankbranch", required=false) String bankbranch,
            @RequestParam (value="bankifsccode", required=false) String bankifsccode,
            @RequestParam (value="eligibleforcl", required=false) String eligibleforcl,
            @RequestParam (value="noofcl", required=false) Integer noofcl,
            @RequestParam (value="noofpl", required=false) Integer noofpl,
            @RequestParam (value="loginuser", required=false) String loginuser
    )
    {
        StaffEligibilityInformation staffEligibilityInformation = new StaffEligibilityInformation();
        StaffPersonalInformation staff_personal_staffid = new StaffPersonalInformation(staffid);
        staffEligibilityInformation.setStaffid(staffid)
                                    .setStaffidcard(staffidcard)
                                    .setStafflibrarycard(stafflibrarycard)
                                    .setStafflogbook(stafflogbook)
                                    .setBankaccountno(bankaccountno)
                                    .setBankname(bankname)
                                    .setBankbranch(bankbranch)
                                    .setBankifsccode(bankifsccode)
                                    .setEligibleforcl(eligibleforcl)
                                    .setNoofcl(noofcl)
                                    .setNoofpl(noofpl)
                                    .setLoginuser(loginuser)
                                    .setStaff_personal_staffid(staff_personal_staffid);

        staffEligibilityInformationRepository.save(staffEligibilityInformation);
    }
}



