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
@RequestMapping("/api/v1/securitymaterialinoutdetail")

public class SecurityMaterialInOutDetailApiController  extends WebMvcConfigurerAdapter {
    @Autowired
    private SecurityMaterialInOutDetailRepository securityMaterialInOutDetailRepository;

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
    public void securityMatInOutDet(
            @RequestParam(value ="matgatepassid", required=false) String matgatepassid,
            @RequestParam(value ="materialcode", required=false) String materialcode,
            @RequestParam(value ="materialname", required=false) String materialname,
            @RequestParam(value ="materialcondition", required=false) String materialcondition,
            @RequestParam (value="noofitems", required=false) Integer noofitems

    ) {
        SecurityMaterialInOutDetail secMatPassDet = new SecurityMaterialInOutDetail();
        secMatPassDet.setMatgatepassid(matgatepassid);
        secMatPassDet.setMaterialcode(materialcode);
        secMatPassDet.setMaterialname(materialname);
        secMatPassDet.setMaterialcondition(materialcondition);
        secMatPassDet.setNoofitems(noofitems);

        securityMaterialInOutDetailRepository.save(secMatPassDet);



    }

}
