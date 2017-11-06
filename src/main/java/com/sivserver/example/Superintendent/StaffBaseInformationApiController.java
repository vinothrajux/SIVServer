package com.sivserver.example.Superintendent;

import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 28/09/2017.
 */

@RestController
@RequestMapping("/api/v1/staffbaseinformation")

public class StaffBaseInformationApiController {

    private StaffBaseInformationRepository staffBaseInformationRepository;

    @GetMapping(value="/all")

    public List<StaffBaseInformation> getStaffBaseInformationDetail() {return staffBaseInformationRepository.findAll(); }

    public StaffBaseInformationApiController(StaffBaseInformationRepository staffBaseInformationRepository)
    {
        this.staffBaseInformationRepository = staffBaseInformationRepository;
    }

    @RequestMapping(method = RequestMethod.POST)

    public void staffbaseinformation(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam(value ="staffname", required=false) String staffname,
            @RequestParam (value="dateofjoin", required=false) Date dateofjoin,
            @RequestParam (value="designation", required=false) String designation,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="status", required=false) String status,
            @RequestParam (value="loginuser", required=false) String loginuser
    )
    {
        StaffBaseInformation staffBaseInformation = new StaffBaseInformation();
        StaffPersonalInformation staff_personal_staffid = new StaffPersonalInformation(staffid);
        staffBaseInformation.setStaffid(staffid)
                            .setStaffname(staffname)
                            .setDateofjoin(dateofjoin)
                            .setDesignation(designation)
                            .setBranch(branch)
                            .setBranchcode(branchcode)
                            .setStatus(status)
                            .setLoginuser(loginuser)
                            .setStaff_personal_staffid(staff_personal_staffid);

        staffBaseInformationRepository.save(staffBaseInformation);


    }

}
