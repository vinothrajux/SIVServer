package com.sivserver.example.Superintendent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/staffattendancedetail")

public class StaffAttendanceDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StaffAttendanceDetailRepository staffAttendanceDetailRepository;


    @RequestMapping(method = RequestMethod.POST)
    public void staffAttDet(
            @RequestParam(value ="attdate", required=false) Date attdate,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="staffid", required=false) String staffid,
            @RequestParam (value="attendancestatus", required=false) String attendancestatus,
            @RequestParam (value="informed", required=false) Boolean informed,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StaffAttendanceDetail staffAttDet = new StaffAttendanceDetail();
        staffAttDet.setAttendanceDate(attdate);
        staffAttDet.setBranchCode(branchcode);
        staffAttDet.setStaffId(staffid);
        staffAttDet.setBranchCode(branchcode);
        staffAttDet.setAttendanceDate(attdate);
        staffAttDet.setInformed(informed);
        staffAttDet.setLoginUser(loginuser);

        staffAttendanceDetailRepository.save(staffAttDet);



    }

}
