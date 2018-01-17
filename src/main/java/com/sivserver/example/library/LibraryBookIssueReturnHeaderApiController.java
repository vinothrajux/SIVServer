package com.sivserver.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/librarybookissuereturnentry")

public class LibraryBookIssueReturnHeaderApiController {
    //@Autowired
    private LibraryBookIssueReturnHeaderRepository libraryBookIssueReturnHeaderRepository;

    @GetMapping(value="/all")

    public List<LibraryBookIssueReturnHeader> getLibraryBookIssueReturnHeader() {return libraryBookIssueReturnHeaderRepository.findAll();}

    public LibraryBookIssueReturnHeaderApiController(LibraryBookIssueReturnHeaderRepository libraryBookIssueReturnHeaderRepository)
    {
        this.libraryBookIssueReturnHeaderRepository = libraryBookIssueReturnHeaderRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void libbookissrethead(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="loginuser", required=false) String loginuser
               ) {
        LibraryBookIssueReturnHeader libBookIssRetHead = new LibraryBookIssueReturnHeader();
        LibraryMemberDetail LibraryBookIssueReturnHeader_regno = new LibraryMemberDetail(regno);
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
