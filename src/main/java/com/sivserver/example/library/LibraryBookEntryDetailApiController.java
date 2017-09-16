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
@RequestMapping("/api/v1/librarybookentrydetail")

public class LibraryBookEntryDetailApiController  {
    //@Autowired
    private LibraryBookEntryDetailRepository libraryBookEntryDetailRepository;

    @GetMapping(value="/all")
    public List<LibraryBookEntryDetail> getLibraryBookEntryDetail() {return libraryBookEntryDetailRepository.findAll();}

    public LibraryBookEntryDetailApiController(LibraryBookEntryDetailRepository libraryBookEntryDetailRepository)
    {
        this.libraryBookEntryDetailRepository = libraryBookEntryDetailRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void libbookentdet(

            @RequestParam(value ="slno", required=false) Integer slno,
            @RequestParam(value ="bookid", required=false) String bookid,
            @RequestParam(value ="branchcode", required=false) String branchcode

    ) {
        LibraryBookEntryDetail libbookentdet = new LibraryBookEntryDetail();
        LibraryBookEntryHeader libraryBookEntryDetail_regno = new LibraryBookEntryHeader(bookid);
        libbookentdet.setSlno(slno);
        libbookentdet.setBookid(bookid);
        libbookentdet.setBranchcode(branchcode);

        libraryBookEntryDetailRepository.save(libbookentdet);



    }


}
