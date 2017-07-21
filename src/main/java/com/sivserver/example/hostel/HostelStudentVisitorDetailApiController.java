package com.sivserver.example.hostel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;

/**
 * Created by GBCorp on 19/07/2017.
 */
@RestController
@RequestMapping("/api/v1/hostelstudentvisitor")

public class HostelStudentVisitorDetailApiController extends WebMvcConfigurerAdapter {
    @Autowired
    private HostelStudentVisitorDetailRepository hostelStudentVisitorDetailRepository;

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
    public void hosStudVisitDet(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam(value ="batch", required=false) String batch,
            @RequestParam(value ="semester", required=false) Integer semester,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="visitortype", required=false) String visitortype,
            @RequestParam(value ="visitorname", required=false) String visitorname,
            @RequestParam(value ="visitorgender", required=false) String visitorgender,
            @RequestParam(value ="visitoraddress1", required=false) String visitoraddress1,
            @RequestParam(value ="visitoraddress2", required=false) String visitoraddress2,
            @RequestParam(value ="visitorarea", required=false) String visitorarea,
            @RequestParam(value ="visitorpincode", required=false) String visitorpincode,
            @RequestParam(value ="visitorstate", required=false) String visitorstate,
            @RequestParam(value ="visitormobilenumber", required=false) String visitormobilenumber,
            @RequestParam(value ="visitoraltmobilenumber", required=false) String visitoraltmobilenumber,
            @RequestParam(value ="visitoremail", required=false) String visitoremail,
            @RequestParam(value ="noofvisitorcompanion", required=false) Integer noofvisitorcompanion,
            @RequestParam(value ="visitorrelationship", required=false) String visitorrelationship,
            @RequestParam(value ="visitorintime", required=false) String visitorintime,
            @RequestParam(value ="visitorouttime", required=false) String visitorouttime,
            @RequestParam(value ="remarks", required=false) String remarks,
            @RequestParam(value ="loginuser", required=false) String loginuser



    ) {
        HostelStudentVisitorDetail hoststudvisitdet = new HostelStudentVisitorDetail();
        hoststudvisitdet.setCurrentdate(currentdate);
        hoststudvisitdet.setRegno(regno);
        hoststudvisitdet.setBranchcode(branchcode);
        hoststudvisitdet.setBatch(batch);
        hoststudvisitdet.setSemester(semester);
        hoststudvisitdet.setAcademicyear(academicyear);
        hoststudvisitdet.setVisitortype(visitortype);
        hoststudvisitdet.setVisitorname(visitorname);
        hoststudvisitdet.setVisitorgender(visitorgender);
        hoststudvisitdet.setVisitoraddress1(visitoraddress1);
        hoststudvisitdet.setVisitoraddress2(visitoraddress2);
        hoststudvisitdet.setVisitorarea(visitorarea);
        hoststudvisitdet.setVisitorpincode(visitorpincode);
        hoststudvisitdet.setVisitorstate(visitorstate);
        hoststudvisitdet.setVisitormobilenumber(visitormobilenumber);
        hoststudvisitdet.setVisitoraltmobilenumber(visitoraltmobilenumber);
        hoststudvisitdet.setVisitoremail(visitoremail);
        hoststudvisitdet.setNoofvisitorcompanion(noofvisitorcompanion);
        hoststudvisitdet.setVisitorrelationship(visitorrelationship);
        hoststudvisitdet.setVisitorintime(visitorintime);
        hoststudvisitdet.setVisitorouttime(visitorouttime);
        hoststudvisitdet.setRemarks(remarks);
        hoststudvisitdet.setLoginuser(loginuser);

        hostelStudentVisitorDetailRepository.save(hoststudvisitdet);



    }


}
