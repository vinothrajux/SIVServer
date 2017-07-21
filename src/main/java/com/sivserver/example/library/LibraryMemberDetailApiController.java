package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 17/07/2017.
 */
@RestController
@RequestMapping("/api/v1/librarymemberdetail")

public class LibraryMemberDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryMemberDetailRepository libraryMemberDetailRepository;

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
    public void libmemberdet(
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam(value ="membertype", required=false) String membertype,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="eligiblenoofbooks", required=false) Integer eligiblenoofbooks,
            @RequestParam (value="noofbookstaken", required=false) Integer noofbookstaken,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        LibraryMemberDetail libMemDet = new LibraryMemberDetail();
        libMemDet.setMemberid(memberid);
        libMemDet.setMembertype(membertype);
        libMemDet.setRegno(regno);
        libMemDet.setBranchCode(branchcode);
        libMemDet.setBatch(batch);
        libMemDet.setSemester(semester);
        libMemDet.setAcadyear(academicyear);
        libMemDet.setEligiblenoofbooks(eligiblenoofbooks);
        libMemDet.setNoofbookstaken(noofbookstaken);
        libMemDet.setLoginuser(loginuser);

        libraryMemberDetailRepository.save(libMemDet);



    }



}
