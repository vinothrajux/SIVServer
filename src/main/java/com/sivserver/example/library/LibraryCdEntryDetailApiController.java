package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/librarycdentrydetail")

public class LibraryCdEntryDetailApiController  {
    //@Autowired
    private LibraryCdEntryDetailRepository libraryCdEntryDetailRepository;

    @GetMapping("value=/all")
    public List<LibraryCdEntryDetail> getLibraryCdEntryDetail() {return libraryCdEntryDetailRepository.findAll();}

    public LibraryCdEntryDetailApiController(LibraryCdEntryDetailRepository libraryCdEntryDetailRepository)
    {
        this.libraryCdEntryDetailRepository = libraryCdEntryDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void libcdentdet(
            @RequestParam(value ="cdid", required=false) Integer slno,
            @RequestParam(value ="cdid", required=false) String cdid,
            @RequestParam(value ="branchcode", required=false) String branchcode

    ) {
        LibraryCdEntryDetail libcdentdet = new LibraryCdEntryDetail();
        LibraryCdEntryHeader libraryCdEntryDetail_regno = new LibraryCdEntryHeader(cdid);
        libcdentdet.setSlno(slno);
        libcdentdet.setCdid(cdid);
        libcdentdet.setBranchcode(branchcode);

        libraryCdEntryDetailRepository.save(libcdentdet);



    }



}
