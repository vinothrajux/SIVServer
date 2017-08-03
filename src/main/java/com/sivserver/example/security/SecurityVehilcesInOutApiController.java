package com.sivserver.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by Seetha on 02-Aug-17.
 */
@RestController
@RequestMapping("/api/v1/securityvehiclesinout")

public class SecurityVehilcesInOutApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SecurityVehiclesInOutRepository securityVehiclesInOutRepository;

//    @Autowired
//    private ApplicationSaleRepository applicationSaleRepository;
//
//
//    @RequestMapping(method = RequestMethod.GET, value="/getApplcationDetail")
//    public ApplicationSaleDetailProjection getApplcationDetail(@RequestParam (value ="applno") String applicationNumber) {
//        ApplicationSaleDetailProjection applicationDetail = applicationSaleRepository.findOneByApplno(applicationNumber);
//        //LoginStatusProjection loginUserDetail = userRepository.findOneByUsername(username);
//
//        return applicationDetail;
//
//    }


    @RequestMapping(method = RequestMethod.POST)
    public void securityVehInOut(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="vehicleno", required=false) String vehicleno,
            @RequestParam(value ="vehicletype", required=false) String vehicletype,
            @RequestParam (value="staffid", required=false) String staffid,
            @RequestParam (value="name", required=false) String name,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="reason", required=false) String reason,
            @RequestParam (value="timein", required=false) String timein,
            @RequestParam (value="timeout", required=false) String timeout,
            @RequestParam (value="loginuser", required=false) String loginuser

                ) {
        SecurityVehiclesInOut secVehPass = new SecurityVehiclesInOut();
        secVehPass.setCurrentdate(currentdate);
        secVehPass.setVehicleno(vehicleno);
        secVehPass.setVehicletype(vehicletype);
        secVehPass.setStaffid(staffid);
        secVehPass.setName(name);
        secVehPass.setAcadyear(academicyear);
        secVehPass.setReason(reason);
        secVehPass.setTimein(timein);
        secVehPass.settimeout(timeout);
        secVehPass.setLoginUser(loginuser);
        securityVehiclesInOutRepository.save(secVehPass);



    }

}
