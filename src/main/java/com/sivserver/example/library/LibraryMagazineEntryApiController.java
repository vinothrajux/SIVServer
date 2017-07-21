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
@RequestMapping("/api/v1/librarymagazineentry")

public class LibraryMagazineEntryApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryMagazineEntryRepository libraryMagazineEntryRepository;

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
    public void libmagentry(
            @RequestParam(value ="magazineid", required=false) String magazineid,
            @RequestParam(value ="magazinetype", required=false) String magazinetype,
            @RequestParam (value="magazineslno", required=false) String magazineslno,
            @RequestParam (value="cubboardno", required=false) String cubboardno,
            @RequestParam (value="magazinename", required=false) String magazinename,
            @RequestParam (value="authorname", required=false) String authorname,
            @RequestParam (value="publishername", required=false) String publishername,
            @RequestParam (value="purchasedfrom", required=false) String purchasedfrom,
            @RequestParam (value="purchaseddate", required=false) Date purchaseddate,
            @RequestParam (value="unitprice", required=false) Long unitprice,
            @RequestParam (value="noofcopies", required=false) Integer noofcopies,
            @RequestParam (value="totalprice", required=false) Long totalprice,
            @RequestParam (value="magazinestatus", required=false) String magazinestatus,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        LibraryMagazineEntry libMagEntry = new LibraryMagazineEntry();
        libMagEntry.setMagazineid(magazineid);
        libMagEntry.setMagazinetype(magazinetype);
        libMagEntry.setMagazineslno(magazineslno);
        libMagEntry.setCubboardno(cubboardno);
        libMagEntry.setMagazinename(magazinename);
        libMagEntry.setAuthorname(authorname);
        libMagEntry.setPublishername(publishername);
        libMagEntry.setPurchasedfrom(purchasedfrom);
        libMagEntry.setPurchaseddate(purchaseddate);
        libMagEntry.setUnitprice(unitprice);
        libMagEntry.setNoofcopies(noofcopies);
        libMagEntry.setTotalprice(totalprice);
        libMagEntry.setMagazinestatus(magazinestatus);
        libMagEntry.setAcademicyear(academicyear);
        libMagEntry.setLoginuser(loginuser);

        libraryMagazineEntryRepository.save(libMagEntry);



    }

}
