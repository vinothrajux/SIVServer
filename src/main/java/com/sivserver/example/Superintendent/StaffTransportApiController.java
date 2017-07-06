package com.sivserver.example.Superintendent;

import com.sivserver.example.transport.StudentTransport;
import com.sivserver.example.transport.StudentTransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Seetha on 01-Jul-17.
 */

@RestController
@RequestMapping("/api/v1/stafftransport")

public class StaffTransportApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private StaffTransportRepository staffTransportRepository;


    @RequestMapping(method = RequestMethod.POST)
    public void studentTransport(
            @RequestParam(value ="staffid", required=false) String staffid,
            @RequestParam (value="staffname", required=false) String staffname,
            @RequestParam (value="branch", required=false) String branch,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="academicYear", required=false) String academicYear,
            @RequestParam (value="designation", required=false) String designation,
            @RequestParam (value="transportmode", required=false) String transportmode,
            @RequestParam (value="route", required=false)String route,
            @RequestParam(value ="routeno", required=false) String routeno,
            @RequestParam (value="stage", required=false) String stage,
            @RequestParam (value="facility", required=false) String facility,
            @RequestParam (value="amount", required=false) Long amount,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        StaffTransport stafftrans = new StaffTransport();
        stafftrans.setStaffID(staffid);
        stafftrans.setStaffName(staffname);
        stafftrans.setBranch(branch);
        stafftrans.setBranchCode(branchcode);
        stafftrans.setAcadYear(academicYear);
        stafftrans.setDesignation(designation);
        stafftrans.setTransportMode(transportmode);
        stafftrans.setRoute(route);
        stafftrans.setRouteNo(routeno);
        stafftrans.setStage(stage);
        stafftrans.setFacility(facility);
        stafftrans.setAmount(amount);
        stafftrans.setLoginUser(loginuser);



        staffTransportRepository.save(stafftrans);



    }
}
