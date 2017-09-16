package com.sivserver.example.hostel;

import com.sivserver.example.student.StudentBaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Date;
import java.util.List;

/**
 * Created by GBCorp on 19/07/2017.
 */
@RestController
@RequestMapping("/api/v1/hostelstudentleave")

public class HostelStudentLeaveDetailApiController {
    //@Autowired
    private HostelStudentLeaveDetailRepository hostelStudentLeaveDetailRepository;

    @GetMapping(value="/all")

    public List<HostelStudentLeaveDetail> getHostelStudentLeaveDetail() {return hostelStudentLeaveDetailRepository.findAll();}

    public HostelStudentLeaveDetailApiController(HostelStudentLeaveDetailRepository hostelStudentLeaveDetailRepository)
    {
        this.hostelStudentLeaveDetailRepository = hostelStudentLeaveDetailRepository;
    }


    @RequestMapping(method = RequestMethod.POST)
    public void hosStudLeaveDet(
            @RequestParam(value ="currentdate", required=false) Date currentdate,
            @RequestParam(value ="regno", required=false) String regno,
            @RequestParam(value ="admissionno", required=false) String admissionno,
            @RequestParam(value ="branchcode", required=false) String branchcode,
            @RequestParam(value ="batch", required=false) String batch,
            @RequestParam(value ="semester", required=false) Integer semester,
            @RequestParam(value ="academicyear", required=false) String academicyear,
            @RequestParam(value ="fromdate", required=false) Date fromdate,
            @RequestParam(value ="todate", required=false) Date todate,
            @RequestParam(value ="noofdays", required=false) Integer noofdays,
            @RequestParam(value ="reason", required=false) String reason,
            @RequestParam(value ="requestedby", required=false) String requestedby,
            @RequestParam(value ="requestedpersoncontactno", required=false) String requestedpersoncontactno,
            @RequestParam(value ="approvedby", required=false) String approvedby,
            @RequestParam(value ="remarks", required=false) String remarks,
            @RequestParam(value ="loginuser", required=false) String loginuser



    ) {
        HostelStudentLeaveDetail hoststudleavedet = new HostelStudentLeaveDetail();
        HostelStudentDetail hostelStudentLeaveDetail_regno = new HostelStudentDetail(regno);
        hoststudleavedet.setCurrentdate(currentdate);
        hoststudleavedet.setRegno(regno);
        hoststudleavedet.setBranchcode(branchcode);
        hoststudleavedet.setBatch(batch);
        hoststudleavedet.setSemester(semester);
        hoststudleavedet.setAcademicyear(academicyear);
        hoststudleavedet.setFromdate(fromdate);
        hoststudleavedet.setTodate(todate);
        hoststudleavedet.setNoofdays(noofdays);
        hoststudleavedet.setReason(reason);
        hoststudleavedet.setRequestedby(requestedby);
        hoststudleavedet.setRequestedpersoncontactno(requestedpersoncontactno);
        hoststudleavedet.setApprovedby(approvedby);
        hoststudleavedet.setRemarks(remarks);
        hoststudleavedet.setLoginuser(loginuser);

        hostelStudentLeaveDetailRepository.save(hoststudleavedet);



    }


}
