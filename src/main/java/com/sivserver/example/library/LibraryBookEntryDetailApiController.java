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
@RequestMapping("/api/v1/librarybookentrydetail")

public class LibraryBookEntryDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryBookEntryDetailRepository libraryBookEntryDetailRepository;

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
    public void libbookentdet(
            @RequestParam(value ="bookid", required=false) String bookid,
            @RequestParam(value ="branchcode", required=false) String branchcode

    ) {
        LibraryBookEntryDetail libbookentdet = new LibraryBookEntryDetail();
        libbookentdet.setBookid(bookid);
        libbookentdet.setBranchcode(branchcode);

        libraryBookEntryDetailRepository.save(libbookentdet);



    }


}
