package com.sivserver.example.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 07/07/2017.
 */
@RestController
@RequestMapping("/api/v1/corporatedetail")

public class CorporateDetailApiController  extends WebMvcConfigurerAdapter {
    @Autowired
    private CorporateDetailRepository corporateDetailRepository;

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
    public void corphead(
            @RequestParam(value ="corporateid", required=false) String corporateid,
            @RequestParam(value ="requiredBranchCode", required=false) String requiredBranchCode,
            @RequestParam (value="requiredStudentCategory", required=false) String requiredStudentCategory


    ) {
        CorporateDetail corpDet = new CorporateDetail();
        corpDet.setCorporateid(corporateid);
        corpDet.setRequiredbranchcode(requiredBranchCode);
        corpDet.setRequiredstudentcategory(requiredStudentCategory);


        corporateDetailRepository.save(corpDet);



    }

}
