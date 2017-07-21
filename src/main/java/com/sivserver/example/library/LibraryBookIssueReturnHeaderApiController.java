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
@RequestMapping("/api/v1/librarybookissuereturnentry")

public class LibraryBookIssueReturnHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryBookIssueReturnHeaderRepository libraryBookIssueReturnHeaderRepository;

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
    public void libbookissrethead(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser
               ) {
        LibraryBookIssueReturnHeader libBookIssRetHead = new LibraryBookIssueReturnHeader();
        libBookIssRetHead.setCurrentdate(currentdate);
        libBookIssRetHead.setMemberid(memberid);
        libBookIssRetHead.setBranchcode(branchcode);
        libBookIssRetHead.setBatch(batch);
        libBookIssRetHead.setSemester(semester);
        libBookIssRetHead.setAcademicyear(academicyear);
        libBookIssRetHead.setLoginuser(loginuser);


        libraryBookIssueReturnHeaderRepository.save(libBookIssRetHead);



    }

}
