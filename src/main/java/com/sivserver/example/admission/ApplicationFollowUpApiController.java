package com.sivserver.example.admission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 30/06/2017.
 */
@RestController
@RequestMapping("/api/v1/applicationfollowup")

public class ApplicationFollowUpApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private ApplicationFollowUpRepository applicationFollowUpRepository;

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
    public void applicationFollowUp(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam (value="enquiryNo", required=false) String enquiryNo,
            @RequestParam (value="applicationno", required=false) String applicationno,
            @RequestParam (value="candidatename", required=false) String candidatename,
            @RequestParam (value="fathername", required=false) String fathername,
            @RequestParam (value="mobileno", required=false) String mobileno,
            @RequestParam (value="alternativeMobileno", required=false) String alternativeMobileno,
            @RequestParam (value="preferredCourse", required=false) String preferredCourse,
            @RequestParam (value="willingness", required=false) String willingness,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        ApplicationFollowUp applfollowup = new ApplicationFollowUp();
        applfollowup.setCurrentdate(currentdate);
        applfollowup.setEnquiryno(enquiryNo);
        applfollowup.setApplicationno(applicationno);
        applfollowup.setCandidatename(candidatename);
        applfollowup.setFathername(fathername);
        applfollowup.setMobileno(mobileno);
        applfollowup.setAlternativemobileno(alternativeMobileno);
        applfollowup.setPreferredcourse(preferredCourse);
        applfollowup.setWillingness(willingness);
        applfollowup.setLoginuser(loginuser);

        applicationFollowUpRepository.save(applfollowup);



    }


}
