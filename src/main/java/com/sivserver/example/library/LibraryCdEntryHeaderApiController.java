package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/librarycdentry")

public class LibraryCdEntryHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryCdEntryHeaderRepository libraryCdEntryHeaderRepository;

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
    public void libcdenthead(
            @RequestParam(value ="cdid", required=false) String cdid,
            @RequestParam(value ="cdtype", required=false) String cdtype,
            @RequestParam (value="cdslno", required=false) String cdslno,
            @RequestParam (value="cubboardno", required=false) String cubboardno,
            @RequestParam (value="cdname", required=false) String cdname,
            @RequestParam (value="authorname", required=false) String authorname,
            @RequestParam (value="publishername", required=false) String publishername,
            @RequestParam (value="purchasedfrom", required=false) String purchasedfrom,
            @RequestParam (value="purchaseddate", required=false) Date purchaseddate,
            @RequestParam (value="unitprice", required=false) Long unitprice,
            @RequestParam (value="noofcopies", required=false) Integer noofcopies,
            @RequestParam (value="totalprice", required=false) Long totalprice,
            @RequestParam (value="cdstatus", required=false) String cdstatus,
            @RequestParam (value="academiyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        LibraryCdEntryHeader libCdEntHead = new LibraryCdEntryHeader();
        libCdEntHead.setCdid(cdid);
        libCdEntHead.setCdtype(cdtype);
        libCdEntHead.setCdslno(cdslno);
        libCdEntHead.setCubboardno(cubboardno);
        libCdEntHead.setCdname(cdname);
        libCdEntHead.setAuthorname(authorname);
        libCdEntHead.setPublishername(publishername);
        libCdEntHead.setPurchasedfrom(purchasedfrom);
        libCdEntHead.setPurchaseddate(purchaseddate);
        libCdEntHead.setUnitprice(unitprice);
        libCdEntHead.setNoofcopies(noofcopies);
        libCdEntHead.setTotalprice(totalprice);
        libCdEntHead.setCdstatus(cdstatus);
        libCdEntHead.setAcademicyear(academicyear);
        libCdEntHead.setLoginuser(loginuser);

        libraryCdEntryHeaderRepository.save(libCdEntHead);



    }


}
