package com.sivserver.example.library;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@RequestMapping("/api/v1/libraryusage")

public class LibraryUsageApiController  {
    //@Autowired
    private LibraryUsageRepository libraryUsageRepository;

    @GetMapping(value="/all")

    public List<LibraryUsage> getLibraryUsage() {return libraryUsageRepository.findAll(); }

    public LibraryUsageApiController(LibraryUsageRepository libraryUsageRepository)
    {
        this.libraryUsageRepository = libraryUsageRepository;
    }




    @RequestMapping(method = RequestMethod.POST)
    public void libusage(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="timefrom", required=false) String timefrom,
            @RequestParam (value="timeto", required=false) String timeto,
            @RequestParam (value="purpose", required=false) String purpose,
            @RequestParam (value="remarks", required=false) String remarks,
            @RequestParam (value="loginuser", required=false) String loginuser
    ) {
        LibraryUsage libraryusage = new LibraryUsage();
        StudentBaseInformation libraryUsage_regno = new StudentBaseInformation(regno);
        libraryusage.setCurrentdate(currentdate);
        libraryusage.setMemberid(memberid);
        libraryusage.setBranchcode(branchcode);
        libraryusage.setBatch(batch);
        libraryusage.setSemester(semester);
        libraryusage.setAcademicyear(academicyear);
        libraryusage.setTimefrom(timefrom);
        libraryusage.setTimeto(timeto);
        libraryusage.setPurpose(purpose);
        libraryusage.setRemarks(remarks);
        libraryusage.setLoginuser(loginuser);


        libraryUsageRepository.save(libraryusage);



    }

}
