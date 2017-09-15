package com.sivserver.example.placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 14/07/2017.
 */
@RestController
@RequestMapping("/api/v1/campusrequestdetail")

public class CampusRequestDetailApiController  {
    //@Autowired
    private CampusRequestDetailRepository campusRequestDetailRepository;

    @GetMapping(value="/all")

    public List<CampusRequestDetail> getCampusRequestDetail() {return campusRequestDetailRepository.findAll();}

    public CampusRequestDetailApiController(CampusRequestDetailRepository campusRequestDetailRepository)
    {
        this.campusRequestDetailRepository = campusRequestDetailRepository ;
    }



    @RequestMapping(method = RequestMethod.POST)
    public void campRequestDetail(
            @RequestParam(value ="id", required=false) Integer id,
            @RequestParam(value ="requestid", required=false) String requestid,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam (value="semester", required=false) Integer semester,
            @RequestParam (value="studentcategory", required=false) String studentcategory,
            @RequestParam (value="typeofstudent", required=false) String typeofstudent,
            @RequestParam (value="numberofstudents", required=false) Integer numberofstudents

    ) {
        CampusRequestDetail campReqDetail = new CampusRequestDetail();
        CampusRequestHeader campusRequestHeader = new CampusRequestHeader(requestid);
        campReqDetail.setId(id);
        campReqDetail.setRequestid(requestid);
        campReqDetail.setBranchcode(branchcode);
        campReqDetail.setSemester(semester);
        campReqDetail.setStudentcategory(studentcategory);
        campReqDetail.setTypeofstudent(typeofstudent);
        campReqDetail.setNumberofstudents(numberofstudents);



        campusRequestDetailRepository.save(campReqDetail);



    }

}
