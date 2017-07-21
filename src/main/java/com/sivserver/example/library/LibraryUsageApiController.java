package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@RequestMapping("/api/v1/libraryusage")

public class LibraryUsageApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryUsageRepository libraryUsageRepository;

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
    public void libusage(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="timefrom", required=false) String timefrom,
            @RequestParam (value="timeto", required=false) String timeto,
            @RequestParam (value="purpose", required=false) String purpose,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        LibraryUsage libraryusage = new LibraryUsage();
        libraryusage.setCurrentdate(currentdate);
        libraryusage.setMemberid(memberid);
        libraryusage.setBranchcode(branchcode);
        libraryusage.setBatch(batch);
        libraryusage.setSemester(semester);
        libraryusage.setAcademicyear(academicyear);
        libraryusage.setTimefrom(timefrom);
        libraryusage.setTimeto(timeto);
        libraryusage.setPurpose(purpose);
        libraryusage.setRemarks(remarks);
        libraryusage.setLoginuser(loginuser);


        libraryUsageRepository.save(libraryusage);



    }

}
