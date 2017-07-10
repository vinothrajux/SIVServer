package com.sivserver.example.placement;

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
@RequestMapping("/api/v1/campusrequestheader")

public class CampusRequestHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private CampusRequestHeaderRepository campusRequestHeaderRepository;

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
    public void campRequestHead(
            @RequestParam(value ="entrydate", required=false) Date entrydate,
            @RequestParam(value ="requestId", required=false) String requestId,
            @RequestParam (value="corporateid", required=false) String corporateid,
            @RequestParam (value="requestType", required=false) String requestType,
            @RequestParam (value="campusreqfromDate", required=false) Date campusreqfromDate,
            @RequestParam (value="campusreqtoDate", required=false) Date campusreqtoDate,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="followupdate", required=false) Date followupdate,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        CampusRequestHeader campReqHeader = new CampusRequestHeader();
        campReqHeader.setEntryDate(entrydate);
        campReqHeader.setRequestId(requestId);
        campReqHeader.setCorporateId(corporateid);
        campReqHeader.setRequestType(requestType);
        campReqHeader.setCampusReqFromDate(campusreqfromDate);
        campReqHeader.setCampusReqToDate(campusreqtoDate);
        campReqHeader.setAcademicYear(academicyear);
        campReqHeader.setRemarks(remarks);
        campReqHeader.setFollowUpDate(followupdate);
        campReqHeader.setLoginUser(loginuser);


        campusRequestHeaderRepository.save(campReqHeader);



    }

}
