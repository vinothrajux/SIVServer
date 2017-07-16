package com.sivserver.example.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@RequestMapping("/api/v1/campusrequestdetail")

public class CampusRequestDetailApiController  extends WebMvcConfigurerAdapter {
    @Autowired
    private CampusRequestDetailRepository campusRequestDetailRepository;

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
    public void campRequestDetail(
            @RequestParam(value ="requestid", required=false) String requestid,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="studentcategory", required=false) String studentcategory,
            @RequestParam (value="typeofstudent", required=false) String typeofstudent,
            @RequestParam (value="numberofstudents", required=false) Integer numberofstudents

    ) {
        CampusRequestDetail campReqDetail = new CampusRequestDetail();
        campReqDetail.setRequestid(requestid);
        campReqDetail.setBranchcode(branchcode);
        campReqDetail.setSemester(semester);
        campReqDetail.setStudentcategory(studentcategory);
        campReqDetail.setTypeofstudent(typeofstudent);
        campReqDetail.setNumberofstudents(numberofstudents);



        campusRequestDetailRepository.save(campReqDetail);



    }

}
