package com.sivserver.example.hostel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

import static com.sivserver.example.utils.SivUtils.crossoriginurl;

/**
 * Created by GBCorp on 19/07/2017.
 */
@RestController
@CrossOrigin(origins = crossoriginurl)
@RequestMapping("/api/v1/hostelstudentvisitor")

public class HostelStudentVisitorDetailApiController  {
    //@Autowired
    private HostelStudentVisitorDetailRepository hostelStudentVisitorDetailRepository;

    @GetMapping(value="/all")

    public List<HostelStudentVisitorDetail> getHostelStudentVisitorDetail() {return hostelStudentVisitorDetailRepository.findAll();}


    public HostelStudentVisitorDetailApiController(HostelStudentVisitorDetailRepository hostelStudentVisitorDetailRepository)
    {
        this.hostelStudentVisitorDetailRepository = hostelStudentVisitorDetailRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void hosStudVisitDet(
            @RequestParam(value ="visitorid", required=false) String visitorid,
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="admissionno", required=false) String admissionno,
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
        HostelStudentDetail hostelStudentLeaveDetail_regno = new HostelStudentDetail(regno);
        hoststudvisitdet.setVisitorid(visitorid);
        hoststudvisitdet.setCurrentdate(currentdate);
        hoststudvisitdet.setRegno(regno);
        hoststudvisitdet.setAdmissionno(admissionno);
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
