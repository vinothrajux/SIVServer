package com.sivserver.example.sports;

import com.sivserver.example.placement.CorporateHeader;
import com.sivserver.example.placement.CorporateHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@RequestMapping("/api/v1/atheleteheader")

public class AtheleteHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private AtheleteHeaderRepository atheleteHeaderRepository;

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
    public void atheletehead(
            @RequestParam(value ="atheleteid", required=false) String atheleteid,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser


    ) {
        AtheleteHeader athleteHead = new AtheleteHeader();
        athleteHead.setAtheleteid (atheleteid);
        athleteHead.setRegno(regno);
        athleteHead.setBranchcode(branchcode);
        athleteHead.setBatch(batch);
        athleteHead.setSemester(semester);
        athleteHead.setAcademicyear(academicyear);
        athleteHead.setLoginuser(loginuser);

        atheleteHeaderRepository.save(athleteHead);



    }


}
