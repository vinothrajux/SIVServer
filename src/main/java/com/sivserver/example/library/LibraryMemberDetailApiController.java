package com.sivserver.example.library;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * Created by GBCorp on 17/07/2017.
 */
@RestController
@RequestMapping("/api/v1/librarymemberdetail")

public class LibraryMemberDetailApiController extends WebMvcConfigurerAdapter {
    //@Autowired
    private LibraryMemberDetailRepository libraryMemberDetailRepository;

    @GetMapping(value="/all")

    public List<LibraryMemberDetail> getLibraryMemberDetail() {return libraryMemberDetailRepository.findAll();}

    public LibraryMemberDetailApiController(LibraryMemberDetailRepository libraryMemberDetailRepository)
    {
        this.libraryMemberDetailRepository = libraryMemberDetailRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void libmemberdet(
            @RequestParam(value ="memberid", required=false) String memberid,
            @RequestParam(value ="membertype", required=false) String membertype,
            @RequestParam (value="regno", required=false) String regno,
            @RequestParam (value="branchcode", required=false) String branchcode,
            @RequestParam (value="batch", required=false) String batch,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="academicyear", required=false) String academicyear,
            @RequestParam (value="eligiblenoofbooks", required=false) Integer eligiblenoofbooks,
            @RequestParam (value="noofbookstaken", required=false) Integer noofbookstaken,
            @RequestParam (value="loginuser", required=false) String loginuser

    ) {
        LibraryMemberDetail libMemDet = new LibraryMemberDetail();
        StudentBaseInformation student_base_regno = new StudentBaseInformation(regno);
        libMemDet.setMemberid(memberid)
                    .setRegno(regno)
                    .setBranchcode(branchcode)
                    .setBatch(batch)
                    .setSemester(semester)
                    .setAcademicyear(academicyear)
                    .setEligiblenoofbooks(eligiblenoofbooks)
                    .setNoofbookstaken(noofbookstaken)
                    .setLoginuser(loginuser)
                    .setStudent_base_regno(student_base_regno);

        libraryMemberDetailRepository.save(libMemDet);



    }



}
