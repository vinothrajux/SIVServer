package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@RequestMapping("/api/v1/librarybookissuereturnentrydetail")

public class LibraryBookIssueReturnDetailApiController extends WebMvcConfigurerAdapter {
    //@Autowired
    private LibraryBookIssueReturnDetailRepository libraryBookIssueReturnDetailRepository;

    @GetMapping(value="/all")

    public List<LibraryBookIssueReturnDetail> getLibraryBookIssueReturnDetail() {return libraryBookIssueReturnDetailRepository.findAll(); }

    public LibraryBookIssueReturnDetailApiController(LibraryBookIssueReturnDetailRepository libraryBookIssueReturnDetailRepository)
    {
        this.libraryBookIssueReturnDetailRepository = libraryBookIssueReturnDetailRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void libbookissretdet(
            @RequestParam(value ="slno", required=false) Integer slno,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam (value="bookid", required=false) String bookid,
            @RequestParam (value="bookslno", required=false) String bookslno,
            @RequestParam (value="possiblereturndate", required=false) Date possiblereturndate,
            @RequestParam (value="currentstatus", required=false) String currentstatus,
            @RequestParam (value="fineamount", required=false) Long fineamount
    ) {
        LibraryBookIssueReturnDetail libBookIssRetDet = new LibraryBookIssueReturnDetail();
        LibraryBookIssueReturnHeader LibraryBookIssueReturnDetail_regno = new LibraryBookIssueReturnHeader(regno);
        libBookIssRetDet.setSlno(slno);
        libBookIssRetDet.setCurrentdate(currentdate);
        libBookIssRetDet.setRegno(regno);
        libBookIssRetDet.setMemberid(memberid);
        libBookIssRetDet.setBookid(bookid);
        libBookIssRetDet.setBookslno(bookslno);
        libBookIssRetDet.setPossiblereturndate(possiblereturndate);
        libBookIssRetDet.setCurrentstatus(currentstatus);
        libBookIssRetDet.setFineamount(fineamount);


        libraryBookIssueReturnDetailRepository.save(libBookIssRetDet);



    }

}

