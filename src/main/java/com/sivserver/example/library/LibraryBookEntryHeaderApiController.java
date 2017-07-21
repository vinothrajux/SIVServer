package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 17/07/2017.
 */
@RestController
@RequestMapping("/api/v1/librarybookentry")

public class LibraryBookEntryHeaderApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private LibraryBookEntryHeaderRepository libraryBookEntryHeaderRepository;

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
            @RequestParam(value ="bookid", required=false) String bookid,
            @RequestParam(value ="booktype", required=false) String booktype,
            @RequestParam (value="bookslno", required=false) String bookslno,
            @RequestParam (value="cubboardno", required=false) String cubboardno,
            @RequestParam (value="bookname", required=false) String bookname,
            @RequestParam (value="authorname", required=false) String authorname,
            @RequestParam (value="publishername", required=false) String publishername,
            @RequestParam (value="purchasedfrom", required=false) String purchasedfrom,
            @RequestParam (value="purchaseddate", required=false) Date purchaseddate,
            @RequestParam (value="unitprice", required=false) Long unitprice,
            @RequestParam (value="noofcopies", required=false) Integer noofcopies,
            @RequestParam (value="totalprice", required=false) Long totalprice,
            @RequestParam (value="bookstatus", required=false) String bookstatus,
            @RequestParam (value="academiyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        LibraryBookEntryHeader libBookEntHead = new LibraryBookEntryHeader();
        libBookEntHead.setBookid(bookid);
        libBookEntHead.setBooktype(booktype);
        libBookEntHead.setBookslno(bookslno);
        libBookEntHead.setCubboardno(cubboardno);
        libBookEntHead.setBookname(bookname);
        libBookEntHead.setAuthorname(authorname);
        libBookEntHead.setPublishername(publishername);
        libBookEntHead.setPurchasedfrom(purchasedfrom);
        libBookEntHead.setPurchaseddate(purchaseddate);
        libBookEntHead.setUnitprice(unitprice);
        libBookEntHead.setNoofcopies(noofcopies);
        libBookEntHead.setTotalprice(totalprice);
        libBookEntHead.setBookstatus(bookstatus);
        libBookEntHead.setAcademicyear(academicyear);
        libBookEntHead.setLoginuser(loginuser);

        libraryBookEntryHeaderRepository.save(libBookEntHead);



    }


}
