package com.sivserver.example.hostel;

import com.sivserver.example.library.LibraryBookEntryDetail;
import com.sivserver.example.library.LibraryBookEntryDetailRepository;
import com.sivserver.example.student.StudentBaseInformation;
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
@RequestMapping("/api/v1/hostelstudentdata")

public class HostelStudentDetailApiController extends WebMvcConfigurerAdapter {
    //@Autowired
    private HostelStudentDetailRepository hostelStudentDetailRepository;

    @GetMapping (value="/all")
    public List<HostelStudentDetail> getHostelStudentDetail() {return  hostelStudentDetailRepository.findAll();}

    public HostelStudentDetailApiController(HostelStudentDetailRepository hostelStudentDetailRepository)
    {
        this.hostelStudentDetailRepository = hostelStudentDetailRepository;
    }
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
    public void hosStudData(
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="admissionno", required=false) String admissionno,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam(value ="batch", required=false) String batch,
            @RequestParam(value ="semester", required=false) Integer semester,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="guardian1name", required=false) String guardian1name,
            @RequestParam(value ="guardian1address1", required=false) String guardian1address1,
            @RequestParam(value ="guardian1address2", required=false) String guardian1address2,
            @RequestParam(value ="guardian1area", required=false) String guardian1area,
            @RequestParam(value ="guardian1pincode", required=false) String guardian1pincode,
            @RequestParam(value ="guardian1state", required=false) String guardian1state,
            @RequestParam(value ="guardian1mobile", required=false) String guardian1mobile,
            @RequestParam(value ="guardian1altmobile", required=false) String guardian1altmobile,
            @RequestParam(value ="guardian1email", required=false) String guardian1email,
            @RequestParam(value ="guardian1altemail", required=false) String guardian1altemail,
            @RequestParam(value ="guardian2name", required=false) String guardian2name,
            @RequestParam(value ="guardian2address1", required=false) String guardian2address1,
            @RequestParam(value ="guardian2address2", required=false) String guardian2address2,
            @RequestParam(value ="guardian2area", required=false) String guardian2area,
            @RequestParam(value ="guardian2pincode", required=false) String guardian2pincode,
            @RequestParam(value ="guardian2state", required=false) String guardian2state,
            @RequestParam(value ="guardian2mobile", required=false) String guardian2mobile,
            @RequestParam(value ="guardian2altmobile", required=false) String guardian2altmobile,
            @RequestParam(value ="guardian2email", required=false) String guardian2email,
            @RequestParam(value ="guardian2altemail", required=false) String guardian2altemail,
            @RequestParam(value ="previoushostelexperience", required=false) String previoushostelexperience,
            @RequestParam(value ="previoushostelname", required=false) String previoushostelname,
            @RequestParam(value ="previoushosteladdress1", required=false) String previoushosteladdress1,
            @RequestParam(value ="previoushosteladdress2", required=false) String previoushosteladdress2,
            @RequestParam(value ="previoushostelarea", required=false) String previoushostelarea,
            @RequestParam(value ="previoushostelpincode", required=false) String previoushostelpincode,
            @RequestParam(value ="previoushostelstate", required=false) String previoushostelstate,
            @RequestParam(value ="previoushostelmobile", required=false) String previoushostelmobile,
            @RequestParam(value ="previoushostelaltmobile", required=false) String previoushostelaltmobile,
            @RequestParam(value ="previoushostelemail", required=false) String previoushostelemail,
            @RequestParam(value ="previoushostelaltemail", required=false) String previoushostelaltemail,
            @RequestParam(value ="loginuser", required=false) String loginuser


    ) {
        HostelStudentDetail hoststuddata = new HostelStudentDetail();
        StudentBaseInformation student_base_regno = new StudentBaseInformation(regno);
        hoststuddata.setRegno(regno)
                    .setBranchcode(branchcode)
                    .setBatch(batch)
                    .setSemester(semester)
                    .setAcademicyear(academicyear)
                    .setGuardian1name(guardian1name)
                    .setGuardian1address1(guardian1address1)
                    .setGuardian1address2(guardian1address2)
                    .setGuardian1area(guardian1area)
                    .setGuardian1pincode(guardian1pincode)
                    .setGuardian1state(guardian1state)
                    .setGuardian1mobile(guardian1mobile)
                    .setGuardian1altmobile(guardian1altmobile)
                    .setGuardian1email(guardian1email)
                    .setGuardian1altemail(guardian1altemail)
                    .setGuardian2name(guardian2name)
                    .setGuardian2address1(guardian2address1)
                    .setGuardian2address2(guardian2address2)
                    .setGuardian2area(guardian2area)
                    .setGuardian2pincode(guardian2pincode)
                    .setGuardian2state(guardian2state)
                    .setGuardian2mobile(guardian2mobile)
                    .setGuardian2altmobile(guardian2altmobile)
                    .setGuardian2email(guardian2email)
                    .setGuardian2altemail(guardian2altemail)
                    .setPrevioushostelexperience(previoushostelexperience)
                    .setPrevioushostelname(previoushostelname)
                    .setPrevioushosteladdress1(previoushosteladdress1)
                    .setPrevioushosteladdress2(previoushosteladdress2)
                    .setPrevioushostelarea(previoushostelarea)
                    .setPrevioushostelpincode(previoushostelpincode)
                    .setPrevioushostelstate(previoushostelstate)
                    .setPrevioushostelmobile(previoushostelmobile)
                    .setPrevioushostelaltmobile(previoushostelaltmobile)
                    .setPrevioushostelemail(previoushostelemail)
                    .setPrevioushostelaltemail(previoushostelaltemail)
                    .setLoginuser(loginuser)
                    .setStudent_base_regno(student_base_regno);





        hostelStudentDetailRepository.save(hoststuddata);



    }


}
