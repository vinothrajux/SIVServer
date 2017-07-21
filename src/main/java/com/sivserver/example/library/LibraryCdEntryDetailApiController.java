package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@RequestMapping("/api/v1/librarycdentrydetail")

public class LibraryCdEntryDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryCdEntryDetailRepository libraryCdEntryDetailRepository;

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
    public void libcdentdet(
            @RequestParam(value ="cdid", required=false) String cdid,
            @RequestParam(value ="branchcode", required=false) String branchcode

    ) {
        LibraryCdEntryDetail libcdentdet = new LibraryCdEntryDetail();
        libcdentdet.setCdid(cdid);
        libcdentdet.setBranchcode(branchcode);

        libraryCdEntryDetailRepository.save(libcdentdet);



    }



}
