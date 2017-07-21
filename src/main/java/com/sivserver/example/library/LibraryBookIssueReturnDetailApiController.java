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
@RequestMapping("/api/v1/librarybookissuereturnentrydetail")

public class LibraryBookIssueReturnDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryBookIssueReturnDetailRepository libraryBookIssueReturnDetailRepository;

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
    public void libbookissretdet(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam (value="bookid", required=false) String bookid,
            @RequestParam (value="bookslno", required=false) String bookslno,
            @RequestParam (value="possiblereturndate", required=false) Date possiblereturndate,
            @RequestParam (value="currentstatus", required=false) String currentstatus,
            @RequestParam (value="fineamount", required=false) Long fineamount
    ) {
        LibraryBookIssueReturnDetail libBookIssRetDet = new LibraryBookIssueReturnDetail();
        libBookIssRetDet.setCurrentdate(currentdate);
        libBookIssRetDet.setMemberid(memberid);
        libBookIssRetDet.setBookid(bookid);
        libBookIssRetDet.setBookslno(bookslno);
        libBookIssRetDet.setPossiblereturndate(possiblereturndate);
        libBookIssRetDet.setCurrentstatus(currentstatus);
        libBookIssRetDet.setFineamount(fineamount);


        libraryBookIssueReturnDetailRepository.save(libBookIssRetDet);



    }

}

