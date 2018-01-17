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
            @RequestParam (value="totalpermission", required=false) Integer totalpermission,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StaffAttendanceHeader staffAttHead = new StaffAttendanceHeader();
        staffAttHead.setAttendanceDate(attdate);
        staffAttHead.setAttendanceDay(attendanceDay);
        staffAttHead.setBranchCode(branchcode);
        staffAttHead.setTotalPresent(totalpresent);
        staffAttHead.setTotalAbsent(totalabsent);
        staffAttHead.setTotalpermission(totalpermission);
        staffAttHead.setAcademicyear(academicyear);
        staffAttHead.setLoginUser(loginuser);

        staffAttendanceHeaderRepository.save(staffAttHead);



    }


}
