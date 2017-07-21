package com.sivserver.example.Superintendent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@RequestMapping("/api/v1/staffattendanceheader")

public class StaffAttendanceHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StaffAttendanceHeaderRepository staffAttendanceHeaderRepository;


    @RequestMapping(method = RequestMethod.POST)
    public void staffAttHead(
            @RequestParam(value ="attdate", required=false) Date attdate,
            @RequestParam (value="attendanceDay", required=false) String attendanceDay,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="totalpresent", required=false) Integer totalpresent,
            @RequestParam (value="totalabsent", required=false) Integer totalabsent,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StaffAttendanceHeader staffAttHead = new StaffAttendanceHeader();
        staffAttHead.setAttendanceDate(attdate);
        staffAttHead.setAttendanceDay(attendanceDay);
        staffAttHead.setBranchCode(branchcode);
        staffAttHead.setTotalPresent(totalpresent);
        staffAttHead.setTotalAbsent(totalabsent);
        staffAttHead.setLoginUser(loginuser);

        staffAttendanceHeaderRepository.save(staffAttHead);



    }


}
