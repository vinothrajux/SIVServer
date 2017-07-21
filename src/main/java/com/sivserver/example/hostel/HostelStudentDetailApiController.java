package com.sivserver.example.hostel;

import com.sivserver.example.library.LibraryBookEntryDetail;
import com.sivserver.example.library.LibraryBookEntryDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by GBCorp on 18/07/2017.
 */
@RestController
@RequestMapping("/api/v1/hostelstudentdata")

public class HostelStudentDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private HostelStudentDetailRepository hostelStudentDetailRepository;

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
        hoststuddata.setRegno(regno);
        hoststuddata.setBranchcode(branchcode);
        hoststuddata.setBatch(batch);
        hoststuddata.setSemester(semester);
        hoststuddata.setAcademicyear(academicyear);
        hoststuddata.setGuardian1name(guardian1name);
        hoststuddata.setGuardian1address1(guardian1address1);
        hoststuddata.setGuardian1address2(guardian1address2);
        hoststuddata.setGuardian1area(guardian1area);
        hoststuddata.setGuardian1pincode(guardian1pincode);
        hoststuddata.setGuardian1state(guardian1state);
        hoststuddata.setGuardian1mobile(guardian1mobile);
        hoststuddata.setGuardian1altmobile(guardian1altmobile);
        hoststuddata.setGuardian1email(guardian1email);
        hoststuddata.setGuardian1altemail(guardian1altemail);
        hoststuddata.setGuardian2name(guardian2name);
        hoststuddata.setGuardian2address1(guardian2address1);
        hoststuddata.setGuardian2address2(guardian2address2);
        hoststuddata.setGuardian2area(guardian2area);
        hoststuddata.setGuardian2pincode(guardian2pincode);
        hoststuddata.setGuardian2state(guardian2state);
        hoststuddata.setGuardian2mobile(guardian2mobile);
        hoststuddata.setGuardian2altmobile(guardian2altmobile);
        hoststuddata.setGuardian2email(guardian2email);
        hoststuddata.setGuardian2altemail(guardian2altemail);
        hoststuddata.setPrevioushostelexperience(previoushostelexperience);
        hoststuddata.setPrevioushostelname(previoushostelname);
        hoststuddata.setPrevioushosteladdress1(previoushosteladdress1);
        hoststuddata.setPrevioushosteladdress2(previoushosteladdress2);
        hoststuddata.setPrevioushostelarea(previoushostelarea);
        hoststuddata.setPrevioushostelpincode(previoushostelpincode);
        hoststuddata.setPrevioushostelstate(previoushostelstate);
        hoststuddata.setPrevioushostelmobile(previoushostelmobile);
        hoststuddata.setPrevioushostelaltmobile(previoushostelaltmobile);
        hoststuddata.setPrevioushostelemail(previoushostelemail);
        hoststuddata.setPrevioushostelaltemail(previoushostelaltemail);
        hoststuddata.setLoginuser(loginuser);




        hostelStudentDetailRepository.save(hoststuddata);



    }


}
