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
@RequestMapping("/api/v1/corporateheader")

public class CorporateHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private CorporateHeaderRepository corporateHeaderRepository;

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
            @RequestParam(value ="corporatename", required=false) String corporatename,
            @RequestParam (value="corporatetype", required=false) String corporatetype,
            @RequestParam (value="hrname", required=false) String hrname,
            @RequestParam (value="hrcontactnumber", required=false) String hrcontactnumber,
            @RequestParam (value="hralternatecontactno", required=false) String hralternatecontactno,
            @RequestParam (value="hrmailid", required=false) String hrmailid,
            @RequestParam (value="hraltmailid", required=false) String hraltmailid,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        CorporateHeader corpHeader = new CorporateHeader();
        corpHeader.setCorporateId(corporateid);
        corpHeader.setCorporateName(corporatename);
        corpHeader.setCoporateType(corporatetype);
        corpHeader.setHRName(hrname);
        corpHeader.setContactNumber(hrcontactnumber);
        corpHeader.setHRAlternateContactNo(hralternatecontactno);
        corpHeader.setHRMailId(hrmailid);
        corpHeader.setHRAltMailId(hraltmailid);
        corpHeader.setLoginUser(loginuser);

        corporateHeaderRepository.save(corpHeader);



    }

}
