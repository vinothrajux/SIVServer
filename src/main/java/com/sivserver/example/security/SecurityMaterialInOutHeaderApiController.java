package com.sivserver.example.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 03/08/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/securitymaterialinoutheader")

public class SecurityMaterialInOutHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private SecurityMaterialInOutHeaderRepository securityMaterialInOutHeaderRepository;

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
    public void securityMatInOutHead(
            @RequestParam(value ="matgatepassid", required=false) String matgatepassid,
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
        SecurityMaterialInOutHeader secMatPassHead = new SecurityMaterialInOutHeader();
        secMatPassHead.setMatgatepassid(matgatepassid);
        secMatPassHead.setCurrentdate(currentdate);
        secMatPassHead.setVehicleno(vehicleno);
        secMatPassHead.setVehicletype(vehicletype);
        secMatPassHead.setStaffid(staffid);
        secMatPassHead.setName(name);
        secMatPassHead.setAcadyear(academicyear);
        secMatPassHead.setReason(reason);
        secMatPassHead.setTimein(timein);
        secMatPassHead.settimeout(timeout);
        secMatPassHead.setLoginUser(loginuser);
        securityMaterialInOutHeaderRepository.save(secMatPassHead);



    }

}
