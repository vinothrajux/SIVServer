package com.sivserver.example.hod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by Seetha on 30-Jun-17.
 */

@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/staffleaveletterentry")

public class StaffLeaveLetterEntryApiController extends WebMvcConfigurerAdapter {

    @Autowired
    private StaffLeaveLetterEntryRepository staffleaveletterentryRepository;


    @RequestMapping(method = RequestMethod.POST)

    public void staffLeaveLetterEntry(
            @RequestParam(value = "currentdate", required = false) Date currentdate,
            @RequestParam(value = "staffid", required = false) String staffid,
            @RequestParam(value = "staffname", required = false) String staffname,
            @RequestParam(value = "branchname", required = false) String branchname,
            @RequestParam(value = "branchcode", required = false) String branchcode,
            @RequestParam(value = "designation", required = false) String designation,
            @RequestParam(value = "typeofleave", required = false) String typeofleave,
            @RequestParam(value = "noofdays", required = false) Integer noofdays,
            @RequestParam(value = "fromdate", required = false) Date fromdate,
            @RequestParam(value = "todate", required = false) Date todate,
            @RequestParam(value = "reason", required = false) String reason,
            @RequestParam(value = "loginuser", required = false) String loginuser


    ) {
        StaffLeaveLetterEntry staffleaveent = new StaffLeaveLetterEntry();

        staffleaveent.setCurrentDate(currentdate);
        staffleaveent.setStaffID(staffid);
        staffleaveent.setStaffName(staffname);
        staffleaveent.setBranchName(branchname);
        staffleaveent.setBranchCode(branchcode);
        staffleaveent.setDesignation(designation);
        staffleaveent.setTypeOfLeave(typeofleave);
        staffleaveent.setNoOfDays(noofdays);
        staffleaveent.setFromDate(fromdate);
        staffleaveent.setToDate(todate);
        staffleaveent.setReason(reason);
        staffleaveent.setLoginUser(loginuser);


        staffleaveletterentryRepository.save(staffleaveent);
    }
}
